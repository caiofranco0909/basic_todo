CREATE DOMAIN dm_name VARCHAR(100);
CREATE DOMAIN dm_description VARCHAR(400);


CREATE TABLE task (
    id_task INTEGER NOT NULL,
    list_id INTEGER REFERENCES appList(id_list),
    name_task dm_name,
    checked_task BOOLEAN DEFAULT FALSE,
    count_task INTEGER DEFAULT 0,
	PRIMARY KEY(id_task)
);

CREATE TABLE appList(
	id_list INTEGER NOT NULL,
	name_list dm_name,
	description_list dm_description,
	start_list DATE,
	deadline_list DATE,
	folder_id INTEGER REFERENCES folder(id_folder),
	PRIMARY KEY(id_list)
);

CREATE TABLE folder(
	id_folder INTEGER NOT NULL,
	nome_folder dm_name,
	description_folder dm_description,
	parent_id INTEGER REFERENCES folder(id_folder),
	PRIMARY KEY(id_folder)
);
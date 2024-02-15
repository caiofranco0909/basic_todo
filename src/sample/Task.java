package sample;

public class Task {
    private String name;
    private static int count;

    public Task(String name){
        this.name = name;
        count += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}

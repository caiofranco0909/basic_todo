package sample;

public class Task {
    private int id;
    private String name;
    private boolean checkded;
    private static int count;
    private static int nextId;

    public Task(String name){
        this.name = name;
        id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean isCheckded() {
        return checkded;
    }

    public void setCheckded(boolean checkded) {
        this.checkded = checkded;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Task.count = count;
    }

    public int getId() {
        return id;
    }
    
    

}

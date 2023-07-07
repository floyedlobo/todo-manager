package in.floyed.taskmanager.model;


import java.util.UUID;

public class Task {


    UUID id;

    public UUID getId() {
        return id;
    }

    String title;

    public Task(String title) {
        id = UUID.randomUUID();
        this.title = title;
    }

    public Task() {
        id = UUID.randomUUID();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

package kz.bitlab.techorda.db;

public class Tasks {
    Long id;
    String name;
    String description;
    String deadlineDate;
    boolean status = false;

    public Tasks() {}
    public Tasks(Long id, String name, String description, String deadlineDate, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadlineDate = deadlineDate;
        this.status = status;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
}

package UPMToDo.model;

import java.time.LocalDate;

public class Task {
    private String taskName;
    private LocalDate initDate;
    private LocalDate doneDate;
    private boolean taskStatus = false;

    public Task(String taskName, LocalDate initDate, LocalDate doneDate) {
        this.taskName = taskName;
        this.initDate = initDate;
        this.doneDate = doneDate;
    }

    public Task(String taskName, LocalDate doneDate) {
        this(taskName, null, doneDate);
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public LocalDate getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(LocalDate doneDate) {
        this.doneDate = doneDate;
    }

    public boolean isTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public LocalDate getInitDate() {
        return initDate;
    }

    public void setInitDate(LocalDate initDate) {
        this.initDate = initDate;
    }
}

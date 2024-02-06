package wis.task;

public abstract class Task {
    final private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void setDone() {
        this.isDone = true;
    }

    public void setUndone() {
        this.isDone = false;
    }

    /**
     * Checks whether description of the task contains some keyword.
     */
    public boolean hasPattern(String pattern) {
        return this.description.contains(pattern);
    }

    @Override
    public String toString() {
        return String.format("[%s] %s",
                this.isDone? "X" : " ",
                this.description);
    }

    public String toSavedString() {
        return String.format("%d#!#%s",
                this.isDone? 1 : 0,
                this.description);
    }
}

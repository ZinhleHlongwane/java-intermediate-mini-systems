package com.zinhle.taskmanager.models;

public class Task {
    
    private String title;
    private Priority priority;
    private Status status;

    public Task(String title, Priority priority, Status status) {
        this.title = title;
        this.priority = priority;
        this.status = status;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
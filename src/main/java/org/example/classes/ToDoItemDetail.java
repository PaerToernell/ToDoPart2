package org.example.classes;

import java.time.LocalDate;

    // Did rename this class to make it make sense
public class ToDoItemDetail {
    // Variabels
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadline;
    private boolean done;
    private Person creator;

    // Constructor
    public ToDoItemDetail(int id, String title, LocalDate deadline){
        this.setId(id);
        this.setTitle(title);
        this.setDeadline(deadline);
    }

    //Setters Getters
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public void setDeadline(LocalDate deadline) {
        if (deadline==null) {
            throw new RuntimeException("Deadline cant be null");
        }
        if (deadline.isBefore(LocalDate.now())){
            throw new RuntimeException("Deadline before today. Deadline: "+deadline+" today: "+LocalDate.now());
        }
        this.deadline = deadline;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    public void setCreator(Person creator) {
        this.creator = creator;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public LocalDate getDeadline() {
        return deadline;
    }
    public boolean isDone() {
        return done;
    }
    public Person getCreator() {
        return creator;
    }
    public String getSummary(){
        return "";
    }



}

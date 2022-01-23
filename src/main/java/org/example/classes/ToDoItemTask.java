package org.example.classes;



public class ToDoItemTask{

    // contructors
    public  ToDoItemTask(ToDoItemDetail ToDoItemDetails){
        if (ToDoItemDetails==null) { throw new RuntimeException("");}
        this.ToDoItemDetails =ToDoItemDetails;
    }



    // Fields
    private int id;
    // I did not create assigned, better to test each time
    // private boolean assigned;
    private ToDoItemDetail ToDoItemDetails;
    private Person assignee;


    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Obsolete
/*    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }*/
    public ToDoItemDetail getTodoitem() {
        return ToDoItemDetails;
    }
    public void setTodoitem(ToDoItemDetail todoitem) {
        this.ToDoItemDetails = todoitem;
    }
    public Person getAssignee() {
        return assignee;
    }
    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
    public String getSummary(){
        return "";
    }
    public boolean isAssigned() {


        return assignee!=null;
    }


}

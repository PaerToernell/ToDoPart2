package org.example.classes;

public class Person {
    int id;
    String firstName;
    String lastName;
    String email;

    // Constructors
    public Person(int id, String firstName, String lastName, String email){
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
        setEmail(email);

    }
    public Person(){

    }

    // Getters Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new RuntimeException("First name can't be null");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new RuntimeException("Last name can't be null");
        }
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription(){
        return "Id: "+getId()+", Firstname: "+getFirstName()+
                ", Lastname: "+getLastName()+", Email: "+getEmail();
    }
}

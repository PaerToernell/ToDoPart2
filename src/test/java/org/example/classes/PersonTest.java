package org.example.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    //private Person testPerson;

    @Test
    void setId() {
        Person testPerson = new Person();
        int testId=23;
        testPerson.setId(testId);
        assertEquals(testPerson.getId(),testId, "Set / Get ID Fail");
    }
    @Test
    void getId(){
        Person testPerson = new Person();
        int testId=23;
        testPerson.setId(testId);
        assertEquals(testPerson.getId(),testId, "Set / Get ID Fail");
    }

    @Test
    void setFirstName() {
        Person testPerson = new Person();
        assertThrows(
                RuntimeException.class,
                () -> testPerson.setFirstName(null), "First name not allowed to be be null"
        );
    }

    @Test
    void setLastName() {
        Person testPerson = new Person();
        assertThrows(
                RuntimeException.class,
                () -> testPerson.setLastName(null), "Last name not allowed to be be null"
        );
    }

    @Test
    void setEmail() {
        Person testPerson = new Person();
        assertThrows(
                RuntimeException.class,
                () -> testPerson.setEmail(null)
        );
    }


    @Test
    void getFirstName() {
        Person testPerson = new Person();
        String testFirstName = "IKoijhIUggiyg";
        testPerson.setFirstName(testFirstName);
        assertEquals(testFirstName, testPerson.getFirstName(), "Get First Name FAIL");
    }

    @Test
    void getLastName() {
        Person testPerson = new Person();
        String testLastName = "IKoijhIUggiyg";
        testPerson.setFirstName(testLastName);
        assertEquals(testLastName, testPerson.getFirstName(), "Get First Name FAIL");
    }

    @Test
    void getEmail() {
        Person testPerson = new Person();
        String testEmail = "IKoijhIUggiyg";
        testPerson.setEmail(testEmail);
        assertEquals(testEmail, testPerson.getEmail(), "Get First Name FAIL");
    }

    @Test
    void getDescription() {
        Person testPerson = new Person(12, "Ulf", "Nilsson", "kjhkh@dssdf.df");
        String testDesc = "Id: "+12+", Firstname: "+"Ulf"+
                ", Lastname: "+"Nilsson"+", Email: "+"kjhkh@dssdf.df";
        assertEquals(testPerson.getDescription(), testDesc, "getDescription Fail");

    }
}
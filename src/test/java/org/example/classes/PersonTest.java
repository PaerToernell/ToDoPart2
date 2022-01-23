package org.example.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    //private Person testPerson;

    @Test
    void setId() {

    }

    @Test
    void setFirstName() {
        Person testPerson = new Person();
        assertThrows(
                RuntimeException.class,
                () -> testPerson.setFirstName(null)
        );

        //assertThrows(aperson.setFirstName(null), RuntimeException(), "");

    }

    @Test
    void setLastName() {
    }

    @Test
    void setEmail() {
    }

    @Test
    void getId() {
    }

    @Test
    void getFirstName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void getEmail() {
    }

    @Test
    void getDescription() {
    }
}
package org.example.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoItemDetailTest {

    @Test
    void setId() {
        ToDoItemDetail testDetail = new ToDoItemDetail();
        int testId=23;
        testDetail.setId(testId);
        assertEquals(testDetail.getId(),testId, "Set / Get ID Fail");
    }

    @Test
    void setTitle() {
        ToDoItemDetail testDetail = new ToDoItemDetail();
        assertThrows(
                RuntimeException.class,
                () -> testDetail.setTitle(null), "First name not allowed to be be null"
        );

    }

    @Test
    void setTaskDescription() {
    }

    @Test
    void setDeadline() {
    }

    @Test
    void setDone() {
    }

    @Test
    void setCreator() {
    }

    @Test
    void getId() {
    }

    @Test
    void getTitle() {
    }

    @Test
    void getTaskDescription() {
    }

    @Test
    void getDeadline() {
    }

    @Test
    void isDone() {
    }

    @Test
    void getCreator() {
    }

    @Test
    void getSummary() {
    }
}
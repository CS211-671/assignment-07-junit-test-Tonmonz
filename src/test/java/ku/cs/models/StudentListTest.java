package ku.cs.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
class StudentListTest {
    @Test
    public void testAddStudentWithoutScore() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610450001", "Alice");

        Student student = studentList.findStudentById("6610450001");

        assertNotNull(student);
        assertEquals("6610450001", student.getId());
        assertEquals("Alice", student.getName());
        assertEquals(0, student.getScore());
    }

    @Test
    public void testAddStudentWithScore() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610450001", "Bob", 75.0);

        Student student = studentList.findStudentById("6610450001");

        assertNotNull(student);
        assertEquals("6610450001", student.getId());
        assertEquals("Bob", student.getName());
        assertEquals(75.0, student.getScore());
    }

    @Test
    public void testFindStudentById() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610450001", "Alice");
        Student student = studentList.findStudentById("123");
        assertNotNull(student);
        assertEquals("6610450001", student.getId());
    }


    @Test
    public void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610450001", "Diana");
        studentList.giveScoreToId("6610450001", 10.0);
        studentList.giveScoreToId("6610450001", 20.0);

        Student student = studentList.findStudentById("6610450001");

        assertNotNull(student);
        assertEquals(30.0, student.getScore());
    }

    @Test
    public void testViewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610450001", "Eve", 85.0);
        studentList.addNewStudent("6610450002", "Frank", 65.0);
        studentList.addNewStudent("6610450003", "Grace", 55.0);

        assertEquals("A", studentList.viewGradeOfId("6610450001"));
        assertEquals("C", studentList.viewGradeOfId("6610450002"));
        assertEquals("D", studentList.viewGradeOfId("6610450003"));

    }


}
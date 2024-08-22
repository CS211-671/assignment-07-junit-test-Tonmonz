package ku.cs.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
class StudentListTest {
    @Test
    @DisplayName("Student should be added to StudentList")
    public void testAddStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("123", "Alice");

        Student student = studentList.findStudentById("123");

        assertNotNull(student);
        assertEquals("123", student.getId());
        assertEquals("Alice", student.getName());
        assertEquals(0, student.getScore());
    }

    @Test
    @DisplayName("Student with score should be added to StudentList")
    public void testAddStudentWithScore() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("124", "Bob", 75.0);

        Student student = studentList.findStudentById("124");

        assertNotNull(student);
        assertEquals("124", student.getId());
        assertEquals("Bob", student.getName());
        assertEquals(75.0, student.getScore());
    }

    @Test
    @DisplayName("Student with the same ID should not be added twice")
    public void testAddDuplicateStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("125", "Charlie");
        studentList.addNewStudent("125", "Charlie", 85.0);

        Student student = studentList.findStudentById("125");

        assertNotNull(student);
        assertEquals("Charlie", student.getName());
        assertEquals(0, student.getScore()); // Original score, should not be 85.0
    }

    @Test
    @DisplayName("Score should be added to existing student")
    public void testGiveScoreToStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("126", "Diana");
        studentList.giveScoreToId("126", 10.0);
        studentList.giveScoreToId("126", 20.0);

        Student student = studentList.findStudentById("126");

        assertNotNull(student);
        assertEquals(30.0, student.getScore()); // 10 + 20
    }

    @Test
    @DisplayName("Grade should be calculated correctly based on score")
    public void testViewGradeOfStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("127", "Eve", 85.0);
        studentList.addNewStudent("128", "Frank", 65.0);
        studentList.addNewStudent("129", "Grace", 55.0);

        assertEquals("A", studentList.viewGradeOfId("127"));
        assertEquals("C", studentList.viewGradeOfId("128"));
        assertNull(studentList.viewGradeOfId("999")); // Non-existent student
    }


}
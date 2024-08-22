package ku.cs.models;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

//    @BeforeEach
//    void init(){
//        s1 = new Student("6xxxxxx","Mon");
//    }


    @Test
    void testAddScore(){
            Student s1 = new Student("6xxxxxxxx", "StudentTest");
            s1.addScore(10.5);
            assertEquals(10.5, s1.getScore());
            s1.addScore(50);
        assertEquals(60.5, s1.getScore());

    }
    @Test
    void testCalculateGrade(){
        Student s1 = new Student("6xxxxxxxxx", "Mon",40);
        s1.addScore(30);
        assertEquals("B", s1.grade());
    }
    @Test
    void  testAddId(){
        Student s1 = new Student("6610450001", "StudentTest");
        assertEquals(true, s1.isId("6610450001"));
    }


}
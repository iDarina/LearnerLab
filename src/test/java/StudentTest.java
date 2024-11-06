import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    public void setUp(){
        student = new Student(1, "Mason");
    }

    @Test
    void testImplementation(){
        Assertions.assertTrue(student instanceof Learner);
    }

    @Test
    void testInheritance(){
        Assertions.assertTrue(student instanceof Person);
    }

    @Test
    void testLearn() {
        double totalStudyTime = student.getTotalStudyTime();
        double numberOfHours = 5.0;

        student.learn(numberOfHours);
        double actual = student.getTotalStudyTime();

        assertEquals(totalStudyTime + numberOfHours, actual);


    }
}
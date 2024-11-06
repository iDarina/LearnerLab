import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {

    Instructor instructor;

    @BeforeEach
    public void setUp() {
        instructor = new Instructor(1, "Mason");
    }

    @Test
    void testImplementation() {
        Assertions.assertTrue(instructor instanceof Teacher);
    }

    @Test
    void testInheritance() {
        Assertions.assertTrue(instructor instanceof Person);
    }

    @Test
    void testTeach() {
        Student student = new Student(2, "Mason");

        double numberOfHours = 5.0;
        double actual = student.getTotalStudyTime() + numberOfHours;

        instructor.teach(student, numberOfHours);
        double expected = student.getTotalStudyTime();

        assertEquals(actual, expected);
    }

    @Test
    void testLecture() {
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Jo");
        Student student3 = new Student(3, "Jessie");
        Student[] students = {student1, student2, student3};

        double numberOfHours = 9.0;

        instructor.lecture(students, numberOfHours);

        double expected = numberOfHours / students.length;


        for (Student student : students) {
            Assertions.assertEquals(expected, student.getTotalStudyTime());


        }
    }
}

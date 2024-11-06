import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipCodeWilmingtonTest {

    ZipCodeWilmington zipCodeWilmington;
    Students students;

    @BeforeEach
    public void setUp(){
        zipCodeWilmington = new ZipCodeWilmington();
        students = new Students();

        students.add(new Student(1, "Babla"));
        students.add(new Student(2, "Bubu"));
    }

    @Test
    void hostLecture() {
        double numberOfHours = 6.0;
        zipCodeWilmington.hostLecture(new Teacher() {
            public void teach(Learner learner, double numberOfHours) {

            }

            public void lecture(Learner[] learners, double numberOfHours) {

            }
        }, numberOfHours);

//        for(Students student : students){
//            assertEquals();
//        }


        }

    }
}
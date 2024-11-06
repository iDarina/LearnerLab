import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    public ZipCodeWilmington() {

    }

    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        Learner[] personList = new Learner[3];
        teacher.lecture(personList, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = new Instructor(1, "Bub");
        Learner[] personList = new Learner[3];
        instructor.lecture(personList, numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();
//        for(Student student : students){
//            studyMap.put(student, student.getTotalStudyTime());
//        }
        return studyMap;
    }

}

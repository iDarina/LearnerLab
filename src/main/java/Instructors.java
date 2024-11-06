public class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    public Instructors() {
        add(new Instructor(1, "Dr. Bubbles"));
        add(new Instructor(2, "Dr. Bub"));
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }


}

public class Students extends People{
    private static final Students INSTANCE = new Students();

    public Students() {
        add(new Student(1, "Bubbles"));
        add(new Student(2, "Bubbl"));
        add(new Student(3, "Bub"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}

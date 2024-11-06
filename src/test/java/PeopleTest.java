import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    List<Person> personList;

    @BeforeEach
    public void setUp(){
        personList = new ArrayList<>();
    }

    @Test
    void testAdd() {
       Person person = new Person(1, "Bubbles");

        personList.add(person);

        assertTrue(personList != null);
    }

    @Test
    void testFindById() {
        List <Person> people = (List<Person>) new People();
        Person person = new Person(1, "Bubbles");

        personList.add(person);
        people.addAll(personList);

       // assertEquals(person, people.);


    }

    @Test
    void testRemove() {
        Person person = new Person(1, "Bubbles");
        personList.add(person);
        personList.remove(person);

        assertFalse(personList.contains(person));
    }
}
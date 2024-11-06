import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    public void setUp(){
        person = new Person(1, "Meason");
    }

    @Test
    @DisplayName("SetName test method")
    void testSetName() {
        String name = "Bubbles";
        person.setName(name);
       String actual = person.getName();

        Assertions.assertEquals(name, actual);
    }
}
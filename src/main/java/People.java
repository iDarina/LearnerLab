import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{
    List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for (Person p: personList){
            if (p.getId() == id){
                return p;
            }else{
                System.out.println("ID is not found");
            }
        }
        return null;
    }

    public boolean contains(Person person){
        if (personList.contains(person)){
            return true;
        }else{
            return false;
        }
        }

    public void remove(Person person){
            personList.remove(person);
        }


    public void remove(long id){
           for (Person p: personList){
               if (p.getId() == id){
                   personList.remove(p);
               }else{
                   System.out.println("Person ID is not found");
               }
           }
        }



    public void removeAll(){
        personList.clear();
    }


    public int count(){
        return personList.size();
    }


    public void toArray(){
        personList.toArray();
    }


    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}

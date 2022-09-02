
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Genys.D
 */
public class Room {

    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList();

    }

    public void add(Person person) {
        this.people.add(person);

    }

    public boolean isEmpty() {
        boolean isEmpty = false;
        if (people.size() == 0) {
            isEmpty = true;
        }
        return isEmpty;
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        // create an object reference for the object to be returned
        Person shortestPerson = this.people.get(0);

        for (Person e : people) {
            if (shortestPerson.getHeight() > e.getHeight()) {
                shortestPerson = e;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (this.people.isEmpty()) {

            return null;
        }

        Person shortestPerson = shortest();

        this.people.remove(shortestPerson);

        return shortestPerson;
    }
}

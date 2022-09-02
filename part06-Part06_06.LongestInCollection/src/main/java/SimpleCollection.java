
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }
        // create an object reference for the object to be returned
        // its first value is the first object on the list
        String longestString = this.elements.get(0);
        //check the list, go through
        for (String e : elements) {
            // compare each object on the list
            // to the returnObject -- we compare heights
            // since we're searching for the longest,

            if (longestString.length() < e.length()) {
                longestString = e;
            }
        }
        return longestString;
    }
}

//Imports
import java.util.ArrayList;
import java.util.Collections;

public class Bag<T> {
    // Prepare list
    private ArrayList<T> myItems;

    // Constructor
    public Bag() {
        myItems = new ArrayList<>();
    }

    // Methods
    public void add(T addedItem) {
        // Add item into bag
        myItems.add(addedItem);
    }

    public void remove(T removedItem) {
        // Remove item from bag
        myItems.remove(removedItem);
    }

    public boolean contains(T checkedItem) {
        // If item is in bag, send true. Else false
        return myItems.contains(checkedItem);
    }

    public int count(T countedItem) {
        // Count the number of the item
        return Collections.frequency(myItems, countedItem);
    }

    public void outputString() {
        for (int i = 0; i < myItems.size(); i++) {
            System.out.println(myItems.get(i));
        }
    }
}

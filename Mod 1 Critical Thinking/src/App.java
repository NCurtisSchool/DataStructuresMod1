/*
Name: Nathan Curtis
Date: 12/15/2024
Class: Data Structures and Algorithms 24WB-CSC400-1
Teacher: Herbert Pensado
Assignment: Mod 1 Assignment
GitHub: https://github.com/NCurtisSchool/DataStructuresMod1.git
*/

public class App {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        // Creates object
        Bag newList = new Bag<>();

        // Add items into newList
        newList.add("Apple");
        newList.add("Grapes");
        newList.add("Garlic");
        newList.add("Chocolate");
        newList.add("Milk");
        newList.add("Ginger");
        newList.add("Ginger");
        newList.add("Chocolate");
        newList.add("Apple");
        newList.add("Apple");

        newList.outputString(); // Shows items in newList

        // True, False, True, True
        containing(newList);

        // Counts
        counting(newList);

        // Remove elements
        newList.remove("Ginger");
        newList.remove("Chocolate");
        newList.remove("Apple");

        newList.outputString(); // Shows items in newList

        // True, False, True, True
        containing(newList);

        // Counts
        counting(newList);
    }

    // Function checking the contained items
    @SuppressWarnings("unchecked")
    public static void containing(Bag newList) {
        System.out.println("Contains Apple: " + newList.contains("Apple"));
        System.out.println("Contains Vanilla: " + newList.contains("Vanilla"));
        System.out.println("Contains Milk: " + newList.contains("Milk"));
        System.out.println("Contains Garlic: " + newList.contains("Garlic"));
    }

    // Function counting the contained items
    @SuppressWarnings("unchecked")
    public static void counting(Bag newList) {
        System.out.println("Amount of Apples: " + newList.count("Apple"));
        System.out.println("Amount of Vanilla: " + newList.count("Vanilla"));
        System.out.println("Amount of Milk: " + newList.count("Milk"));
        System.out.println("Amount of Garlic: " + newList.count("Garlic"));
    }
}

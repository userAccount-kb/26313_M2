import java.util.*;

public class ToDoList {
    private String item;
    private LinkedHashSet<String> userList = new LinkedHashSet<>(); //to ensure no duplicates

    /**
     * Adds a to-do list item to the List.
     * @param item The item that the user enters.
     */
    public void addItem(String item) {
        userList.add(item);
    }

    /**
     * Removes the selected item from the List and confirms deletion.
     */
    public void deleteItem() {
        userList.remove(item);

        System.out.println("Deletion successful!\n");
    }

    /**
     * Verifies the item the user has input exists in the list.
     * If selectedItem is found, the coordinating List item  
     * will be assigned the value of selectedItem.
     * @param selectedItem The List item the user enters.
     * @return itemExists has a default value of false, but will 
     * return true if selectedItem is found.
     */
    public boolean verifyItem(String selectedItem) {
        boolean itemExists = false;

        for (String list : userList) {
            if (selectedItem.equalsIgnoreCase(list)) {
                item = selectedItem;
                itemExists = true;
            }
        }

        return itemExists;
    }

    /**
     * Displays all list items.
     */
    public void viewAll() {
        for (String list : userList) {
            System.out.print("\n" + list);
        }

        System.out.println("\n");
    }
}

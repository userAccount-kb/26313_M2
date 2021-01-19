import java.util.*;

public class ToDoList {
    private int index = 0;
    private LinkedList<String> userList = new LinkedList<>();

    public void addItem(String item) {
        userList.add(item);
    }

    public void deleteItem() {
        userList.remove(index);

        System.out.println("Deletion successful!\n");
    }

    public boolean verifyItem(String selectedItem) {
        boolean itemExists = false;
        int count = 0;

        for (String list : userList) {
            if (selectedItem.equalsIgnoreCase(list)) {
                index = count;
                itemExists = true;
            }
            count++;
        }

        return itemExists;
    }

    public void viewAll() {
        for (String list : userList) {
            System.out.print("\n" + list);
        }
    }
}

import java.util.*;

public class ToDoList {
    //String item;
    private LinkedList<String> userList = new LinkedList<>();

    public void addItem(String item) {
        userList.add(item);
    }

    public void deleteItem(String selectedItem) {
        Scanner userResponse = new Scanner(System.in);
        String answer;
        int index = 0, count = 0;
        boolean itemExists = false;

        //confirm item exists
        for (String list : userList) {
            if (selectedItem.equalsIgnoreCase(list)) {
                index = count;
                System.out.print("Are you sure you wish to delete \"" + list + "\"?");
            }
            count++;
        }
        
        //verify deletion
        if (itemExists) {
            System.out.println("Are you sure you want to delete \"" + selectedItem + "\"?");
            if (userResponse.next().equals("yes") || userResponse.next().equals("no"))  {
                answer = userResponse.next();

                if (answer.equalsIgnoreCase("yes")) { //delete
                    userList.remove(index);
                }
            }
        } else {
            System.out.println("That item does not exist.");
        }

        userResponse.close();
    }


    public void viewAll() {
        for (String list : userList) {
            System.out.print(list + "\n");
        }
    }
}

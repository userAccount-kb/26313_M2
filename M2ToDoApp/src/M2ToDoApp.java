import java.util.Scanner;

public class M2ToDoApp {
    public static void main(String[] args) throws Exception {
        ToDoList user1 = new ToDoList();
        System.out.println("Welcome to your personal to-do list!");
        boolean quit = false;
        while (quit == false) {
            quit = runList(user1);
        }
        
    }

    public static boolean runList(ToDoList user1) {
        String action = "", item = "", answer = "";
        boolean itemExists = false;

        Scanner userInput = new Scanner(System.in), userResponse = new Scanner (System.in);
        
        System.out.println("\nYou can \"add\", \"delete\", or \"view all\" items. " 
        + "What would you like to do? \n(press q to quit)");

        try{
            action = userInput.nextLine();
        } catch (Exception e) {
            System.out.println("Something went terribly wrong. Error: " + e);
        }

        //input validation
        if (action.equalsIgnoreCase("add")) {
            System.out.println("What item would you like to add?");
            item = userResponse.nextLine();
            user1.addItem(item);
        } else if (action.equalsIgnoreCase("delete")) {
            System.out.println("Which item would you like to delete?");
            item = userResponse.nextLine();
            itemExists = user1.verifyItem(item);

            //verify deletion
            if (itemExists == false) {
                System.out.println("That item does not exist.");
            } else {
                System.out.println("Are you sure you want to delete \"" + item + "\"?");
                answer = userResponse.next();

                if (answer.equalsIgnoreCase("yes")) { //delete
                    user1.deleteItem();
                } else {
                    System.out.println("Deletion cancelled!");
                }
            }
        } else if (action.equalsIgnoreCase("view all")) {
            user1.viewAll();
        } else {
            System.out.println("Invalid entry!\n");
        }
        
        if (action.equalsIgnoreCase("q")) {
            return true;
        }
        return false;
    }
}

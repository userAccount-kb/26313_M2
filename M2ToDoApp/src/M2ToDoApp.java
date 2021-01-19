import java.util.Scanner;

public class M2ToDoApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to your personal to-do list!");
        Scanner userInput = new Scanner(System.in);
        String action = "", item = "";
        ToDoList user1 = new ToDoList();
        
        Scanner userResponse = new Scanner (System.in);
        
        while (!action.equalsIgnoreCase("q")) {
            System.out.println("You can \"add\", \"delete\", or \"view all\" items. " 
            + "What would you like to do? \n(press q to quit)");

            try{
                action = userInput.nextLine();
            } catch (Exception e) {
                System.out.println("Something went terribly wrong. Error: " + e);
                break;
            }

            //input validation
            if (action.equalsIgnoreCase("add")) {
                System.out.println("What item would you like to add?");
                item = userResponse.nextLine();
                user1.addItem(item);
            } else if (action.equalsIgnoreCase("delete")) {
                System.out.println("Which item would you like to delete?");
                item = userResponse.nextLine();
                user1.deleteItem(item);
            } else if (action.equalsIgnoreCase("view all")) {
                user1.viewAll();
            } else {
                System.out.println("Invalid entry!\n");
            }
        }
    }
}

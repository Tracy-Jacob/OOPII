package FunShopInventory;

import java.util.Scanner;

/**
 * Created by jacobtracy on 3/17/16.
 */
public class progamRun {


        Scanner userInput = new Scanner(System.in);

        // Program constructor
        public progamRun() {
        }

        public static void main(String[] args) {
            progamRun program = new progamRun();
            boolean quitProgram = false;

            while (!quitProgram) {
			/*
			 * Control of the program will flow through the Main Menu and the
			 * sub menus.
			 */
                quitProgram = program.mainMenu();
            }
            System.exit(0);
        }

        private boolean mainMenu() {
            boolean quitProgram = false;

            while (!quitProgram) {
                Integer select = null;

                // Print the main menu
                System.out.println();
                System.out.println("Main Menu");
                System.out.println("	1. Inventory Management");
                System.out.println("	2. Quit application");
                System.out.print("Please enter your selection (1-2): ");

         
                try {
                    select = Integer.parseInt(userInput.nextLine());
                } catch (NumberFormatException e) {
 
                    System.out.println();
                    System.out.println("Try Again, this time use either 1 or 2.");
                    return false;
                }

                switch (select) {
                    case 1:
                        inventoryMenu();
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Thank you, come again");
                        quitProgram = true;
                        return quitProgram;
                    default:
                        System.out.println();
                        System.out.println("Oops! Please enter a number (1-2) to use the system.");
                        break;
                }
            }

            return quitProgram;

        }

        private void inventoryMenu() {
            boolean returnToMainMenu = false;

            while (!returnToMainMenu) {
                Integer select = null;

                System.out.println();
                System.out.println("Item Management");
                System.out.println("	1. Add Item");
                System.out.println("	2. List all items");
                System.out.println("	3. Update item quantity");
                System.out.println("	4. Return to Main Menu");
                System.out.print("Please enter your selection (1-4): ");

                try {
                    select = Integer.parseInt(userInput.nextLine());
                } catch (NumberFormatException e) {
                    // Don't do anything. It will fall to the default case.
                }

                switch (select) {
                    case 1:
                        InventoryManager.addItem();
                        break;
                    case 2:
                        InventoryManager.listItems();
                        break;
                    case 3:
                        InventoryManager.updateItemQuantity();
                        break;
                    case 4:
                        returnToMainMenu = true;
                        break;
                    default:

                        System.out.println();
                        System.out.println("Try again, this time use a number between 1 and 4.");
                        break;
                }
            }

        }

}

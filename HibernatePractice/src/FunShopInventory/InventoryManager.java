package FunShopInventory;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jacobtracy on 3/17/16.
 */
public class InventoryManager {

    static Scanner userInput = new Scanner(System.in);



    static void addItem(){

        String itemName;
        String itemType;
        int itemQuantity;

        System.out.println("Please give the item a name");
        itemName = userInput.nextLine();
        System.out.println("Please give the item type, ie. Toy, Board game or candy");
        itemType = userInput.nextLine();
        System.out.println("Please give the item quantity");
        itemQuantity = userInput.nextInt();

        System.out.println("Adding "+itemName+" to the database.");

        Item itemTheInsert = new Item(itemName,itemType,itemQuantity);
        Model.insertItem(itemTheInsert);

        System.out.println(itemName+" successfully added!");

    }

    static void listItems(){
        List<Item> itemList = Model.returnAllItems();

        System.out.println();
        System.out.println("Items in Database");

        Iterator<Item> itemIterator = itemList.iterator();

        while(itemIterator.hasNext()) {

            Item element = itemIterator.next();
            System.out.printf("%-5s%-16s%-16s%-20s\n",element.getId(),element.getItemName(),
                    element.getItemType(),element.getItemQuantity());

        }

    }

    static void updateItemQuantity(){
        String selection = null;
        Item itemTheUpdate;

        listItems();
        System.out.print("Enter the name of the item you want to update: ");

        try {
            selection = userInput.nextLine();
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Invalid entry. Returning to item Menu.");
            return;
        }

        itemTheUpdate = Model.queryItemByName(selection);

        if (itemTheUpdate == null) {
            System.out.println();
            System.out.println("The name you entered dont work, I am noow taking you back to the menu");
            return;
        }

        System.out.println();
        System.out.println("Updating "+itemTheUpdate+"'s information.");

        System.out.print("Item Name: ");
        String itemsName = userInput.nextLine();
        System.out.print("Item Type: ");
        String itemsType = userInput.nextLine();
        System.out.print("Quantity: ");
        int itemsQuantity = userInput.nextInt();

        if(!itemsName.isEmpty()) {
            itemTheUpdate.setItemName(itemsName);
        }
        if(!itemsType.isEmpty()) {
            itemTheUpdate.setItemType(itemsType);
        }
        if(!itemsType.equals(null)) {
            itemTheUpdate.setItemQuantity(itemsQuantity);
        }

        System.out.println("Updating information for "+itemTheUpdate);
        Model.mergeItemInformation(itemTheUpdate);

        System.out.println("It worked");

    }
}

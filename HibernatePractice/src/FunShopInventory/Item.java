package FunShopInventory;

/**
 * Created by jacobtracy on 3/17/16.
 */

import javax.persistence.*;

@Entity
@Table(name = "item")

public class Item {

    @Column(name="id")
    private Integer id;

    @Column(name="Item_Name")
    private String itemName;

    @Column(name="Item_Type")
    private String itemType;

    @Column(name="Quantity")
    private int itemQuantity;

    public Item(){

    }

    public Item (String theItemName, String theItemType, int theItemQuantity) {
        this.itemName = theItemName;
        this.itemType = theItemType;
        this.itemQuantity = theItemQuantity;
    }

    public String toString() {
        return "Item: [id=" + id + ", ItemName=" + itemName + ", ItemType=" + itemType
                + ", ItemQuantity=" + itemQuantity + "]";
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}

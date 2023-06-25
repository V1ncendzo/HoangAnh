package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class Cart {
    private int qtyOrdered;
    private int index = -1;
    public static final int MAX_NUMBERS_ORDERS = 20;
    private DigitalVideoDisc itemOrder[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERS];
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i = 0; i< MAX_NUMBERS_ORDERS; i++){
            if(itemOrder[i] == null){
                index = i;
            }
        }
        if(index != -1){
            itemOrder[index] = disc;
            System.out.println("The disc has been added");
            qtyOrdered ++;
        }else{
            System.out.println("The cart is full");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i = 0; i < MAX_NUMBERS_ORDERS; i++){
            if(itemOrder[i] == disc){
                index = i;
            }
        }
        if(index != -1){
            itemOrder[index] = null;
            for(int i = index; i < MAX_NUMBERS_ORDERS - 1; i++){
                itemOrder[i] = itemOrder[i+1];
                itemOrder[MAX_NUMBERS_ORDERS -1] = null;
                System.out.println("The disc has been removed");
                qtyOrdered -= 1;
            }
        }else{
            System.out.println("Disc is not in the cart");
        }
    }
    public double totalCost(){
        double total_cost = 0;
        for(int i = 0; i < MAX_NUMBERS_ORDERS; i++){
            if(itemOrder[i] != null){
                total_cost += itemOrder[i].getCost();
            }
        }
        return Double.parseDouble(String.format("%.02f",(float)total_cost));
    }
    public int getQtyOrdered(){
        return  qtyOrdered;
    }
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < MAX_NUMBERS_ORDERS; i++) {
            if (itemOrder[i] != null) {
                System.out.println(itemOrder[i].getId() + ". " + itemOrder[i].toString());
            }
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < MAX_NUMBERS_ORDERS; i++) {
            if (itemOrder[i] != null && itemOrder[i].getId() == id) {
                System.out.println("DVD found:");
                System.out.println("DVD - " + itemOrder[i].toString() + ": " + itemOrder[i].getCost() + " $");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching DVD found.");
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < MAX_NUMBERS_ORDERS; i++) {
            if (itemOrder[i] != null && itemOrder[i].isMatch(title)) {
                System.out.println("DVD found:");
                System.out.println("DVD - " + itemOrder[i].toString() + ": " + itemOrder[i].getCost() + " $");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching DVD found.");
        }
    }

}


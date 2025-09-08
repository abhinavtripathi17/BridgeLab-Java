package JavaClassandObject.Level1;

public class TrackInventryOfItems {
    String[] itemCode;
    String[] itemName;
    double[] price;

    // Constructor
    TrackInventryOfItems(String[] itemName, String[] itemCode, double[] price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItems(int i) {
        System.out.println("Item Code : " + itemCode[i]);
        System.out.println("Item Name : " + itemName[i]);
        System.out.println("Item Price : " + price[i]);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        String[] itemName = {"Water bottle", "Rice", "Blackboard"};
        String[] itemCode = {"01AA", "01BB", "02AA"};
        double[] price = {500, 700, 400};

        TrackInventryOfItems inventory = new TrackInventryOfItems(itemName, itemCode, price);

        for (int i = 0; i < price.length; i++) {
            inventory.displayItems(i);
        }
    }
}

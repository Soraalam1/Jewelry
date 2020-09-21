public class Necklace {
    private double price;
    private String name;
    private int itemID;
    private String dateCreated;

    public Necklace(double price, String name, int itemID, String dateCreated) {
        this.price = price;
        this.name = name;
        this.itemID = itemID;
        this.dateCreated = dateCreated;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getItemID() {
        return itemID;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "price = " + price +
                ", name = " + name +
                ", itemID = " + itemID +
                ", dateCreated = " + dateCreated +
                '}';
    }
}

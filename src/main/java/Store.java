import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Store {
    private String name;
    private String ownerName;
    private ArrayList<Necklace> products = new ArrayList<Necklace>();

    public Store(String name, String ownerName, ArrayList<Necklace> products) {
        this.name = name;
        this.ownerName = ownerName;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<Necklace> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Necklace> products) {
        this.products = products;
    }

    public void sell(int itemID){
        for(int index = 0; index < this.products.size(); index++){
            if(this.products.get(index).getItemID() == itemID){
                this.products.remove(index);
            }
        }
    }
    public void restock(){
        while(this.products.size() < 20){
            Random randomItemID = new Random();
            String[] possibleNames = {"Diamond", "Gold", "Silver"};
            double[] possiblePrices = {2000, 1000, 500};
            int newNecklaceRandomPick = randomItemID.nextInt(3);
            int newItemID = randomItemID.nextInt(1000)+1;

            SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
            String currentDate = date.format(new Date());

            this.products.add(new Necklace(possiblePrices[newNecklaceRandomPick],
                    possibleNames[newNecklaceRandomPick],newItemID,currentDate));
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", products=" + products +
                '}';
    }
}
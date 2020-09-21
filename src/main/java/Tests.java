import java.util.ArrayList;

public class Tests {
    public static void main(String[] args) {
        ArrayList products = new ArrayList();
        products.add(new Necklace(600,"Special",313,"03/13/1996"));
        Store jewelryStore = new Store("Dean's Jewelry", "Dean",products);


        //Printing out the starting stock of the store, which should only be the one 313 necklace
        System.out.println(jewelryStore);
        //restocking to 20 necklaces
        jewelryStore.restock();
        //printing the restock
        System.out.println(jewelryStore);
        //selling the starting 313 necklace
        jewelryStore.sell(313);
        //printing out the stores necklaces, 313 should be gone
        System.out.println(jewelryStore);
        //restocking back up to 20
        jewelryStore.restock();
        //there should now be 20 completely random necklaces
        System.out.println(jewelryStore);

    }
}

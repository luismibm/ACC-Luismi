import java.util.ArrayList;
import java.util.Iterator;

public class RepasoArrayList {

    public static class Product {

        private String name;
        private int stock;

        public Product(String name, int stock) {
            this.name = name;
            this.stock = stock;
        }

        public String getName() {
            return name;
        }
        public int getStock() {
            return stock;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setStock(int stock) {
            this.stock = stock;
        }

        @Override
        public String toString() {
            return name + ", " + stock;
        }
    }

    public static void main(String[] args) {

        // Step 1
        Product p1 = new Product("Meat", 4);
        Product p2 = new Product("Bread", 5);
        Product p3 = new Product("Cheese", 6);
        Product p4 = new Product("Soda", 7);
        Product p5 = new Product("Pepsi", 8);

        // Step 2 & 3
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        // Step 4
        System.out.println("Step 4 ArrayList: ");
        Iterator<Product> it4 = list.iterator();
        while(it4.hasNext()){
            System.out.println("- " + it4.next().toString());
        }

        // Step 5
        list.remove(p4);
        list.remove(p5);

        // Step 6
        Product p7 = new Product("Fries", 9);
        list.add(1, p7);

        // Step 7
        System.out.println("\nStep 7 ArrayList: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("- " + list.get(i).toString());
        }

        // Step 8
        System.out.println("\nStep 8 ArrayList: ");
        for (Product p : list) {
            System.out.println("- " + p.toString());
        }

        // Step 9
        System.out.println("\nStep 9 ArrayList: ");
        Iterator<Product> it9 = list.iterator();
        while(it9.hasNext()){
            System.out.println("- " + it9.next().toString());
        }

        // Step 10
        list.clear();

    }

}
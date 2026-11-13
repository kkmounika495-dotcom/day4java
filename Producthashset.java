

import java.util.LinkedHashSet;

public class Producthashset {
    public static void main(String[] args) {

        LinkedHashSet<String> product = new LinkedHashSet<>();

        product.add("Laptop");
        product.add("mobile");
        product.add("headphone");
        product.add("smartwatch");

        System.out.println("LinkedHashSet: " + product);

        product.add("tablet");

        System.out.println("Contains mobile: " + product.contains("mobile"));

        product.remove("headphone");

        System.out.println("After Removing: " + product);

        System.out.println("Size: " + product.size());

        System.out.println("Is Empty: " + product.isEmpty());
    }
}
package org.filtering;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Sample transactions with product names (imagine these are from a database or an API)
        List<String> transactions = Arrays.asList(
                "Apple iPhone", "Samsung Galaxy", "Apple iPhone", "LG TV", "LG TV", "Sony PlayStation", "Samsung Galaxy");

        // Find unique products using distinct
        List<String> uniqueProducts = transactions.stream()
                .distinct()
                .collect(Collectors.toList());

        // Print unique products
        System.out.println("Unique Products: " + uniqueProducts);
    }
}

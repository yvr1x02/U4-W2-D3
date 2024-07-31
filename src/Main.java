import es.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        //elenco prodotti
        Product product1 = new Product(1234, "Hacklog vol1", "Book", 325.00);
        Product product2 = new Product(4567, "Hacklog vol2", "Book", 135.00);
        Product product3 = new Product(8901, "Elden Ring", "Boys", 60.80);
        Product product4 = new Product(2345, "Hollow Knight", "Boys", 25.80);
        Product product5 = new Product(6789, "Mario Kart 8", "Baby", 75.00);
        Product product6 = new Product(0123, "Hacklog vol1", "Book", 35.00);

        //elenco customer
        Customer customer1 = new Customer(14567, "Alice", 1);
        Customer customer2 = new Customer(28901, "Bob", 2);

        // elenco ordini
        Order order1 = new Order(9876, "shipped", LocalDate.of(2023, 7, 1), LocalDate.of(2023, 7, 3), Arrays.asList(product1, product3), customer1);
        Order order2 = new Order(5432, "delivered", LocalDate.of(2023, 7, 10), LocalDate.of(2023, 7, 15), Arrays.asList(product2, product4), customer2);
        Order order3 = new Order(1098, "processing", LocalDate.of(2023, 7, 20), LocalDate.of(2023, 7, 25), Arrays.asList(product3, product5), customer1);

        //lista prodotti
        List<Product> products = Arrays.asList(product1, product2, product3, product4, product5);

        //lista ordini
        List<Order> orders = Arrays.asList(order1, order2, order3);


        getBookByPrice(products);
        getOrdersByProductsCat(orders);
        getDiscountedProducts(products);


    }

    private static void getBookByPrice(List<Product> products) {
        System.out.println("---------Es1--------");
        List<Product> searchedBook = ProductManagement.searchBookByPrice(products, 100);
        searchedBook.forEach(System.out::println);


    }

    private static void getOrdersByProductsCat(List<Order> orders) {
        System.out.println("---------Es2--------");
        List<Order> ordersWithProductsTag = OrderManagement.getOrdersWithProductsTag(orders);
        ordersWithProductsTag.forEach(System.out::println);

    }


    private static void getDiscountedProducts(List<Product> products) {
        System.out.println("---------Es3--------");
        List<Product> discountedProducts = ProductManagement.getDiscountedProducts(products, 10.00);
        discountedProducts.forEach(System.out::println);
    }

}
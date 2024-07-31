package es;

import java.util.List;
import java.util.stream.Collectors;

public class OrderManagement {

    public static List<Order> getOrdersWithProductsTag(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> "Baby".equals(product.getCategory())))
                .collect(Collectors.toList());
    }
}

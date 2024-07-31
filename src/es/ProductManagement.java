package es;

import java.util.List;
import java.util.stream.Collectors;

public class ProductManagement {

    public static List<Product> searchBookByPrice(List<Product> products, double searchPrice) {
        return products.stream()
                .filter(product -> "Book".equals(product.getCategory()) && product.getPrice() > searchPrice)
                .collect(Collectors.toList());

    }


    public static List<Product> getDiscountedProducts(List<Product> products, double discount) {
        return products.stream()
                .filter(product -> "Boys".equalsIgnoreCase(product.getCategory()))
                .map(product -> new Product(
                        product.getId(),
                        product.getName(),
                        product.getCategory(),
                        product.getPrice() * (1 - discount / 100)
                ))
                .collect(Collectors.toList());
    }
}

package model;

import java.util.ArrayList;
import java.util.List;
import model.Product;

public class ProductData {
	private static List<Product> products = new ArrayList<>();

	static {
		products.add(new Product(1, "Quang 1", "files/1.jpg", 100));
		products.add(new Product(2, "Quang 2", "files/2.jpg", 200));
		products.add(new Product(3, "Quang 3", "files/3.jpg", 300));
		products.add(new Product(4, "Quang 4", "files/4.jpg", 400));
		products.add(new Product(5, "Quang 5", "files/5.jpg", 500));
		products.add(new Product(6, "Quang 6", "files/6.jpg", 600));
	}

	public static List<Product> getProducts() {
		return products;
	}

	public static Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}

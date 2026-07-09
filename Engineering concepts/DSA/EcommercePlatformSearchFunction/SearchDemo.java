package EcommercePlatformSearchFunction;

// Product class
class Product {

    int productId;
    String productName;
    String category;
    // Constructor
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class SearchDemo {

    // Linear Search - O(n)
    public static Product linearSearch(Product[] products, int productId) {

        for (Product product : products) {
            if (product.productId == productId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search - O(log n)
    // Array must be sorted
    public static Product binarySearch(Product[] products, int productId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (products[mid].productId == productId)
                return products[mid];

            if (products[mid].productId < productId)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        // Sorted array of products
        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Phone", "Electronics")
        };

        // Linear Search
        Product result1 = linearSearch(products, 103);
        if (result1 != null)
            System.out.println("Linear Search Found: " + result1.productName);

        // Binary Search
        Product result2 = binarySearch(products, 104);
        if (result2 != null)
            System.out.println("Binary Search Found: " + result2.productName);
    }
}

/*
Output:
Linear Search Found: Keyboard
Binary Search Found: Monitor

Learned:
- Big O notation measures algorithm efficiency.
- Linear Search checks elements one by one. -> O(n)
- Binary Search works only on sorted arrays. -> O(log n)
- Binary Search is faster for large datasets.
*/
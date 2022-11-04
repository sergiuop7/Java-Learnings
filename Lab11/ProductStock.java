package Lab11;

import java.util.ArrayList;
import java.util.List;

public class ProductStock {
    List<Product> productList = new ArrayList<>();

    public ProductStock() {
    }

    public void addNewProduct(Product newProduct){
        productList.add(newProduct);
    }

    public void viewProducts(){
        for (Product product : productList) {
            System.out.println("\nName:\t" + product.getName() +
                    "\nPrice:\t" + product.getPrice() +
                    "\nQuantity:\t" + product.getQuantity());
        }
    }

    public void deleteProduct(Product toDelete){
        productList.removeIf(product -> (product.getName().equals(toDelete.getName())));
    }

    public void changeProductAvailableQuantity(Product product, int newQuantity){
        product.setQuantity(newQuantity);
    }
}
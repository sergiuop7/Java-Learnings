package Lab11;

import java.util.Scanner;

//quickly implemented the stock management application in console
public class Shop {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      Product product1 = new Product("Banana",10,3f);
      Product product2 = new Product("Cherries",10,30f);
      Product product3 = new Product("Colgate Toothpaste",10,10f);

      ProductStock stock = new ProductStock();

      while(true){
          System.out.println("1: add new product\n2: delete product\n3: view all products\n4: exit");
          int option = scanner.nextInt();

          switch (option){
              case 1:
                  stock.addNewProduct(product1);
                  stock.addNewProduct(product2);
                  stock.addNewProduct(product3);
                  break;
              case 2:
                  stock.deleteProduct(product1);
                  break;
              case 3:
                  stock.viewProducts();
                  break;
              case 4:
                  stock.changeProductAvailableQuantity(product1,5);
              case 5:
                  System.exit(0);
          }
      }
  }
}

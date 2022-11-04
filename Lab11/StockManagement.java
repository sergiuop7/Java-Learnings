package Lab11;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.*;

public class StockManagement extends JFrame {
    JTextArea textArea;
    ArrayList<Product> productList;
    JButton getButton;
    JButton postButton;
    JButton updateButton;
    JButton deleteButton;

    ActionListener getButtonlistener = e -> getProducts();
    ActionListener postButtonListener = e -> postProduct();
    ActionListener updateButtonlistener = e -> updateQty();
    ActionListener deleteButtonlistener = e -> deleteProduct();

    StockManagement() {
        setTitle("Store Management system");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,300);
        setLocation(700, 300);

        setVisible(true);
        setResizable(false);

        this.setLayout(null);

        getButton = new JButton("View Products");
        getButton.setBounds(10, 130, 150, 50);
        add(getButton);
        getButton.addActionListener(getButtonlistener);

        postButton = new JButton("Add Product");
        postButton.setBounds(10, 10, 150, 50);
        add(postButton);
        postButton.addActionListener(postButtonListener);

        updateButton = new JButton("Change Product Quantity");
        updateButton.setBounds(10, 190, 150, 50);
        add(updateButton);
        updateButton.addActionListener(updateButtonlistener);

        deleteButton = new JButton("Delete Product");
        deleteButton.setBounds(10, 70, 150, 50);
        add(deleteButton);
        deleteButton.addActionListener(deleteButtonlistener);

        textArea = new JTextArea();
        textArea.setBounds(170, 10, 300, 230);
        add(textArea);

        productList = new ArrayList<>();
    }

    public Product getProduct(String name){
        Product neededProduct = new Product();

        for (Product product : productList) {
            if (product.getName().equals(name)) {
                neededProduct.setQuantity(product.getQuantity());
                neededProduct.setPrice(product.getPrice());
            }
        }

        return neededProduct;
    }

    public void getProducts() {
        if (productList.isEmpty()) {
            textArea.setText("There are no products available yet.");
        } else {
            textArea.setText("");
            for (Product product : productList) {
                textArea.append("\nName:\t" + product.getName() +
                        "\nPrice:\t" + product.getPrice() +
                        "\nQuantity:\t" + product.getQuantity() + "\n\n");
            }
        }
    }

    public void postProduct() {
        if(Objects.equals(postButton.getText(), "Add Product")) {
            postButton.setText("Okay");

            textArea.setText("Enter product: \n-name \n-quantity \n-price");
            return;
        }

        if(Objects.equals(postButton.getText(), "Okay")) {
            postButton.setText("Add Product");

            List<String> input = new ArrayList<>();
            input.add(textArea.getText());
            textArea.setText("");

            productList.add(new Product(input.get(0), Integer.parseInt(input.get(1)), Float.parseFloat(input.get(2))));
        }
    }

    public void updateQty() {
        if(Objects.equals(updateButton.getText(), "Change Product Quantity")) {
            updateButton.setText("Okay");

            textArea.setText("Write down the name of the product :\nNew Quantity");
            return;
        }

        if(Objects.equals(updateButton.getText(), "Okay")) {

            updateButton.setText("Change Product Quantity");

            String input = textArea.getText();

            List<String> inputs = new ArrayList<>();
            inputs = Arrays.asList(input.split(" "));

            textArea.setText("");

            Product toUpdate = getProduct(inputs.get(0));

            if (toUpdate != null){
                toUpdate.setPrice(Float.parseFloat(inputs.get(1)));
            }
        }
    }

    public void deleteProduct() {
        if(Objects.equals(deleteButton.getText(), "Delete Product")) {
            deleteButton.setText("Okay");

            textArea.setText("Write down the name of the product : \nProduct Name");
            return;
        }

        if(Objects.equals(deleteButton.getText(), "Okay")) {

            deleteButton.setText("Delete Product");

            String toDelete = textArea.getText();
            textArea.setText("");

            Product productToDelete = getProduct(toDelete);
            productList.removeIf(product -> (product == productToDelete));
        }
    }

    public static void main(String[] args) {
        StockManagement stock = new StockManagement();
    }
}
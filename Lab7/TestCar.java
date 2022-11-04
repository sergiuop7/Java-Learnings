package Lab7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Car> cars = new ArrayList<>();
        float price;
        String model;
        String filename = "C:\\Users\\User\\OneDrive\\Documents\\30322_oprea_sergiu_se_labs\\Oprea_Sergiu_30322\\src\\Lab7\\file.ser";

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many cars do you want to add ? ");
        int nrCars = scanner.nextInt();

        for (int i = 1; i <= nrCars; i++) {

            scanner.nextLine();
            System.out.println("Enter model : ");
            model = scanner.nextLine();
            System.out.println("Enter price : ");
            price = scanner.nextFloat();

            Car object = new Car(model, price);
            cars.add(object);

        }
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(cars);

            // close the ObjectOutputStream
            out.close();

            // close the OutputStream file
            file.close();

            System.out.println("List of cars serialized");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        ArrayList<Car> cars1 = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            cars1 = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        //Verify list data
        for (Car car : cars1) {
            System.out.println(car);
        }
    }

}


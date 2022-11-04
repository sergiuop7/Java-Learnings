package Lab7;

import java.io.Serializable;

public class Car implements Serializable {

    public String model;
    public float price;


    public Car(String model, float price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

}

package entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "cars")
public class Car extends Vehicle {

    private int seats;
    @OneToOne(mappedBy = "car")
    private PlateNumber plateNumber;

    public Car(String model, BigDecimal price, String fuelType, int seats) {
        super(model, price, fuelType);
        this.seats = seats;
    }

    public Car(long id, String model, BigDecimal price, String fuelType, int seats) {
        super(id, model, price, fuelType);
        this.seats = seats;
    }

    public Car() {

    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append(super.toString());
        sb.append("seats=").append(seats);
        sb.append(", plateNumber=").append(plateNumber);
        sb.append('}');
        return sb.toString();
    }
}
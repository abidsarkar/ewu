package CodeForProjectCSE110;

import java.io.Serializable;

public class Car implements Serializable {
    private String Brand, Model, Name;
    private boolean Condition;
    private double Price;
    private int Year, Seat;

    Car() {

    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public boolean getCondition() {
        return Condition;
    }

    public void setCondition(boolean Condition) {
        this.Condition = Condition;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setSeat(int Seat) {
        this.Seat = Seat;
    }

    @Override
    public String toString() {
        String condition;
        if (getCondition()) {
            condition = "New";
        } else {
            condition = "Used";
        }
        return "Car:\n" +
                "Brand = " + Brand + '\n' +
                "Model = " + Model + '\n' +
                "Name = " + Name + '\n' +
                "Year = " + Year + '\n' +
                "Condition = " + condition + '\n' +
                "Price = " + Price + '\n' +
                "Seat = " + Seat + '\n';
    }


}
package Pojo;

import java.util.List;

public class DeviceType {
    private String RAM;
    private double price;
    private List<String> Colour;

    // Getters and Setters
    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getColour() {
        return Colour;
    }

    public void setColour(List<String> colour) {
        this.Colour = colour;
    }

    @Override
    public String toString() {
        return "DeviceType{" +
                "RAM='" + RAM + '\'' +
                ", price=" + price +
                ", Colour=" + Colour +
                '}';
    }
}

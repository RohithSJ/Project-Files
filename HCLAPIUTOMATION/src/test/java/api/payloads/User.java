package api.payloads;

public class User {
    private String id;
    private String name;
    private Data data;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    // Inner class Data
    public static class Data {
        private int year;
        private DeviceType[] devicetype;

        // Constructor for Google Pixel 6 Pro
        public Data(int year, DeviceType[] devicetype) {
            this.year = year;
            this.devicetype = devicetype;
        }

        // Constructor for Banana (example)
        public Data(String capacity, double screenSize) {
            this.capacity = capacity;
            this.screenSize = screenSize;
        }

        // Getters and Setters
        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public DeviceType[] getDevicetype() {
            return devicetype;
        }

        public void setDevicetype(DeviceType[] devicetype) {
            this.devicetype = devicetype;
        }

        // For Banana example
        private String capacity;
        private double screenSize;

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }

        public double getScreenSize() {
            return screenSize;
        }

        public void setScreenSize(double screenSize) {
            this.screenSize = screenSize;
        }
    }

    // Inner class DeviceType
    public static class DeviceType {
        private String RAM;
        private double price;
        private String[] Colour;

        // Constructor
        public DeviceType(String RAM, double price, String[] Colour) {
            this.RAM = RAM;
            this.price = price;
            this.Colour = Colour;
        }

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

        public String[] getColour() {
            return Colour;
        }

        public void setColour(String[] Colour) {
            this.Colour = Colour;
        }
    }
}

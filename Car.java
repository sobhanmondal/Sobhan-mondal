class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("BUATTI", "PAGANI", 2021);
        Car car2 = new Car("MC LAREN", "FERRARI", 2022);

        car1.displayInfo();
        car2.displayInfo();
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Corolla", "Toyota", 2018, 45000.0, "Red", 5);

        System.out.println("=== State after creation ===");
        System.out.println(car.toString());

        System.out.println("\n=== Selling a car ===");
        car.sell();

        System.out.println("\n=== Fields (get methods) ===");
        System.out.println("Model:    " + car.getModel());
        System.out.println("Brand:    " + car.getBrand());
        System.out.println("Year:     " + car.getYear());
        System.out.println("Price:    " + car.getPrice());
        System.out.println("Color:    " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        System.out.println("\n=== Changing fields (set methods) ===");
        car.setModel("Camry");
        car.setYear(2020);
        car.setPrice(52000.0);
        car.setColor("Blue");

        System.out.println("\n=== State after changes ===");
        System.out.println(car.toString());
    }
}

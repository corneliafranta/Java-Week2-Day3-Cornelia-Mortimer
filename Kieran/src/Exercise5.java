public class Exercise5 {

	public static void main(String[] args) {
		Vehicles.Car car = new Vehicles.Car("Honda", "Civic", 4, 80);
		Vehicles.ElectroBike eBike = new Vehicles.ElectroBike("Xiaomi", "MX495", 2, 25);
		Vehicles.Bike bike = new Vehicles.Bike("Traveller", "Sprint", 2, 15);
		Vehicles.Bicycle bicycle = new Vehicles.Bicycle("Mountaineer", "Zephyr", 2, 16);

		// Calling the details methods for all initialised objects
		car.getDetails();
		eBike.getDetails();
		bike.getDetails();
		bicycle.getDetails();
	}
}

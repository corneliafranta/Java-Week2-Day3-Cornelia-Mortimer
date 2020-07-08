public class Vehicles {
	public static class Vehicle {
		String brand;
		String model;
		int numWheels;
		int maxSpeed;

		Vehicle(String brand, String model, int numWheels, int maxSpeed) {
			this.brand = brand;
			this.model = model;
			this.numWheels = numWheels;
			this.maxSpeed = maxSpeed;
		}

		public void getDetails() {
			System.out.println(this.brand + " - " + this.model + ", No.Wheels: " + this.numWheels + ", with a max speed of: " + this.maxSpeed +"kph");

		}
	}

	public static class Car extends Vehicle {

		Car(String brand, String model, int numWheels, int maxSpeed) {
			super(brand, model, numWheels, maxSpeed);
		}
	}

	public static class ElectroBike extends Vehicle {

		ElectroBike(String brand, String model, int numWheels, int maxSpeed) {
			super(brand, model, numWheels, maxSpeed);
		}
	}

	public static class Bike extends Vehicle {

		Bike(String brand, String model, int numWheels, int maxSpeed) {
			super(brand, model, numWheels, maxSpeed);
		}
	}

	public static class Bicycle extends Vehicle {

		Bicycle(String brand, String model, int numWheels, int maxSpeed) {
			super(brand, model, numWheels, maxSpeed);
		}
	}
}

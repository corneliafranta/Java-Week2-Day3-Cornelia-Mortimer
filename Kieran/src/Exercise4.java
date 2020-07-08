import java.util.ArrayList;

class City {
	String name;
	int citizensNum;

	City(String name, int population) {
		this.name = name;
		this.citizensNum = population;
	}
}

class AustrianCities {
	ArrayList<City> citiesList;

	AustrianCities(ArrayList<City> citiesList) {
		this.citiesList = citiesList;
	}

	void printCityNames() {
		System.out.println("### City Names ###");
		for (City c : this.citiesList) {
			System.out.println(c.name);
		}
	}

	void printCityCitizenNumbers() {
		System.out.println("### Citizen population ###");
		for (City c : this.citiesList) {
			System.out.println(c.citizensNum);
		}

	}

	void printAllCityData() {
		System.out.println("### City name and populations ###");
		for (City c : this.citiesList) {
			System.out.println("City: " + c.name + ", Population: " + c.citizensNum);
		}
	}

	void printTotalNumberOfCitizens() {
		int currentTotal = 0;

		System.out.println("### Total Population ###");
		for (City c : this.citiesList) {
			System.out.println(c.name + " | " + c.citizensNum);

			currentTotal += c.citizensNum;
		}

		System.out.println("########################");
		System.out.println("Total: " + currentTotal);
		System.out.println("########################");
	}
}


public class Exercise4 {

	public static void main(String[] args) {

		// Init of the austrian cities obj arraylist and population
		ArrayList<City> austria = new ArrayList<>();
		austria.add(new City("Wien", 1911728));
		austria.add(new City("Niederösterreich", 1684623));
		austria.add(new City("Oberösterreich", 1490392));
		austria.add(new City("Steiermark", 1246576));
		austria.add(new City("Tirol", 757852));
		austria.add(new City("Kärnten", 561390));
		austria.add(new City("Salzburg", 558479));
		austria.add(new City("Voralberg", 397094));
		austria.add(new City("Burgenland", 294466));

		// Printing all objs from the arrlist
		for (City c : austria) {
			System.out.println("City: " + c.name + ", Population: " + c.citizensNum);
		}
		System.out.println();

		// Init AustrianCities obj
		AustrianCities austrianCities = new AustrianCities(austria);

		// Printing out the cityNames
		austrianCities.printCityNames();
		System.out.println();

		// Printing out the city populations
		austrianCities.printCityCitizenNumbers();
		System.out.println();

		// Printing out all the data
		austrianCities.printAllCityData();
		System.out.println();

		// Printing out the total population
		austrianCities.printTotalNumberOfCitizens();
		System.out.println();


	}
}

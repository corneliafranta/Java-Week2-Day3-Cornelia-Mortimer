import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercise1 {

	// Method to add a new entry at any position in a list
	public static void addToListStart(ArrayList<String[]> list, int position, String[] cityTemp)  {
		list.add(position, cityTemp);
	}

	// Method to set a new value to any element in the list
	public static void updateList(ArrayList<String[]> list, int position, String[] value) {
		list.set(position, value);
	}

	public static void main(String[] args) {

		// Init new arrlist
		ArrayList<String> austrianCities = new ArrayList<>();

		// Adding elements to the list
		austrianCities.add("Eisenstadt");
		austrianCities.add("Baden");
		austrianCities.add("Wiener Neustadt");
		austrianCities.add("Graz");
		austrianCities.add("Villach");
		austrianCities.add("Krems");
		austrianCities.add("St. Pölten");
		austrianCities.add("Steyr");
		austrianCities.add("Linz");
		austrianCities.add("Wels");
		austrianCities.add("Salzberg");
		austrianCities.add("Innsbruck");
		austrianCities.add("Bregenz");
		austrianCities.add("Dornbirn");
		austrianCities.add("Feldkirch");
		austrianCities.add("Vienna");

		// Print out the list
		for (String s : austrianCities) {
			System.out.println(s);
		}

		// Creating a temperature list and adding the elements to it
		ArrayList<Integer> cityTemp = new ArrayList<>();
		cityTemp.add(22);
		cityTemp.add(25);
		cityTemp.add(18);
		cityTemp.add(29);
		cityTemp.add(33);
		cityTemp.add(24);
		cityTemp.add(19);
		cityTemp.add(16);
		cityTemp.add(28);
		cityTemp.add(29);
		cityTemp.add(24);
		cityTemp.add(22);
		cityTemp.add(26);
		cityTemp.add(19);
		cityTemp.add(20);
		cityTemp.add(21);

		// Printing out the temperatures
		for (int i : cityTemp) {
			System.out.println(i);
		}

		// Init of the joint arr
		ArrayList<String[]> pairedList = new ArrayList();

		// Adding the two lists to the new pairedList
		for (int i = 0; i < austrianCities.size(); i++) {
			String[] tempArr = new String[2];
			tempArr[0] = austrianCities.get(i);
			tempArr[1] = cityTemp.get(i).toString();

			pairedList.add(tempArr);
		}

		// Printing out the paired list
		for (String[] s : pairedList) {
			System.out.println(s[0] + " " + s[1] + "°C");
		}

		System.out.println(" ");

		/*
		########################################################
		Exercise 2
		########################################################
		*/

		// Sorting of the arraylist of arrays in alphabetical order
		pairedList.sort(Comparator.comparing(strings -> strings[0]));

		// Printing out the results
		for (String[] s : pairedList) {
			System.out.println(s[0] + " " + s[1] + "°C");
		}

		System.out.println(" ");

		// Adding a new element to the list
		addToListStart(pairedList, 0, new String[] {"New City", "26"});

		// Printing out the list
		for (String[] s : pairedList) {
			System.out.println(s[0] + " " + s[1] + "°C");
		}

		System.out.println(" ");

		/*
		########################################################
		Exercise 3
		########################################################
		*/

		// Updating a value in the list
		updateList(pairedList, 3, new String[] {"Updated city name", "28"});

		// Reversing the order of the list
		Collections.reverse(pairedList);

		// Printing out the reversed list
		for (String[] s : pairedList) {
			System.out.println(s[0] + " " + s[1] + "°C");
		}

	}
}

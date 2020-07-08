import java.util.ArrayList;

public class Exercise1 {

	public static void main(String[] args) {

		ArrayList<String> austrianCities = new ArrayList<>();

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

		for (String s : austrianCities) {
			System.out.println(s);
		}

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

		for (int i : cityTemp) {
			System.out.println(i);
		}

		ArrayList<String[]> pairedList = new ArrayList();

		for (int i = 0; i < austrianCities.size(); i++) {
			String[] tempArr = new String[2];
			tempArr[0] = austrianCities.get(i);
			tempArr[1] = cityTemp.get(i).toString();

			pairedList.add(tempArr);
		}

		for (String[] s : pairedList) {
			System.out.println(s[0] + " " + s[1] + "°C");
		}
	}
}

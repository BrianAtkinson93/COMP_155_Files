import java.util.*;

public class Utility {

	public static String formatProvince( String provinceOrFederal ) {

		provinceOrFederal = provinceOrFederal.toLowerCase();
		//System.out.println(provinceOrFederal);
		switch (provinceOrFederal) {
			case "ontario":
			case "on":
				return "ON";
			case "Manitoba":
			case "mb":
				return "MB";
			case "british columbia":
			case "bc":
				return "BC";
			case "new brunswick":
			case "nb":
				return "NB";
			case "alberta":
			case "ab":
				return "AB";
			case "saskatchewan":
			case "sk":
				return "SK";
			case "nova scotia":
			case "ns":
				return "NS";
			default:
				return "federal";
		}
	}

	public static void display( Map<?, ?> map ) {

		//INSERT YOUR CODE HERE...
		System.out.println(map);
	}

	public static Map<Integer, Person> initiate() {

		String test_db = "./data/test_db.csv";
		String address_db = "./data/addresses_db.csv";

		return CSVReader.parsePersons( test_db, address_db );
	}
}
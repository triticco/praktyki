package praktyki.zadanie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

public class Parser {

	public static List<User> parseCSV(String fileName) throws IOException {
		CSVReader reader = new CSVReader(new FileReader(fileName), ';');

		List<User> users = new ArrayList<User>();

		List<String[]> arrayList = reader.readAll();
		reader.close();

		for (String[] array : arrayList) {
			User user = createNewUser(array);
			if (user != null) {
				users.add(user);
			}
		}

		return users;

	}

	private static User createNewUser(String[] array) {
		User user = new User();

		user.setName(array[0]);
		user.setAddress(array[1]);
		try {
			user.setNip(Long.parseLong(array[2]));
		} catch (NumberFormatException ex) {
			return null;
		}
		user.setWebsite(array[3]);
		user.setEmail(array[4]);

		return user;
	}

}

package praktyki.zadanie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsersControl {
	private List<User> usersList;

	public void loadUsers(String fileName) throws IOException {
		usersList = Parser.parseCSV(fileName);
	}

	public List<Long> getAllNips() {
		List<Long> list = new ArrayList<Long>();

		for (User user : usersList) {
			list.add(user.getNip());
		}

		return list;
	}

}

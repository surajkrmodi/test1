package tdd;

import java.util.HashMap;

public class Bank {

	HashMap<Integer, banking> map = new HashMap<Integer, banking>();
	int id;

	public int createAccount(int id, int bal, String owner, String type, String status) {
		banking b = new banking(bal, owner, type, status);
		map.put(id, b);
		return 1;

	}

	public int deactivateAccount(int id) {
		banking b = map.get(id);
		if (map.containsKey(id) && b.getStatus().equals("active")) {
			b.setStatus("Inactive");
			return 1;
		}
		return 0;
	}

	public int activateAccount(int id) {
		banking b = map.get(id);
		if (map.containsKey(id) && b.getStatus().equals("Inactive")) {
			b.setStatus("active");
			return 1;
		}
		return 0;
	}

}

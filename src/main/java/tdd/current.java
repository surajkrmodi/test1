package tdd;

import java.util.HashMap;

public class current extends banking {

	private int overdraft;
	HashMap<Integer, banking> map = new HashMap<Integer, banking>();

	current(int bal, String owner, String type, String status, int overdraft) {
		super(bal, owner, type, status);
		this.overdraft = overdraft;
	}

	public int createAccountcurrent(int id, int bal, String owner, String type, String status) {
		banking b = new banking(bal, owner, type, status);
		map.put(id, b);
		return 1;
	}

}

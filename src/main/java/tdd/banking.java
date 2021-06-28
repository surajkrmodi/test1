package tdd;

public class banking {
	private int bal;
	private String owner;
	private String type;
	private String status;

	banking(int bal, String owner, String type, String status) {
		this.bal = bal;
		this.owner = owner;
		this.type = type;
		this.status = status;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

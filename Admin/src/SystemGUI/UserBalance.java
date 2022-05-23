
package SystemGUI;

public class UserBalance {

	private String user_id;
	private long balance;
	private String card_num;

	public UserBalance() {
	}

	public UserBalance(String user_id, long balance, String card_num) {
		this.user_id = user_id;
		this.balance = balance;
		this.card_num = card_num;
	}

	public UserBalance(String user_id, String card_num) {
		this.user_id = user_id;
		this.card_num = card_num;
	}

	public UserBalance(String user_id, long balance) {
		this.user_id = user_id;
		this.balance = balance;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getCard_num() {
		return card_num;
	}

	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}

}

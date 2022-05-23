
package SystemGUI;

public class Transaction {

	private String user_id;
	private String train_id;
	private String ticket_id;
	private String from;
	private String to;
	private String date;

	public Transaction(String user_id, String train_id, String from, String to, String date) {
		this.user_id = user_id;
		this.train_id = train_id;
		this.from = from;
		this.to = to;
		this.date = date;
	}

	public Transaction(String user_id, String train_id, String ticket_id, String from, String to, String date) {
		this.user_id = user_id;
		this.train_id = train_id;
		this.ticket_id = ticket_id;
		this.from = from;
		this.to = to;
		this.date = date;
	}

	public String getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}

	public Transaction() {
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getTrain_id() {
		return train_id;
	}

	public void setTrain_id(String train_id) {
		this.train_id = train_id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}

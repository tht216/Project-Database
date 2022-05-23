
package SystemGUI;

public class Customer {
	private String user_id;
	private String password;
	private String name;
	private String address;
	private int age;
	private String sex;
	private String phoneNumber;
	private String securityQ;
	private String answer;
	private long balance;
	private String cardNum;

	public Customer() {
	}

	public Customer(String user_id, String password, String name, String address, int age, String sex,
			String phoneNumber, String securityQ, String answer) {
		this.user_id = user_id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.age = age;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.securityQ = securityQ;
		this.answer = answer;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSecurityQ() {
		return securityQ;
	}

	public void setSecurityQ(String securityQ) {
		this.securityQ = securityQ;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

}

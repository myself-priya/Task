package collection1;

public class User {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String mailId;
	private long phoneNO;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public long getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(long phoneNO) {
		this.phoneNO = phoneNO;
	}

	public User(int id, String name, int age, String gender, String mailId, long phoneNO) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mailId = mailId;
		this.phoneNO = phoneNO;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", mailId=" + mailId
				+ ", phoneNO=" + phoneNO + "]";
	}
	

}

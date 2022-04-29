public class Phone {
	String phone;
	String name;

	public Phone(String phone, String name) {
		this.phone = phone;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Фамилия: %s, телефон: %s", this.name, this.phone);
	}

	@Override
	public boolean equals(Object obj) {
		Phone old = (Phone) obj;
		return old.phone.equals(this.phone) && old.name.equals(this.name);
	}
}

import java.util.ArrayList;
import java.util.Iterator;


public class PhoneArrayList extends ArrayList<Phone> {
	@Override
	public String toString() {
		String result = "[\n";
		for (Phone phone : this) {
			result = result + String.format("\t[%s]\n", phone.toString());
		}
		result = result + "]\n";
		return result;
	}

	public ArrayList<String> get(String name) {
		ArrayList<String> found = new ArrayList<>();
		for (Phone phone : this) {
			if (phone.name.equals(name)) {
				found.add(phone.phone);
			}
		}
		return found;
	}
}

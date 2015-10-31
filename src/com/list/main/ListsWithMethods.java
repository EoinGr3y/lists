package src.com.list.main;

import java.util.ArrayList;

public class ListsWithMethods {

	private String name = "Tom";
	private ArrayList<String> names = new ArrayList<String>();
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	private ArrayList<User> users = new ArrayList<User>();

	public ListsWithMethods() {
		names.add("Jenny");
		names.add(name);
		names.add("Jane");
		for (String name : names) {
			System.out.println("A name on the list is " + name);
		}
		numbers.add(128);
		numbers.add(200);
		numbers.add(999);
		for (Integer i : numbers) {
			System.out.println("A number on the list is " + i);
		}
		User user1 = new User("Ken", 25, "ken@aol.com");
		User user2 = new User("Debbie", 30, "debs@yahoo.com");
		User user3 = new User("Patrick", 54, "patrick@eircom.net");
		users.add(user1);
		users.add(user2);
		users.add(user3);
		for (User user : users) {
			System.out.println("A user's name is " + user.getName());
		}
	}

	public static void main(String[] args) {
		ListsWithMethods listsWithMethods = new ListsWithMethods();
	}
}

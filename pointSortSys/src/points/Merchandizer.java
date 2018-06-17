package points;

import java.util.HashMap;
import java.util.LinkedList;

public class Merchandizer {
	public Merchandizer( LinkedList<User> prevBuyers, String firstName, String lastName,
			String userName, String email, String password) {
		this.merch = new LinkedList<merch>();
		this.prevBuyers = prevBuyers;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	
	private LinkedList<merch> merch;
	private LinkedList<User> prevBuyers;
	private String firstName, lastName, userName, email, password;
	public LinkedList<merch> getMerch() {
		return merch;
	}
	public LinkedList<User> getPrevBuyers() {
		return prevBuyers;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUserName() {
		return userName;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void addMerch(merch x){
		if(!this.merch.contains(x)){
		this.merch.add(x);
		}
		else{
		int i=this.merch.indexOf(x);
			this.merch.get(i).increaseAmount(1);
		}
	}
	public void setMerch(LinkedList<merch> merch) {
		this.merch = merch;
	}
	public void setPrevBuyers(LinkedList<User> prevBuyers) {
		this.prevBuyers = prevBuyers;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}

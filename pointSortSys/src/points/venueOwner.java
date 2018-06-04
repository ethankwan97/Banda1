package points;

import java.util.LinkedList;

public class venueOwner {
	
	public venueOwner(String userName, String firstName, String lastName, String passWord, String city, String state,
			 double posX, double posY){
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passWord = passWord;
		this.city = city;
		this.state = state;
		this.ownersVenues =  new LinkedList<venue>();
		this.posX = posX;
		this.posY = posY;
		String[] tempMerch={""};
		this.merchLookingFor=tempMerch;
		this.merchScore=new CompMerchToOwner(this,0);
		this.possibleMerch=new LinkedList<merch>();
	}
	private String userName, firstName, lastName, passWord, city, state;
	private LinkedList<venue> ownersVenues;
	private String[] merchLookingFor;
	private CompMerchToOwner merchScore;
	private double posX, posY;
	private LinkedList<merch> possibleMerch;
	public String getUserName() {
		return userName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public LinkedList<merch> getPossibleMerch() {
		return possibleMerch;
	}
	public void setPossibleMerch(LinkedList<merch> possibleMerch) {
		this.possibleMerch = possibleMerch;
	}
	public CompMerchToOwner getMerchScore() {
		return merchScore;
	}
	public void setMerchScore(CompMerchToOwner merchScore) {
		this.merchScore = merchScore;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassWord() {
		return passWord;
	}
	
	public String[] getMerchLookingFor() {
		return merchLookingFor;
	}
	public void setMerchLookingFor(String[] merchLookingFor) {
		this.merchLookingFor = merchLookingFor;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public LinkedList<venue> getOwnersVenues() {
		return ownersVenues;
	}
	public double getPosX() {
		return posX;
	}
	public double getPosY() {
		return posY;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setOwnersVenues(LinkedList<venue> ownersVenues) {
		this.ownersVenues = ownersVenues;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}
    
	
    
}

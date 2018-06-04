package points;

import java.util.LinkedList;
public class venue {
	public venue(String name, String city, String state, double posX,
			double posY,  venueOwner owner, int size) {
	
		this.name = name;
		this.city = city;
		this.state = state;
		this.posX = posX;
		this.posY = posY;
		this.gigs = new LinkedList<gig>();
		this.owner = owner;
		this.size = size;
	}
	private String name, city, state;
	private double posX, posY;
	private LinkedList<gig> gigs;
	private venueOwner owner;
	private int size;
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public double getPosX() {
		return posX;
	}
	public double getPosY() {
		return posY;
	}
	public LinkedList<gig> getGigs() {
		return gigs;
	}
	public venueOwner getOwner() {
		return owner;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}
	public void setGigs(LinkedList<gig> gigs) {
		this.gigs = gigs;
	}
	public void setOwner(venueOwner owner) {
		this.owner = owner;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	
	
	

}

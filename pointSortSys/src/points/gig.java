package points;

import java.util.LinkedList;

public class gig {
	public gig(String name,double maxWillToPay, venue venueAt, int day, 
			String[] genresLookingFor, String contactFirstName, String contactLastName, String contactEmail,
			int contactPhoneNum, int expectedAudiance, String type) {
		super();
		this.maxWillToPay = maxWillToPay;
		this.venueAt = venueAt;
		this.bandsCompatible = new LinkedList<band>();
		this.bandsCompPay = new LinkedList<band>();
		this.day = day;
		this.genresLookingFor = genresLookingFor;
		this.contactFirstName = contactFirstName;
		this.contactLastName = contactLastName;
		this.contactEmail = contactEmail;
		this.contactPhoneNum = contactPhoneNum;
		this.expectedAudiance = expectedAudiance;
		this.bandsCompDay = new LinkedList<band>();
		this.bandsCompG = new LinkedList<band>();
		this.bandsType=new LinkedList<band>();
		this.bandsCompPay = new LinkedList<band>();
		this.bandsPayAndDist = new LinkedList<band>();
		this.compScore=new CompbandToGig(this, 0);
		this.type=type;
		this.name=name;
	}
	private double maxWillToPay;
	private CompbandToGig compScore;
	private venue venueAt;
	private LinkedList<band> bandsCompatible, bandsCompPay, bandsPayAndDist, bandsCompG, bandsCompDay,bandsType;
	private int day;
	private String[] genresLookingFor;
	private String contactFirstName, contactLastName, contactEmail,type, name;
	private int contactPhoneNum, expectedAudiance;
	public double getMaxWillToPay() {
		return maxWillToPay;
	}
	public venue getVenueAt() {
		return venueAt;
	}
	public LinkedList<band> getBandsCompatible() {
		return bandsCompatible;
	}
	
	public LinkedList<band> getBandsType() {
		return bandsType;
	}
	public void setBandsType(LinkedList<band> bandsType) {
		this.bandsType = bandsType;
	}
	public LinkedList<band> getBandsCompPay() {
		return bandsCompPay;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LinkedList<band> getBandsCompDay() {
		return bandsCompDay;
	}
	public void setBandsCompDay(LinkedList<band> bandsCompDay) {
		this.bandsCompDay = bandsCompDay;
	}
	public LinkedList<band> getBandsCompG() {
		return bandsCompG;
	}
	
	public CompbandToGig getCompScore() {
		return compScore;
	}
	public void setCompScore(CompbandToGig compScore) {
		this.compScore = compScore;
	}
	public void setBandsCompG(LinkedList<band> bandsCompG) {
		this.bandsCompG = bandsCompG;
	}
	public void setBandsCompPay(LinkedList<band> bandsCompPay) {
		this.bandsCompPay = bandsCompPay;
	}
	public int getDay() {
		return day;
	}
	
	public String[] getGenresLookingFor() {
		return genresLookingFor;
	}
	public String getContactFirstName() {
		return contactFirstName;
	}
	public String getContactLastName() {
		return contactLastName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	
	public LinkedList<band> getBandsPayAndDist() {
		return bandsPayAndDist;
	}
	public void setBandsPayAndDist(LinkedList<band> bandsPayAndDist) {
		this.bandsPayAndDist = bandsPayAndDist;
	}
	public int getContactPhoneNum() {
		return contactPhoneNum;
	}
	public int getExpectedAudiance() {
		return expectedAudiance;
	}
	public void setMaxWillToPay(double maxWillToPay) {
		this.maxWillToPay = maxWillToPay;
	}
	public void setVenueAt(venue venueAt) {
		this.venueAt = venueAt;
	}
	public void setBandsCompatible(LinkedList<band> bandsCompatible) {
		this.bandsCompatible = bandsCompatible;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setGenresLookingFor(String[] genresLookingFor) {
		this.genresLookingFor = genresLookingFor;
	}
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public void setContactPhoneNum(int contactPhoneNum) {
		this.contactPhoneNum = contactPhoneNum;
	}
	public void setExpectedAudiance(int expectedAudiance) {
		this.expectedAudiance = expectedAudiance;
	}
	@Override
	public String toString() {
		return "gig [venueAt=" + venueAt + ", name=" + name + "]";
	}
	public String toStringBandComp(){
		return this.bandsCompatible.toString();
	}
	
	

}

package points;

import java.util.Arrays;
import java.util.LinkedList;

public class merch {
	public merch(String type, String name, double price, double rating, int amountLeft, int amountSold,
			Merchandizer seller, LinkedList<User> buyers, String[] suitable, String[] genres) {
		this.type = type;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.amountLeft = amountLeft;
		this.amountSold = amountSold;
		this.seller = seller;
		this.buyers = buyers;
		this.suitableFor=suitable;
		this.genres=genres;
		this.userScore= new CompUserToMerch(this,0);
		this.bandBuyers= new LinkedList<band>();
		this.compBand= new CompMerchToBand(this, 0);
		this.ownerBuyers=new LinkedList<venueOwner>();
		this.compOwner= new CompOwnerToMerch(this,0);
	}
	private String type, name;
	private String[] suitableFor, genres;
	private double price, rating;
	private int amountLeft, amountSold;
	private Merchandizer seller;
	private LinkedList<User> buyers;
	private LinkedList<band> bandBuyers;
	private LinkedList<venueOwner> ownerBuyers;
	private CompMerchToBand compBand;
	private CompOwnerToMerch compOwner;
	private CompUserToMerch userScore;
	
	public void increaseAmount(int x){
		this.amountLeft+=x;
	}
	public void decreaseAmount(int x){
		this.amountLeft-=x;
	}
	
	
	
	public CompOwnerToMerch getCompOwner() {
		return compOwner;
	}
	public void setCompOwner(CompOwnerToMerch compOwner) {
		this.compOwner = compOwner;
	}
	public LinkedList<venueOwner> getOwnerBuyers() {
		return ownerBuyers;
	}
	public void setOwnerBuyers(LinkedList<venueOwner> ownerBuyers) {
		this.ownerBuyers = ownerBuyers;
	}
	public CompMerchToBand getCompBand() {
		return compBand;
	}
	public void setCompBand(CompMerchToBand compBand) {
		this.compBand = compBand;
	}
	public LinkedList<band> getBandBuyers() {
		return bandBuyers;
	}
	public void setBandBuyers(LinkedList<band> bandBuyers) {
		this.bandBuyers = bandBuyers;
	}
	public CompUserToMerch getUserScore() {
		return userScore;
	}
	public void setUserScore(CompUserToMerch userScore) {
		this.userScore = userScore;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public String[] getSuitableFor() {
		return suitableFor;
	}
	public String[] getGenres() {
		return genres;
	}
	public double getPrice() {
		return price;
	}
	public double getRating() {
		return rating;
	}
	public int getAmountLeft() {
		return amountLeft;
	}
	public int getAmountSold() {
		return amountSold;
	}
	public Merchandizer getSeller() {
		return seller;
	}
	public LinkedList<User> getBuyers() {
		return buyers;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSuitableFor(String[] suitableFor) {
		this.suitableFor = suitableFor;
	}
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public void setAmountLeft(int amountLeft) {
		this.amountLeft = amountLeft;
	}
	public void setAmountSold(int amountSold) {
		this.amountSold = amountSold;
	}
	public void setSeller(Merchandizer seller) {
		this.seller = seller;
	}
	public void setBuyers(LinkedList<User> buyers) {
		this.buyers = buyers;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(genres);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((seller == null) ? 0 : seller.hashCode());
		result = prime * result + Arrays.hashCode(suitableFor);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		merch other = (merch) obj;
		if (!Arrays.equals(genres, other.genres))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (seller == null) {
			if (other.seller != null)
				return false;
		} else if (!seller.equals(other.seller))
			return false;
		if (!Arrays.equals(suitableFor, other.suitableFor))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	

}

package points;

import java.util.Arrays;
import java.util.LinkedList;
public class band {
public band(LinkedList<User> bandMembers, double posX, double posY, double maxDist,
			double minimumPay, int years, String name, int[] daysWillingToPlay, String[] topGenres,int max, String[] types){
		this.bandMembers = bandMembers;
		this.venues = new LinkedList<venue>();
		this.gigs = new LinkedList<gig>();
		this.posX = posX;
		this.posY = posY;
		this.maxDist = maxDist;
		this.minimumPay = minimumPay;
		this.years = years;
		this.gigs = new LinkedList<gig>();
		this.gigsCompDay = new LinkedList<gig>();
		this.gigsCompPay = new LinkedList<gig>();
		this.gigsGComp = new LinkedList<gig>();
		this.gigsPayAndDist = new LinkedList<gig>();
		this.compToGig = new CompatibleGigToBand(this, 0);
		this.rating=0;
		this.maxAudiance=max;
		this.typesOfGigs=types;
		double[] tempGVal=new double[15];
		for (User member: bandMembers){
			for(int i=0; i<member.getGenreVal().length; i++){
				tempGVal[i]+= member.getGenreVal()[i];
				
			}
		}
		for(int i=0; i<tempGVal.length; i++){
			tempGVal[i]=tempGVal[i]/((double)bandMembers.size());
		}
		this.genreVal = tempGVal;
		
		this.topGenres = topGenres;
		int numInst =0;
		for(User member: bandMembers){
			numInst+=member.getPlays().length;
		}
		String[] tempInst= new String[numInst];
		int memNum=0;
		for(User member: bandMembers){
			memNum+=1;
			User x = member;
			int offset=0;
			switch (memNum){
			  case 1:
				  offset=0;
				  break;
			  case 2:
				x = (User) bandMembers.toArray()[0];
				offset=x.getPlays().length;
				break;
			  case 3:
				 x = (User) bandMembers.toArray()[1];
				 offset=x.getPlays().length;
				 break;
			  case 4:
				  x = (User) bandMembers.toArray()[2];
					 offset=x.getPlays().length;
					 break;
			  case 5:
				  x = (User) bandMembers.toArray()[3];
					 offset=x.getPlays().length;
					 break;
			  case 6:
				  x = (User) bandMembers.toArray()[4];
					 offset=x.getPlays().length;
					 break;
			  case 7:
				  x = (User) bandMembers.toArray()[5];
					 offset=x.getPlays().length;
					 break;
			  case 8:
				  x = (User) bandMembers.toArray()[6];
					 offset=x.getPlays().length;
					 break;
			  case 9:
				  x = (User) bandMembers.toArray()[7];
					 offset=x.getPlays().length;
					 break;
			  case 10:
				  x = (User) bandMembers.toArray()[8];
					 offset=x.getPlays().length;
					 break;
			  case 11:
				  x = (User) bandMembers.toArray()[9];
					 offset=x.getPlays().length;
					 break;
			  case 12:
				  x = (User) bandMembers.toArray()[10];
					 offset=x.getPlays().length;
					 break;
			  case 13:
				  x = (User) bandMembers.toArray()[11];
				 offset=x.getPlays().length;
				 break;
			    
			}
			for(int i=0; i<member.getPlays().length; i++){
				tempInst[i+offset]=member.getPlays()[i];
			}
		}
		
		this.instruments = tempInst;
		this.name = name;
		this.daysWillingToPlay = daysWillingToPlay;
		this.numRatings=0;
		this.possibleMerch= new LinkedList<merch>();
		this.compMerch=new CompBandToMerch(this, 0);
		String[] tempmerch = {""};
		this.merchLookingFor=tempmerch;
	}
private LinkedList<User> bandMembers;
private LinkedList<venue> venues;
private LinkedList<gig> gigs, gigsCompPay, gigsPayAndDist, gigsGComp, gigsCompDay;
private double posX, posY, maxDist, minimumPay, rating, numRatings;
private int years, maxAudiance, minAudiance;
private double[] genreVal;
private String[] topGenres, instruments, typesOfGigs, merchLookingFor;
private String name;
private int[] daysWillingToPlay;
private CompatibleGigToBand compToGig;
private LinkedList<merch> possibleMerch;
private CompBandToMerch compMerch;



public LinkedList<User> getBandMembers() {
	return bandMembers;
}
public LinkedList<venue> getVenues() {
	return venues;
}


public String[] getMerchLookingFor() {
	return merchLookingFor;
}
public void setMerchLookingFor(String[] merchLookingFor) {
	this.merchLookingFor = merchLookingFor;
}
public CompBandToMerch getCompMerch() {
	return compMerch;
}
public void setCompMerch(CompBandToMerch compMerch) {
	this.compMerch = compMerch;
}
public LinkedList<merch> getPossibleMerch() {
	return possibleMerch;
}
public void setPossibleMerch(LinkedList<merch> possibleMerch) {
	this.possibleMerch = possibleMerch;
}
public int getMaxAudiance() {
	return maxAudiance;
}
public int getMinAudiance() {
	return minAudiance;
}
public String[] getTypesOfGigs() {
	return typesOfGigs;
}
public void setMaxAudiance(int maxAudiance) {
	this.maxAudiance = maxAudiance;
}
public void setMinAudiance(int minAudiance) {
	this.minAudiance = minAudiance;
}
public void setTypesOfGigs(String[] typesOfGigs) {
	this.typesOfGigs = typesOfGigs;
}
public double getPosX() {
	return posX;
}

public LinkedList<gig> getGigsCompDay() {
	return gigsCompDay;
}
public void setGigsCompDay(LinkedList<gig> gigsCompDay) {
	this.gigsCompDay = gigsCompDay;
}

public double getPosY() {
	return posY;
}


public CompatibleGigToBand getCompToGig() {
	return compToGig;
}
public void setCompToGig(CompatibleGigToBand compToGig) {
	this.compToGig = compToGig;
}
public LinkedList<gig> getGigsGComp() {
	return gigsGComp;
}
public void setGigsGComp(LinkedList<gig> gigsGComp) {
	this.gigsGComp = gigsGComp;
}
public LinkedList<gig> getGigs() {
	return gigs;
}
public LinkedList<gig> getGigsCompPay() {
	return gigsCompPay;
}

public LinkedList<gig> getGigsPayAndDist() {
	return gigsPayAndDist;
}
public void setGigsPayAndDist(LinkedList<gig> gigsPayAndDist) {
	this.gigsPayAndDist = gigsPayAndDist;
}
public void setGigs(LinkedList<gig> gigs) {
	this.gigs = gigs;
}
public void setGigsCompPay(LinkedList<gig> gigsCompPay) {
	this.gigsCompPay = gigsCompPay;
}
public double getMaxDist() {
	return maxDist;
}
public double getMinimumPay() {
	return minimumPay;
}
public int getYears() {
	return years;
}
public double[] getGenreVal() {
	return genreVal;
}
public String[] getTopGenres() {
	return topGenres;
}
public String[] getInstruments() {
	return instruments;
}
public String getName() {
	return name;
}
public int[] getDaysWillingToPlay() {
	return daysWillingToPlay;
}
public void setBandMembers(LinkedList<User> bandMembers) {
	this.bandMembers = bandMembers;
}
public void setVenues(LinkedList<venue> venues) {
	this.venues = venues;
}
public void setPosX(double posX) {
	this.posX = posX;
}
public void setPosY(double posY) {
	this.posY = posY;
}
public void setMaxDist(double maxDist) {
	this.maxDist = maxDist;
}
public void setMinimumPay(double minimumPay) {
	this.minimumPay = minimumPay;
}
public void setYears(int years) {
	this.years = years;
}
public void setGenreVal(double[] genreVal) {
	this.genreVal = genreVal;
}
public void setTopGenres(String[] topGenres) {
	this.topGenres = topGenres;
}
public void setInstruments(String[] instruments) {
	this.instruments = instruments;
}

public double getRating() {
	return rating;
}
public double getNumRatings() {
	return numRatings;
}
public void setRating(double rating) {
	this.rating = rating;
}
public void setNumRatings(double numRatings) {
	this.numRatings = numRatings;
}
public void setName(String name) {
	this.name = name;
}
public void setDaysWillingToPlay(int[] daysWillingToPlay) {
	this.daysWillingToPlay = daysWillingToPlay;
}

public void addToRating(double x){
	double change =x/this.numRatings;
	this.rating= this.rating+change;
}
@Override
public String toString() {
	return "band [topGenres=" + Arrays.toString(topGenres) + ", name=" + name + "]";
}
public String toStringGigsComp(){
	return this.gigs.toString();
}
	
	
}

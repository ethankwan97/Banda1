package points;

import java.util.LinkedList;

public class jam {
		public jam(int startTime, int endTime, User starter, double posX, double posY, String city,
			String state, String country,int spots, LinkedList<String> instsNeeded) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.starter=starter;
		this.members = new LinkedList<User>();
		this.members.add(starter);
		this.posX = posX;
		this.posY = posY;
		this.city = city;
		this.state = state;
		this.country = country;
		this.spots=spots;
		this.active=true;
		this.insts=new LinkedList<String>();
		String[] tempInst=starter.getPlays();
		for(int i=0; i<this.starter.getPlays().length;i++){
			this.insts.add(this.starter.getPlays()[i]);
		}
		this.instsNeeded=instsNeeded;
		for(int i=0; i<this.starter.getGenreVal().length; i++){
			this.genreVals[i]=this.starter.getGenreVal()[i];
		}
	}
		private int startTime, endTime, spots;
		private LinkedList<User> members;
		private double posX, posY;
		private String city, state, country;
		private LinkedList<String> insts, instsNeeded;
		private double[] genreVals;
		private User starter;
		private boolean active;
		public int getStartTime() {
			return startTime;
		}
		public int getEndTime() {
			return endTime;
		}
		public LinkedList<User> getMembers() {
			return members;
		}
		public double getPosX() {
			return posX;
		}
		public double getPosY() {
			return posY;
		}
		public String getCity() {
			return city;
		}
		public String getState() {
			return state;
		}
		
		public LinkedList<String> getInsts() {
			return insts;
		}
		public LinkedList<String> getInstsNeeded() {
			return instsNeeded;
		}
		public void setInsts(LinkedList<String> insts) {
			this.insts = insts;
		}
		public void setInstsNeeded(LinkedList<String> instsNeeded) {
			this.instsNeeded = instsNeeded;
		}
		public double[] getGenreVals() {
			return genreVals;
		}
		public User getStarter() {
			return starter;
		}
		public boolean isActive() {
			return active;
		}
		public void setGenreVals(double[] genreVals) {
			this.genreVals = genreVals;
		}
		public void setStarter(User starter) {
			this.starter = starter;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		public String getCountry() {
			return country;
		}
		public void setStartTime(int startTime) {
			this.startTime = startTime;
		}
		public void setEndTime(int endTime) {
			this.endTime = endTime;
		}
		public void setMembers(LinkedList<User> members) {
			this.members = members;
		}
		public void setPosX(double posX) {
			this.posX = posX;
		}
		public void setPosY(double posY) {
			this.posY = posY;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setState(String state) {
			this.state = state;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public void decreaseSpots(int x){
			this.spots-=x;
		}
		public int getSpots() {
			return spots;
		}
		public void setSpots(int spots) {
			this.spots = spots;
		}
		public void addJammers(User x){
			this.members.add(x);
			for(int i=0; i<x.getPlays().length; i++){
				this.insts.add(x.getPlays()[i]);
				
			}
			this.instsNeeded.remove(x.getPrefferedJamInst());
			this.spots-=1;
		}
		
		public void endOfJamTime(double timeNow){
			if(timeNow>this.endTime){
				this.setActive(false);
			}
			else{
				this.setActive(true);
			}
		}
		
}

package points;

public class CompOwnerToMerch {
	public CompOwnerToMerch(merch myMerch, int compScore) {
		this.myMerch = myMerch;
		this.compScore = compScore;
	}
	private venueOwner myOwner;
	private merch myMerch;
	private int compScore;
	public venueOwner getMyOwner() {
		return myOwner;
	}
	public merch getMyMerch() {
		return myMerch;
	}
	public int getCompScore() {
		return compScore;
	}
	public void setMyOwner(venueOwner myOwner) {
		this.myOwner = myOwner;
	}
	public void setMyMerch(merch myMerch) {
		this.myMerch = myMerch;
	}
	public void setCompScore(int compScore) {
		this.compScore = compScore;
	}
	public void decreaseCompScore(int x){
		this.compScore-=x;
	}


}

package points;

public class compMerchToUser {
	public compMerchToUser(User myUser, int compScore) {
		super();
		this.myUser = myUser;
		this.compScore = compScore;
	}
	private User myUser;
	private merch myMerch;
	private int compScore;
	
	public void increaseCompScore(int x){
		this.compScore +=x;
	}
	public void decreaseCompScore(int x){
		this.compScore-=x;
	}
	public User getMyUser() {
		return myUser;
	}
	public merch getMyMerch() {
		return myMerch;
	}
	public int getCompScore() {
		return compScore;
	}
	public void setMyUser(User myUser) {
		this.myUser = myUser;
	}
	public void setMyMerch(merch myMerch) {
		this.myMerch = myMerch;
	}
	public void setCompScore(int compScore) {
		this.compScore = compScore;
	}

	
	
	
}

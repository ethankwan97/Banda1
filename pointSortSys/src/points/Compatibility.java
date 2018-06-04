package points;

public class Compatibility {

	public Compatibility(User myUser, int compScore) {
		super();
		MyUser = myUser;
		this.otherUser = myUser;
		this.compScore = compScore;
	}
	private User MyUser, otherUser;
	private int compScore;
	public User getMyUser() {
		return MyUser;
	}
	public User getOtherUser() {
		return otherUser;
	}
	public int getCompScore() {
		return compScore;
	}
	public void setMyUser(User myUser) {
		MyUser = myUser;
	}
	public void setOtherUser(User otherUser) {
		this.otherUser = otherUser;
	}
	public void setCompScore(int compScore) {
		this.compScore = compScore;
	}
	
	
	
	
}

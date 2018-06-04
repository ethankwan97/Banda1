package points;

public class CompBandToMerch {

	public CompBandToMerch(band myBand, int compScore) {
		
		this.myBand = myBand;
		this.compScore = compScore;
	}
	private band myBand;
	private merch myMerch;
	private int compScore;
	
	public void increaseCompScore(int x){
		this.compScore +=x;
	}
	public void decreaseCompScore(int x){
		this.compScore-=x;
	}
	public band getMyBand() {
		return myBand;
	}
	public merch getMyMerch() {
		return myMerch;
	}
	public int getCompScore() {
		return compScore;
	}
	public void setMyBand(band myBand) {
		this.myBand = myBand;
	}
	public void setMyMerch(merch myMerch) {
		this.myMerch = myMerch;
	}
	public void setCompScore(int compScore) {
		this.compScore = compScore;
	}
}

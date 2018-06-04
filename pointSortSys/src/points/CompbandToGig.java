package points;

public class CompbandToGig {
	public CompbandToGig( gig myGig, int compSocre) {
		this.myGig = myGig;
		this.compSocre = compSocre;
	}
	private gig myGig;
	private band myBand;
	private int compSocre;
	public gig getMyGig() {
		return myGig;
	}
	public band getMyBand() {
		return myBand;
	}
	public int getCompSocre() {
		return compSocre;
	}
	public void setMyGig(gig myGig) {
		this.myGig = myGig;
	}
	public void setMyBand(band myBand) {
		this.myBand = myBand;
	}
	public void setCompSocre(int compSocre) {
		this.compSocre = compSocre;
	}
	
	public void increaseCompSocre(int x){
		this.compSocre= this.compSocre+x;
	}
	
}

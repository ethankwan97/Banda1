package points;

import java.util.Comparator;

public class ComparatorBandForMerch implements Comparator<band>  {

	@Override
	public int compare(band a, band b) {
	
		return a.getCompMerch().getCompScore()-b.getCompMerch().getCompScore();
	}
	
	
	

}

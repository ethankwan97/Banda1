package points;

import java.util.Comparator;

public class sortByCompBand implements Comparator<band>{

	@Override
	public int compare(band a, band b) {
		return a.getCompToGig().getCompSocre()-b.getCompToGig().getCompSocre();
	}
	

	
	
}

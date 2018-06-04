package points;

import java.util.Comparator;

public class ComparatorOwnersForMerch implements Comparator<venueOwner> {

	@Override
	public int compare(venueOwner a, venueOwner b) {
		return a.getMerchScore().getCompScore()-b.getMerchScore().getCompScore();
	}

}

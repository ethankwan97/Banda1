package points;

import java.util.Comparator;

public class ComparatorMerchForBand implements Comparator<merch>{

	@Override
	public int compare(merch a, merch b) {
		return a.getCompBand().getCompScore()-b.getCompBand().getCompScore();
	}

}

package points;

import java.util.Comparator;

public class ComparatorMerchForUsers implements Comparator<merch>{

	@Override
	public int compare(merch a, merch b) {
		
		return a.getUserScore().getCompScore()-b.getUserScore().getCompScore();
	}
	

}

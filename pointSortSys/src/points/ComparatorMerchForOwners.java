package points;

import java.util.Comparator;

public class ComparatorMerchForOwners implements Comparator<merch>{

	@Override
	public int compare(merch a, merch b) {
		
		return a.getCompOwner().getCompScore()-b.getCompOwner().getCompScore();
	}

}

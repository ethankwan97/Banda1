package points;

import java.util.Comparator;

public class sortCompForGigs implements Comparator<gig>{

	@Override
	public int compare(gig a, gig b) {
		return a.getCompScore().getCompSocre()-b.getCompScore().getCompSocre();
	}

}

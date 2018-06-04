package points;

import java.util.Comparator;

public class CompatorMerchUsers implements Comparator<User>{

	@Override
	public int compare(User a, User b) {
		return a.getCompToMerch().getCompScore()-b.getCompToMerch().getCompScore();
		
	}

}

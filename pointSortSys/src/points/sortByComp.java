package points;
import java.util.*;

public class sortByComp implements Comparator<User>{

	@Override
	public int compare(User a, User b) {
		
		return a.getTempCompScore().getCompScore()-b.getTempCompScore().getCompScore();
	}

}

package points;

import java.util.LinkedList;

public class jamAlg {
	public jamAlg(LinkedList<User> users) {
		this.users = users;
		
		this.jammers= new LinkedList<User>();
	}

	private LinkedList<User> users;
	private LinkedList<User> jammers;
	public void matchActiveJammers(jam myJam){
		
		
		SortAlg x= new SortAlg(this.jammers);
		x.callerCompare();
		for(User myUser: myJam.getStarter().getCompatibleSorted()){
			if(myJam.getSpots()==0){
				break;
			}
			else{
				for(int i=0; i<myUser.getPlays().length;i++){
					if(myJam.getInstsNeeded().contains(myUser.getPlays()[i])){
						if(!myJam.getMembers().contains(myUser)){
							myJam.addJammers(myUser);
							myUser.getJamsIn().add(myJam);
							jammers.remove(myUser);
						
						}
					}
				}
			}
			
			
		}
		
	}
	
	public void callerForJams(){
		for(User x: this.users){
				x.cleanUpJams();
				if(x.isJam()){
					this.jammers.add(x);
				}
			}
		for(User myUser: this.jammers){
			for(jam x: myUser.getJamsMade()){
				matchActiveJammers(x);
			}
		}
		
	}
	
}

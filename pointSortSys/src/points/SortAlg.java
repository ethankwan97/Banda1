package points;

import java.util.Collections;

import java.util.LinkedList;
public class SortAlg {
		public SortAlg(LinkedList<User> inputUsers) {
		this.inputUsers = inputUsers;
	}

		private LinkedList<User>  inputUsers;
		
		void setCompatibleUsersSorted(User myUser){
			if(!this.inputUsers.contains(myUser)){
					this.inputUsers.add(myUser);
			}
				for (User otherUser : inputUsers) {
					
				    if(otherUser==myUser){
				    	continue;
				    }
				    for(int i =0; i<myUser.getLookingForS().length; i++){
				    	for(int j =0; j< otherUser.getPlays().length; j++){
				    		if(myUser.getLookingForS()[i] == otherUser.getPlays()[j]){
				    			if(!myUser.getLookingFor().contains(otherUser)){
				    			myUser.getLookingFor().add(otherUser);
				    			}
				    		}
				    	}	
				    }
				    
				    for(int i =0; i<myUser.getPlays().length; i++){
				    	
				    	for(int j =0; j< otherUser.getLookingForS().length; j++){
				    		
				    		
				    		if(myUser.getPlays()[i] == otherUser.getLookingForS()[j]){
				    			if(!myUser.getLookingForMe().contains(otherUser)){
				    			myUser.getLookingForMe().add(otherUser);
				    			}
				    		}
				    	}	
				    }
				}
				    for(User x : myUser.getLookingFor()){
				    	if(myUser.getLookingForMe().contains(x)){
				    		myUser.getCompatibleInst().add(x);
				    	}
				    }
				
				    
				    for(User x : myUser.getCompatibleInst()){
				    	double distPart=Math.sqrt(((myUser.getPosX()-x.getPosX())*(myUser.getPosX()-x.getPosX())) + ((myUser.getPosY()-x.getPosY())*(myUser.getPosY()-x.getPosY())));
				    	if(distPart<Math.min(myUser.getMaxDist(), x.getMaxDist())){
				    		myUser.getCompatibleDistnInst().add(x);
				    	}
				    }
				    
				    LinkedList<User> genreUsers= new LinkedList<User>();
				 
				    for(User x :myUser.getCompatibleDistnInst()){
				    	int compatibiltyGScore = 125;
				    	for(int i=0; i<myUser.getGenreVal().length; i++){
				    		int diffGVal=Math.abs(myUser.getGenreVal()[i]-x.getGenreVal()[i]);
				    		compatibiltyGScore=compatibiltyGScore-diffGVal;
				    		int goalDiff=4*Math.abs(myUser.getGoals()-x.getGoals());
				    		compatibiltyGScore=compatibiltyGScore-goalDiff;
				    	}
				    	x.getTempCompScore().setOtherUser(myUser);
				    	x.getTempCompScore().setCompScore(compatibiltyGScore);
				    	genreUsers.add(x);
				    	
				    }
				   
				    Collections.sort(genreUsers, new sortByComp());
				    Collections.reverse(genreUsers);
				    if(genreUsers.size()>50){
				    	for(int i=0; i<49; i++){
				    	myUser.getCompatibleSorted().add(genreUsers.get(i));
				    	}
				    }
				    else{
				    	myUser.setCompatibleSorted(genreUsers);
				    }
					
				   myUser.getCompatibleDistnInst().clear();
				   myUser.getCompatibleInst().clear();
				   myUser.getLookingFor().clear();
				   myUser.getLookingForMe().clear();
					
				
				
				
			}
			
		
		void callerCompare(){
			for(User myUser : inputUsers){
				myUser.getCompatibleSorted().clear();
				setCompatibleUsersSorted(myUser);
			}
			
		}
		
		
		
		
		
			
			
		}
		
		
		
		
		
		
		
	


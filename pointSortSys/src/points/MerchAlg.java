package points;

import java.util.Collections;
import java.util.LinkedList;

public class MerchAlg {
	public MerchAlg(LinkedList<Merchandizer> sellers, LinkedList<User> buyers, LinkedList<band> bands,
			LinkedList<venueOwner> owners) {
		this.setSellers(sellers);
		this.users = buyers;
		this.bands = bands;
		this.owners = owners;
		this.merch=new LinkedList<merch>();
		for (Merchandizer x: this.sellers){
			for(merch y: x.getMerch()){
				if(!this.merch.contains(y)){
					this.merch.add(y);
				}
			}
		}
	}
	private LinkedList<Merchandizer> sellers;
	private LinkedList<User> users;
	private LinkedList<band> bands;
	private LinkedList <venueOwner> owners;
	private LinkedList<merch> merch;
	

	public void matchMerchToUsers(){
		for(merch myMerch: this.merch){
			for (User myUser: this.users){
				
				for(int i=0; i<myMerch.getSuitableFor().length; i++){
					for(int j=0; j<myUser.getPlays().length;j++){
						if(myMerch.getSuitableFor()[i]==myUser.getPlays()[j]){
							myUser.getCompToMerch().setMyMerch(myMerch);
							myUser.getCompToMerch().setMyUser(myUser);
							myUser.getCompToMerch().decreaseCompScore(10);
							if(!myMerch.getBuyers().contains(myUser)){
							myMerch.getBuyers().add(myUser);
							myUser.getPossibleMerch().add(myMerch);
							}
						}
						
					}
				}
				
				for(int i=0; i<myMerch.getGenres().length; i++){
					for(int j=0; j<myUser.getPlays().length;j++){
						if(myUser.getGenreOrdered()[j]==myMerch.getGenres()[i]){
							myUser.getCompToMerch().decreaseCompScore(5);
						 }
						}
					}
				for(int i=0; i<myUser.getLookingForMerch().length;i++){
					if(myUser.getLookingForMerch()[i]==myMerch.getType()){
						myUser.getCompToMerch().decreaseCompScore(100);
					}
				}
					
				 
			}
			Collections.sort(myMerch.getBuyers(), new CompatorMerchUsers());
		
		}
		
		for(User myUser: this.users){
			for(merch x: myUser.getPossibleMerch()){
				x.getUserScore().setMyMerch(x);
				x.getUserScore().setMyUser(myUser);
				x.getUserScore().setCompScore((int)x.getPrice());
				x.getUserScore().decreaseCompScore((int)(10*x.getRating()));
				for(int i=0; i<x.getSuitableFor().length; i++){
					for(int j=0; j<myUser.getPlays().length;j++){
						x.getUserScore().decreaseCompScore(10);
						}
					}
				
				for(int i=0; i<x.getGenres().length; i++){
					for(int j=0; j<myUser.getPlays().length;j++){
						   x.getUserScore().decreaseCompScore(5);
						}
					}
				
			}
			
			Collections.sort(myUser.getPossibleMerch(), new ComparatorMerchForUsers());
		}
			
	}
	
	
	
	public void matchMerchToBands(){
		for(merch myMerch : merch){
			for(int i=0; i<myMerch.getSuitableFor().length; i++){
				if(myMerch.getSuitableFor()[i]=="bands"){
					myMerch.setBandBuyers(bands);
				}
				else{
					continue;
				}
			}
			for(band myBand : myMerch.getBandBuyers()){
				myBand.getPossibleMerch().add(myMerch);
				for(int i=0; i<myMerch.getGenres().length; i++){
					for(int j=0; j<myBand.getTopGenres().length;j++){
							if(myMerch.getGenres()[i]==myBand.getTopGenres()[j]){
								myBand.getCompMerch().setMyBand(myBand);
								myBand.getCompMerch().setMyMerch(myMerch);
								myBand.getCompMerch().decreaseCompScore(5);
							}
						}
					}
				
				for(int i=0; i<myBand.getMerchLookingFor().length; i++){
					if(myMerch.getType()==myBand.getMerchLookingFor()[i]){
						myBand.getCompMerch().decreaseCompScore(100);
					}
				}
				
			}
			Collections.sort(myMerch.getBandBuyers(), new ComparatorBandForMerch());
			
		}
		
		for(band myBand:bands){
			for(merch myMerch: myBand.getPossibleMerch()){
				myMerch.getCompBand().setMyBand(myBand);
				myMerch.getCompBand().setMyMerch(myMerch);
				myMerch.getCompBand().setCompScore((int)myMerch.getPrice());
				myMerch.getCompBand().decreaseCompScore((int)(10*myMerch.getRating()));
				
				for(int i=0; i<myMerch.getGenres().length; i++){
					for(int j=0; j<myBand.getTopGenres().length;j++){
						 if(myMerch.getGenres()[i]==myBand.getTopGenres()[j]){
							 myMerch.getCompBand().decreaseCompScore(5);
						 }
						}
					}
				for(int i=0; i<myBand.getMerchLookingFor().length;i++){
					if(myMerch.getType()==myBand.getMerchLookingFor()[i]){
						myMerch.decreaseAmount(100);
					}
				}
				
				
				
			}
			Collections.sort(myBand.getPossibleMerch(), new ComparatorMerchForBand());
		}
			
	}
	
	public void matchOwnersToMerch(){
		for(merch myMerch: this.merch){
			for(int i=0; i<myMerch.getSuitableFor().length;i++){
				if(myMerch.getSuitableFor()[i]=="owners"){
					myMerch.setOwnerBuyers(owners);
				}
			}
			
			for(venueOwner myOwner: myMerch.getOwnerBuyers()){
				myOwner.getPossibleMerch().add(myMerch);
				for(int i=0; i<myOwner.getMerchLookingFor().length;i++){
					if(myOwner.getMerchLookingFor()[i]==myMerch.getType()){
						myOwner.getMerchScore().setMyMerch(myMerch);
						myOwner.getMerchScore().setMyOwner(myOwner);
						myOwner.getMerchScore().decreaseCompScore(100);
					}
				}
				myOwner.getMerchScore().decreaseCompScore(myOwner.getOwnersVenues().size());
			}
			Collections.sort(myMerch.getOwnerBuyers(), new ComparatorOwnersForMerch());
		}
		
		
		for(venueOwner myOwner: owners){
			for(merch myMerch:myOwner.getPossibleMerch()){
				myMerch.getCompOwner().setMyMerch(myMerch);
				myMerch.getCompOwner().setMyOwner(myOwner);
				myMerch.getCompOwner().setCompScore((int)myMerch.getPrice());
				myMerch.getCompOwner().decreaseCompScore((int)(10*myMerch.getRating()));
				
				for(int i=0; i<myOwner.getMerchLookingFor().length; i++){
					if(myOwner.getMerchLookingFor()[i]==myMerch.getType()){
						myMerch.getCompOwner().decreaseCompScore(100);
					}
				}
				
			}
			
			Collections.sort(myOwner.getPossibleMerch(), new ComparatorMerchForOwners());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	public LinkedList<Merchandizer> getSellers() {
		return sellers;
	}


	public void setSellers(LinkedList<Merchandizer> sellers) {
		this.sellers = sellers;
	}
	
	

}

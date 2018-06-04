package points;

import java.util.Collections;
import java.util.LinkedList;

public class gigAlg {

	public gigAlg(LinkedList<band> inputBands, LinkedList<gig> inputGigs) {
		this.inputBands = inputBands;
		this.inputGigs = inputGigs;
	}
	private LinkedList<band> inputBands;
	private LinkedList<gig> inputGigs;
	
	
	
	void matchToGigsBands(){
		for(gig myGig: this.inputGigs){
			for(band myBand: this.inputBands){
				if(myGig.getMaxWillToPay()>=myBand.getMinimumPay()){
					myGig.getBandsCompPay().add(myBand);
					myBand.getGigsCompPay().add(myGig);
				}
				
			}
			for(band x :myGig.getBandsCompPay()){
				double distPartX=(myGig.getVenueAt().getPosX()-x.getPosX())*(myGig.getVenueAt().getPosX()-x.getPosX());
				double distPartY=(myGig.getVenueAt().getPosY()-x.getPosY())*(myGig.getVenueAt().getPosY()-x.getPosY());
				double dist= Math.sqrt(distPartX+distPartY);
				if(dist<x.getMaxDist()){
					myGig.getBandsPayAndDist().add(x);
					x.getGigsPayAndDist().add(myGig);
					
				}
			}
			
			for(band x: myGig.getBandsPayAndDist()){
				for(int i=0; i<x.getTopGenres().length; i++){
					for(int j=0; j<myGig.getGenresLookingFor().length; j++){
						if(myGig.getGenresLookingFor()[j]==x.getTopGenres()[i]){
							if(!myGig.getBandsCompG().contains(x)){
							myGig.getBandsCompG().add(x);
							x.getGigsGComp().add(myGig);
							}
							x.getCompToGig().setMyBand(x);
							x.getCompToGig().setMyGig(myGig);
							x.getCompToGig().increaseCompSocre(-10);
				        }
					}
				}
			}
			
			for(band x : myGig.getBandsCompG()){
				for(int i =0; i<x.getTypesOfGigs().length;i++){
					if(x.getTypesOfGigs()[i]==myGig.getType()){
						myGig.getBandsType().add(x);
					}
				}
				
			}
			
			for(band x: myGig.getBandsType()){
				for(int i=0; i<x.getDaysWillingToPlay().length; i++){
					if((x.getDaysWillingToPlay()[i]==myGig.getDay()) && !(x.getMaxAudiance()<myGig.getExpectedAudiance())){
						myGig.getBandsCompDay().add(x);
						x.getGigsCompDay().add(myGig);
						
					}
				}
				
			}
			
			
			
			
			for(band x: myGig.getBandsCompDay()){
				x.getCompToGig().setMyBand(x);
				x.getCompToGig().setMyGig(myGig);
				double diffPay=myGig.getMaxWillToPay()-x.getMinimumPay();
				x.getCompToGig().increaseCompSocre(-(int)diffPay);
				
			}
			
			
			for(band x: myGig.getBandsCompDay()){
				x.getCompToGig().increaseCompSocre(-(int)x.getRating());
				int diff=(x.getMaxAudiance()-myGig.getExpectedAudiance())/10;
				x.getCompToGig().increaseCompSocre(diff);
				
			}
			
			 Collections.sort(myGig.getBandsCompDay(), new sortByCompBand());
			 myGig.setBandsCompatible(myGig.getBandsCompDay());
		
			 myGig.getBandsCompG().clear();
			 myGig.getBandsCompPay().clear();
		}
		
		
		for(band myBand: inputBands){
			for(gig x:myBand.getGigsCompDay()){
				x.getCompScore().setCompSocre(-(int)x.getMaxWillToPay());
				x.getCompScore().increaseCompSocre(myBand.getMaxAudiance()-x.getExpectedAudiance());
			}
			Collections.sort(myBand.getGigsCompDay(), new sortCompForGigs());
			myBand.setGigs(myBand.getGigsCompDay());
		}
		
		
		

	}
	
}

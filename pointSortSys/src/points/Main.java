package points;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args){
	
	int[] alexGenre=  {7,5,6,7,4,3,2,1,3,2,3,4,5,3,2};
	String[] alexLooking= {"drums","piano","sing", "bass"};
	String[] alexPlays = {"guitar", "violin"};
	int[] koushGenre= {6,4,7,4,3,2,1,1,1,1,1,1,1,1,1};
	String[] koushLooking = {"guitar", "piano", "drummer"};
	String[] koushPlays = {"bass", "sing"};
	int[] eliGenre=   {2,2,1,1,1,1,1,1,4,7,6,3,5,7,7};
	String[] eliPlays= {"piano","drums"};
	String[] eliLooking={"sing","bass","violin"};
User alex = new User ("Booth", "Alex@gmail.com", "alexbo12", "ALex","Bothe", alexGenre, 50.3, 52, 100, alexLooking, alexPlays,4);
User kousha = new User("Koosh", "k@gmail.com", "1234546", "Kouhsa", "Masoumi", koushGenre,50.7,50.2,75,koushLooking,koushPlays,4);
User eli = new User("elishad", "eli@gmail.com", "4423553", "Eli", "Levin",eliGenre, 50.6, 50, 90,eliLooking, eliPlays,3);	
	 LinkedList<User> inputUsers= new LinkedList<User>();
	 
	 inputUsers.add(alex);
	 inputUsers.add(eli);
	 inputUsers.add(kousha);
		SortAlg sortShit = new SortAlg(inputUsers);
		sortShit.callerCompare();
		
		System.out.printf(alex.toString());
		System.out.println("CompatibleSorted= ");
		System.out.printf(alex.getCompatibleSorted().toString());
		System.out.println("");
		System.out.printf(eli.toString());
		System.out.println("CompatibleSorted= ");
		System.out.printf(eli.getCompatibleSorted().toString());
		System.out.println("");
		System.out.printf(kousha.toString());
		System.out.println("CompatibleSorted= ");
		System.out.printf(kousha.getCompatibleSorted().toString());
		
		
		int[] days={2,3,4,5};
		String[] genresB= {"jazz","rock", "blues"};
		String[] genresA= {"rock","jazz", "blues"};
		String[] genresBand2={"jazz","regge","rap"};
		
		String[] types={"bar", "birthday", "club"};
		band a=new band(inputUsers, 50, 50, 50, 100, 1, "dopeband",days, genresB, 300, types);
		band band2 = new band(inputUsers,50,50,50,100,1,"band2",days,genresBand2,350,types);
		 LinkedList<gig> gigs = new LinkedList<gig>();
		 venueOwner mrBitch = new venueOwner("Bitch", "Mr.", "Bitch","1232345","Chi","Ill",50,50);
		venue b = new venue("Jazz House", "Chicago", "Illinois", 40, 45, mrBitch, 100);
		mrBitch.getOwnersVenues().add(b);
		 gig x=new gig("Tequila, Theraflu(Meth), and Titties Tuesday",150,b, 3,genresA,"Mr.Bitch","Btichly","Bitch@gmail.com",22,250,"bar");
		 gig gig2=new gig("Whiskey, Weed and Wankers Wednesday",150,b,3,genresBand2,"Mr.Bitch","Btichly","Bitch@gmail.com",22,310,"bar");

		LinkedList<band> bands= new LinkedList<band>();
		bands.add(a);
		gigs.add(x);
		gigs.add(gig2);
		bands.add(band2);
		gigAlg y = new gigAlg(bands, gigs);
		y.matchToGigsBands();
		System.out.print(x.toString());
		System.out.println( "mathced bands:");
		System.out.println(x.toStringBandComp());
		System.out.print(a.toString());
		System.out.println("matched gigs: ");
		System.out.println(a.toStringGigsComp());
		
		
		
		
		
	}

}

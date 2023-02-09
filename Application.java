/**
 * This is the Application object that will launch our application
 * @author Rob Kelley
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter("487","Neutral",false,"AVERAGE");
		
		
		System.out.println(npc.reportStructure());
		System.out.println(npc.introduce());
		System.out.println("The random string is : " +npc.exclaim());
		
		System.out.println("\n");
		
		BasketballTeam bas =new BasketballTeam("Team 1,", "Mascot 1","Coach 1");
		bas.wins=20;
		bas.losses=7;
		bas.setfieldGoals(90);
		bas.setfieldGoalsAttempted(200);
		bas.setfreedThrows(80);
		bas.setfreeThrowsAttempted(100);
	
		System.out.println("Win percentage:  "+bas.getWinPercentage());
		System.out.println("Feild Goal percentage: "+bas.fieldGoalsPercentage());
		System.out.println("Free Throw percentage: "+bas.freeThrowsPercentage());
		
		
		
		
	}//end main

}//end class
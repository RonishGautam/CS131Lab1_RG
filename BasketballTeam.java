
public class BasketballTeam extends SportsTeam{
private int fieldGoals;
private int fieldGoalsAttempted;
private int freeThrows;
private int freeThrowsAttempted;

	public BasketballTeam(){
		super();
	this.fieldGoals=0;
	this.fieldGoalsAttempted=0;
	this.freeThrows=0;
	this.freeThrowsAttempted=0;
	
}
		public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		this.fieldGoals=0;
		this.fieldGoalsAttempted=0;
		this.freeThrows=0;
		this.freeThrowsAttempted=0;	

	}
	public double fieldGoalsPercentage(){
		return (double) fieldGoals/ (double) fieldGoalsAttempted;
	}
	public double freeThrowsPercentage() {
		return (double) freeThrows/ (double) freeThrowsAttempted;
	}
	
	public void setfieldGoals(int fieldGoals) {
		this.fieldGoals= fieldGoals;
	}
	public void setfieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted=fieldGoalsAttempted;
	}
	public void setfreedThrows(int freeThrows) {
		this.freeThrows= freeThrows;
	}
	public void setfreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted=freeThrowsAttempted;
	}
	
	
	
	public double [] getStats() {
		return new double [] {super.getWinPercentage(),fieldGoalsPercentage(), freeThrowsPercentage()};
	}
	}
	


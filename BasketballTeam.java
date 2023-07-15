import java.util.Arrays;
public class BasketballTeam extends SportsTeam{
	int fieldGoals, fieldGoalsAttempted, freeThrows, freeThrowsAttempted;
	
	public BasketballTeam() {
		super();
		fieldGoals=0;
		fieldGoalsAttempted=0;
		freeThrows=0; 
		freeThrowsAttempted=0;
	}
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super();
		fieldGoals=0;
		fieldGoalsAttempted=0;
		freeThrows=0; 
		freeThrowsAttempted=0;
	}
	
	public double fieldGoalPercentage() {
		double fieldGoalPercentage=(double)fieldGoals/(double)fieldGoalsAttempted;
		return fieldGoalPercentage;
	}
	
	public double freeThrowPercentage() {
		double freeThrowPercentage=(double)freeThrows/(double)freeThrowsAttempted;
		return freeThrowPercentage;
	}
	
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		this.wins=wins;
		this.losses=losses;
		this.fieldGoals=fieldGoals;
		this.fieldGoalsAttempted=fieldGoalsAttempted;
		this.freeThrows=freeThrows;
		this.freeThrowsAttempted=freeThrowsAttempted;
	}
	
	public double[] getStats() {
		double winRatio=super.getWinPercentage();
		double fieldGoalPercentage=this.fieldGoalPercentage();
		double freeThrowPercentage=this.freeThrowPercentage();
		double[] statsArray = {winRatio, fieldGoalPercentage, freeThrowPercentage};
		System.out.println(Arrays.toString(statsArray));
		return statsArray;
	}
}

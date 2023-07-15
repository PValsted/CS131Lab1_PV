
public abstract class SportsTeam {
	protected String teamName, teamMascot, headCoach;
	protected int wins, losses;
	
	public SportsTeam() {
		teamName="";
		teamMascot="";
		headCoach="";
		wins=0;
		losses=0;
	}
	
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName=teamName;
		this.teamMascot=teamMascot;
		this.headCoach=headCoach;
		wins=0;
		losses=0;
	}
	
	public double getWinPercentage() {
		return (double)wins/((double)wins+(double)losses);
	}

}

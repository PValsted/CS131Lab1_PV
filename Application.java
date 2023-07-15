public class Application {
	
  public static void main(String[] args) {
	  
    NonPlayerCharacter npc = new NonPlayerCharacter();
    System.out.println(npc.isActive());
    System.out.println(npc.getIntelligenceType());
    System.out.println(npc.reportStructure());
    System.out.println(npc.introduce());
    System.out.println(npc.exclaim());
    
    BasketballTeam bt=new BasketballTeam("Louisville", "Cardinals", "Kenny Payne");
    bt.setStats(10, 5, 40, 120, 60, 90);
    System.out.println(bt.freeThrowPercentage());
    bt.getStats();
    
  }
}
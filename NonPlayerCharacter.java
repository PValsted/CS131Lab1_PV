import java.util.Random;
public class NonPlayerCharacter extends GameCharacter{
	private boolean active;
	private String intelligenceType;
	
	public NonPlayerCharacter() {
		super();
		this.setActive(false);
		this.setIntelligenceType("AVERAGE");
	}
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		super();
		this.setActive(active);
		this.setIntelligenceType(intelligenceType);
	}
	
	public String reportStructure() {
		super.reportStructure();
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Active: " + isActive() + "\n");
		sb.append("Intelligence: " + getIntelligenceType() + "\n");
		sb.append("==================================\n");
		return super.reportStructure() + sb.toString();
	}
	
	public String introduce() {
		return "Hello, my name is " + super.getUniqueID() + ".";
	}
	
	public String exclaim() {
		Random r = new Random();
		int index=r.nextInt(5);
		String randString=null;
		
		if (index==0)
			randString="Dag Gummit";
		else if (index==1)
			randString="Doggone it";
		else if (index==2)
			randString="Holy cow";
		else if (index==3)
			randString="Jeez";
		else if (index==4)
			randString="Well cheese and crackers";
		
		return randString;
	}
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getIntelligenceType() {
		return intelligenceType;
	}
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}
	
}

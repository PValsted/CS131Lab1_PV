import java.util.Random;

public class GameCharacter {
		protected String uniqueID;
  
		protected String personality;
  
	public GameCharacter() {
		Random r = new Random();
		r.setSeed(1000L);
		int id = r.nextInt(1000);
		setUniqueID(Integer.toString(id));
		setPersonality("NEUTRAL");
	}
  
	public GameCharacter(String uniqueID, String personality) {
		setUniqueID(uniqueID);
		setPersonality(personality);
	}
  
	public String reportStructure() {
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("UniqueID: " + getUniqueID() + "\n");
		sb.append("Personality: " + getPersonality() + "\n");
		sb.append("==================================\n");
		return sb.toString();
	}
  
	public String getUniqueID() {
		return this.uniqueID;
	}
  
	public void setUniqueID(String name) {
		this.uniqueID = name;
	}
  
	public String getPersonality() {
		return this.personality;
	}
  
	public void setPersonality(String personality) {
		this.personality = personality;
	}
  
	public String toString() {
		return "GameCharacter [uniqueID=" + this.uniqueID + ", personality=" + this.personality + "]";
	}
}


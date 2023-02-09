import java.security.SecureRandom;
import java.util.Random;

public class NonPlayerCharacter extends GameCharacter {
	
	private boolean active;
	private String intelligenceType;	
	
	
		public NonPlayerCharacter() {
			super();
			setActive(false);


		}
	
	
	public NonPlayerCharacter(String uniqueid,String personality,boolean active,String intelligenceType){	
		super(uniqueid, personality);
		this.active=active;
		this.intelligenceType=intelligenceType;
	}
	public String reportStructure() {
		StringBuilder string=new StringBuilder();
		string.append(super.reportStructure()).append("Active: ").append(active).append("\n").append("Intelligence: ").append(intelligenceType);
		string.append("\n===============================");
		return string.toString();
		
		
	}
	public String introduce() {
	return "Hello my name is: " + uniqueID;
	}
	   public static String exclaim() {
	        String[] words = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
	        Random ra = new Random();
	        int index = ra.nextInt(words.length);
	        return words[index];
	    }
	   public void setInlligenceType(String intelligenceType) {
		   this.intelligenceType = intelligenceType;
	   }
	   public void setActive(boolean active) {
		   this.active=active;
	   }
	   }


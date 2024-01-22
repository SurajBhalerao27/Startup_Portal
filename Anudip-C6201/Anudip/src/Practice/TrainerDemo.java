package Practice;
class Trainer{
	private int trainerId;
	private String trainerName;
	private String subject;
	private String officeLocation;
	
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	
	
	
}
public class TrainerDemo {
public static void main(String[] args) {
	Trainer t=new Trainer();
	t.setTrainerId(101);
	t.setTrainerName("chaitali");
	t.setSubject("Java full stack ");
	t.setOfficeLocation("Vashi");
	
	
	int id=t.getTrainerId();
	String name=t.getTrainerName();
	String loc=t.getOfficeLocation();
	String sub=t.getSubject();
	
	System.out.println("Name of Trainer:"+name);
	System.out.println("ID of Trainer:"+id);
	System.out.println("Office location of trainer:"+loc);
	System.out.println("Assigned Subject for trainer:"+sub);
	
};

}

package collections;

/*
 * Comparable is an interface used to compare objects based on one of its properties.
 * When we want to sort collection of userdefined objects using sort method of the Collections
 * class we need to specify how the object have to be compared before sorting.
 * 
 * This is done with the help of Comparable interface.
 * We implement Comparable interface on our userdefined class and implement compareTo method
 * to specify the property on which comparison has to be done.
 */
public class Person implements Comparable<Person> {

	private Integer personId;;
	private String pname;
	private Boolean adult;
	private Integer age;
	private String nationality;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer personId, String pname, Boolean adult, Integer age, String nationality) {
		super();
		this.personId = personId;
		this.pname = pname;
		this.adult = adult;
		this.age = age;
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "\nPersonPojo [personId=" + personId + ", pname=" + pname + ", adult=" + adult + ", age=" + age
				+ ", nationality=" + nationality + "]";
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Boolean getAdult() {
		return adult;
	}

	public void setAdult(Boolean adult) {
		this.adult = adult;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public int compareTo(Person o) {
		return this.personId.compareTo(o.personId);

	}

}

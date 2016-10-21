

public class BootCampCandidates {
	
	//Create three private fields a name a surname and age
	private String name;
	private String surname;
	private int age;
	
	//Create a constructor that receives three arguments and initializes the variables
	BootCampCandidates (String name1, String surname1, int age1){
		this.name = name1;
		this.surname = surname1;
		this.age= age1;
	}
	
	//Create getters and setters for all your variables (six in total methods needed)
	public void setName(String name2){
		this.name=name2;
	}
	public String getName(){
		return this.name;
	}

	public void setSurname(String surname2){
		this.surname=surname2;
	}
	public String getSurname(){
		return this.surname;
	}
	
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
		
	//Create a method toString that returns the name surname and age of the candidate
	public String methodToString(){
	
	return "Name: "+this.name+" Surname: "+this.surname+ " Age: "+this.age;
	
	}
	
	
}

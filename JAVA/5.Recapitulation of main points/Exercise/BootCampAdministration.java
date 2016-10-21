
import java.util.ArrayList;

public class BootCampAdministration {

	// Create a private ArrayList with object of BootCampCandidates with name
	// anArrayListOfBootCamps
	private ArrayList<BootCampCandidates> anArrayListOfBootCamps;

	// Create a constructor which receives an array with BootCampCandidate
	// objects and initializes the anArrayListOfBootCamps ArrayList by adding all
	// BootCampCandidate array's elements in the the anArrayListOfBootCamps
	BootCampAdministration(BootCampCandidates[] arrayOfBootCampCandidates) {
		anArrayListOfBootCamps = new ArrayList<BootCampCandidates>();
		for (int i = 0; i < arrayOfBootCampCandidates.length; i++) {
			this.anArrayListOfBootCamps.add(arrayOfBootCampCandidates[i]);
		}

	}

	// Create setters and getters for BootCampAdministration
	public void setBootCampAdministration(ArrayList<BootCampCandidates> arrayListOfBootCampCandidates) {
		this.anArrayListOfBootCamps = arrayListOfBootCampCandidates;
	}

	public ArrayList<BootCampCandidates> getBootCampAdministration() {
		return this.anArrayListOfBootCamps;
	}

	// create an int method that returns the size of anArrayListOfBootCamps
	public int sizeOfAnArrayListOfBootcamps() {
		return this.anArrayListOfBootCamps.size();
	}

	// Create a method that adds a new BootCampCandidate inside the ArrayList
	public void addBootCampCandidate(String name,String surname,int age){
		BootCampCandidates candidate = new BootCampCandidates(name,surname,age);
		anArrayListOfBootCamps.add(candidate);
	}

	// Create a method that removes a candidate by name and returns true if
	// found or false if not
	// HINT: you have to use get() to get the object and equals to compare it
	public boolean removeBootCampCandidate(String name) {
		for (int i = 0; i < sizeOfAnArrayListOfBootcamps(); i++) {
			if (this.anArrayListOfBootCamps.get(i).getName().equals(name)) {
				this.anArrayListOfBootCamps.remove(i);
				return true;
			}
		}
		return false;
	}


	// Create a method to search for a boot camp member by surname and returns a
	// string with its information
	// if it's found and null if it's not found
	public String searchBootCampCandidate(String surname) {
		for (int i = 0; i < sizeOfAnArrayListOfBootcamps(); i++) {
			if (this.anArrayListOfBootCamps.get(i).getSurname().equals(surname)) {
				return this.anArrayListOfBootCamps.get(i).methodToString();
			}
		}
		return null;
	}

	// Create a method that can change a bootcampers age by having as input its
	// name and surname
	public void changeAgeOfBootCampCandidate(String name,String surname,int new_age) {
		for (int i = 0; i < sizeOfAnArrayListOfBootcamps(); i++) {
			if ((this.anArrayListOfBootCamps.get(i).getName().equals(name))&&(this.anArrayListOfBootCamps.get(i).getSurname().equals(surname))) {
				this.anArrayListOfBootCamps.get(i).setAge(new_age);
			}
		}
	}

}

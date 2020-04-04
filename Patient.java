package week09;
import java.util.Comparator;

//Kathleen Loeb

public class Patient {
 //Protected Variables
	protected String name;
	protected int severity;
	public int compareTo;

//Gets and sets
	public String getName() {
		return name;
	}
public void setName(String nameIntake) {
	this.name =nameIntake;
}

public int getSeverity() {
	return severity;
}
public void setSeverity(int severityIntake) {
	this.severity = severityIntake;
}
//end gets sets

//constructors
public Patient() {
	this.name = "Default Name";
	this.severity = 5;
}
public Patient(String nameIntake, int severityIntake) {
	this.name = nameIntake;
	this.severity = severityIntake;
}

public void createPatient(String nameIntake, String severityIntake) {

//end constructors
}
//object to string
@Override
public String toString() {
	return "Patient" + this.name + "Priority: " + this.severity;
}
}
//comparator class to determine priority
class PatientComparator implements Comparator<Patient>{
    public int compare(Patient patient1, Patient patient2) {
        if (patient1.getSeverity()< patient2.getSeverity())
            return 1;
        else if (patient1.getSeverity() > patient2.getSeverity())
            return -1;
                        return 0;
        }

} 
package week09;
import java.util.*;
import java.util.Comparator;
//Kathleen Loeb

public class priorityQueue {
	 public static void main(String args[]) {

		//Create empty queue
		PriorityQueue<Patient> eRoom = new PriorityQueue<Patient>(new PatientComparator());

		//loop to add patients
		boolean done= false;
		String exit;
		
		while(!done) {

	   //Scanner for patient info
	   Scanner myObj = new Scanner(System.in);

	  //User input
	   System.out.println("Enter patient name: ");
	   String nameIntake = myObj.nextLine();
	   System.out.println("Enter patient severity from 1-5, 5 being the highest: ");
	   String severityString = myObj.nextLine();
	   int severityIntake = Integer.parseInt(severityString);
	   Patient patient1 = new Patient(nameIntake, severityIntake);
	   eRoom.add(patient1);
	   //option to exit loop
	   System.out.println("Would you like to enter another patient? Please enter 'Y' for yes and 'N' for no.");
	   exit = myObj.nextLine();
	   if (exit.contentEquals("N")) 
		   done = true;
	   
	 }
		//Print the queue contents
		   System.out.println("Patient Priority Queue: ");
		   Iterator itr = eRoom.iterator();
		   while (itr.hasNext())
			   	System.out.println(itr.next());

	 }
}

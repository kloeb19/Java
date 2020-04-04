package week03;
import java.util.ArrayList;
//Kathleen Loeb 02/12/2020

public class Shuffle {

 public static void main(String[] args) {
	 //create array list of type integer
	        ArrayList<Integer> myList = new ArrayList<>();
	        
	        //add number 1-9 to array list
	        for (int i = 0; i < 10; i++) {
	            myList.add(i);
	        }
	        //print array list
	        System.out.println("Original list: " + myList);
	        //shuffle array list
	        shuffle(myList);
	        //print shuffled array list
	        System.out.println("Shuffled list: " + myList);

	    }
 			//generic method
	    public static <E> void shuffle(ArrayList<E> myList) {

	        for (int i = 0; i < myList.size(); i++) {
	            int random = (int) (Math.random() * myList.size());
	            E tmp = myList.get(random);
	            myList.set(random, myList.get(i));
	            myList.set(i, tmp);
	        }
	    }
	}

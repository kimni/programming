package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/* This class contains input method, display method and reverse linkedlist method 
 */
class Test{
	
	LinkedList<String> ll = new LinkedList<String>();								// creates a LinkedList of String type
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		// creates an object for BufferedReader
		
	/* input method accepts inputs from the user and store it in a LinkedList of String type
	 * Variable used: str -> stores the value of each input
	 * Return type: void
	 */
	void input() throws IOException{
		String str = null;
		
		while(!(str = br.readLine()).equals("")){
			ll.add(str);
		}
	}
	
	/* Display the value of the LinkedList
	 * Variable used: s -> to iterate over the linkedlist
	 * Return type: void
	 */
	void display(){
		
		System.out.println("\nOutput");
		for(String s: ll){
			System.out.println(s + " ");
		}
	}
	
	/* to print the reverse linkedlist
	 * Variable use: len -> to keep track of the length of the linkedlist
	 * Return type: void
	 */
	void reverseLinkedList(){
		
		int len = ll.size();
		len--;
		System.out.println("\nReverse LinkedList");
		
		while(len >= 0){
			System.out.println(ll.get(len) + " ");
			len--;
		}	
	}
	
}


public class LinkedListDemo {

	public static void main(String[] args) throws IOException {
		
		// create an object of class Test
		Test ob = new Test();
		
		ob.input();					// calls input method
		ob.display();				// calls display method
		ob.reverseLinkedList(); 	// calls reverse linkedlist method
	}

}

/*
 * Binary Search Implementation
 */

package practice;

import java.io.IOException;
import java.util.Scanner;

public class BinarySearch {

	int []list = {12,23,35,59,87};		// given list of an array
	
	boolean binarySearch(int search){
		
		boolean flag = false;		// initialize flag to false
		int start = 0;				// set start to 0
		int end = list.length -1;	// set end to length of the array-1
				
		// continue to loop until start is greater than end
		while(start <= end){
			
			int mid = (start+end)/2;		// find the middle index in a given array
			System.out.println("\n mid = " + list[mid] + "\n");
			
			// if the value of mid index is equal to the key to be search, set flag to true and return flag
			if(list[mid] == search){
				flag = true;
				return flag;
			}
			
			// if the value of mid index is greater than the key to be search, then set end to mid-1
			if(list[mid] > search){
				end = mid-1;
			}
			
			// if the value of mid index is lesser than the key to be search, then set start to mid+1
			if(list[mid] < search){
				start = mid+1;
			}
			
		}
		return flag;
	}
	
	public static void main(String []args) throws IOException{
		
		BinarySearch ob = new BinarySearch();
				
		int key;
		
		System.out.print("\n Enter value to be searched : ");
		
		Scanner sc = new Scanner(System.in);
		
		key = sc.nextInt();		// stores the value to be searched in the array
		
		System.out.println("\n key :"+key);
		boolean flag = ob.binarySearch(key);
		
		// if flag returned is true, indicates the key is found in the array otherwise, not found
		if(flag == true){
			System.out.println("\n value found!!");
		}
		else{
			System.out.println("\n Not found!");
		}
	}

}

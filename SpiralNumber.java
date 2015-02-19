/*
 * Spiral Number for NxN matrix
 */

package practice;

public class SpiralNumber {

	int [][]arr;
	int maxrow, maxcol;
	int count;
	
	/*
	 * constructor to initialize the size of the array
	 * initialize the array with 0
	 */
	SpiralNumber(int size){
		
		arr = new int[size][size];
		
		maxrow = maxcol = size;
		count = 1;
		
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				arr[i][j] = 0;
			}
		}
		
	}
	
	/*
	 * implements the spiral number in ascending order
	 * variables: row-> stores the no. of rows
	 *            col-> stores the no. of col
	 * return type: void            
	 */
	void spiralNumber(){
		
		int row = maxrow;
		int col = maxcol;
		
		
		int i = 0;
		int j = 0;
		
		// executes as long as count is less than (row * col)
		while(count <= (maxrow*maxcol)){
			//top left to right
			if(i != row){
				
				for(int k = j; k<col; k++){
					arr[i][k] = count;
					count++;
				}
				
				i++;
			}
			
			//top right to bottom
			if(j != col){
				for(int k = i; k<row; k++){
					arr[k][col-1] = count;
					count++;
				}
				col--;
			}
			
			//bottom right to left
			if(j < col){
				
				for(int k= col-1; k>=j; k--){
					arr[row-1][k] = count;
					count++;
				}
				row--;
			}
			
			//bottom left to top
			if(i<row){
				
				for(int k = row-1; k >= i; k--){
					arr[k][j] = count;
					count++;
				}
				j++;
			}
		
			/*System.out.println("\n i = "+ i);
			System.out.println("\n row = "+ row);
			System.out.println("\n j = "+ j);
			System.out.println("\n col = "+ col);*/
		}
		display();
		
	}
	
	/*
	 * display the final spinal number array
	 * return type: void
	 */
	void display(){
		
		System.out.println("\nSpiral Number \n");
		for(int i =0; i<maxrow; i++){
			for(int j=0; j<maxcol; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String []args){
				
		SpiralNumber ob  = new SpiralNumber(7);
	
		ob.spiralNumber();
	}
}

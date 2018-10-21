

package FirstProject;


public class array {
	
	public static void main (String[] args) {
		
		int[][] stairs = new int[10][];    
				
			for (int i = 0; i < stairs.length; i++) {
				
				stairs[i] = new int[i + 1];  
				
					for ( int j = 0; j < stairs[i].length; j++) {
						
						stairs[i][j] = j;
			
					
					
					}
			}
	
			
			for (int[] row : stairs) {
			
				for (int col : row ) {
		
					System.out.print(col + " ");	
					
				}
				System.out.println();
			}
	    }
	
    }

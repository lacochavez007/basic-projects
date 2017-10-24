package mypackage;

public class TriangleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] triangle = new int[10][];
		// assign array values to make a triangle
		for( int i=0;i<triangle.length;i++) {
			triangle[i] = new int[i+1];

			for(int j =0 ; j< i+1;j++) {
				triangle[i][j] = j;
				System.out.print(triangle[i][j]);
			}
			System.out.println();
		}
		
		
	}

}

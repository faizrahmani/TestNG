package OOPs2;

public class TwoDimArray {

	public static void main(String[] args) {

		String y[][] = new String[4][5];
		
		System.out.println(y.length); // y.length will find out size of rows
		System.out.println(y[0].length); // y.[0].length will find out the size of the columns
		
		//1st row
		y[0][0]="A";
		y[0][1]="B";
		y[0][2]="B";
		y[0][3]="C";
		y[0][4]="D";
		
		//2nd row
		y[1][0]="A1";
		y[1][1]="B1";
		y[1][2]="B1";
		y[1][3]="C1";
		y[1][4]="D1";
		
		//3rd row
		y[2][0]="A2";
		y[2][1]="B2";
		y[2][2]="B2";
		y[2][3]="C2";
		y[2][4]="D2";
		
		y[3][0]="A3";
		y[3][1]="B3";
		y[3][2]="B3";
		y[3][3]="C3";
		y[3][4]="D3";
		
		//System.out.println(y[2][3]);
		//System.out.println(y[1][1]);
		//System.out.println(y[0][0]);

		for(int row=0;row<y.length;row++) {
			for(int col=0;col<y[0].length;col++) {
				System.out.println(y[row][col]);
			}
		}
	}

}

public class MatrixAdd {

	public static void main(String[] args) {
		int [][]a= {{1,2},{3,3}};
		int [][]b= {{1,1},{3,4}};
		int [][] sum=new int[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			sum[i][j]=a[i][j]+b[i][j];

	}
	}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			System.out.print(sum[i][j]+" ");

		
		
	}
	System.out.println();
			
}
	}
}

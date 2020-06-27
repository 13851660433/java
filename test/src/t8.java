package test;

public class t8 {

	public static void main(String[] args) {
		int k,i,j,a[][]= new int[4][4];
		k = 1;
		for(i=0;i<4;i++) {
			if(i%2==0) {
				for(j=0;j<=i;j++) {a[i][j]=k++;}
				for(j=i-1;j>=0;j--) {a[j][i]=k++;}
				
			}else {
				for(j=0;j<=i;j++) {a[j][i]=k++;}
				for(j=i-1;j>=0;j--) {a[i][j]=k++;}
			}
		}
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++)
				System.out.println();
		}

	}

}

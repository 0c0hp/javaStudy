package sec02.exam05;

public class ForMultiple {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		
		for(i=2;i<=9;i++) {
			System.out.println("*** "+i+"단 ***");
			for(j=1;j<=9;j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
		}

	}

}

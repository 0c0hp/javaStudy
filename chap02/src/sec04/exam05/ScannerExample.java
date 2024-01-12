package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData=scanner.nextLine();
			System.out.println("입력된 문자열:\""+inputData+"\"");
			if(inputData.equals("q")) { //문자열이 동일한지 비교할때 equals() 메소드 사용
				break;
			} 
		}
		System.out.println("종료");
	}
}
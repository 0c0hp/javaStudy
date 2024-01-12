package sec03.exam01;

//자동 형변환의 예시
//작은 허용 범위를 큰 허용 범위로 바뀔때 자동으로 형변환 됨(작은->큰)

public class PromitionExample {

	public static void main(String[] args) {
		byte byteValue=10;
		int intValue=byteValue;
		System.out.println("intValue: " + intValue);

	}

}

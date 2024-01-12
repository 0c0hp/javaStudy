package sec03.exam02;

//괄호를 붙여서 하는 강제 형변환
//강제 형변환은 허용범위가 큰 형을 허용범위가 작은 형으로 바꿀 때 사용 (큰->작은)

public class CastingExample {

	public static void main(String[] args) {
		
		int intValue=44032;
		char charValue = (char) intValue;
		System.out.println(charValue); //가 가 나옴
		
		long longValue=500;
		intValue=(int)longValue;
		System.out.println(intValue); //500이 나옴
		
		double doubleValue=3.14;
		intValue=(int)doubleValue;
		System.out.println(intValue); //3이 나옴
	}
}

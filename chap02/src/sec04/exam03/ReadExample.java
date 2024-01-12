package sec04.exam03;

//System.in.read() -->사용자에게 입력받는 코드
//if(key==113)등의 코드를 적어 특정 값이 들어오면 종료되게 만들 수 있음
//단점:키보드를 하나씩 읽기 때문에 통 문자열로 읽지 못함 그리고 2개 이상의 키가 조합된 한글을 읽을 수 없다.
//이를 보완하기 위해 자바는 Scanner 클래스를 제공하고 있다.

public class ReadExample {

	public static void main(String[] args) throws Exception{
		int KeyCode;
		
		while(true) {
			KeyCode = System.in.read(); //이 코드를 작성해서 입력받을수 있음
			System.out.println("KeyCode: " + KeyCode);
		}

	}

}

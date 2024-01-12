package sec01.exam04;

//Math.random()함수 사용 0.0<= Math.random() <1.0 범위를 가짐

public class IfDiceExample {

	public static void main(String[] args) {
		//일단 랜덤으로 주사위의 번호를 나오게 해야함 
		//그리고 if -else if - else 문 사용
		int num = (int)(Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}
		else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}
		else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}
		else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}
		else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}
		else if(num==6) {
			System.out.println("6번이 나왔습니다.");
		}
		
	}

}

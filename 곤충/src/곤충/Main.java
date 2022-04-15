package 곤충;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ant 개미1 = new Ant("일개미");
		Ant 개미2 = new Ant("여왕개미");
		Ant 개미3 = new Ant("노예개미");
		개미1.setColor("black");
		개미2.setColor("pink");
		개미3.setWingNum(0);
		System.out.println(개미2.getWingNum);	//getWingNum을 확인할 수 없거나 필드가 아닙니다.
		System.out.println(개미3.getWingNum);
		
		
		
		//곤출을 생성할떄 곤충 생성자를 쓰는거고
		//개미를 생성할때 개미 생성자를 쓰는겁니다
		//개미의 속성과 메소드는 개미안에 포함된 개념이기 때문에 개미를 만들면 포함되어있다
	}

}

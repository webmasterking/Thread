package 곤충;

public class Insects {
	private String name;
	private String color;
	private double width;
	private int legNum = 6;
	private int wingNum = 2;
	
	public Insects(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public int getLegNum() {
		return legNum;
	}
	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}
	public int getWingNum() {
		return wingNum;
	}
	public void setWingNum(int wingNum) {
		this.wingNum = wingNum;
	}
	
	public void move() {
		System.out.println(name+"이 이동합니다.");
	}
	
	public void eat(String feed) {
		System.out.println(name+ "이"+feed+"를 먹습니다.");
	}
	
	public void jump() {
		System.out.println(name="이(가) 점프를 합니다");
	}
}

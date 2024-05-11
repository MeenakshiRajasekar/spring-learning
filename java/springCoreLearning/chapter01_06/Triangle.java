package springCoreLearning.chapter01_06;

public class Triangle {
	
	private String type;
	private int height;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Triangle(String type) {	
		this.type = type;
	}
	
	public Triangle(int Height) {	
		this.height = Height;
	}
	
	public Triangle(String type, int Height) {
		this.type = type;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("Drawing " + getType() + " triangle with height of : " +getHeight());
	}

}

package office;

public class Rectangle {
	private int height;
	private int width;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Rectangle(int height,int width) {
		this.height=height;
		this.width=width;
	}
	
	public int area() {
		int area = height *width;
		System.out.println("area:"+(area));
		return area;
	}
		public int perimeter() {
		int perimeter = 2*(height +width);
		System.out.println("perimeter:"+(perimeter));
		return perimeter;
	}
		
	void displayRectangle() {
		System.out.println("height"+height);
		System.out.println("width"+width);		
	}
}

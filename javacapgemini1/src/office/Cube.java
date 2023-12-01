package office;

public class Cube {
	private int height;
	private int width;
	private int depth;
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
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	 public Cube(int height,int width,int depth) {
		 this.height=height;
		 this.width=width;
		 this.depth=depth;	
	}
	 public int areaCube() {
		 int areaCube = 0;
		 areaCube=(6*(height*height*height));
		 System.out.println("areaCube:"+areaCube);
		 return areaCube; 
	 }
	 public int perimeterCube() {
		int perimeterCube=12*height;
		 System.out.println("perimeterCube:"+perimeterCube);
		 return perimeterCube;
	 } 
	 void displayCube() {
		 System.out.println("height:"+height);
		 System.out.println("width:"+width);
		 System.out.println("depth:"+depth);
	 }	
}

package shapeandsubclass;

public class Shape {
	
	public String color;
	boolean filled;
	public String getColour() {
		return color;
	}
	public void setColour(String colour) {
		this.color = colour;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		return "Shape [colour=" + color + ", filled=" + filled + "]";
	}
	
	
	
	

}

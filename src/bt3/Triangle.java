package bt3;

public class Triangle extends Shape{
	private static Triangle instance;

	protected Triangle() {
	}
	public static Triangle createTriangle(){
		if (instance == null) {
			instance = new Triangle();
		}
        return instance;
    }  

	@Override
	public String draw() {
		return "Đây là hình tam giác "
				+ brush + paper+ frame;		
	}
}
package bt3;

public class Circle extends Shape{
	private static Circle instance;

	protected Circle() {
	}
	public static Circle createCircle(){
		if (instance == null) {
			instance = new Circle();
		}
        return instance;
    }  

	@Override
	public String draw() {
		return "Đây là hình tròn "
				+ brush + paper+ frame;
		
	}
}
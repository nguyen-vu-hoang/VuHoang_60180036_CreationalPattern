package bt3;


public class Retangle extends Shape{
	private static Retangle instance;

	protected Retangle() {
		super();
	}
	public static Retangle createRetangle(){
		if (instance == null) {
			instance = new Retangle();
		}
        return instance;
    }  

	@Override
	public String draw() {
		return "Đây là hình chữ nhật "
				+ brush + paper+ frame;
		
	}

}


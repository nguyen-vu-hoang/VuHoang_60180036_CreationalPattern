package bt3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.createShape(ShapeType.circle);
		shape.setBrush("vẽ bằng cọ ");
		shape.setPaper("dùng giấy A4 ");
		shape.setFrame("khung chữ nhật ");
		
		System.out.println(shape.draw());
	}

}

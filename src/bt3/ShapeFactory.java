package bt3;

public class ShapeFactory {

		public Shape createShape(ShapeType shapeType) {
		if (shapeType==ShapeType.rectangle)
	         return Retangle.createRetangle();
	     else if (shapeType==ShapeType.triangle) 
	    	  return Triangle.createTriangle();
	     else if (shapeType==ShapeType.circle) 
	    	  return Circle.createCircle();
		 else return null;
	}

	
	 
}

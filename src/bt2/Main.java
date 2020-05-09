package bt2;

public class Main {

	public static void main(String[] args) {
		MyStringBuilder stringBuilder= new MyStringBuilder().addString("hello ").addFloat(0.2f).addBool(true);
		System.out.println(stringBuilder.toString());
				
	}

}

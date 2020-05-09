package bt2;

public final class MyStringBuilder 
{
	String s;
	
	public MyStringBuilder addString(String s) {
		this.s = s;
		return this;
	}
	public MyStringBuilder addFloat(float f) {
		this.s += f;
		return this;
	}
	public MyStringBuilder addBool(boolean b) {
		this.s += b;
		return this;
	}
	@Override
	public String toString() {
		return this.s;
	}
}
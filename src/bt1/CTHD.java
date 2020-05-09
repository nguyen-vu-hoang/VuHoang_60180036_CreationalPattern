package bt1;

public class CTHD {
	String sanPham;
	int soLuong;
	double donGia;
	float chietKhau;
	
	
	public CTHD(CTHDBuilder builder) {
		this.sanPham = builder.sanPham;
		this.soLuong = builder.soLuong;
		this.donGia = builder.donGia;
		this.chietKhau = builder.chietKhau;
	}
	public static class CTHDBuilder 
	{
		String sanPham;
		int soLuong;
		double donGia;
		float chietKhau;
		
	public CTHDBuilder setSP(String sanPham) {
		this.sanPham = sanPham;
		return this;
	}
	public CTHDBuilder setSL(int soLuong) {
		this.soLuong = soLuong;
		return this;
	}
	public CTHDBuilder setDG(double donGia) {
		this.donGia = donGia;
		return this;
	}
	public CTHDBuilder setCK(float chietKhau) {
		this.chietKhau = chietKhau;
		return this;
	}
	public CTHD getCTHD() {
		return new CTHD(this);
	}
	}
}

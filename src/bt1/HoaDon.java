package bt1;

import java.util.ArrayList;

public class HoaDon {
	HoaDonHeader hd;
	ArrayList<CTHD> ct = new ArrayList<CTHD>();
	public HoaDon(HoaDonHeader hd, ArrayList<CTHD> ct) {
		this.hd = hd;
		this.ct = ct;
	}
	@Override
	public String toString() {
		
		String str = "Mã số hóa đơn: " + hd.maHoaDon
				+"\nNgày bán: " + hd.ngayBan
				+"\nTên khách hàng: " + hd.tenKH;
		for (CTHD cthd : ct) {
			str += "\nTên sản phẩm: " + cthd.sanPham
					+ "\nsố lượng: " + cthd.soLuong
					+"\nđơn giá " + cthd.donGia
					+"\nchiết khấu " + cthd.chietKhau;
		}
		return str;
	}
	
}

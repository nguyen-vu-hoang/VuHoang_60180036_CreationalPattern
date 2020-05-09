package bt1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		HoaDonHeader hdhd = new HoaDonHeader("HD001", "20/01/2019", "Nguyễn Anh Bình");
		CTHD cthd1 = new CTHD.CTHDBuilder().setSP("Bàn").setSL(2).setDG(80000).setCK(0.05f).getCTHD();
		CTHD cthd2 = new CTHD.CTHDBuilder().setSP("Ghế").setSL(20).setDG(20000).setCK(0.05f).getCTHD();
		ArrayList<CTHD> ct = new ArrayList<CTHD>();
		ct.add(cthd1);
		ct.add(cthd2);
		HoaDon hDon = new HoaDon(hdhd, ct);
		System.out.println(hDon.toString());
	}

}

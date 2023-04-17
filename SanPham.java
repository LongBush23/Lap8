import java.util.Scanner;

public class SanPham {
	private String ten;
	private double gia;
	private double giamGia;
	
	public double getThueNhapKhau() {
		return 0.1 * gia;
	}
	Scanner sc = new Scanner(System.in);
	public void Xuat() {
		System.out.println("ten san pham la "+ ten);
		System.out.println("gia san pham la "+ gia);
		System.out.println("nhap gia san pham giam la "+ giamGia);
		System.out.println("gia thue nhap khau la "+ getThueNhapKhau());
	}
	public void Nhap() {
		System.out.println("nhap ten san pham :");
		ten = sc.nextLine();
		System.out.println("nhap gia san pham : ");
		gia = sc.nextDouble();
		System.out.println("nhap gia san pham giam : ");
		giamGia = sc.nextDouble();
	}
	
}

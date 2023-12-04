package test;

import java.util.List;
import dao.TamVangDAOImpl;
import model.TamVang;

public class TestTamVangDAO {

    public static void main(String[] args) {
        // Tạo instance của TamVangDAOImpl
        TamVangDAOImpl tamVangDAO = new TamVangDAOImpl();

//        // Kiểm tra đăng ký tạm vắng
/*        TamVang tamVangDangKy = new TamVang();
        tamVangDangKy.setMaTamVang(12345678);
        tamVangDangKy.setHoTen("LAN ANH");
        tamVangDangKy.setCmnd(123456789);
        tamVangDangKy.setMaHoKhau(12345);
        tamVangDangKy.setQuanHeChuHo("Con");
        tamVangDangKy.setNgayDangKy(new java.util.Date());
        tamVangDangKy.setThoiGianTamVang(new java.util.Date());
        tamVangDangKy.setLyDo("Đi kím ngiu");

        boolean ketQuaDangKy = tamVangDAO.dangKyTamVang(tamVangDangKy);
        System.out.println("Đăng ký tạm vắng: " + (ketQuaDangKy ? "Thành công" : "Thất bại"));
*/
        // Kiểm tra xem tạm vắng đã được đăng ký thành công chưa
        List<TamVang> danhSachTamVang = tamVangDAO.xemDanhSachTamVang();
        System.out.println("Danh sách tạm vắng:");
        for (TamVang tv : danhSachTamVang) {
            System.out.println(tv.getMaTamVang() + " - " + tv.getHoTen() + " - " + tv.getLyDo());
        }

        // Kiểm tra hủy tạm vắng
//        boolean ketQuaHuy = tamVangDAO.huyTamVang("12345");
//        System.out.println("Hủy tạm vắng: " + (ketQuaHuy ? "Thành công" : "Thất bại"));

        // Kiểm tra tìm kiếm tạm vắng
//        String tuKhoaTimKiem = "péo";
//        List<TamVang> ketQuaTimKiem = tamVangDAO.timKiemTamVang(tuKhoaTimKiem);
//        System.out.println("Kết quả tìm kiếm tạm vắng theo '" + tuKhoaTimKiem + "':");
//        for (TamVang tv : ketQuaTimKiem) {
//            System.out.println(tv.getMaTamVang() + " - " + tv.getHoTen() + " - " + tv.getLyDo());
//        }
    }
}

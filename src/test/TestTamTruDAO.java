package test;

import model.TamTru;
import java.util.List;
import dao.TamTruDAOImpl;

public class TestTamTruDAO {

	public static void main(String[] args) {
		// Tạo instance của TamTruDAOImpl
        TamTruDAOImpl tamTruDAO = new TamTruDAOImpl();

        // Kiểm tra đăng ký tạm trú
//        TamTru tamTruDangKy = new TamTru();
//        tamTruDangKy.setMaTamTru("12345");
//        tamTruDangKy.setHoTen("lanhhh");
//        tamTruDangKy.setCmnd("111111");
//        tamTruDangKy.setMaHoKhau("768");
//        tamTruDangKy.setQuanHeChuHo("con");
//        tamTruDangKy.setNgayDangKy(new java.util.Date());
//        tamTruDangKy.setThoiGianTamTru(new java.util.Date());
//        tamTruDangKy.setDiaChiTruocChuyenDen("TP LS");
//
//        boolean ketQuaDangKy = tamTruDAO.dangKyTamTru(tamTruDangKy);
//        System.out.println("Đăng ký tạm trú: " + (ketQuaDangKy ? "Thành công" : "Thất bại"));

        // Kiểm tra xem tạm trú đã được đăng ký thành công chưa
//        List<TamTru> danhSachTamTru = tamTruDAO.xemDanhSachTamTru();
//        System.out.println("Danh sách tạm trú:");
//        for (TamTru tt : danhSachTamTru) {
//            System.out.println(tt.getMaTamTru() + " - " + tt.getHoTen() + " - " + tt.getDiaChiTruocChuyenDen());
//        }

        // Kiểm tra hủy tạm trú
//        boolean ketQuaHuy = tamTruDAO.huyTamTru("12345");
//        System.out.println("Hủy tạm trú: " + (ketQuaHuy ? "Thành công" : "Thất bại"));

        // Kiểm tra tìm kiếm tạm trú
//        String tuKhoaTimKiem = "lanh";
//        List<TamTru> ketQuaTimKiem = tamTruDAO.timKiemTamTru(tuKhoaTimKiem);
//        System.out.println("Kết quả tìm kiếm tạm trú theo '" + tuKhoaTimKiem + "':");
//        for (TamTru tt : ketQuaTimKiem) {
//            	System.out.println(tt.getMaTamTru() + " - " + tt.getHoTen() + " - " + tt.getDiaChiTruocChuyenDen());
//		       }
		}
	}


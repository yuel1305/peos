package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.TamTru;

public class TamTruDAOImpl implements TamTruDAO {
	public TamTruDAOImpl() {
		
	}
    @Override
    public boolean dangKyTamTru(TamTru tamTru) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO TamTru (maTamTru, hoTen, cmnd, maHoKhau, quanHeChuHo, ngayDangKy, thoiGianTamTru, diaChiTruocChuyenDen) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, tamTru.getMaTamTru());
                preparedStatement.setString(2, tamTru.getHoTen());
                preparedStatement.setString(3, tamTru.getCmnd());
                preparedStatement.setString(4, tamTru.getMaHoKhau());
                preparedStatement.setString(5, tamTru.getQuanHeChuHo());
                preparedStatement.setString(6, tamTru.getNgayDangKy() );
                preparedStatement.setString(7, tamTru.getThoiGianTamTru());
                preparedStatement.setString(8, tamTru.getDiaChiTruocChuyenDen());

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean huyTamTru(String maTamTru) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM TamTru WHERE maTamTru = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, maTamTru);

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<TamTru> xemDanhSachTamTru() {
        List<TamTru> danhSachTamTru = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM TamTru";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    TamTru tamTru = new TamTru();
                    tamTru.setMaTamTru(resultSet.getString("maTamTru"));
                    tamTru.setHoTen(resultSet.getString("hoTen"));
                    tamTru.setCmnd(resultSet.getString("cmnd"));
                    tamTru.setMaHoKhau(resultSet.getString("maHoKhau"));
                    tamTru.setQuanHeChuHo(resultSet.getString("quanHeChuHo"));
                    tamTru.setNgayDangKy(resultSet.getString("ngayDangKy"));
                    tamTru.setThoiGianTamTru(resultSet.getString("thoiGianTamTru"));
                    tamTru.setDiaChiTruocChuyenDen(resultSet.getString("diaChiTruocChuyenDen"));

                    danhSachTamTru.add(tamTru);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachTamTru;
    }

    @Override
    public List<TamTru> timKiemTamTru(String tuKhoa) {
        List<TamTru> ketQua = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM TamTru WHERE maTamTru LIKE ? OR hoTen LIKE ? OR cmnd LIKE ?";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, "%" + tuKhoa + "%");
                preparedStatement.setString(2, "%" + tuKhoa + "%");
                preparedStatement.setString(3, "%" + tuKhoa + "%");

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        TamTru tamTru = new TamTru();
                        tamTru.setMaTamTru(resultSet.getString("maTamTru"));
                        tamTru.setHoTen(resultSet.getString("hoTen"));
                        tamTru.setCmnd(resultSet.getString("cmnd"));
                        tamTru.setMaHoKhau(resultSet.getString("maHoKhau"));
                        tamTru.setQuanHeChuHo(resultSet.getString("quanHeChuHo"));
                        tamTru.setNgayDangKy(resultSet.getString("ngayDangKy"));
                        tamTru.setThoiGianTamTru(resultSet.getString("thoiGianTamTru"));
                        tamTru.setDiaChiTruocChuyenDen(resultSet.getString("diaChiTruocChuyenDen"));

                        ketQua.add(tamTru);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ketQua;
    }
}

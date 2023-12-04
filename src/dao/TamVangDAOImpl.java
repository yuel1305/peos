package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.TamVang;

public class TamVangDAOImpl implements TamVangDAO {

    @Override
    public boolean dangKyTamVang(TamVang tamVang) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO TamVang (maTamVang, hoTen, cmnd, maHoKhau, quanHeChuHo, ngayDangKy, thoiGianTamVang, lyDo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setLong(1, tamVang.getMaTamVang());
                preparedStatement.setString(2, tamVang.getHoTen());
                preparedStatement.setLong(3, tamVang.getCmnd());
                preparedStatement.setLong(4, tamVang.getMaHoKhau());
                preparedStatement.setString(5, tamVang.getQuanHeChuHo());
                preparedStatement.setDate(6, new java.sql.Date(tamVang.getNgayDangKy().getTime()));
                preparedStatement.setDate(7, new java.sql.Date(tamVang.getThoiGianTamVang().getTime()));
                preparedStatement.setString(8, tamVang.getLyDo());

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean huyTamVang(String maTamVang) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM TamVang WHERE maTamVang = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, maTamVang);

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<TamVang> xemDanhSachTamVang() {
        List<TamVang> danhSachTamVang = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM TamVang";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    TamVang tamVang = new TamVang();
                    tamVang.setMaTamVang(resultSet.getInt("maTamVang"));
                    tamVang.setHoTen(resultSet.getString("hoTen"));
                    tamVang.setCmnd(resultSet.getInt("cmnd"));
                    tamVang.setMaHoKhau(resultSet.getInt("maHoKhau"));
                    tamVang.setQuanHeChuHo(resultSet.getString("quanHeChuHo"));
                    tamVang.setNgayDangKy(resultSet.getDate("ngayDangKy"));
                    tamVang.setThoiGianTamVang(resultSet.getDate("thoiGianTamVang"));
                    tamVang.setLyDo(resultSet.getString("lyDo"));

                    danhSachTamVang.add(tamVang);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachTamVang;
    }

    @Override
    public List<TamVang> timKiemTamVang(String tuKhoa) {
        List<TamVang> ketQua = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM TamVang WHERE maTamVang LIKE ? OR hoTen LIKE ? OR cmnd LIKE ?";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, "%" + tuKhoa + "%");
                preparedStatement.setString(2, "%" + tuKhoa + "%");
                preparedStatement.setString(3, "%" + tuKhoa + "%");

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        TamVang tamVang = new TamVang();
                        tamVang.setMaTamVang(resultSet.getInt("maTamVang"));
                        tamVang.setHoTen(resultSet.getString("hoTen"));
                        tamVang.setCmnd(resultSet.getInt("cmnd"));
                        tamVang.setMaHoKhau(resultSet.getInt("maHoKhau"));
                        tamVang.setQuanHeChuHo(resultSet.getString("quanHeChuHo"));
                        tamVang.setNgayDangKy(resultSet.getDate("ngayDangKy"));
                        tamVang.setThoiGianTamVang(resultSet.getDate("thoiGianTamVang"));
                        tamVang.setLyDo(resultSet.getString("lyDo"));

                        ketQua.add(tamVang);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ketQua;
    }
}


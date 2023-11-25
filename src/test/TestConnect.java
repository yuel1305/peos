package test;

import java.sql.*;
import dao.DatabaseConnection;

public class TestConnect {
    public static Connection sConn = null;
    public static void main(String[] args) {
    	
            // Thử kiểm tra phương thức getConnection
            Connection connection = DatabaseConnection.getConnection();

            // Kiểm tra xem có kết nối hay không
            if (connection != null) {
                System.out.println("Kết nối đã được thiết lập.");
                try {
                    // Đóng kết nối sau khi sử dụng
                    connection.close();
                    System.out.println("Kết nối đã được đóng.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Không thể thiết lập kết nối.");
            }
        }

    }

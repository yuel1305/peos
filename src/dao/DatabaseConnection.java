package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection sConn = null;

    public static Connection getConnection() {
    	//Khai báo chuỗi kết nối
        String strDbUrl = "jdbc:sqlserver://DESKTOP-CFSL0UO:1433; databaseName=lanhpeo;user=sa;password=123456789;"
                + "encrypt=true;trustServerCertificate=true";
        if (sConn == null) {
            try {              
                sConn = DriverManager.getConnection(strDbUrl);
                System.out.println("Ket noi thanh cong");
//                DatabaseMetaData data = (DatabaseMetaData) sConn.getMetaData();
//                // hien thi thong tin sql khi ket noi thanh cong
                
            } 
            catch (SQLException ex) {
            	System.out.println("Khong the ket noi den CSDL \n" + ex);
            	ex.printStackTrace();
            } 
        }
        return sConn;
    }
}


package model;

import java.util.Date;

public class TamTru {
    private String maTamTru;
    private String hoTen;
    private String cmnd;
    private String maHoKhau;
    private String quanHeChuHo;
    private String ngayDangKy;
    private String thoiGianTamTru;
    private String diaChiTruocChuyenDen;
	
    public String getMaTamTru() {
		return maTamTru;
	}
	public void setMaTamTru(String maTamTru) {
		this.maTamTru = maTamTru;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getMaHoKhau() {
		return maHoKhau;
	}
	public void setMaHoKhau(String maHoKhau) {
		this.maHoKhau = maHoKhau;
	}
	public String getQuanHeChuHo() {
		return quanHeChuHo;
	}
	public void setQuanHeChuHo(String quanHeChuHo) {
		this.quanHeChuHo = quanHeChuHo;
	}
	public String getNgayDangKy() {
		return ngayDangKy;
	}
	public void setNgayDangKy(String ngayDangKy) {
		this.ngayDangKy = ngayDangKy;
	}
	public String getThoiGianTamTru() {
		return thoiGianTamTru;
	}
	public void setThoiGianTamTru(String thoiGianTamTru) {
		this.thoiGianTamTru = thoiGianTamTru;
	}
	public String getDiaChiTruocChuyenDen() {
		return diaChiTruocChuyenDen;
	}
	public void setDiaChiTruocChuyenDen(String diaChiTruocChuyenDen) {
		this.diaChiTruocChuyenDen = diaChiTruocChuyenDen;
	}
	public TamTru(String maTamTru, String hoTen, String cmnd, String maHoKhau, String quanHeChuHo, String ngayDangKy,
			String thoiGianTamTru, String diaChiTruocChuyenDen) {
		super();
		this.maTamTru = maTamTru;
		this.hoTen = hoTen;
		this.cmnd = cmnd;
		this.maHoKhau = maHoKhau;
		this.quanHeChuHo = quanHeChuHo;
		this.ngayDangKy = ngayDangKy;
		this.thoiGianTamTru = thoiGianTamTru;
		this.diaChiTruocChuyenDen = diaChiTruocChuyenDen;
	}
	public TamTru() {
		super();
	}

    
}
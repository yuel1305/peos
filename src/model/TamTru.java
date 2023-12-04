package model;

import java.util.Date;

public class TamTru {
    private int maTamTru;
    private String hoTen;
    private int cmnd;
    private int maHoKhau;
    private String quanHeChuHo;
    private Date ngayDangKy;
    private Date thoiGianTamTru;
    private String diaChiTruocChuyenDen;
	
    public int getMaTamTru() {
		return maTamTru;
	}
	public void setMaTamTru(int maTamTru) {
		this.maTamTru = maTamTru;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public int getMaHoKhau() {
		return maHoKhau;
	}
	public void setMaHoKhau(int maHoKhau) {
		this.maHoKhau = maHoKhau;
	}
	public String getQuanHeChuHo() {
		return quanHeChuHo;
	}
	public void setQuanHeChuHo(String quanHeChuHo) {
		this.quanHeChuHo = quanHeChuHo;
	}
	public Date getNgayDangKy() {
		return ngayDangKy;
	}
	public void setNgayDangKy(Date ngayDangKy) {
		this.ngayDangKy = ngayDangKy;
	}
	public Date getThoiGianTamTru() {
		return thoiGianTamTru;
	}
	public void setThoiGianTamTru(Date thoiGianTamTru) {
		this.thoiGianTamTru = thoiGianTamTru;
	}
	public String getDiaChiTruocChuyenDen() {
		return diaChiTruocChuyenDen;
	}
	public void setDiaChiTruocChuyenDen(String diaChiTruocChuyenDen) {
		this.diaChiTruocChuyenDen = diaChiTruocChuyenDen;
	}
	public TamTru(int maTamTru, String hoTen, int cmnd, int maHoKhau, String quanHeChuHo, Date ngayDangKy,
			Date thoiGianTamTru, String diaChiTruocChuyenDen) {
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
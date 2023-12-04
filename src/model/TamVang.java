package model;

import java.util.Date;

public class TamVang {
    private int maTamVang;
    private String hoTen;
    private int cmnd;
    private int maHoKhau;
    private String quanHeChuHo;
    private Date ngayDangKy;
    private Date thoiGianTamVang;
    private String lyDo;
    
	public int getMaTamVang() {
		return maTamVang;
	}
	public void setMaTamVang(int maTamVang) {
		this.maTamVang = maTamVang;
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
	public Date getThoiGianTamVang() {
		return thoiGianTamVang;
	}
	public void setThoiGianTamVang(Date thoiGianTamVang) {
		this.thoiGianTamVang = thoiGianTamVang;
	}
	public String getLyDo() {
		return lyDo;
	}
	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}
	public TamVang(int maTamVang, String hoTen, int cmnd, int maHoKhau, String quanHeChuHo, Date ngayDangKy,
			Date thoiGianTamVang, String lyDo) {
		super();
		this.maTamVang = maTamVang;
		this.hoTen = hoTen;
		this.cmnd = cmnd;
		this.maHoKhau = maHoKhau;
		this.quanHeChuHo = quanHeChuHo;
		this.ngayDangKy = ngayDangKy;
		this.thoiGianTamVang = thoiGianTamVang;
		this.lyDo = lyDo;
	}
	public TamVang() {
		super();
	}
	

    
    
}
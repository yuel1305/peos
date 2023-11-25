package model;

import java.util.Date;

public class TamVang {
    private String maTamVang;
    private String hoTen;
    private String cmnd;
    private String maHoKhau;
    private String quanHeChuHo;
    private Date ngayDangKy;
    private Date thoiGianTamVang;
    private String lyDo;
    
	public String getMaTamVang() {
		return maTamVang;
	}
	public void setMaTamVang(String maTamVang) {
		this.maTamVang = maTamVang;
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
	public TamVang(String maTamVang, String hoTen, String cmnd, String maHoKhau, String quanHeChuHo, Date ngayDangKy,
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
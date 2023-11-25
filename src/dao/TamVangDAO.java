package dao;

import java.util.List;
import model.TamVang;

public interface TamVangDAO {
    boolean dangKyTamVang(TamVang tamVang);
    boolean huyTamVang(String maTamVang);
    List<TamVang> xemDanhSachTamVang();
    List<TamVang> timKiemTamVang(String tuKhoa);
}

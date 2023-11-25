package dao;

import java.util.List;
import model.TamTru;

public interface TamTruDAO {
    boolean dangKyTamTru(TamTru tamTru);
    boolean huyTamTru(String maTamTru);
    List<TamTru> xemDanhSachTamTru();
    List<TamTru> timKiemTamTru(String tuKhoa);
}


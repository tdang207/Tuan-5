package dungtichxe;

public class Vehicle {
    private String chuXe;
    private String loaiXe;
    private int dungTich;
    private double triGiaXe;

    public Vehicle() {
        this.chuXe = "Chưa xác định";
        this.loaiXe = "Chưa xác định";
        this.dungTich = 1;
        this.triGiaXe = 0;
    }

    public Vehicle(String chuXe, String loaiXe, int dungTich, double triGiaXe) {
        setChuXe(chuXe);
        setLoaiXe(loaiXe);
        setDungTich(dungTich);
        setTriGiaXe(triGiaXe);
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        if (chuXe == null || chuXe.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên chủ xe không được để trống!");
        }
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        if (loaiXe == null || loaiXe.trim().isEmpty()) {
            throw new IllegalArgumentException("Loại xe không được để trống!");
        }
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        if (dungTich <= 0) {
            throw new IllegalArgumentException("Dung tích phải lớn hơn 0!");
        }
        this.dungTich = dungTich;
    }

    public double getTriGiaXe() {
        return triGiaXe;
    }

    public void setTriGiaXe(double triGiaXe) {
        if (triGiaXe < 0) {
            throw new IllegalArgumentException("Trị giá xe không được âm!");
        }
        this.triGiaXe = triGiaXe;
    }

    public double thue() {
        if (dungTich < 100) {
            return

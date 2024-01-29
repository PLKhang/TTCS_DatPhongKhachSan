package entity;
import jakarta.persistence.Entity;
@Entity
public class LoaiPhong{

    private String maLP;
    private String tenLP;
    private String moTa;
    
    public String getMaLP() {
        return maLP;
    }

    public void setMaLP(String maLP) {
        this.maLP = maLP;
    }

    public String getTenLP() {
        return tenLP;
    }

    public void setTenLP(String tenLP) {
        this.tenLP = tenLP;
    }
    
    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "[" + this.maLP + "," + this.tenLP + "," + this.moTa + "]";
    }

}
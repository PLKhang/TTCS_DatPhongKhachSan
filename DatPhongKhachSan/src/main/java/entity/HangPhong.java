package entity;
import jakarta.persistence.Entity;
import java.math.BigDecimal;
import java.lang.Short;
@Entity
public class HangPhong{

    private String maHP;
    private String tenHP;
    private String maKP;
    private String maLP;
    private BigDecimal donGia;
    private short soNguoi;
    
    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public String getTenHP() {
        return tenHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }
    
    public String getMaKP() {
        return maKP;
    }

    public void setMaKP(String maKP) {
        this.maKP = maKP;
    }
    
    public String getMaLP() {
        return maLP;
    }

    public void setMaLP(String maLP) {
        this.maLP = maLP;
    }

    public BigDecimal getDonGia() {
    	return donGia;
    }
 
    public void setDonGia(BigDecimal donGia) {
    	this.donGia = donGia;
    }
    
    public short getSoNguoi() {
    	return soNguoi;
    }
    
    public void setSoNguoi(short soNguoi) {
    	this.soNguoi = soNguoi;
    }

    @Override
    public String toString() {
        return "[" + this.maHP + "," + this.tenHP + "," + this.maKP +","+ this.maLP 
        		+ "," + this.donGia + "," + this.soNguoi + "]";
    }

}
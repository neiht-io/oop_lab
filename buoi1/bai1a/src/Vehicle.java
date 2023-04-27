/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khact
 */
public class Vehicle {
    String ChuXe;
    String LoaiXe;
    int dungTich;
    double triGia;

    public Vehicle(String ChuXe, String LoaiXe, int dungTich, double triGia, double tax) {
        this.ChuXe = ChuXe;
        this.LoaiXe = LoaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }
    
    

    public String getChuXe() {
        return ChuXe;
    }

    public void setChuXe(String ChuXe) {
        this.ChuXe = ChuXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    
    public double tax (){
        if (getDungTich()<100) {
            
            
        }
    }

    @Override
    public String toString() {
        return ChuXe + "    " + LoaiXe + "    " + dungTich + "    " + triGia + "    " + tax ;
    }
    
    
    
}


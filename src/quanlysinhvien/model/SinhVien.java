/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysinhvien.model;

/**
 *
 * @author nguyenvv
 */
public class SinhVien {

    private String hoTen;

    private String lop;

    private int namSinh;

    private int gioiTinh;

    public SinhVien(String hoTen, String lop, int namSinh, int gioiTinh) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}

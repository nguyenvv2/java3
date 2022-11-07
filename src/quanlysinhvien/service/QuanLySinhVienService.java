/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package quanlysinhvien.service;

import java.util.ArrayList;
import quanlysinhvien.model.SinhVien;

/**
 *
 * @author nguyenvv
 */
public interface QuanLySinhVienService {
    
    public ArrayList<SinhVien> getList();
    
    public String them(SinhVien sinhVien);
    
    public String sua(int vitri, SinhVien sinhVien);
    
    public String xoa(int vitri);
}

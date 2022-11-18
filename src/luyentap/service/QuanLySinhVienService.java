/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package luyentap.service;

import java.util.ArrayList;
import luyentap.model.SinhVien;

/**
 *
 * @author nguyenvv
 */
public interface QuanLySinhVienService {

    ArrayList<SinhVien> getList();

    String addNew(SinhVien sinhVien);

    String update(SinhVien sinhVien, String maSinhVien);

    String delete(String maSinhVien);

    ArrayList<SinhVien> search(String maSinhVien);
}

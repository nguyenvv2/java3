/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.service.impl;

import java.util.ArrayList;
import luyentap.model.SinhVien;
import luyentap.repository.SinhVienRepository;
import luyentap.service.QuanLySinhVienService;

/**
 *
 * @author nguyenvv
 */
public class QuanLySinhVienImpl implements QuanLySinhVienService {

    private SinhVienRepository sinhVienRepository = new SinhVienRepository();

    @Override
    public ArrayList<SinhVien> getList() {
        return sinhVienRepository.getListFromDb();
    }

    @Override
    public String addNew(SinhVien sinhVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(SinhVien sinhVien, String maSinhVien) {
        if (sinhVienRepository.update(sinhVien, maSinhVien)) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String maSinhVien) {
        if (sinhVienRepository.delelte(maSinhVien)) {
            return "xoa thanh cong";
        }else{
            return "xoa that bai";
        }
    }

    @Override
    public ArrayList<SinhVien> search(String maSinhVien) {
        return sinhVienRepository.timKiem(maSinhVien);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysinhvien.service.impl;

import java.util.ArrayList;
import quanlysinhvien.model.SinhVien;
import quanlysinhvien.service.QuanLySinhVienService;

/**
 *
 * @author nguyenvv
 */
public class QuanLySinhVienImpl implements QuanLySinhVienService {

    private ArrayList<SinhVien> sinhViens;

    public QuanLySinhVienImpl() {
        sinhViens = new ArrayList<>();
        SinhVien sv = new SinhVien();
        sv.setHoTen("Nguyen Van A");
        sv.setLop("IT1234");
        sv.setNamSinh(1998);
        sv.setGioiTinh(1);
        sinhViens.add(sv);
    }

    @Override
    public ArrayList<SinhVien> getList() {
        return sinhViens;
    }

    @Override
    public String them(SinhVien sinhVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String sua(int vitri, SinhVien sinhVienNew) {
//        sinhViens.set(vitri, sinhVienNew);
        SinhVien svCu = sinhViens.get(vitri);
        svCu.setHoTen(sinhVienNew.getHoTen());
        svCu.setLop(sinhVienNew.getLop());
        svCu.setNamSinh(sinhVienNew.getNamSinh());
        return "Sua thanh cong";

    }

    @Override
    public String xoa(int vitri) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

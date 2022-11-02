/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach.service.impl;

import java.util.ArrayList;
import quanlysach.model.Sach;
import quanlysach.service.QuanLySachService;

/**
 *
 * @author nguyenvv
 */
public class QuanLySachImpl implements QuanLySachService {

    ArrayList<Sach> listSach = new ArrayList<>();

    public QuanLySachImpl() {
        Sach sach1 = new Sach();
        sach1.setTen("sach 1");
        sach1.setTacGia("tac gia 1");
        sach1.setNamIn(2020);
        sach1.setTheLoai(1);
        listSach.add(sach1);
    }
    

    @Override
    public ArrayList<Sach> getList() {
        return listSach;
    }

    @Override
    public String addSach(Sach sach) {
        listSach.add(sach);
        return "Them thanh cong";
    }

    @Override
    public String delete(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

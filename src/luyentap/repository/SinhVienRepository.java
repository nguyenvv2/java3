/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.repository;

import java.sql.*;
import java.util.ArrayList;
import luyentap.model.SinhVien;

/**
 *
 * @author nguyenvv
 */
public class SinhVienRepository {

    private DbConnection connection;

    public ArrayList<SinhVien> getListFromDb() {
        ArrayList<SinhVien> listSv = new ArrayList<>();
        String sql = " select * FROM sinh_vien";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSinhVien(rs.getString(1));
                sv.setTenSinhVien(rs.getString(2));
                sv.setTenLop(rs.getString(3));
                sv.setGioiTinh(rs.getInt(4));
                listSv.add(sv);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return listSv;
    }

    public ArrayList<SinhVien> timKiem(String maSinhVien) {
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        String sql = "select * FROM sinh_vien WHERE ma_sinh_vien = ?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, maSinhVien);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSinhVien(rs.getString(1));
                sv.setTenSinhVien(rs.getString(2));
                sv.setTenLop(rs.getString(3));
                sv.setGioiTinh(rs.getInt(4));
                listSinhVien.add(sv);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return listSinhVien;
    }

    public Boolean update(SinhVien sinhVien, String maSinhVien) {
        String sql = "update sinh_vien set ten_lop =?,"
                + " ten_sinh_vien =? "
                + " WHERE ma_sinh_vien = ?  ";
        int checkUpdate;
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, sinhVien.getTenLop());
            ps.setObject(2, sinhVien.getTenSinhVien());
            ps.setObject(3, maSinhVien);
            
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
    
    
    public Boolean delelte(String maSinhVien) {
        String sql = " DELETE from sinh_vien where ma_sinh_vien = ?";
        int checkUpdate;
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
          ps.setObject(1, maSinhVien);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
}

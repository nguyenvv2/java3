/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectsql.repository;

import connectsql.model.SanPham;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class SanPhamRepository {

    private DbConnection connection;

    public ArrayList<SanPham> getListFromDb() {
        ArrayList<SanPham> listSp = new ArrayList<>();
        String sql = " SELECT * FROM SanPham";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setId(rs.getInt(1));
                sp.setMa(rs.getString(2));
                sp.setTen(rs.getString(3));
                listSp.add(sp);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return listSp;
    }
    
    public static void main(String[] args) {
        ArrayList<SanPham> list = new  SanPhamRepository().getListFromDb();
        for (SanPham sanPham : list) {
            System.out.println(sanPham.toString());
        }
    }
}

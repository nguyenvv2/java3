/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectsql.service.impl;

import connectsql.model.SanPham;
import connectsql.repository.SanPhamRepository;
import connectsql.service.SanPhamService;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class SanPhamServiceImpl implements SanPhamService {

    private SanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    public ArrayList<SanPham> getAll() {
        return sanPhamRepository.getListFromDb();
    }

}

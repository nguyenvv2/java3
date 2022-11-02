/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package quanlysach.service;

import java.util.ArrayList;
import quanlysach.model.Sach;

/**
 *
 * @author nguyenvv
 */
public interface QuanLySachService {

    ArrayList<Sach> getList();

    String addSach(Sach sach);

    String delete(int index);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;
    import java.sql.SQLException;
    import java.util.List;
/**
 *
 * @author ASUS
 */
public interface interfaceyaa {
    void create(managerlal karyawan) throws SQLException;
    List<managerlal> getAllKaryawan() throws SQLException;
    void update(managerlal karyawan) throws SQLException;
    void delete(String nip) throws SQLException;
}

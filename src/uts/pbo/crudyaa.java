/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;
    import java.sql.*;
    import java.util.ArrayList;
    import java.util.List;

/**
 *
 * @author ASUS
 */
public class crudyaa implements interfaceyaa {
    private Connection conn;

    public crudyaa() throws SQLException {
        this.conn = daosambung.getConnection();
    }
    
    
    // Create
    @Override
    public void create(managerlal karyawan) throws SQLException {
        String query = "INSERT INTO karyawan (nip, nama, jabatan, gaji, divisi) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, karyawan.getNip());
        ps.setString(2, karyawan.getNama());
        ps.setString(3, karyawan.getJabatan());
        ps.setInt(4, karyawan.getGaji());
        ps.setString(5, karyawan.getDivisi());
        ps.executeUpdate();
    }
    
    
    
     // Read
     @Override
    public List<managerlal> getAllKaryawan() throws SQLException {
        List<managerlal> managerlals = new ArrayList<>();
        String query = "SELECT * FROM karyawan";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            managerlal p = new managerlal(
                rs.getString("nip"),
                rs.getString("nama"),
                rs.getString("jabatan"),
                rs.getInt("gaji"),
                rs.getString("divisi")
            );
            managerlals.add(p);
        }
        return managerlals;
    }

    
    
    @Override
    public void update(managerlal karyawan) throws SQLException {
        String query = "UPDATE karyawan SET nama = ?, jabatan = ?, gaji = ?, divisi = ? WHERE nip = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, karyawan.getNama());
        ps.setString(2, karyawan.getJabatan());
        ps.setInt(3, karyawan.getGaji());
        ps.setString(4, karyawan.getDivisi());
        ps.setString(5, karyawan.getNip());
        ps.executeUpdate();
    }
    
    
     @Override
    public void delete(String nip) throws SQLException {
        String query = "DELETE FROM karyawan WHERE nip = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, nip);
        ps.executeUpdate();
    }
}

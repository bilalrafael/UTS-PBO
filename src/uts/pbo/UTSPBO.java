/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo;
    import java.sql.SQLException;
    import java.util.List;
    import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class UTSPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            crudyaa crud = new crudyaa();
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("\n1. Create Karyawan\n2. Lihat Karywan\n3. Update Karyawan\n4. Delete Karyawan\n5. Keluar");
                System.out.print("Pilih menu: ");
                int menu = input.nextInt();

                switch (menu) {
                    case 1:
                        System.out.print("Nip: ");
                        String nip = input.next();
                        System.out.print("Nama: ");
                        String nama = input.next();
                        System.out.print("Jabatan: ");
                        String jabatan = input.next();
                        System.out.print("Gaji: ");
                        int gaji = input.nextInt();
                        System.out.print("Divisi: ");
                        String divisi = input.next();

                        crud.create(new managerlal(nip, nama, jabatan, gaji, divisi));
                        System.out.println("✅ Karyawan berhasil ditambahkan!");
                        break;

                    case 2:
                        List<managerlal> crudyaa = crud.getAllKaryawan();
                        System.out.println("=== Daftar Karyawan ===");
                        for (managerlal p : crudyaa) {
                            System.out.println("NIP     : " + p.getNip());
                            System.out.println("Nama    : " + p.getNama());
                            System.out.println("Jabatan : " + p.getJabatan());
                            System.out.println("Jabatan : " + p.getGaji());
                            System.out.println("Jabatan : " + p.getDivisi());
                            System.out.println("-------------------------");
                        }
                        break;


                    case 3:
                        System.out.print("Masukkan Nip Karyawan: ");
                        nip = input.next();
                        System.out.print("Nama baru: ");
                        nama = input.next();
                        System.out.print("Jabatan baru: ");
                        jabatan = input.next();
                        System.out.print("Gaji baru: ");
                        gaji = input.nextInt();
                        System.out.print("Divisi baru: ");
                        divisi = input.next();
                        crud.update(new managerlal(nip, nama, jabatan, gaji,divisi));
                        System.out.println("✅ Data Karyawan berhasil diupdate!");
                        break;

                    case 4:
                        System.out.print("Masukkan NIP Karyawan yang dihapus: ");
                        nip = input.next();
                        crud.delete(nip);
                        System.out.println("✅ Data Karyawan berhasil dihapus!");
                        break;

                    case 5:
                        System.exit(0);
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        
        
        
        
        //coba cek  sambung ngga nya
//        try {
//            Connection conn = daosambung.getConnection();
//                    if (conn != null){
//                        System.out.println("berhasil");
//                        conn.close();
//                    }
//        } catch (SQLException e) {
//            System.out.println("gagal");
//            e.printStackTrace();
//        }
    }
    
}

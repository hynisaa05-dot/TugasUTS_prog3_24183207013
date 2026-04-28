/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg6;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * @author Lenovo_J2
 */
public class Pertemuan6 extends javax.swing.JFrame {

    // ArrayList untuk menampung daftar pesanan
    ArrayList<String> daftarPesanan = new ArrayList<>();

    public Pertemuan6() {
        initComponents();
        
        // Inisialisasi JComboBox
        makan_minum.removeAllItems();
        makan_minum.addItem("Makanan");
        makan_minum.addItem("Minuman");
        makan_minum.setSelectedIndex(0);
        
        // Set isi list pertama kali sesuai index 0
        updateListMenu();
    }

    private void updateListMenu() {
        String kategori = makan_minum.getSelectedItem().toString();
        if (kategori.equals("Makanan")) {
            list_menu.setListData(new String[]{
                "Nasi Goreng", "Nasi Mawut", "Mie Goreng", "Mie Kuah"
            });
        } else if (kategori.equals("Minuman")) {
            list_menu.setListData(new String[]{
                "Es Milo", "Es Teh", "Es Jeruk", "Air Mineral"
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        makan_minum = new javax.swing.JComboBox<>();
        Meja_field = new javax.swing.JTextField();
        pemesanan_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_menu = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        btn_proses = new javax.swing.JButton();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Pemesanan Makanan");

        makan_minum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makan_minumActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel1.setText("APLIKASI PEMESANAN MAKANAN");

        jLabel2.setText("No. Meja:");
        jLabel3.setText("Nama:");
        jLabel4.setText("Kategori Menu:");

        jScrollPane1.setViewportView(list_menu);

        btn_proses.setText("Proses");
        btn_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesActionPerformed(evt);
            }
        });

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        // Layouting (Sederhana)
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_tambah))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(makan_minum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pemesanan_field)
                            .addComponent(Meja_field)
                            .addComponent(btn_proses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Meja_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pemesanan_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(makan_minum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_hapus))
                .addGap(18, 18, 18)
                .addComponent(btn_proses)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void makan_minumActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (makan_minum.getSelectedItem() != null) {
            updateListMenu();
        }
    }                                           

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String menuTerpilih = list_menu.getSelectedValue();
        if (menuTerpilih == null) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih menu dari daftar terlebih dahulu!");
            return;
        }

        String inputJumlah = JOptionPane.showInputDialog(this, "Masukkan jumlah porsi untuk " + menuTerpilih + ":");
        try {
            if (inputJumlah != null && !inputJumlah.isEmpty()) {
                int jumlah = Integer.parseInt(inputJumlah);
                daftarPesanan.add(menuTerpilih + " (" + jumlah + " porsi)");
                JOptionPane.showMessageDialog(this, "Pesanan ditambahkan!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Jumlah harus berupa angka!");
        }
    }                                          

    private void btn_prosesActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String nomorMeja = Meja_field.getText();
        String namaPemesan = pemesanan_field.getText();

        if (nomorMeja.isEmpty() || namaPemesan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nomor meja dan Nama harus diisi!");
            return;
        }

        if (daftarPesanan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Belum ada menu yang ditambahkan!");
            return;
        }

        StringBuilder hasil = new StringBuilder();
        for (String p : daftarPesanan) {
            hasil.append("- ").append(p).append("\n");
        }

        JOptionPane.showMessageDialog(this,
            "==== STRUK PESANAN ====\n" +
            "No Meja    : " + nomorMeja + "\n" +
            "Pemesan    : " + namaPemesan + "\n" +
            "--------------------------\n" +
            hasil.toString() +
            "--------------------------"
        );
    }                                          

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int konfirmasi = JOptionPane.showConfirmDialog(this, "Yakin hapus semua pesanan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (konfirmasi == JOptionPane.YES_OPTION) {
            daftarPesanan.clear();
            Meja_field.setText("");
            pemesanan_field.setText("");
            list_menu.clearSelection();
            JOptionPane.showMessageDialog(this, "Pesanan berhasil dikosongkan.");
        }
    }                                         

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Pertemuan6().setVisible(true);
        });
    }

    // Variables declaration                     
    private javax.swing.JTextField Meja_field;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_proses;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_menu;
    private javax.swing.JComboBox<String> makan_minum;
    private javax.swing.JTextField pemesanan_field;
    // End of variables declaration                   
}
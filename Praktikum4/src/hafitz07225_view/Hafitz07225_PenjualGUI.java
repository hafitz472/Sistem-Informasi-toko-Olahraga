
package hafitz07225_view;

import Hafitz07225_Controller.Hafitz07225_PembeliController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Hafitz07225_PenjualGUI {

    private static Hafitz07225_PembeliController pembeli = new Hafitz07225_PembeliController();
    JFrame Penjual = new JFrame();
    JTable tabelpembeli = new JTable();
    JScrollPane scrollaslab = new JScrollPane(tabelpembeli);
    JButton tambah, edit, hapus, back;
    JLabel admin, labelnomor, labelnama, labelpassword, labelalamat;
    JTextField nomortext, passwordtext;

    public Hafitz07225_PenjualGUI() {
        Penjual.setSize(650, 500);
        Penjual.setLayout(null);
        Penjual.getContentPane().setBackground(Color.LIGHT_GRAY);
        Penjual.setLocationRelativeTo(null);
        Penjual.setVisible(true);
        Penjual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        admin = new JLabel("ADMIN");
        admin.setBounds(250, 30, 200, 30);
        admin.setFont(new Font("Consolas", Font.BOLD, 40));
        Penjual.add(admin);

        scrollaslab.setBounds(30, 100, 570, 200);

        tabelpembeli.setModel(pembeli.dataTabelpembeli());

        Penjual.add(scrollaslab);

        labelnomor = new JLabel("Nomor");
        labelnomor.setBounds(50, 320, 100, 30);
        Penjual.add(labelnomor);

        nomortext = new JTextField();
        nomortext.setBounds(50, 350, 100, 30);
        Penjual.add(nomortext);

        labelpassword = new JLabel("password");
        labelpassword.setBounds(200, 320, 100, 30);
        Penjual.add(labelpassword);

        passwordtext = new JTextField();
        passwordtext.setBounds(200, 350, 100, 30);
        Penjual.add(passwordtext);

        edit = new JButton("Edit");
        edit.setBounds(200, 400, 100, 30);
        edit.setBackground(Color.YELLOW);
        Penjual.add(edit);

        hapus = new JButton("hapus");
        hapus.setBounds(350, 400, 100, 30);
        hapus.setBackground(Color.YELLOW);
        Penjual.add(hapus);
        
        back = new JButton("back");
        back.setBounds(500, 400, 100, 30);
        back.setBackground(Color.RED);
        Penjual.add(back);

        tambah = new JButton("Tambah");
        tambah.setBounds(50, 400, 100, 30);
        tambah.setBackground(Color.yellow);
        Penjual.add(tambah);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Penjual.dispose();
                Hafitz07225_GUI men = new Hafitz07225_GUI();
            }
        });
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Penjual.dispose();
                new Hafitz07225_TambahGUI();
            }
        });
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Penjual.dispose();
                String nomor = nomortext.getText();
                String pass = passwordtext.getText();
                int index = Hafitz07225_allobjectctrl.pembeli.cekpembeli(nomor, pass);
                Hafitz07225_allobjectctrl.pembeli.remove(index);
                Hafitz07225_PenjualGUI men = new Hafitz07225_PenjualGUI();
            }
        });

        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Penjual.dispose();
                String nomor = nomortext.getText();
                String pass = passwordtext.getText();
                int index = Hafitz07225_allobjectctrl.pembeli.cekpembeli(nomor, pass);
                new Hafitz07225_EditGUI(index);
            }
        });
        tabelpembeli.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelpembeli.getSelectedRow();
                nomortext.setText(Hafitz07225_allobjectctrl.pembeli.dataTabelpembeli().getValueAt(i, 0).toString());
                passwordtext.setText(Hafitz07225_allobjectctrl.pembeli.dataTabelpembeli().getValueAt(i, 1).toString());
            }
        });

    }
}

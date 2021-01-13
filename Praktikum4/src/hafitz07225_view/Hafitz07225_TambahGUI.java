
package hafitz07225_view;

import Hafitz07225_Entity.Hafitz07225_BarangEntity;
import Hafitz07225_Entity.Hafitz07225_DaftarbarangEntity;
import Hafitz07225_Entity.Hafitz07225_PembeliEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Hafitz07225_TambahGUI {
    JFrame tambah = new JFrame();
    JButton input,back;
    JLabel top,labelnomor,labelpassword,labelnama,labelalamat,labelbarang;
    JTextField textnomor,textpassword,textnama,textalamat,textbarang;
    JComboBox pilbar = new JComboBox(Hafitz07225_BarangEntity.namaBarang);
    public Hafitz07225_TambahGUI(){
        tambah.setSize(700,630);
        tambah.setLayout(null);
        tambah.getContentPane().setBackground(Color.CYAN);
        top = new JLabel("INPUT PEMBELI");
        top.setBounds(200,10,600,50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        tambah.add(top);
        
        
        labelnomor = new JLabel("Nomor");
        labelnomor.setBounds(250,180, 100, 30);
        tambah.add(labelnomor);
        
        textnomor = new JTextField();
        textnomor.setBounds(250, 210, 200, 30);
        tambah.add(textnomor);
        
        labelpassword = new JLabel("Password");
        labelpassword.setBounds(250, 300, 100, 30);
        tambah.add(labelpassword);
        
        textpassword = new JPasswordField();
        textpassword.setBounds(250, 330, 200, 30);
        tambah.add(textpassword);
        
        input = new JButton("Input");
        input.setBounds(300, 450, 100, 40);
        input.setBackground(Color.YELLOW);
        tambah.add(input);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(250, 240, 100, 30);
        tambah.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(250, 270, 200, 30);
        tambah.add(textnama);
        
        labelalamat =new JLabel("Alamat");
        labelalamat.setBounds(250, 370, 100, 30);
        tambah.add(labelalamat);
        
        labelbarang = new JLabel("Pilih Barang");
        labelbarang.setBounds(490, 180, 100, 30);
        tambah.add(labelbarang);
        
        pilbar.setBounds(490, 210, 100, 30);
        tambah.add(pilbar);
        
        textalamat = new JTextField();
        textalamat.setBounds(250, 400, 200, 30);
        tambah.add(textalamat);
        
        back = new JButton("back");
        back.setBounds(300, 500, 100, 30);
        back.setBackground(Color.RED);
        tambah.add(back);
        
        tambah.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tambah.setVisible(true);
        tambah.setLocationRelativeTo(null);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tambah.dispose();
                Hafitz07225_PenjualGUI men = new Hafitz07225_PenjualGUI();
            }
        });
        
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    
                    String nomor = textnomor.getText();
                    String pass = textpassword.getText();
                    String nama = textnama.getText();
                    String alamat = textalamat.getText();
                    int indexbar = pilbar.getSelectedIndex();
                    
                    
                    Hafitz07225_allobjectctrl.pembeli.daftarPembeli(indexbar, new Hafitz07225_PembeliEntity(nomor,pass,nama,alamat));
                    JOptionPane.showMessageDialog(null, "Input Sukses","Information",JOptionPane.INFORMATION_MESSAGE);
                    tambah.dispose();
                    Hafitz07225_PenjualGUI PenjualGUI = new Hafitz07225_PenjualGUI();
                }catch(Exception exception){
                    
                    JOptionPane.showMessageDialog(null, "Format Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
        });
    }
}

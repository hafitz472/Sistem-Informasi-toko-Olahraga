
package hafitz07225_view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
public class Hafitz07225_GUI {
    JFrame LogReg = new JFrame();
    JLabel login,daftar,top;
    JTextField textnomorlogin,textnomordaftar,textnama,textumur;
    JLabel labelnomorlogin,labelnomordaftar,labelnama,labelpasswordlogin,labelpassworddaftar,labelumur;
    JButton cek,registrasi;
    JPasswordField passworddaftar,passwordlogin;
    private boolean ceklogin = false;
    
    public Hafitz07225_GUI(){
        LogReg.setSize(700,630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("TOKO OLAHRAGA");
        top.setBounds(150,10,600,50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        LogReg.add(top);
        
        login = new JLabel("login Admin");
        login.setBounds(50, 50, 210, 100);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        LogReg.add(login);
        
        labelnomorlogin = new JLabel("Nomor");
        labelnomorlogin.setBounds(40,150, 100, 30);
        LogReg.add(labelnomorlogin);
        
        textnomorlogin = new JTextField();
        textnomorlogin.setBounds(30, 180, 200, 30);
        LogReg.add(textnomorlogin);
        
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(30, 210, 100, 30);
        LogReg.add(labelpasswordlogin);
        
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 240, 200, 30);
        LogReg.add(passwordlogin);
        
        cek = new JButton("Cek");
        cek.setBounds(90, 320, 100, 40);
        cek.setBackground(Color.YELLOW);
        LogReg.add(cek);
        
        daftar = new JLabel("Daftar Admin");
        daftar.setFont(new Font("Consolas",Font.BOLD,30));
        daftar.setBounds(400, 50, 210, 100);
        LogReg.add(daftar);
        
        labelnomordaftar = new JLabel("Nomor");
        labelnomordaftar.setBounds(400,150, 100, 30);
        LogReg.add(labelnomordaftar);
        
        textnomordaftar = new JTextField();
        textnomordaftar.setBounds(400, 180, 200, 30);
        LogReg.add(textnomordaftar);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(400, 210, 100, 30);
        LogReg.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(400, 240, 200, 30);
        LogReg.add(textnama);
        
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(400, 270, 100, 30);
        LogReg.add(labelpassworddaftar);
        
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400, 300, 200, 30);
        LogReg.add(passworddaftar);
        
        labelumur =new JLabel("Umur");
        labelumur.setBounds(400, 330, 100, 30);
        LogReg.add(labelumur);
        
        textumur = new JTextField();
        textumur.setBounds(400, 360, 200, 30);
        LogReg.add(textumur);
        
        registrasi = new JButton("Daftar");
        registrasi.setBounds(450, 400, 100, 30);
        registrasi.setBackground(Color.yellow);
        LogReg.add(registrasi);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        cek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    try{
                        Hafitz07225_allobjectctrl.penjual.login(textnomorlogin.getText(), passwordlogin.getText());
                        String nama = Hafitz07225_allobjectctrl.penjual.PenjualEntity07225().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat datang "+nama,"information",JOptionPane.INFORMATION_MESSAGE);
                        LogReg.dispose();
                        Hafitz07225_PenjualGUI pemilik = new Hafitz07225_PenjualGUI();
                        
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "Nomor Atau Password Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                        
                }
            }
        });
        registrasi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    String nomor = textnomordaftar.getText();
                    String pass = passworddaftar.getText();
                    String nama = textnama.getText();
                    String umur = textumur.getText();
                    
                    Hafitz07225_allobjectctrl.penjual.insert(nomor, pass, nama, umur);
                    JOptionPane.showMessageDialog(null, "Daftar Sukses","Information",JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    void kosong(){
    textnomordaftar.setText(null);
    passworddaftar.setText(null);
    textnama.setText(null);
    textumur.setText(null);
    textnomorlogin.setText(null);
    passwordlogin.setText(null);
    }
}

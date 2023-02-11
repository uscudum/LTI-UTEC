package Semana1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaApp extends JFrame{
    private JPanel panelMain;
    private JLabel lblName;
    private JTextField txtName;
    private JButton btnSave;

    public VentanaApp(){
        setTitle("Welcome");
        setSize(450,300);
        setContentPane(panelMain);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnSave, txtName.getText() + " , hola");
            }
        });
    }

    public static void main(String[] args) {
        VentanaApp myFrame = new VentanaApp();
    }


}

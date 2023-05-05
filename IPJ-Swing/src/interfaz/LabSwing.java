package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabSwing extends Frame {
    private JTextField txtTemp;
    private JComboBox cmbUnit;
    private JButton btnConvert;
    private JTextField txtResult;
    private JPanel panel;

    public LabSwing() {
        JFrame frame = new JFrame("Convertidor");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setVisible(true);
        frame.setBounds(700,350,400,400);



        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Double temperatura = Double.parseDouble(txtTemp.getText());
                    Double resultado = 0.0;
                    Integer conversion = cmbUnit.getSelectedIndex();

                    if (conversion == 0) {
                        resultado = (Double) ((temperatura * 9 / 5) + 32);
                        //(0 °C × 9/5) + 32 = 32 °F
                        txtResult.setText(String.format("%.2f °F", resultado));
                    }
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(panel,"Dato inválido: " + error.getMessage(), "Error",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        LabSwing labSwing = new LabSwing();
    }
}

//https://es.stackoverflow.com/questions/1487/guia-definitiva-de-conversión-de-tipos-en-java
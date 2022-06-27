package padrao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author sjand
 */
public class Conversor extends JFrame
{
    JLabel titulo, rotulo1, grauf, grauk;
    JTextField texto1, exibirf, exibirk;
    JButton converter;
    
    public Conversor()
    {
        super("");
        
        Container tela = getContentPane();
        setLayout(null);
        
        titulo = new JLabel("Conversor de Temperatura");
        titulo.setBounds(95, 20, 200, 20);
        titulo.setForeground(new Color(64, 33, 189));
        titulo.setFont(new Font("Arial",Font.BOLD,14));
        
        rotulo1 = new JLabel("Graus Celsius");
        rotulo1.setBounds(80, 60, 80, 20);
        rotulo1.setFont(new Font("Arial",Font.BOLD,12));
        
        texto1 = new JTextField(4);
        texto1.setBounds(220, 60, 80, 20);
        
        grauf = new JLabel("Grau Fahrenheit");
        grauf.setBounds(80, 110, 100, 20);
        grauf.setFont(new Font("Arial",Font.BOLD,12));
        exibirf = new JTextField("");
        exibirf.setBounds(220, 110, 80, 20);
        
        grauk = new JLabel("Grau Kelvin");
        grauk.setBounds(80, 160, 80, 20);
        grauk.setFont(new Font("Arial",Font.BOLD,12));
        exibirk = new JTextField("");
        exibirk.setBounds(220, 160, 80, 20);        
        
        converter = new JButton("Converte");
        converter.setBounds(150, 200, 100, 20);
        
        converter.addActionListener
        (
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        double temp, f, k;
                        temp = 0;
                        
                        temp = Double.parseDouble(texto1.getText());
                        
                        f = ((temp * 9/5) + 32);
                        k = temp + 273.15;
                        
                        exibirf.setText(f + "");
                        exibirk.setText(k + "");
                        
                        exibirf.setVisible(true);
                        exibirk.setVisible(true);
                    }
                }
        );
        
        texto1.requestFocus();
        exibirf.setVisible(true);
        exibirk.setVisible(true);
        
        tela.add(titulo);
        
        tela.add(rotulo1);
        tela.add(texto1);
        
        tela.add(grauf);
        tela.add(exibirf);
        
        tela.add(grauk);
        tela.add(exibirk);
        
        tela.add(converter);
        
        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(true);
    }
    
    public static void main(String[] args) 
    {
        Conversor app = new Conversor();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}
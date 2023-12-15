package sample;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Order extends JFrame {

    private JPanel contentPane;
    private JTextArea output;
    private UserUI userUI;

    public Order(UserUI userUI) {
        this.userUI = userUI;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 670, 672);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(254, 255, 255));
        panel.setBounds(20, 23, 630, 79);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("會員訂單資訊");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
        lblNewLabel.setBounds(239, 20, 144, 38);
        panel.add(lblNewLabel);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(254, 255, 255));
        panel2.setBounds(21, 151, 629, 279);
        contentPane.add(panel2);
        panel2.setLayout(null);

        output = new JTextArea();
        output.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        output.setBounds(49, 24, 519, 228);
        panel2.add(output);

        JButton leave = new JButton("離開");
        leave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        leave.setForeground(new Color(94, 94, 94));
        leave.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        leave.setBounds(458, 468, 129, 41);
        contentPane.add(leave);

        JButton back = new JButton("返回");
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	UserUI page1 = new UserUI();
                page1.setVisible(true);  
                dispose();
            }
        });
        back.setForeground(new Color(94, 94, 94));
        back.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        back.setBounds(64, 470, 129, 41);
        contentPane.add(back);
        
        JButton printer = new JButton("列印");
        printer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			 output.print();
        			} 
        		catch (PrinterException e1) 
        		{
					e1.printStackTrace();
				}
        	}
        });
        printer.setForeground(new Color(94, 94, 94));
        printer.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        printer.setBounds(259, 468, 129, 41);
        contentPane.add(printer);
        

    }

    public void setOrder(String order) 
    {
        output.setText(order);
    }
}

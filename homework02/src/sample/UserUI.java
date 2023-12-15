package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserUI extends JFrame {
	
	 
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField apple;
	private JTextField banana;
	private JTextField orange;
	private JTextField peach;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserUI frame = new UserUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel01 = new JPanel();
		panel01.setBackground(new Color(254, 255, 255));
		panel01.setBounds(17, 23, 630, 77);
		contentPane.add(panel01);
		panel01.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("會員訂單");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel.setBounds(257, 17, 110, 38);
		panel01.add(lblNewLabel);
		
		JPanel panel02 = new JPanel();
		panel02.setBackground(new Color(254, 255, 255));
		panel02.setBounds(17, 130, 630, 345);
		contentPane.add(panel02);
		panel02.setLayout(null);
		
		JLabel 蘋果 = new JLabel("蘋果/10元");
		蘋果.setForeground(new Color(94, 94, 94));
		蘋果.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		蘋果.setBounds(40, 83, 91, 29);
		panel02.add(蘋果);
		
		JLabel 香蕉 = new JLabel("香蕉/20元");
		香蕉.setForeground(new Color(94, 94, 94));
		香蕉.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		香蕉.setBounds(40, 124, 91, 29);
		panel02.add(香蕉);
		
		JLabel 柳橙 = new JLabel("柳橙/30元");
		柳橙.setForeground(new Color(94, 94, 94));
		柳橙.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		柳橙.setBounds(40, 165, 91, 29);
		panel02.add(柳橙);
		
		JLabel 水蜜桃 = new JLabel("水蜜桃/40元");
		水蜜桃.setForeground(new Color(94, 94, 94));
		水蜜桃.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		水蜜桃.setBounds(40, 206, 120, 29);
		panel02.add(水蜜桃);
		
		apple = new JTextField();
		apple.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		apple.setForeground(new Color(254, 255, 255));
		apple.setBackground(new Color(121, 121, 121));
		apple.setBounds(167, 85, 120, 29);
		panel02.add(apple);
		apple.setColumns(10);
		
		banana = new JTextField();
		banana.setForeground(new Color(254, 255, 255));
		banana.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		banana.setColumns(10);
		banana.setBackground(new Color(121, 121, 121));
		banana.setBounds(167, 124, 120, 29);
		panel02.add(banana);
		
		orange = new JTextField();
		orange.setForeground(new Color(254, 255, 255));
		orange.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		orange.setColumns(10);
		orange.setBackground(new Color(121, 121, 121));
		orange.setBounds(167, 165, 120, 29);
		panel02.add(orange);
		
		peach = new JTextField();
		peach.setForeground(new Color(254, 255, 255));
		peach.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		peach.setColumns(10);
		peach.setBackground(new Color(121, 121, 121));
		peach.setBounds(167, 206, 120, 29);
		panel02.add(peach);
		
		
		
		JRadioButton member1 = new JRadioButton("  會員");
		member1.setBounds(333, 44, 141, 23);
		panel02.add(member1);
		member1.setForeground(new Color(94, 94, 94));
		member1.setSelected(true);
		member1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		member1.setBackground(new Color(254, 255, 255));
		buttonGroup.add(member1);
		buttonGroup.add(member1);
		
		JRadioButton member2 = new JRadioButton("  非會員");
		member2.setBounds(333, 79, 141, 23);
		panel02.add(member2);
		member2.setForeground(new Color(94, 94, 94));
		member2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		member2.setBackground(new Color(254, 255, 255));
		buttonGroup.add(member2);
		buttonGroup.add(member2);
		
		JLabel abc = new JLabel("姓名");
		abc.setForeground(new Color(94, 94, 94));
		abc.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		abc.setBounds(40, 42, 91, 29);
		panel02.add(abc);
		
		name = new JTextField();
		name.setForeground(new Color(254, 255, 255));
		name.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		name.setColumns(10);
		name.setBackground(new Color(121, 121, 121));
		name.setBounds(167, 44, 120, 29);
		panel02.add(name);
		
		ButtonGroup buttonGroup = new ButtonGroup();
        
		JButton OK = new JButton("確認");
		OK.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) 
		    {
		        // 使用者輸入
		        String Name = name.getText();
		        Integer Apple = Integer.parseInt(apple.getText());
		        Integer Banana = Integer.parseInt(banana.getText());
		        Integer Orange = Integer.parseInt(orange.getText());
		        Integer Peach = Integer.parseInt(peach.getText());

		        // 計算總金額
		        Product1 product = new Product2();
		        Integer sum1 = product.getSum1(Apple, Banana, Orange, Peach);
		        Integer sum2 = product.getSum2(sum1);
		        Integer sum3 = product.getSum3(sum2);
		        Integer sum4 = product.getSum4(sum3);

		        // 訂單資訊Order視窗
		        Order page2 = new Order(null);
		        
		        if (sum1 >= 1000) {
		            if (member1.isSelected()) {
		                // 滿千與會員折扣
		                page2.setOrder(
		                    "姓名：" + Name + 
		                    "\n蘋果數量：" + Apple + 
		                    "\n香蕉數量：" + Banana + 
		                    "\n柳橙數量：" + Orange + 
		                    "\n水蜜桃數量：" + Peach +
		                    "\n訂單總金額：" + sum4);
		            } else {
		                // 滿千95折
		                page2.setOrder(
		                    "姓名：" + Name + 
		                    "\n蘋果數量：" + Apple + 
		                    "\n香蕉數量：" + Banana + 
		                    "\n柳橙數量：" + Orange + 
		                    "\n水蜜桃數量：" + Peach +
		                    "\n訂單總金額：" + sum2);
		            }
		        } else {
		            if (sum1 < 1000 && member1.isSelected()) {
		                // 會員折扣
		                page2.setOrder(
		                    "姓名：" + Name + 
		                    "\n蘋果數量：" + Apple + 
		                    "\n香蕉數量：" + Banana + 
		                    "\n柳橙數量：" + Orange + 
		                    "\n水蜜桃數量：" + Peach +
		                    "\n訂單總金額：" + sum3); 
		            } else {
		                // 未滿千且非會員
		                page2.setOrder(
		                    "姓名：" + Name + 
		                    "\n蘋果數量：" + Apple + 
		                    "\n香蕉數量：" + Banana + 
		                    "\n柳橙數量：" + Orange + 
		                    "\n水蜜桃數量：" + Peach +
		                    "\n訂單總金額：" + sum1);
		            }
		        }

		        // 顯示Order視窗
		        page2.setVisible(true);
		        dispose();
		    }
		});

        OK.setForeground(new Color(94, 94, 94));
        OK.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        OK.setBounds(263, 517, 129, 41);
        contentPane.add(OK);
        
        
	}
}

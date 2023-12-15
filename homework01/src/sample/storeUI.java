package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class storeUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField led;
	private JTextField ram;
	private JTextField mouse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					storeUI frame = new storeUI();
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
	public storeUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(254, 255, 255));
		panel.setBounds(88, 28, 496, 67);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("訂單系統");
		lblNewLabel.setBounds(217, 24, 61, 16);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(254, 255, 255));
		panel_1.setBounds(88, 127, 496, 247);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLed = new JLabel("Led");
		lblLed.setBounds(51, 96, 52, 16);
		panel_1.add(lblLed);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mouse");
		lblNewLabel_1_1.setBounds(51, 187, 52, 16);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ram");
		lblNewLabel_1_1_1.setBounds(51, 140, 52, 16);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("姓名");
		lblNewLabel_1_2.setBounds(51, 53, 52, 16);
		panel_1.add(lblNewLabel_1_2);
		
		name = new JTextField();
		name.setBackground(new Color(169, 169, 169));
		name.setBounds(116, 48, 130, 26);
		panel_1.add(name);
		name.setColumns(10);
		
		led = new JTextField();
		led.setColumns(10);
		led.setBackground(new Color(169, 169, 169));
		led.setBounds(115, 91, 130, 26);
		panel_1.add(led);
		
		ram = new JTextField();
		ram.setColumns(10);
		ram.setBackground(new Color(169, 169, 169));
		ram.setBounds(115, 135, 130, 26);
		panel_1.add(ram);
		
		mouse = new JTextField();
		mouse.setColumns(10);
		mouse.setBackground(new Color(169, 169, 169));
		mouse.setBounds(115, 182, 130, 26);
		panel_1.add(mouse);
		
		JCheckBox member = new JCheckBox("  會員身分");
		member.setBounds(279, 49, 128, 23);
		panel_1.add(member);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("數量");
		lblNewLabel_1_2_1.setBounds(160, 20, 52, 16);
		panel_1.add(lblNewLabel_1_2_1);
		
		JTextArea output = new JTextArea();
		output.setBounds(88, 456, 496, 135);
		contentPane.add(output);
		
		JButton ok = new JButton("OK");
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			 String Name=name.getText();
			 // String Led=led.getText();
			 Integer a=Integer.parseInt(led.getText());
			 Integer b=Integer.parseInt(ram.getText());
			 Integer c=Integer.parseInt(mouse.getText());
			 
			 store x=new store(Name,a,b,c);
			 
			 if (x.getSum1() >= 20000) 
			      {		
				    if (member.isSelected()) 
				  {
				        output.setText(
				            "姓名：" + x.getName() +
				            "\nLed：" + x.getLed() +
				            "\nRam：" + x.getRam() +
				            "\nMouse：" + x.getMouse() +
				            "\n總計：" + x.getSum3());  // 滿2萬 會員 95折+95折
				    } 
				    else // 
				    {
				        output.setText(
				            "姓名：" + x.getName() +
				            "\nLed：" + x.getLed() +
				            "\nRam：" + x.getRam() +
				            "\nMouse：" + x.getMouse() +
				            "\n總計：" + x.getSum2());   // 滿2萬 非會員 95折
				    }
				} 
			 else 
				{
				 if (x.getSum1() < 20000 && member.isSelected())  
			    {
			        output.setText(
			            "姓名：" + x.getName() +
			            "\nLed：" + x.getLed() +
			            "\nRam：" + x.getRam() +
			            "\nMouse：" + x.getMouse() +
			            "\n總計：" + x.getSum2());    // 不滿2萬 會員 95折
			    } 
				else 
			     {
			        output.setText(
			            "姓名：" + x.getName() +
			            "\nLed：" + x.getLed() +
			            "\nRam：" + x.getRam() +
			            "\nMouse：" + x.getMouse() +
			            "\n總計：" + x.getSum1());  // 不滿2萬 非會員 不打折
			     }
			    } 
		     }
		});
		ok.setBounds(279, 403, 117, 29);
		contentPane.add(ok);
	}
}

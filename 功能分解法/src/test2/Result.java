package test2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

/**
 * 成本估算结果页面
 */
public class Result extends JFrame {
	
	private float summ;
	private float sumc;
	private float showm;
	private float showc;

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public Result(float[] m,float[] c,int n) {
		try {
			summ = (float)0;
			sumc = (float)0;
			
			setTitle("测算结果");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 551, 324);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel label = new JLabel("功能分解法测算软件工期与成本");
			label.setBounds(10, 10, 432, 59);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("微软雅黑", Font.PLAIN, 21));
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("软件成本：");
			label_1.setBounds(56, 132, 90, 21);
			contentPane.add(label_1);
			
			JLabel label_3 = new JLabel("*");
			label_3.setBounds(150, 132, 81, 21);
			contentPane.add(label_3);
			
			JLabel label_4 = new JLabel("软件工期：");
			label_4.setBounds(56, 182, 90, 21);
			contentPane.add(label_4);
			
			JLabel label_5 = new JLabel("*");
			label_5.setBounds(150, 182, 81, 21);
			contentPane.add(label_5);
			
			for(int i = 0; i < n;i++) {
				summ = summ + m[i];
				sumc = sumc + c[i];
			}
			
			showc = (float)(Math.round(sumc*100))/100;
			showm = (float)(Math.round(summ*100))/100;
			
			label_3.setText(String.valueOf(showc));
			label_5.setText(String.valueOf(showm));
			
			setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

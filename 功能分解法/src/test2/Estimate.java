package test2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * 输入参数值
 * 进行估算的页面
 */
public class Estimate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private float[][] a;
	private String[] name;
	private float[] d;
	private float[] c;
	private float[] m;
	int i;

	/**
	 * Create the frame.
	 */
	public Estimate(int n) {
		try {
			i = 0;
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 533, 408);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel label = new JLabel("功能分解法测算软件工期与成本");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("微软雅黑", Font.PLAIN, 21));
			label.setBounds(100, 38, 307, 21);
			contentPane.add(label);
			
			JLabel lblNewLabel = new JLabel("最乐观值");
			lblNewLabel.setBounds(40, 126, 81, 21);
			contentPane.add(lblNewLabel);
			
			JLabel label_1 = new JLabel("最悲观值");
			label_1.setBounds(225, 126, 81, 21);
			contentPane.add(label_1);
			
			JLabel label_2 = new JLabel("最可能值");
			label_2.setBounds(40, 178, 81, 21);
			contentPane.add(label_2);
			
			JLabel label_3 = new JLabel("成本费用率");
			label_3.setBounds(31, 207, 90, 21);
			contentPane.add(label_3);
			
			JLabel label_4 = new JLabel("劳动生产率");
			label_4.setBounds(216, 178, 90, 21);
			contentPane.add(label_4);
			
			JLabel label_5 = new JLabel("输入");
			label_5.setBounds(40, 81, 81, 21);
			contentPane.add(label_5);
			
			JLabel label_7 = new JLabel("功能模块的各参数值：");
			label_7.setBounds(273, 81, 182, 21);
			contentPane.add(label_7);
			
			textField = new JTextField();
			textField.setBounds(107, 126, 75, 27);
			contentPane.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(308, 123, 75, 27);
			contentPane.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBounds(107, 175, 75, 27);
			contentPane.add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setBounds(107, 212, 75, 27);
			contentPane.add(textField_3);
			textField_3.setColumns(10);
			
			textField_4 = new JTextField();
			textField_4.setBounds(302, 175, 81, 27);
			contentPane.add(textField_4);
			textField_4.setColumns(10);
			
			JButton button = new JButton("分析");
			button.setBounds(284, 272, 123, 29);
			contentPane.add(button);
			
			JButton button_1 = new JButton("保存信息");
			button_1.setBounds(125, 272, 123, 29);
			contentPane.add(button_1);
			
			textField_5 = new JTextField();
			textField_5.setBounds(84, 78, 171, 27);
			contentPane.add(textField_5);
			textField_5.setColumns(10);
			
			JLabel label_9 = new JLabel("行");
			label_9.setBounds(193, 134, 81, 21);
			contentPane.add(label_9);
			
			JLabel label_10 = new JLabel("行");
			label_10.setBounds(397, 126, 81, 21);
			contentPane.add(label_10);
			
			JLabel label_11 = new JLabel("行");
			label_11.setBounds(193, 178, 81, 21);
			contentPane.add(label_11);
			
			JLabel label_12 = new JLabel("元/行");
			label_12.setBounds(193, 215, 81, 21);
			contentPane.add(label_12);
			
			JLabel label_13 = new JLabel("元/行");
			label_13.setBounds(397, 178, 81, 21);
			contentPane.add(label_13);
			
			a = new float[n][5];
			d = new float[n];
			c = new float[n];
			m = new float[n];
			name = new String[n];
			
			button_1.addActionListener(new ActionListener() {
	
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(i < n) {
						name[i] = textField_5.getText().trim();
						a[i][0] = Float.parseFloat(textField.getText().trim());
						a[i][1] = Float.parseFloat(textField_1.getText().trim());
						a[i][2] = Float.parseFloat(textField_2.getText().trim());
						a[i][3] = Float.parseFloat(textField_3.getText().trim());
						a[i][4] = Float.parseFloat(textField_4.getText().trim());
						
						
						d[i] = (float)(Math.round(((a[i][0] + 4 * a[i][2] + a[i][1]) / 6) * 100)) / 100;
						c[i] = (float)(Math.round((a[i][3] * d[i]) * 100)) / 100;
						m[i] = (float)(Math.round((d[i] / a[i][4])* 100)) / 100;
						
						i++;
					}
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					
					if(i >= n) {
						JOptionPane.showMessageDialog(null, "模块信息输入完毕");
					}
					
				}
				
			});
			
			button.addActionListener(new ActionListener() {
	
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new Result(m,c,n);
				}
				
			});
			
			setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

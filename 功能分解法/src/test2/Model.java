package test2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

/**
 * 开始输入界面
 */
public class Model extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int n;

	/**
	 * Create the frame.
	 */
	public Model() {
		try {
			setTitle("功能分解法");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 546, 287);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel label = new JLabel("输入模块数");
			label.setBounds(69, 107, 112, 21);
			contentPane.add(label);
			
			textField = new JTextField();
			textField.setBounds(196, 104, 96, 27);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JButton button = new JButton("确定");
			button.setBounds(348, 167, 123, 29);
			contentPane.add(button);
			
			JLabel label_1 = new JLabel("功能分解法测算软件工期与成本");
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setFont(new Font("???", Font.PLAIN, 21));
			label_1.setBounds(109, 32, 307, 21);
			contentPane.add(label_1);
			
			setVisible(true);
			
			button.addActionListener(new ActionListener() {
	
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					n = Integer.parseInt(textField.getText().trim());
					new Estimate(n);
					setVisible(false);
				}
				
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

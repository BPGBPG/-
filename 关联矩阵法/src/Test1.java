import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 关联矩阵参数输入主窗口
 */
public class Test1 implements ActionListener {
    private JFrame frame;
    // 文本框
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField textField_20;
    private JTextField textField_21;
    private JTextField textField_22;
    private JTextField textField_23;

    private JButton compute,next;
    int[] F=new int[4];
    float[] W=new float[4];


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Test1 window = new Test1();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Test1() {
        initialize();// 初始化主窗口
    }

    /**
     * 初始化主窗口
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 581, 331);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 538, 270);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        textField = new JTextField();
        textField.setBounds(79, 69, 66, 21);
        panel.add(textField);
        textField.setToolTipText("");
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(155, 69, 66, 21);
        panel.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(231, 69, 66, 21);
        panel.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(307, 69, 66, 21);
        panel.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(383, 69, 66, 21);
        panel.add(textField_4);
        textField_4.setEditable(false);
        textField_4.setColumns(10);

        textField_5 = new JTextField();
        textField_5.setBounds(459, 69, 66, 21);
        panel.add(textField_5);
        textField_5.setEditable(false);
        textField_5.setColumns(10);

        textField_6 = new JTextField();
        textField_6.setBounds(79, 100, 66, 21);
        panel.add(textField_6);
        textField_6.setColumns(10);

        textField_7 = new JTextField();
        textField_7.setBounds(155, 100, 66, 21);
        panel.add(textField_7);
        textField_7.setColumns(10);

        textField_8 = new JTextField();
        textField_8.setBounds(231, 100, 66, 21);
        panel.add(textField_8);
        textField_8.setColumns(10);

        textField_9 = new JTextField();
        textField_9.setBounds(307, 100, 66, 21);
        panel.add(textField_9);
        textField_9.setColumns(10);

        textField_10 = new JTextField();
        textField_10.setBounds(383, 100, 66, 21);
        panel.add(textField_10);
        textField_10.setEditable(false);
        textField_10.setColumns(10);

        textField_11 = new JTextField();
        textField_11.setBounds(459, 100, 66, 21);
        panel.add(textField_11);
        textField_11.setEditable(false);
        textField_11.setColumns(10);

        textField_12 = new JTextField();
        textField_12.setBounds(79, 131, 66, 21);
        panel.add(textField_12);
        textField_12.setColumns(10);

        textField_13 = new JTextField();
        textField_13.setBounds(155, 131, 66, 21);
        panel.add(textField_13);
        textField_13.setColumns(10);

        textField_14 = new JTextField();
        textField_14.setBounds(231, 131, 66, 21);
        panel.add(textField_14);
        textField_14.setColumns(10);

        textField_15 = new JTextField();
        textField_15.setBounds(307, 131, 66, 21);
        panel.add(textField_15);
        textField_15.setColumns(10);

        textField_16 = new JTextField();
        textField_16.setBounds(383, 131, 66, 21);
        panel.add(textField_16);
        textField_16.setEditable(false);
        textField_16.setColumns(10);

        textField_17 = new JTextField();
        textField_17.setBounds(459, 131, 66, 21);
        panel.add(textField_17);
        textField_17.setEditable(false);
        textField_17.setColumns(10);

        textField_18 = new JTextField();
        textField_18.setBounds(79, 162, 66, 21);
        panel.add(textField_18);
        textField_18.setColumns(10);

        textField_19 = new JTextField();
        textField_19.setBounds(155, 162, 66, 21);
        panel.add(textField_19);
        textField_19.setColumns(10);

        textField_20 = new JTextField();
        textField_20.setBounds(231, 162, 66, 21);
        panel.add(textField_20);
        textField_20.setColumns(10);

        textField_21 = new JTextField();
        textField_21.setBounds(307, 162, 66, 21);
        panel.add(textField_21);
        textField_21.setColumns(10);

        textField_22 = new JTextField();
        textField_22.setBounds(383, 162, 66, 21);
        panel.add(textField_22);
        textField_22.setEditable(false);
        textField_22.setColumns(10);

        textField_23 = new JTextField();
        textField_23.setBounds(459, 162, 66, 21);
        panel.add(textField_23);
        textField_23.setEditable(false);
        textField_23.setColumns(10);

        JLabel lblNewLabel = new JLabel("X1");
        lblNewLabel.setBounds(79, 44, 66, 15);
        panel.add(lblNewLabel);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblX = new JLabel("X2");
        lblX.setBounds(155, 44, 66, 15);
        panel.add(lblX);
        lblX.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblX_1 = new JLabel("X3");
        lblX_1.setBounds(231, 44, 66, 15);
        panel.add(lblX_1);
        lblX_1.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblX_2 = new JLabel("X4");
        lblX_2.setBounds(307, 44, 66, 15);
        panel.add(lblX_2);
        lblX_2.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblX_3 = new JLabel("Fi");
        lblX_3.setBounds(383, 44, 66, 15);
        panel.add(lblX_3);
        lblX_3.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblX_4 = new JLabel("Wi");
        lblX_4.setBounds(459, 44, 66, 15);
        panel.add(lblX_4);
        lblX_4.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblX_9 = new JLabel("\r\nX1:\u6210\u672C \r\nX2:\r\n\u529F\u80FD\u4E0E\u6027\u80FD \r\nX3:\u89C4\u6A21\u4E0E\u7814\u53D1\u96BE\u5EA6 \r\nX4:\u6295\u8D44\u5229\u6DA6\u7387");
        lblX_9.setBounds(35, 193, 318, 15);
        panel.add(lblX_9);
        lblX_9.setFont(new Font("宋体", Font.PLAIN, 12));

        JLabel lblNewLabel_1 = new JLabel("\u6743\u91CD\u7CFB\u6570\u7684\u786E\u5B9A: \u5982\u679C Xi \u6BD4Xj \u91CD\u8981\u5219\u4E3A1  \u5426\u5219\u4E3A0");
        lblNewLabel_1.setBounds(35, 213, 329, 16);
        panel.add(lblNewLabel_1);
        lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 14));

        compute = new JButton("\u8BA1\u7B97");
        compute.setBounds(441, 210, 84, 23);
        panel.add(compute);

        JLabel label_10 = new JLabel("\u6743\u91CD\u7CFB\u6570\u6C42\u89E3\u8868");
        label_10.setBounds(187, 10, 140, 24);
        panel.add(label_10);
        label_10.setFont(new Font("宋体", Font.PLAIN, 20));

        JLabel lblEij = new JLabel("Eij");
        lblEij.setBounds(10, 44, 66, 15);
        panel.add(lblEij);
        lblEij.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblX_5 = new JLabel("X1");
        lblX_5.setBounds(10, 72, 66, 15);
        panel.add(lblX_5);
        lblX_5.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblX_6 = new JLabel("X2");
        lblX_6.setBounds(10, 103, 66, 15);
        panel.add(lblX_6);
        lblX_6.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblX_7 = new JLabel("X3");
        lblX_7.setBounds(10, 134, 66, 15);
        panel.add(lblX_7);
        lblX_7.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblX_8 = new JLabel("X4");
        lblX_8.setBounds(10, 165, 66, 15);
        panel.add(lblX_8);
        lblX_8.setHorizontalAlignment(SwingConstants.CENTER);

        next= new JButton("\u4E0B\u4E00\u6B65");
        next.setBounds(441, 239, 84, 23);
        panel.add(next);

        compute.addActionListener(this);
        next.addActionListener(this);

    }

    /**
     * 监听器：获取窗口中各个组件中填写的信息
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==compute) {
            F[0]=Integer.valueOf(textField.getText())+Integer.valueOf(textField_1.getText())+Integer.valueOf(textField_2.getText())+Integer.valueOf(textField_3.getText());
            F[1]=Integer.valueOf(textField_6.getText())+Integer.valueOf(textField_7.getText())+Integer.valueOf(textField_8.getText())+Integer.valueOf(textField_9.getText());
            F[2]=Integer.valueOf(textField_12.getText())+Integer.valueOf(textField_13.getText())+Integer.valueOf(textField_14.getText())+Integer.valueOf(textField_15.getText());
            F[3]=Integer.valueOf(textField_18.getText())+Integer.valueOf(textField_19.getText())+Integer.valueOf(textField_20.getText())+Integer.valueOf(textField_21.getText());

            int sum=F[0]+F[1]+F[2]+F[3];
            W[0]=(float)F[0]/sum;
            W[1]=(float)F[1]/sum;
            W[2]=(float)F[2]/sum;
            W[3]=(float)F[3]/sum;
            textField_4.setText(F[0]+"");
            textField_10.setText(F[1]+"");
            textField_16.setText(F[2]+"");
            textField_22.setText(F[3]+"");

            textField_5.setText(W[0]+"");
            textField_11.setText(W[1]+"");
            textField_17.setText(W[2]+"");
            textField_23.setText(W[3]+"");
        }
        if(e.getSource()==next) {
            String NUM = (String) JOptionPane.showInputDialog(frame, "你有几个系统方案", "系统提示",
                    JOptionPane.PLAIN_MESSAGE, null, null, null);
            int num=Integer.valueOf(NUM);
            Test2 t2=new Test2(W,num);
            frame.setVisible(false);
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 各指标等级分表
 */
public class Test2 extends JFrame implements ActionListener {
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField txta;
    private JButton next;
    int[][] U;
    float[] V;
    float[] W;
    private int num;
    private int i = 1;

    public Test2() throws HeadlessException {
        initialize();// 初始化主窗体的方法
    }

    public Test2(float[] W, int num) throws HeadlessException {
        this.W = W;
        this.num = num;
        U = new int[num][4];
        V = new float[num];
        initialize();// 初始化主窗体的方法
    }

    /**
     * 初始化主窗体的方法
     */
    private void initialize() {
        this.setBounds(100, 100, 585, 481);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        this.setVisible(true);

        JPanel panel = new JPanel();
        panel.setFont(new Font("宋体", Font.PLAIN, 16));
        panel.setBounds(10, 10, 540, 191);
        this.getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createTitledBorder(""));

        JLabel label = new JLabel("\u5404\u6307\u6807\u7B49\u7EA7\u5206\u8868");
        label.setBounds(196, 10, 126, 21);
        label.setFont(new Font("宋体", Font.PLAIN, 18));
        panel.add(label);

        JLabel lblNewLabel = new JLabel("\u5C5E\u6027        5          4          3          2            1");
        lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
        lblNewLabel.setBounds(10, 43, 488, 19);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel(
                "X1      20\u4E07\u5143\u4EE5\u4E0B    [20,30)    [30,40)   [40,50)  50\u4E07\u5143\u4EE5\u4E0A");
        lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
        lblNewLabel_1.setBounds(20, 72, 496, 19);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel(
                "X2        \u5F88\u5F3A          \u5F3A        \u8F83\u5F3A      \u4E00\u822C           \u5F31");
        lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 16));
        lblNewLabel_2.setBounds(20, 101, 488, 19);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel(
                "X4       0.7\u4EE5\u4E0A     [0.5,0.7)   [0.4,0.5)   [0.3,0.4)   0.3\u4EE5\u4E0B");
        lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 16));
        lblNewLabel_3.setBounds(20, 161, 512, 19);
        panel.add(lblNewLabel_3);

        JLabel lblXucfufucf = new JLabel(
                "X3         \u5C0F         \u8F83\u5C0F      \u4E00\u822C        \u8F83\u5927          \u5927");
        lblXucfufucf.setFont(new Font("宋体", Font.PLAIN, 16));
        lblXucfufucf.setBounds(20, 130, 480, 19);
        panel.add(lblXucfufucf);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 211, 545, 210);
        this.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        panel_1.setBorder(BorderFactory.createTitledBorder(""));

        next = new JButton("\u4E0B\u4E00\u4E2A");
        next.setBounds(229, 183, 93, 23);
        panel_1.add(next);
        next.setFont(new Font("宋体", Font.PLAIN, 14));
        next.addActionListener(this);

        JLabel lblx_3 = new JLabel("\u6295\u8D44\u5229\u6DA6\u7387(X4)");
        lblx_3.setBounds(48, 150, 126, 21);
        panel_1.add(lblx_3);
        lblx_3.setFont(new Font("宋体", Font.PLAIN, 18));

        textField_3 = new JTextField();
        textField_3.setBounds(184, 151, 181, 22);
        panel_1.add(textField_3);
        textField_3.setFont(new Font("宋体", Font.PLAIN, 14));
        textField_3.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(184, 117, 181, 22);
        panel_1.add(textField_2);
        textField_2.setFont(new Font("宋体", Font.PLAIN, 14));
        textField_2.setColumns(10);

        JLabel lblx_2 = new JLabel("\u89C4\u6A21\u4E0E\u7814\u53D1\u96BE\u5EA6(X3)");
        lblx_2.setBounds(10, 116, 162, 21);
        panel_1.add(lblx_2);
        lblx_2.setFont(new Font("宋体", Font.PLAIN, 18));

        JLabel lblx_1 = new JLabel("\u529F\u80FD\u4E0E\u6027\u80FD(X2)");
        lblx_1.setBounds(48, 82, 126, 21);
        panel_1.add(lblx_1);
        lblx_1.setFont(new Font("宋体", Font.PLAIN, 18));

        textField_1 = new JTextField();
        textField_1.setBounds(184, 83, 181, 22);
        panel_1.add(textField_1);
        textField_1.setFont(new Font("宋体", Font.PLAIN, 14));
        textField_1.setColumns(10);

        textField = new JTextField();
        textField.setBounds(184, 49, 181, 22);
        panel_1.add(textField);
        textField.setFont(new Font("宋体", Font.PLAIN, 14));
        textField.setColumns(10);

        JLabel lblx = new JLabel("\u6210\u672C(X1)");
        lblx.setBounds(102, 47, 72, 21);
        panel_1.add(lblx);
        lblx.setFont(new Font("宋体", Font.PLAIN, 18));

        txta = new JTextField();
        txta.setBounds(216, 10, 106, 30);
        panel_1.add(txta);
        txta.setEditable(false);
        txta.setHorizontalAlignment(SwingConstants.CENTER);
        txta.setFont(new Font("宋体", Font.PLAIN, 20));
        txta.setText("\u65B9\u6848A1");
        txta.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("\u4F8B\u5982:35");
        lblNewLabel_4.setBounds(375, 53, 54, 15);
        panel_1.add(lblNewLabel_4);

        JLabel label_1 = new JLabel("\u4F8B\u5982:\u8F83\u5F3A");
        label_1.setBounds(375, 87, 54, 15);
        panel_1.add(label_1);

        JLabel label_2 = new JLabel("\u4F8B\u5982:\u4E00\u822C");
        label_2.setBounds(375, 121, 54, 15);
        panel_1.add(label_2);

        JLabel label_3 = new JLabel("\u4F8B\u5982:0.45");
        label_3.setBounds(375, 155, 54, 15);
        panel_1.add(label_3);

    }


    /**
     * 监听器：获取窗口中各个组件中填写的信息
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==next) {
            if(i<=num) {

                int money=Integer.valueOf(textField.getText());
                if(money<20) {
                    U[i-1][0]=5;
                }else if (money>=20&&money<30) {
                    U[i-1][0]=4;
                }else if (money>=30&&money<40) {
                    U[i-1][0]=3;
                }else if (money>=40&&money<50) {
                    U[i-1][0]=2;
                }else if (money>50) {
                    U[i-1][0]=1;
                }

                String str1=textField_1.getText();
                if(str1.equals("很强")) {
                    U[i-1][1]=5;
                }else if(str1.equals("强")) {
                    U[i-1][1]=4;
                }else if(str1.equals("较强")) {
                    U[i-1][1]=3;
                }else if(str1.equals("一般")) {
                    U[i-1][1]=2;
                }else if(str1.equals("弱")) {
                    U[i-1][1]=1;
                }

                String str2=textField_2.getText();
                if(str2.equals("小")) {
                    U[i-1][21]=5;
                }else if(str2.equals("较小")) {
                    U[i-1][21]=4;
                }else if(str2.equals("一般")) {
                    U[i-1][2]=3;
                }else if(str2.equals("较大")) {
                    U[i-1][2]=2;
                }else if(str2.equals("大")) {
                    U[i-1][2]=1;
                }
                double lr= Double.parseDouble(textField_3.getText());
//				double lr=(double)Integer.valueOf();
                if(lr<0.3) {
                    U[i-1][3]=1;
                }else if (lr>=0.3&&lr<0.4) {
                    U[i-1][3]=2;
                }else if (lr>=0.4&&lr<0.5) {
                    U[i-1][3]=3;
                }else if (lr>=0.5&&lr<0.7) {
                    U[i-1][3]=4;
                }else if (lr>0.7) {
                    U[i-1][3]=5;
                }
                txta.setText("方案A"+(i+1)+"");
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");


                if(i==num) {
                    for(int j=0;j<num;j++) {
                        for(int k=0;k<4;k++) {
                            System.out.print(U[j][k]+" ");
                            V[j]+=U[j][k]*W[k];
                        }

                        System.out.println(V[j]);
                    }

                    String str="选择方案1";
                    float max=V[0];
                    for(int l=1;l<V.length;l++){
                        if(V[l]>max) {
                            max=V[l];
                            str="选择方案"+(l+1)+"";
                        }
                    }
                    JOptionPane.showMessageDialog(Test2.this, str);
                }

                i++;

            }

        }
    }
}

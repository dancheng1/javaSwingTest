package com.dancheng.test.swing.test;

import com.borland.jbcl.layout.XYConstraints;
import com.borland.jbcl.layout.XYLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Rectangle;

/**
 * @author dancheng.zhang
 * @date 2021/1/19 12:48 PM
 */
public class XYLyoutTest extends JPanel {

    XYLayout xYLayout1 = new XYLayout();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JButton jButton1 = new JButton();
    JTextField jTextField1 = new JTextField();
    JPanel jPanel3 = new JPanel();
    JPanel jPanel4 = new JPanel();
    JPanel jPanel5 = new JPanel();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();

    public XYLyoutTest() {
        initForm();
    }

    private void initForm() {
        setLayout(xYLayout1);
        jButton1.setBounds(new Rectangle(42, 54, 100, 50));
        jButton1.setText("jButton1");
        jPanel1.setLayout(null);
        jPanel2.setLayout(null);
        jTextField1.setText("jTextField1");
        jTextField1.setBounds(new Rectangle(45, 86, 62, 20));
        jPanel3.setLayout(null);
        jPanel4.setLayout(null);
        jPanel5.setLayout(null);
        jButton2.setBounds(new Rectangle(42, 26, 71, 23));
        jButton2.setText("jButton2");
        jButton3.setBounds(new Rectangle(59, 36, 71, 23));
        jButton3.setText("jButton3");
        jButton4.setBounds(new Rectangle(63, 28, 71, 23));
        jButton4.setText("jButton4");
        add(jPanel1, new XYConstraints(5, 2, 153, 128));
        jPanel1.add(jButton1, null);
        add(jPanel2,  new XYConstraints(7, 141, 187, 147));
        jPanel2.add(jTextField1, null);
        add(jPanel3,  new XYConstraints(243, 22, 147, 72));
        jPanel3.add(jButton2, null);
        add(jPanel4,  new XYConstraints(238, 108, 159, 84));
        jPanel4.add(jButton3, null);
        add(jPanel5,  new XYConstraints(234, 203, 165, 87));
        jPanel5.add(jButton4, null);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("主界面");
        frame.setLayout(new BorderLayout());

        frame.add(new XYLyoutTest(), BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

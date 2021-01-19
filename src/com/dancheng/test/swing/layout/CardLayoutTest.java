package com.dancheng.test.swing.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.CardLayout;

/**
 * @author dancheng.zhang
 * @date 2021/1/17 9:54 PM
 * CardLayout()：构造一个新布局，默认间隔为 0。
 * CardLayout(int hgap, int vgap)：创建布局管理器，并指定组件间的水平间隔（hgap）和垂直间隔（vgap）。
 */
public class CardLayoutTest {

    public static void main(String[] args) {
        // 创建Frame窗口
        JFrame frame = new JFrame("Java第五个程序");
        // 面板1
        JPanel p1 = new JPanel();
        // 面板2
        JPanel p2 = new JPanel();
        // 卡片式布局的面板
        JPanel cards = new JPanel(new CardLayout());
        p1.add(new JButton("登录按钮"));
        p1.add(new JButton("注册按钮"));
        p1.add(new JButton("找回密码按钮"));
        p2.add(new JTextField("用户名文本框", 20));
        p2.add(new JTextField("密码文本框", 20));
        p2.add(new JTextField("验证码文本框", 20));
        // 向卡片式布局面板中添加面板1
        cards.add(p1, "card1");
        // 向卡片式布局面板中添加面板2
        cards.add(p2, "card2");
        CardLayout cl = (CardLayout) (cards.getLayout());
        // 调用show()方法显示面板2
        cl.show(cards, "card1");
        cl.show(cards, "card2");
        frame.add(cards);
        frame.setBounds(300, 200, 400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

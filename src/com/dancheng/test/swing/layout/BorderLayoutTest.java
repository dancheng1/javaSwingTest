package com.dancheng.test.swing.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * @author dancheng.zhang
 * @date 2021/1/17 9:35 PM
 * 边框布局管理器
 * BorderLayout()：创建一个 Border 布局，组件之间没有间隙。
 * BorderLayout(int hgap,int vgap)：创建一个 Border 布局，其中 hgap 表示组件之间的横向间隔；vgap 表示组件之间的纵向间隔，单位是像素。
 */
public class BorderLayoutTest {

    public static void main(String[] args) {
        // 创建Frame窗口
        JFrame frame = new JFrame("Java第三个GUI程序");
        frame.setSize(400, 200);
        // 为Frame窗口设置布局为BorderLayout
        frame.setLayout(new BorderLayout());
        JButton button1 = new JButton("上");
        JButton button2 = new JButton("左");
        JButton button3 = new JButton("中");
        JButton button4 = new JButton("右");
        JButton button5 = new JButton("下");
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.WEST);
        frame.add(button3, BorderLayout.CENTER);
        frame.add(button4, BorderLayout.EAST);
        frame.add(button5, BorderLayout.SOUTH);
        frame.setBounds(300, 200, 600, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

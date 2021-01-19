package com.dancheng.test.swing.layout;

import com.intellij.ui.JBColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

/**
 * @author dancheng.zhang
 * @date 2021/1/17 9:41 PM
 * 流式布局管理器
 * FlowLayout()：创建一个布局管理器，使用默认的居中对齐方式和默认 5 像素的水平和垂直间隔。
 * FlowLayout(int align)：创建一个布局管理器，使用默认 5 像素的水平和垂直间隔。其中，align 表示组件的对齐方式，对齐的值必须是 FlowLayoutLEFT、FlowLayout.RIGHT 和 FlowLayout.CENTER，指定组件在这一行的位置是居左对齐、居右对齐或居中对齐。
 * FlowLayout(int align, int hgap,int vgap)：创建一个布局管理器，其中 align 表示组件的对齐方式；hgap 表示组件之间的横向间隔；vgap 表示组件之间的纵向间隔，单位是像素。
 * 上述程序向 JPanel 面板中添加了 9 个按钮，并使用 HowLayout 布局管理器使 9 个按钮间的横向和纵向间隙都为 20 像素。此时这些按钮将在容器上按照从上到下、从左到右的顺序排列，如果一行剩余空间不足容纳组件将会换行显示
 */
public class FlowLayoutTest {

    public static void main(String[] args) {
        // 创建Frame窗口
        JFrame jFrame=new JFrame("Java第四个GUI程序");
        // 创建面板
        JPanel jPanel=new JPanel();
        // 创建按钮
        JButton btn1=new JButton("1");
        JButton btn2=new JButton("2");
        JButton btn3=new JButton("3");
        JButton btn4=new JButton("4");
        JButton btn5=new JButton("5");
        JButton btn6=new JButton("6");
        JButton btn7=new JButton("7");
        JButton btn8=new JButton("8");
        JButton btn9=new JButton("9");
        // 面板中添加按钮
        jPanel.add(btn1);
        jPanel.add(btn2);
        jPanel.add(btn3);
        jPanel.add(btn4);
        jPanel.add(btn5);
        jPanel.add(btn6);
        jPanel.add(btn7);
        jPanel.add(btn8);
        jPanel.add(btn9);
        // 向JPanel添加FlowLayout布局管理器，将组件间的横向和纵向间隙都设置为20像素
        jPanel.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
        // 设置背景色
        jPanel.setBackground(JBColor.GRAY);
        // 添加面板到容器
        jFrame.add(jPanel);
        // 设置容器的大小
        jFrame.setBounds(800,200,800,150);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

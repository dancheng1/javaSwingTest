package com.dancheng.test.swing.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 * @author dancheng.zhang
 * @date 2021/1/17 10:01 PM
 * GridLayout(int rows,int cols)：创建一个指定行（rows）和列（cols）的网格布局。布局中所有组件的大小一样，组件之间没有间隔。
 * GridLayout(int rows,int cols,int hgap,int vgap)：创建一个指定行（rows）和列（cols）的网格布局，并且可以指定组件之间横向（hgap）和纵向（vgap）的间隔，单位是像素。
 */
public class GridLayoutTest {

    public static void main(String[] args) {
        JFrame frame=new JFrame("GridLayou布局计算器");
        // 创建面板
        JPanel panel=new JPanel();
        // 指定面板的布局为GridLayout，4行4列，间隙为5
        panel.setLayout(new GridLayout(4,4,5,5));
        // 添加按钮
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("/"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("*"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("-"));
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));
        // 添加面板到容器
        frame.add(panel);
        frame.setBounds(300,200,200,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

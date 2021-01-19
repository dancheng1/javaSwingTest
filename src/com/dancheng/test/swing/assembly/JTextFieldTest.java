package com.dancheng.test.swing.assembly;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 8:47 AM
 * <p>
 * JTextField()：创建一个默认的文本框。
 * JTextField(String text)：创建一个指定初始化文本信息的文本框。
 * JTextField(int columns)：创建一个指定列数的文本框。
 * JTextField(String text,int columns)：创建一个既指定初始化文本信息，又指定列数的文本框。
 * <p>
 * Dimension getPreferredSize()	获得文本框的首选大小
 * void scrollRectToVisible(Rectangle r)	向左或向右滚动文本框中的内容
 * void setColumns(int columns)	设置文本框最多可显示内容的列数
 * void setFont(Font f)	设置文本框的字体
 * void setScrollOffset(int scrollOffset)	设置文本框的滚动偏移量（以像素为单位）
 * void setHorizontalAlignment(int alignment)	设置文本框内容的水平对齐方式
 */
public class JTextFieldTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java文本框组件示例");    //创建Frame窗口
        JPanel jp = new JPanel();    //创建面板


        JTextField txtfield1 = new JTextField();    //创建文本框
        txtfield1.setText("普通文本框");    //设置文本框的内容
        JTextField txtfield2 = new JTextField(20);
        txtfield2.setFont(new Font("楷体", Font.BOLD, 16));    //修改字体样式
        txtfield2.setText("指定长度和字体的文本框");
        JTextField txtfield3 = new JTextField(30);
        txtfield3.setText("居中对齐");
        txtfield3.setHorizontalAlignment(JTextField.CENTER);    //居中对齐


        jp.add(txtfield1);
        jp.add(txtfield2);
        jp.add(txtfield3);
        frame.add(jp);
        frame.setBounds(300, 200, 600, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

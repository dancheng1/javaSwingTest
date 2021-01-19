package com.dancheng.test.swing.assembly;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 8:50 AM
 * <p>
 * JTextArea()：创建一个默认的文本域。
 * JTextArea(int rows,int columns)：创建一个具有指定行数和列数的文本域。
 * JTextArea(String text)：创建一个包含指定文本的文本域。
 * JTextArea(String text,int rows,int columns)：创建一个既包含指定文本，又包含指定行数和列数的多行文本域。
 * <p>
 * void append(String str)	将字符串 str 添加到文本域的最后位置
 * void setColumns(int columns)	设置文本域的行数
 * void setRows(int rows)	设置文本域的列数
 * int getColumns()	获取文本域的行数
 * void setLineWrap(boolean wrap)	设置文本域的换行策略
 * int getRows()	获取文本域的列数
 * void insert(String str,int position)	插入指定的字符串到文本域的指定位置
 * void replaceRange(String str,int start,int end)	将指定的开始位 start 与结束位 end 之间的字符串用指定的字符串 str 取代
 */
public class JTextAreaTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java文本域组件示例");    //创建Frame窗口
        JPanel jp = new JPanel();    //创建一个JPanel对象


        JTextArea jta = new JTextArea("请输入内容", 7, 30);
        jta.setLineWrap(true);    //设置文本域中的文本为自动换行
        jta.setForeground(Color.BLACK);    //设置组件的背景色
        jta.setFont(new Font("楷体", Font.BOLD, 16));    //修改字体样式
        jta.setBackground(Color.YELLOW);    //设置按钮背景色


        JScrollPane jsp = new JScrollPane(jta);    //将文本域放入滚动窗口
        Dimension size = jta.getPreferredSize();    //获得文本域的首选大小
        jsp.setBounds(110, 90, size.width, size.height);


        jp.add(jsp);    //将JScrollPane添加到JPanel容器中
        frame.add(jp);    //将JPanel容器添加到JFrame容器中
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setSize(800, 200);    //设置JFrame容器的大小
        frame.setVisible(true);
    }

}

package com.dancheng.test.swing.assembly;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Font;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 8:59 AM
 * <p>
 * JRadioButton()：创建一个初始化为未选择的单选按钮，其文本未设定。
 * JRadioButton(Icon icon)：创建一个初始化为未选择的单选按钮，其具有指定的图像但无文本。
 * JRadioButton(Icon icon,boolean selected)：创建一个具有指定图像和选择状态的单选按钮，但无文本。
 * JRadioButton(String text)：创建一个具有指定文本但未选择的单选按钮。
 * JRadioButton(String text,boolean selected)：创建一个具有指定文本和选择状态的单选按钮。
 * JRadioButton(String text,Icon icon)：创建一个具有指定的文本和图像并初始化为未选择的单选按钮。
 * JRadioButton(String text,Icon icon,boolean selected)：创建一个具有指定的文本、图像和选择状态的单选按钮。
 */
public class JRadioButtonTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java单选组件示例");    //创建Frame窗口
        JPanel panel = new JPanel();    //创建面板
        JLabel label1 = new JLabel("现在是哪个季节：");
        JRadioButton rb1 = new JRadioButton("春天", true);    //创建JRadioButton对象
        JRadioButton rb2 = new JRadioButton("夏天");    //创建JRadioButton对象
        JRadioButton rb3 = new JRadioButton("秋天");    //创建JRadioButton对象
        JRadioButton rb4 = new JRadioButton("冬天");    //创建JRadioButton对象
        label1.setFont(new Font("楷体", Font.BOLD, 16));    //修改字体样式
        ButtonGroup group = new ButtonGroup();
        //添加JRadioButton到ButtonGroup中
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        group.add(rb4);


        panel.add(label1);
        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);
        panel.add(rb4);
        frame.add(panel);
        frame.setBounds(300, 200, 400, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

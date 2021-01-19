package com.dancheng.test.swing.assembly;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 8:56 AM
 * <p>
 * JCheckBox()：创建一个默认的复选框，在默认情况下既未指定文本，也未指定图像，并且未被选择。
 * JCheckBox(String text)：创建一个指定文本的复选框。
 * JCheckBox(String text,boolean selected)：创建一个指定文本和选择状态的复选框。
 */
public class JCheckBoxTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java复选组件示例");    //创建Frame窗口
        JPanel jp = new JPanel();    //创建面板
        JLabel label = new JLabel("流行编程语言有：");
        label.setFont(new Font("楷体", Font.BOLD, 16));    //修改字体样式
        JCheckBox chkbox1 = new JCheckBox("C#", true);    //创建指定文本和状态的复选框
        JCheckBox chkbox2 = new JCheckBox("C++");    //创建指定文本的复选框
        JCheckBox chkbox3 = new JCheckBox("Java");    //创建指定文本的复选框
        JCheckBox chkbox4 = new JCheckBox("Python");    //创建指定文本的复选框
        JCheckBox chkbox5 = new JCheckBox("PHP");    //创建指定文本的复选框
        JCheckBox chkbox6 = new JCheckBox("Perl");    //创建指定文本的复选框
        jp.add(label);
        jp.add(chkbox1);
        jp.add(chkbox2);
        jp.add(chkbox3);
        jp.add(chkbox4);
        jp.add(chkbox5);
        jp.add(chkbox6);
        frame.add(jp);
        frame.setBounds(300, 200, 400, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

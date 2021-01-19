package com.dancheng.test.swing.assembly;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 9:04 AM
 * JList()：构造一个空的只读模型的列表框。
 * JList(ListModel dataModel)：根据指定的非 null 模型对象构造一个显示元素的列表框。
 * JList(Object[] listData)：使用 listData 指定的元素构造—个列表框。
 * JList(Vector<?> listData)：使用 listData 指定的元素构造一个列表框。
 */
public class JListTest1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java列表框组件示例");
        JPanel jp = new JPanel();    //创建面板
        JLabel label1 = new JLabel("证件类型：");    //创建标签
        String[] items = new String[]{"身份证", "驾驶证", "军官证"};
        JList list = new JList(items);    //创建JList
        jp.add(label1);
        jp.add(list);

        frame.add(jp);
        frame.setBounds(300, 200, 400, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

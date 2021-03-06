package com.dancheng.test.swing.assembly;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 9:01 AM
 * <p>
 * JComboBox()：创建一个空的 JComboBox 对象。
 * JComboBox(ComboBoxModel aModel)：创建一个 JComboBox，其选项取自现有的 ComboBoxModel。
 * JComboBox(Object[] items)：创建包含指定数组中元素的 JComboBox。
 * <p>
 * void addItem(Object anObject)	将指定的对象作为选项添加到下拉列表框中
 * void insertItemAt(Object anObject,int index)	在下拉列表框中的指定索引处插入项
 * void removeltem(0bject anObject)	在下拉列表框中删除指定的对象项
 * void removeItemAt(int anlndex)	在下拉列表框中删除指定位置的对象项
 * void removeAllItems()	从下拉列表框中删除所有项
 * int getItemCount()	返回下拉列表框中的项数
 * Object getItemAt(int index)	获取指定索引的列表项，索引从 0 开始
 * int getSelectedIndex()	获取当前选择的索引
 * Object getSelectedltem()	获取当前选择的项
 */
public class JComboBoxTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java下拉列表组件示例");
        JPanel jp = new JPanel();    //创建面板
        JLabel label1 = new JLabel("证件类型：");    //创建标签
        JComboBox cmb = new JComboBox();    //创建JComboBox
        cmb.addItem("--请选择--");    //向下拉列表中添加一项
        cmb.addItem("身份证");
        cmb.addItem("驾驶证");
        cmb.addItem("军官证");
        jp.add(label1);
        jp.add(cmb);

        cmb.setSelectedIndex(1);

        frame.add(jp);
        frame.setBounds(300, 200, 400, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

package com.dancheng.test.swing.assembly;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 9:55 AM
 * <p>
 * add(Component component,int index)	在指定的选项卡索引位置添加一个 component，默认的选项卡
 * 标题为组件名称
 * addTab(String title, Component component)	添加一个使用 title 作为标题，且没有图标的组件
 * getComponentAt(int index)	返回 index 位置的组件
 * getSelectedComponent()	返回此选项卡窗格当前选择的组件
 * getSelectedIndex()	返回当前选择的此选项卡窗格的索引
 * getTabCount()	返回此 tabbedPane 的选项卡数
 * insertTab(String title,Icon icon,Component component,
 * String tip,int index)	在 index 位置插入一个组件，该组件通过 title 或 icon（任意一个
 * 都可以为 null）来表示
 * isEnabledAt(int index)	返回当前是否启用了 index 位置的选项卡
 * remove(int index)	移除对应于指定索引的选项卡和组件
 * setEnabledAt(int index,boolean enabled)	设置是否启用 index 位置的选项卡
 * setMnemonicAt(int tablndex,int mnemonic)	设置用于访问指定选项卡的键盘助记符
 * setTitleAt(int index,String title)	将 index 位置的标题设置为 title，它可以为 null
 * setToolTipTextAt(int index,String toolTipText)	将 index 位置的工具提示文本设置为 toolTipText，它可以为 null
 */
public class JTabbedPaneTest extends JPanel {

    public JTabbedPaneTest() {
        super(new GridLayout(1, 1));
        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = createImageIcon("tab.jp1g");
        JComponent panel1 = makeTextPanel("计算机名");
        tabbedPane.addTab("计算机名", icon, panel1, "Does nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        JComponent panel2 = makeTextPanel("硬件");
        tabbedPane.addTab("硬件", icon, panel2, "Does twice as much nothing");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        JComponent panel3 = makeTextPanel("高级");
        tabbedPane.addTab("高级", icon, panel3, "Still does nothing");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
        JComponent panel4 = makeTextPanel("系统保护");
        panel4.setPreferredSize(new Dimension(410, 50));
        tabbedPane.addTab("系统保护", icon, panel4, "Does nothing at all");
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
        add(tabbedPane);
    }

    private JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    private static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = JTabbedPaneTest.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("我的电脑 - 属性");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JTabbedPaneTest(), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

}

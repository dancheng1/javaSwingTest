package com.dancheng.test.swing.assembly;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 9:48 AM
 * <p>
 * add(Action a)	创建连接到指定 Action 对象的新菜单项，并将其追加到此菜单的末尾
 * add(Component c)	将某个组件追加到此菜单的末尾
 * add(Component c,int index)	将指定组件添加到此容器的给定位置
 * add(JMenuItem menultem)	将某个菜单项追加到此菜单的末尾
 * add(String s)	创建具有指定文本的新菜单项，并将其追加到此菜单的末尾
 * addSeparator()	将新分隔符追加到菜单的末尾
 * doCliclc(int pressTime)	以编程方式执行“单击”操作
 * getDelay()	返回子菜单向上或向下弹出前建议的延迟（以毫秒为单位）
 * getltem(int pos)	返回指定位置的 JMenuItem
 * getItemCount()	返回菜单上的项数，包括分隔符
 * getMenuComponent(int n)	返回位于位置 n 的组件
 * getMenuComponents()	返回菜单子组件的 Component 数组
 * getSubElements()	返回由 MenuElement 组成的数组，其中包含此菜单组件的子菜单
 * insert(JMenuItem mi,int pos)	在给定位置插入指定的 JMenuitem
 * insert(String s,pos)	在给定位置插入具有指定文本的新菜单项
 * insertSeparator(int index)	在指定的位置插入分隔符
 * isMenuComponent(Component c)	如果在子菜单层次结构中存在指定的组件，则返回 true
 * isPopupMenuVisible()	如果菜单的弹出窗口可见，则返回 rue
 * isSelected()	如果菜单是当前选择的（即高亮显示的）菜单，则返回 true
 * isTopLevelMenu()	如果菜单是“顶层菜单”（即菜单栏的直接子级），则返回 true
 * setDelay(int d)	设置菜单的 PopupMenu 向上或向下弹出前建议的延迟
 * setMenuLocation(int x,int y)	设置弹出组件的位置
 * setPopupMenuVisible(boolean b)	设置菜单弹出的可见性
 * setSelected(boolean b)	设置菜单的选择状态
 */
public class JMenuTest extends JMenuBar {

    public JMenuTest() {
        add(createFileMenu());    //添加“文件”菜单
        add(createEditMenu());    //添加“编辑”菜单
        setVisible(true);
    }

    public static void main(String[] agrs) {
        JFrame frame = new JFrame("菜单栏");
        frame.setSize(300, 200);
        frame.setJMenuBar(new JMenuTest());
        frame.setVisible(true);
    }

    //定义“文件”菜单
    private JMenu createFileMenu() {
        JMenu menu = new JMenu("文件(F)");
        menu.setMnemonic(KeyEvent.VK_F);    //设置快速访问符
        JMenuItem item = new JMenuItem("新建(N)", KeyEvent.VK_N);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        menu.add(item);
        item = new JMenuItem("打开(O)", KeyEvent.VK_O);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        menu.add(item);
        item = new JMenuItem("保存(S)", KeyEvent.VK_S);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("退出(E)", KeyEvent.VK_E);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        menu.add(item);
        return menu;
    }

    //定义“编辑”菜单
    private JMenu createEditMenu() {
        JMenu menu = new JMenu("编辑(E)");
        menu.setMnemonic(KeyEvent.VK_E);
        JMenuItem item = new JMenuItem("撤销(U)", KeyEvent.VK_U);
        item.setEnabled(false);
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("剪贴(T)", KeyEvent.VK_T);
        menu.add(item);
        item = new JMenuItem("复制(C)", KeyEvent.VK_C);
        menu.add(item);
        menu.addSeparator();
        JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem("自动换行");
        menu.add(cbMenuItem);
        return menu;
    }

}

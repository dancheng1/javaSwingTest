package com.dancheng.test.swing.assembly;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 9:51 AM
 * <p>
 * getInvoker()	返回作为此弹出菜单的“调用者”的组件
 * setInvoker(Component invoker)	设置弹出菜单的调用者，即弹出菜单在其中显示的组件
 * addPopupMenuListener(PopupMenuListener1)	添加 PopupMenu 监听器
 * removePopupMenuListener(PopupMenuListener1)	移除 PopupMenu 监听器
 * getPopupMenuListeners()	返回利用 addPopupMenuListener()添加到此 JMenuitem 的所有
 * PopupMenuListener 组成的数组
 * getLabel()	返回弹出菜单的标签
 * setLabel(String label)	设置弹出菜单的标签
 * show(Component invoker,int x,int y)	在调用者的坐标空间中的位置 X、Y 处显示弹出菜单
 * getComponentIndex(Component c)	返回指定组件的索引
 */
public class JPopuMenuTest extends JFrame {

    JMenu fileMenu;
    JPopupMenu jPopupMenuOne;
    JMenuItem openFile, closeFile, exit;
    JRadioButtonMenuItem copyFile, pasteFile;
    ButtonGroup buttonGroupOne;

    public JPopuMenuTest() {
        jPopupMenuOne = new JPopupMenu();    //创建jPopupMenuOne对象
        buttonGroupOne = new ButtonGroup();
        //创建文件菜单及子菜单，并将子菜单添加到文件菜单中
        fileMenu = new JMenu("文件");
        openFile = new JMenuItem("打开");
        closeFile = new JMenuItem("关闭");
        fileMenu.add(openFile);
        fileMenu.add(closeFile);
        //将fileMenu菜单添加到弹出式菜单中
        jPopupMenuOne.add(fileMenu);
        //添加分割符
        jPopupMenuOne.addSeparator();
        //创建单选菜单项，并添加到ButtonGroup对象中
        copyFile = new JRadioButtonMenuItem("复制");
        pasteFile = new JRadioButtonMenuItem("粘贴");
        buttonGroupOne.add(copyFile);
        buttonGroupOne.add(pasteFile);
        //将copyFile添加到jPopupMenuOne中
        jPopupMenuOne.add(copyFile);
        //将pasteFile添加到jPopupMenuOne中
        jPopupMenuOne.add(pasteFile);
        jPopupMenuOne.addSeparator();
        exit = new JMenuItem("退出");
        //将exit添加到jPopupMenuOne中
        jPopupMenuOne.add(exit);
        //创建监听器对象
        MouseListener popupListener = new PopupListener(jPopupMenuOne);
        //向主窗口注册监听器
        this.addMouseListener(popupListener);
        this.setTitle("弹出式菜单");
        this.setBounds(100, 100, 650, 450);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new JPopuMenuTest();
    }

    // 添加内部类，其扩展了MouseAdapter类，用来处理鼠标事件
    class PopupListener extends MouseAdapter {
        JPopupMenu popupMenu;

        PopupListener(JPopupMenu popupMenu) {
            this.popupMenu = popupMenu;
        }

        @Override
        public void mousePressed(MouseEvent e) {
            showPopupMenu(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            showPopupMenu(e);
        }

        private void showPopupMenu(MouseEvent e) {
            if (e.isPopupTrigger()) {
                //如果当前事件与鼠标事件相关，则弹出菜单
                popupMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        }
    }

}
package com.dancheng.test.swing.assembly;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 9:45 AM
 * <p>
 * addActionListener(ActionListener 1)	将一个动作监听器添加到 Timer
 * getDelay()	返回两次触发动作事件间延迟，以毫秒为单位
 * isCoalesce()	如果 Timer 组合多个挂起的动作事件，则返回 true
 * isRunning()	如果 Timer 正在运行，则返回 true
 * restart()	重新启动 Timer，取消所有挂起的触发并使它按初始延迟触发
 * setCoalesce(boolean flag)	设置 Timer 是否组合多个挂起的 ActionEvent
 * setDelay(int delay)	设置 Timer 的事件间延迟，两次连续的动作事件之间的毫秒数
 * setLogTimers(boolean flag)	启用/禁用计时器日志
 * setRepeats(boolean flag)	如果 flag 为 false，则指示 Timer 只向其监听器发送一次动作事件
 * start()	启动 Timer，使它开始向其监听器发送动作事件
 * stop()	停止 Timer，使它停止向其监听器发送动作事件
 */
public class JProgressBarTimerTest implements ActionListener, ChangeListener {

    JFrame frame = null;
    JProgressBar progressbar;
    JLabel label;
    Timer timer;
    JButton b;

    private JProgressBarTimerTest() {
        frame = new JFrame("软件安装");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        label = new JLabel(" ", JLabel.CENTER);    //创建显示进度信息的文本标签
        progressbar = new JProgressBar();    //创建一个进度条
        progressbar.setOrientation(JProgressBar.HORIZONTAL);
        progressbar.setMinimum(0);
        progressbar.setMaximum(100);
        progressbar.setValue(0);
        progressbar.setStringPainted(true);
        progressbar.addChangeListener(this);    //添加事件监听器
        //设置进度条的几何形状
        progressbar.setPreferredSize(new Dimension(300, 20));
        progressbar.setBorderPainted(true);
        progressbar.setBackground(Color.pink);
        //添加启动按钮
        JPanel panel = new JPanel();
        b = new JButton("安装");
        b.setForeground(Color.blue);
        //添加事件监听器
        b.addActionListener(this);
        panel.add(b);
        timer = new Timer(100, this);    //创建一个计时器，计时间隔为100毫秒
        //把组件添加到frame中
        contentPane.add(panel, BorderLayout.NORTH);
        contentPane.add(progressbar, BorderLayout.CENTER);
        contentPane.add(label, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] agrs) {
        new JProgressBarTimerTest();    //创建一个实例化对象
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            timer.start();
        }

        if (e.getSource() == timer) {
            int value = progressbar.getValue();
            if (value < 100) {
                progressbar.setValue(++value);
            } else {
                timer.stop();
                frame.dispose();
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int value = progressbar.getValue();
        if (e.getSource() == progressbar) {
            label.setText("目前已完成进度：" + Integer.toString(value) + " %");
            label.setForeground(Color.blue);
        }
    }
}

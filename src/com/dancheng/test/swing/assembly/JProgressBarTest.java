package com.dancheng.test.swing.assembly;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 9:38 AM
 * <p>
 * getMaximum()	返回进度条的最大值
 * getMinimum()	返回进度条的最小值
 * getPercentComplete()	返回进度条的完成百分比
 * getString()	返回当前进度的 String 表示形式
 * getValue()	返回进度条的当前 value
 * setBorderPainted(boolean b)	设置 borderPainted 属性，如果进度条应该绘制其边框，则此属性为 true
 * setIndeterminate(boolean
 * newValue)	设置进度条的 indeterminate 属性，该属性确定进度条处于确定模式中还
 * 是处于不确定模式中
 * setMaximum(int n)	将进度条的最大值设置为 n
 * setMinimum(int n)	将进度条的最小值设置为 n
 * setOrientation(int newOrientation)	将进度条的方向设置为 newOrientation
 * setString(String s)	设置进度字符串的值
 * setStringPainted(boolean b)	设置 stringPainted 属性的值，该属性确定进度条是否应该呈现进度字符串
 * setValue(int n)	将进度条的当前值设置为 n
 * updateUI()	将 UI 属性重置为当前外观对应的值
 */
public class JProgressBarTest extends JFrame {

    public JProgressBarTest() {
        setTitle("使用进度条");
        JLabel label = new JLabel("欢迎使用在线升级功能！");
        //创建一个进度条
        JProgressBar progressBar = new JProgressBar();
        JButton button = new JButton("完成");
        button.setEnabled(false);
        Container container = getContentPane();
        container.setLayout(new GridLayout(3, 1));
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel1.add(label);    //添加标签
        panel2.add(progressBar);    //添加进度条
        panel3.add(button);    //添加按钮
        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        progressBar.setStringPainted(true);
        //如果不需要进度上显示“升级进行中...”，可注释此行
        progressBar.setString("升级进行中...");
        //如果需要使用不确定模式，可使用此行
        progressBar.setIndeterminate(true);
        //开启一个线程处理进度
        new Progress(progressBar, button).start();
        //单机“完成”按钮结束程序
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JProgressBarTest frame = new JProgressBarTest();
        //frame.setBounds(300,200,300,150);    //设置容器的大小
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    private class Progress extends Thread {
        JProgressBar progressBar;
        JButton button;
        //进度条上的数字
        int[] progressValues = {6, 18, 27, 39, 51, 66, 81, 100};

        Progress(JProgressBar progressBar, JButton button) {
            this.progressBar = progressBar;
            this.button = button;
        }

        @Override
        public void run() {
            for (int i = 0; i < progressValues.length; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //设置进度条的值
                progressBar.setValue(progressValues[i]);
            }
            progressBar.setIndeterminate(false);
            progressBar.setString("升级完成！");
            button.setEnabled(true);
        }
    }

}

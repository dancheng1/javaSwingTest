package com.dancheng.test.swing.assembly;

import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.Container;

/**
 * @author dancheng.zhang
 * @date 2021/1/18 9:36 AM
 * JSlider()	创建一个范围在 0~100 且初始值为 50 的水平滑块
 * JSlider(BoundedRangeModel brm)	使用指定的 BoundedRangeModel 创建一个水平滑块
 * JSlider(int orientation)	使用指定的方向创建一个滑块，范围在 0~100 且初始值为 50
 * JSlider(int min,int max)	使用指定的最小值和最大值来创建一个水平滑块，初始值等于最小值加上最大值的平均值
 * JSlider(int min,int max,int value)	用指定的最小值、最大值和初始值创建一个水平滑块
 * <p>
 * createStandardLabels(int increment)	创建一个数字文本标签的 Hashtable，从滑块最小值处开始增加，并使用指定的增量
 * getLabelTable()	返回哪些标签在哪些刻度绘制的字典
 * getMaj orTickSpacing()	返回主刻度标记的间隔
 * getMaximum()	从 BoundedRangeModel 返回滑块所支持的最大值
 * getMinimum()	从 BoundedRangeModel 返回滑块所支持的最小值
 * getMinorTickSpacing()	返回次刻度标记的间隔
 * getSnapToTicks()	如果滑块（及其所表示的值）解析为最靠近用户放置滑块处的刻度标记的值，则返回为 true
 * getValue()	从 BoundedRangeModel 返回滑块的当前值
 * setLabelTable(Dictionary labels)	用于指定将在给定值处绘制哪个标签
 * setMaj orTickSpacing(int n)	此方法设置主刻度标记的间隔
 * setMaximum(int maximum)	将滑块的最大值设置为 maximum
 * setMinimum(int minimum)	将滑块的最小值设置为 minimum
 * setMinorTickSpacing(int n)	设置次刻度标记的间隔
 * setOrientation(int orientation)	将滑块的方向设置为 SwingConstants.VERTICAL 或 SwingConstants.HORIZONTAL
 * setPaintLabels(boolean b)	确定是否在滑块上绘制标签
 * setPaintTicks(boolean b)	确定是否在滑块上绘制刻度标记
 * setPaintTrack(boolean b)	确定是否在滑块上绘制滑道
 * setSnapToTicks(boolean b)	指定为 true，则滑块（及其所表示的值）解析为最靠近用户放置滑块处的刻度标记的值
 * setValue(int n)	将滑块的当前值设置为 n
 */
public class JSliderTest {

    public static void main(String[] args) {
        JFrame frame=new JFrame("滑块组件示例");
        frame.setSize(800,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane=frame.getContentPane();
        JSlider slider=new JSlider(0,100);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        contentPane.add(slider);

        slider.setPaintLabels(true);
        slider.setPaintTicks(true);

        frame.setVisible(true);
    }

}

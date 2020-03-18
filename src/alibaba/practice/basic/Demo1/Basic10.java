package alibaba.practice.basic.Demo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @program: Java workspace
 * @description: 10. 编写程序，在屏幕上显示带标题的窗口，并添加一个按钮。当用户单击按钮时，结束程 序。（窗体编程）
 * @author: Typhoon
 * @create: 2020-02-05 14:14
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic10 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("设置关闭按钮");
        jFrame.setBounds(400,300,700,400);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);

        JButton jButton = new JButton("点击关闭窗口");
        jButton.setPreferredSize(new Dimension(20,40));
        jButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        jFrame.add(jButton);
    }
}

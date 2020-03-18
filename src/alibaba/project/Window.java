package alibaba.project;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * @program: LInux_WorkSpace_Eclipse
 * @description: 设置聊天室的窗口界面
 * @author: Typhoon
 * @create: 2020-01-27 16:05
 **/
public class Window {
    private static void setFrame(){
        JFrame jFrame = new JFrame();
        /*
         *设置参数信息
         */
        jFrame.setBounds(0,0,1100,700);

        /*
         *设置属性信息
         */
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        jFrame.setUndecorated(true);
        jFrame.add(setPanel());
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        setFrame();
    }
    private static JPanel setPanel(){

        JPanel jPanel = new JPanel();
        jPanel.setBackground(new Color(8, 11, 74));
        jPanel.setBorder(new LineBorder(new Color(255, 48, 112)));

        JPanel jPanel1 = clonePanel(200,640);
        JPanel jPanel2 = clonePanel(600,640);


        jPanel.add(jPanel1);
        jPanel.add(jPanel2);
        return jPanel;
    }
    private static JPanel clonePanel(int width,int height){
        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(width,height));
        jPanel.setBackground(new Color(6, 3, 56));
        jPanel.setBorder(new LineBorder(new Color(255, 48, 112),5));
        return jPanel;
    }
}

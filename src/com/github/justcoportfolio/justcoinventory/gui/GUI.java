package com.github.justcoportfolio.justcoinventory.gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Justin
 */
public class GUI{
    
    private final JFrame frame;
    private JPanel rootPane;
    private final AddTab addTab;
    private final ViewEditTab editTab;
    
    public GUI(){
        this.addTab = new AddTab();
        this.editTab = new ViewEditTab();
        this.frame = new JFrame("JustCoInventory");
    }
    
    public void initialize(){
        this.initFrame();
    }
    
    private void initFrame(){
        this.rootPane = (JPanel)this.frame.getContentPane();
        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(640, 480);
        this.frame.setResizable(true);
        this.frame.setLocationRelativeTo(null);
        this.frame.setIconImage(new ImageIcon("res/img/tux.png").getImage());
    }
}

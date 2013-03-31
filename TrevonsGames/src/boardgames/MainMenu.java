/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgames;
import boardgames.pegSolitaire.*;
import boardgames.Gomoku.*;
import boardgames.BattleShip.*;
import boardgames.checkers.*;
import boardgames.Mancala.*;
import boardgames.connectfour.*;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Tom
 */
public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form Test_GUI
     */
    
    SolitaireGuiPanel pegGui;
    ClientPanel client;
    ServerPanel server;
    JFrame gameFrame;
    
    public MainMenu() {
        initComponents();
        
        pegGui = new SolitaireGuiPanel();
        
        
        gameFrame = new JFrame("GUI2");
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        ip_input_box = new javax.swing.JTextField();
        locally_radiob = new javax.swing.JRadioButton();
        online_radiob = new javax.swing.JRadioButton();

        jButton1.setText("Peg Solitaire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solitaireClicked(evt);
            }
        });

        jButton2.setText("Connect 4");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectFourClicked(evt);
            }
        });

        jButton3.setText("Checkers");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckersClicked(evt);
            }
        });

        jButton4.setText("Gomoku");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GomokuClicked(evt);
            }
        });

        jButton5.setText("Mancala");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MancalaClicked(evt);
            }
        });

        jButton6.setText("Battleship");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BattleshipClicked(evt);
            }
        });

        jButton7.setText("server");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverClicked(evt);
            }
        });

        jButton8.setText("client");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientClicked(evt);
            }
        });

        ip_input_box.setText("Server IP here");
        ip_input_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip_input_boxActionPerformed(evt);
            }
        });

        buttonGroup1.add(locally_radiob);
        locally_radiob.setSelected(true);
        locally_radiob.setText("Play Locally");

        buttonGroup1.add(online_radiob);
        online_radiob.setText("Play Online");
        online_radiob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                online_radiobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ip_input_box)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(locally_radiob)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 57, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(online_radiob)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ip_input_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locally_radiob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(online_radiob)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void solitaireClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solitaireClicked
        // TODO add your handling code here:
        
        /*SolitaireGui gui = new SolitaireGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel textLabel= new JLabel("Label56",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300,100));
        gui.getContentPane().add(textLabel,BorderLayout.CENTER);

        gui.setLocationRelativeTo(null);
        gui.pack();
        gui.setVisible(true);
        */
        
        gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JLabel textLabel= new JLabel("Label56",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300,100));
        gameFrame.getContentPane().add(textLabel,BorderLayout.CENTER);
        
        if(locally_radiob.isSelected())
        {
            gameFrame.add((pegGui));
        }
        else
        {
            //trigger another panel to ask if client or server and if client what the ip of the server is
        }
        
        gameFrame.setLocationRelativeTo(null);
        gameFrame.pack();
        gameFrame.setVisible(true);
        
        SolitaireGame g = new SolitaireGame();
        g.initGame();
        
    }//GEN-LAST:event_solitaireClicked

    private void ConnectFourClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectFourClicked
        // TODO add your handling code here:
        ConnectFourGame g = new ConnectFourGame();
        g.cfGameStart();
    }//GEN-LAST:event_ConnectFourClicked

    private void CheckersClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckersClicked
        // TODO add your handling code here:
        CheckersGame g = new CheckersGame();
        g.initCheckers();
    }//GEN-LAST:event_CheckersClicked

    private void GomokuClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GomokuClicked
        GomokuGUI g = new GomokuGUI();
        
        g.playGomoku(); //if statement "unclicks" gomoku when game is over
    }//GEN-LAST:event_GomokuClicked

    private void MancalaClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MancalaClicked
        MancalaGame g = new MancalaGame();
        
        g.initMancala();
    }//GEN-LAST:event_MancalaClicked

    private void BattleshipClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BattleshipClicked
        // TODO add your handling code here:
        BattleShipGUI b = new BattleShipGUI();
        b.playGame();
    }//GEN-LAST:event_BattleshipClicked

    private void clientClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientClicked
        // TODO add your handling code here:
        gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JLabel textLabel= new JLabel("Label56",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300,100));
        gameFrame.getContentPane().add(textLabel,BorderLayout.CENTER);
        
        String str = ip_input_box.getText();
        //declare arraylist
        //pull chars one at a time appending to a temp string until char == '.', then convert to int and add to array list
        ArrayList<Integer> ip = new ArrayList<>();
        String temp_s = "";
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) == '.')
            {
                ip.add(Integer.parseInt(temp_s));
                temp_s = "";
            }
            else
            {
                temp_s += str.charAt(i);
            }
        }
        ip.add(Integer.parseInt(temp_s));
        System.out.println(ip.toString());
        client = new ClientPanel(ip);
        gameFrame.add((client));
        
        gameFrame.setLocationRelativeTo(null);
        gameFrame.pack();
        gameFrame.setVisible(true);
        
        SolitaireGame g = new SolitaireGame();
        g.initGame();
        client.waitForMove();
    }//GEN-LAST:event_clientClicked

    private void serverClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverClicked
        // TODO add your handling code here:
        gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JLabel textLabel= new JLabel("Label56",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300,100));
        gameFrame.getContentPane().add(textLabel,BorderLayout.CENTER);
        
        server = new ServerPanel();
        gameFrame.add((server));
        
        gameFrame.setLocationRelativeTo(null);
        gameFrame.pack();
        gameFrame.setVisible(true);
        
        SolitaireGame g = new SolitaireGame();
        g.initGame();
    }//GEN-LAST:event_serverClicked

    private void ip_input_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip_input_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ip_input_boxActionPerformed

    private void online_radiobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_online_radiobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_online_radiobActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField ip_input_box;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JRadioButton locally_radiob;
    private javax.swing.JRadioButton online_radiob;
    // End of variables declaration//GEN-END:variables
}

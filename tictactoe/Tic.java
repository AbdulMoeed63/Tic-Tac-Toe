
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Tic extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    public Tic() {
        initComponents();
        jBtn1.setBackground(Color.BLACK);
        jBtn2.setBackground(Color.BLACK);
        jBtn3.setBackground(Color.BLACK);
        jBtn4.setBackground(Color.BLACK);
        jBtn5.setBackground(Color.BLACK);
        jBtn6.setBackground(Color.BLACK);
        jBtn7.setBackground(Color.BLACK);
        jBtn8.setBackground(Color.BLACK);
        jBtn9.setBackground(Color.BLACK);
//        JOptionPane.showMessageDialog(this, "Player X turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    }
    private void gameScore() {

        jblPlayerX.setText(String.valueOf(xCount));
        jblPlayerO.setText(String.valueOf(oCount));

    }

    private void choose_Player() {

        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }

    }

    private void winningGame() {

        String b1 = jBtn1.getText();
        String b2 = jBtn2.getText();
        String b3 = jBtn3.getText();
        String b4 = jBtn4.getText();
        String b5 = jBtn5.getText();
        String b6 = jBtn6.getText();
        String b7 = jBtn7.getText();
        String b8 = jBtn8.getText();
        String b9 = jBtn9.getText();

        //FOR PLAYER X
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {

            
            jBtn1.setBackground(Color.ORANGE);
            jBtn2.setBackground(Color.ORANGE);
            jBtn3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        }
        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {

            jBtn4.setBackground(Color.ORANGE);
            jBtn5.setBackground(Color.ORANGE);
            jBtn6.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        }
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {

            jBtn7.setBackground(Color.ORANGE);
            jBtn8.setBackground(Color.ORANGE);
            jBtn9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        }
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {

            jBtn1.setBackground(Color.GREEN);
            jBtn4.setBackground(Color.GREEN);
            jBtn7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        }
        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {

            jBtn2.setBackground(Color.GREEN);
            jBtn5.setBackground(Color.GREEN);
            jBtn8.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        }
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {

            jBtn3.setBackground(Color.GREEN);
            jBtn6.setBackground(Color.GREEN);
            jBtn9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        }
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {

            jBtn1.setBackground(Color.PINK);
            jBtn5.setBackground(Color.PINK);
            jBtn9.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        }
        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {

            jBtn3.setBackground(Color.PINK);
            jBtn5.setBackground(Color.PINK);
            jBtn7.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        }
        //FOR PLAYER O

        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {

            jBtn1.setBackground(Color.MAGENTA);
            jBtn2.setBackground(Color.MAGENTA);
            jBtn3.setBackground(Color.MAGENTA);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        }
        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {

            jBtn4.setBackground(Color.MAGENTA);
            jBtn5.setBackground(Color.MAGENTA);
            jBtn6.setBackground(Color.MAGENTA);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        }
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {

            jBtn7.setBackground(Color.MAGENTA);
            jBtn8.setBackground(Color.MAGENTA);
            jBtn9.setBackground(Color.MAGENTA);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        }
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {

            jBtn1.setBackground(Color.CYAN);
            jBtn4.setBackground(Color.CYAN);
            jBtn7.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        }
        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {

            jBtn2.setBackground(Color.CYAN);
            jBtn5.setBackground(Color.CYAN);
            jBtn8.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        }
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {

            jBtn3.setBackground(Color.CYAN);
            jBtn6.setBackground(Color.CYAN);
            jBtn9.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        }
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {

            jBtn1.setBackground(Color.YELLOW);
            jBtn5.setBackground(Color.YELLOW);
            jBtn9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        }
        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {

            jBtn3.setBackground(Color.YELLOW);
            jBtn5.setBackground(Color.YELLOW);
            jBtn7.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        }
        else if((b1 == "X" || b1 == "O") && (b2 == "X" || b2 == "O") && (b3 == "X" || b3 == "O") && (b4 == "X" || b4 =="O") && (b5 == "X" || b5 == "O") && (b6 == "X" || b6 =="O") && (b7 == "X" || b7 == "O") && (b8 == "X" || b8 == "O") && (b9 == "X" || b9 =="O")){
        
            JOptionPane.showMessageDialog(this, "Game is drawn","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            gameScore();
        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jBtn3 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jblPlayerO = new javax.swing.JLabel();
        jblPlayerX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jBtn3.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtn3.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtn3.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 210, 200));

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jBtn2.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtn2.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtn2.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 210, 200));

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jBtn1.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtn1.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtn1.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 200));

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtn8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jBtn8.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtn8.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtn8.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 210, 200));

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtn4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jBtn4.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtn4.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtn4.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 210, 200));

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtn7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jBtn7.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtn7.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtn7.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 210, 200));

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtn5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jBtn5.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtn5.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtn5.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 210, 200));

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtn9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jBtn9.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtn9.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtn9.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 210, 200));

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jBtn6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));
        jBtn6.setMaximumSize(new java.awt.Dimension(200, 158));
        jBtn6.setMinimumSize(new java.awt.Dimension(200, 158));
        jBtn6.setPreferredSize(new java.awt.Dimension(200, 158));
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 210, 200));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 670, 640));

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel2.setText("Player O :");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 90));

        jblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jblPlayerO.setForeground(new java.awt.Color(0, 255, 0));
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("0");
        jblPlayerO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 190, 90));

        jblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jblPlayerX.setForeground(new java.awt.Color(0, 255, 0));
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerX.setText("0");
        jPanel5.add(jblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 190, 90));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel4.setText("Player X :");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 90));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 250));

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.setText("Exit");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 5, true));
        jButton4.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton4.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 230, 140));

        jButton12.setBackground(new java.awt.Color(51, 153, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        jButton12.setText("New Game");
        jButton12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));
        jButton12.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton12.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton12.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 530, 160));

        jButton13.setBackground(new java.awt.Color(51, 153, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        jButton13.setText("Reset");
        jButton13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));
        jButton13.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton13.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton13.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 290, 140));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 550, 360));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 570, 640));

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 66)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Tic Tac Toe Game");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 630, 90));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1250, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1400, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
       jBtn1.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X")){
       
       checker = false;
       jBtn1.setForeground(Color.RED);
       }
       else{
           checker = true;
           jBtn1.setForeground(Color.BLUE);
       }
       choose_Player();
       winningGame();
       
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
         jBtn2.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X")){
       
       checker = false;
       jBtn2.setForeground(Color.RED);
       }
       else{
           checker = true;
           jBtn2.setForeground(Color.BLUE);
       }
       choose_Player();
       winningGame();
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
         jBtn5.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X")){
       
       checker = false;
       jBtn5.setForeground(Color.RED);
       }
       else{
           checker = true;
           jBtn5.setForeground(Color.BLUE);
       }
       choose_Player();
       winningGame();
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        jBtn1.setEnabled(true);
        jBtn2.setEnabled(true);
        jBtn3.setEnabled(true);
        jBtn4.setEnabled(true);
        jBtn5.setEnabled(true);
        jBtn6.setEnabled(true);
        jBtn7.setEnabled(true);
        jBtn8.setEnabled(true);
        jBtn9.setEnabled(true);
        
        jblPlayerX.setText(jblPlayerX.getText());
        jblPlayerO.setText(jblPlayerO.getText());
        
        jBtn1.setText("");
        jBtn2.setText("");
        jBtn3.setText("");
        jBtn4.setText("");
        jBtn5.setText("");
        jBtn6.setText("");
        jBtn7.setText("");
        jBtn8.setText("");
        jBtn9.setText("");
        
        jBtn1.setBackground(Color.BLACK);
        jBtn2.setBackground(Color.BLACK);
        jBtn3.setBackground(Color.BLACK);
        jBtn4.setBackground(Color.BLACK);
        jBtn5.setBackground(Color.BLACK);
        jBtn6.setBackground(Color.BLACK);
        jBtn7.setBackground(Color.BLACK);
        jBtn8.setBackground(Color.BLACK);
        jBtn9.setBackground(Color.BLACK);
        
        if(startGame == "X"){
        
        JOptionPane.showMessageDialog(this, "Player X turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        
        JOptionPane.showMessageDialog(this, "Player O turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
         jBtn6.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X")){
       
       checker = false;
       jBtn6.setForeground(Color.RED);
       }
       else{
           checker = true;
           jBtn6.setForeground(Color.BLUE);
       }
       choose_Player();
       winningGame();
    }//GEN-LAST:event_jBtn6ActionPerformed
private JFrame frame;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        frame = new JFrame();
        if(JOptionPane.showConfirmDialog(frame, " You want to exit the game? ","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        
        System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    //cler the board
    jBtn1.setText("");
    jBtn2.setText("");
    jBtn3.setText("");
    jBtn4.setText("");
    jBtn5.setText("");
    jBtn6.setText("");
    jBtn7.setText("");
    jBtn8.setText("");
    jBtn9.setText("");
    //clearing the scores
    jblPlayerX.setText("0");
    jblPlayerO.setText("0");
    
    jBtn1.setBackground(Color.BLACK);
    jBtn2.setBackground(Color.BLACK);
    jBtn3.setBackground(Color.BLACK);
    jBtn4.setBackground(Color.BLACK);
    jBtn5.setBackground(Color.BLACK);
    jBtn6.setBackground(Color.BLACK);
    jBtn7.setBackground(Color.BLACK);
    jBtn8.setBackground(Color.BLACK);
    jBtn9.setBackground(Color.BLACK);
    
    if(startGame == "X"){
        
        JOptionPane.showMessageDialog(this, "Player X turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        
        JOptionPane.showMessageDialog(this, "Player O turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
    
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
         jBtn3.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X")){
       
       checker = false;
       jBtn3.setForeground(Color.RED);
       }
       else{
           checker = true;
           jBtn3.setForeground(Color.BLUE);
       }
       choose_Player();
       winningGame();
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
         jBtn4.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X")){
       
       checker = false;
       jBtn4.setForeground(Color.RED);
       }
       else{
           checker = true;
           jBtn4.setForeground(Color.BLUE);
       }
       choose_Player();
       winningGame();
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
         jBtn7.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X")){
       
       checker = false;
       jBtn7.setForeground(Color.RED);
       }
       else{
           checker = true;
           jBtn7.setForeground(Color.BLUE);
       }
       choose_Player();
       winningGame();
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
         jBtn8.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X")){
       
       checker = false;
       jBtn8.setForeground(Color.RED);
       }
       else{
           checker = true;
           jBtn8.setForeground(Color.BLUE);
       }
       choose_Player();
       winningGame();
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
         jBtn9.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X")){
       
       checker = false;
       jBtn9.setForeground(Color.RED);
       }
       else{
           checker = true;
           jBtn9.setForeground(Color.BLUE);
       }
       choose_Player();
       winningGame();
    }//GEN-LAST:event_jBtn9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    // End of variables declaration//GEN-END:variables
}

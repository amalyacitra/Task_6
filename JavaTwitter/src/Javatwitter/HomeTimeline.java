/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javatwitter;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author amalyacitra
 */
public class HomeTimeline extends javax.swing.JFrame implements View {

    /**
     * Creates new form HomeTimeline
     */
    public HomeTimeline() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaTimeline = new javax.swing.JTextArea();
        btnCompose = new javax.swing.JButton();
        btnFollow = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txAreaTimeline.setEditable(false);
        txAreaTimeline.setColumns(20);
        txAreaTimeline.setRows(5);
        jScrollPane1.setViewportView(txAreaTimeline);

        btnCompose.setText("Compose");

        btnFollow.setText("Follow User");

        btnRefresh.setText("Refresh");

        btnExit.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCompose)
                        .addGap(31, 31, 31)
                        .addComponent(btnFollow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnRefresh)
                        .addGap(28, 28, 28)
                        .addComponent(btnExit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompose)
                    .addComponent(btnFollow)
                    .addComponent(btnRefresh)
                    .addComponent(btnExit))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * @param args the command line arguments
     */
    
    public Object getBtnCompose() {
        return btnCompose;
    }

    public Object getBtnExit() {
        return btnExit;
    }

    public Object getBtnFollow() {
        return btnFollow;
    }

    public Object getBtnRefresh() {
        return btnRefresh;
    }

    public void setTimeline(String s) {
        this.txAreaTimeline.setText(s);
    }

    public void addListener(ActionListener e){
        btnCompose.addActionListener(e);
        btnExit.addActionListener(e);
        btnFollow.addActionListener(e);
        btnRefresh.addActionListener(e);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompose;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFollow;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txAreaTimeline;
    // End of variables declaration//GEN-END:variables
}

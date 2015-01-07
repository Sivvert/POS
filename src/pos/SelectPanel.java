/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import pos.products.CategoryList;

/**
 *
 * @author ahmet.kazan
 */
public class SelectPanel extends javax.swing.JPanel {
    private final MainWindow mainWindow;

    /**
     * Creates new form SelectPanel
     */
    public SelectPanel(MainWindow mainWindow) {
          this.mainWindow = mainWindow;
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

        Cat = new javax.swing.JButton();
        Prod = new javax.swing.JButton();
        Klan = new javax.swing.JButton();

        Cat.setText("Categorieen");
        Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatActionPerformed(evt);
            }
        });

        Prod.setText("Product Toevoegen");
        Prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdActionPerformed(evt);
            }
        });

        Klan.setText("Klant Toevoegen");
        Klan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Cat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Klan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(491, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Cat)
                .addGap(103, 103, 103)
                .addComponent(Prod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(Klan)
                .addGap(123, 123, 123))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatActionPerformed
   mainWindow.showPanel(new CategoryList(mainWindow));  // TODO add your handling code here:
    }//GEN-LAST:event_CatActionPerformed

    private void ProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdActionPerformed
        mainWindow.showPanel(new NewProduct(mainWindow));
    }//GEN-LAST:event_ProdActionPerformed

    private void KlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KlanActionPerformed
         mainWindow.showPanel(new NewCustomer(mainWindow));
    }//GEN-LAST:event_KlanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cat;
    private javax.swing.JButton Klan;
    private javax.swing.JButton Prod;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos.orders;

import pos.products.Product;

/**
 *
 * @author Jordy, Tako, Ahmet, Duraid en Eric
 */
public class OrderLine extends javax.swing.JPanel {
private final Product product;
private final int amount;
    /**
     * Creates new form OrderLine
     * @param product
     * @param amount
     */
    public OrderLine(Product product, int amount) {
        this.product = product;
        this.amount = amount;
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

        productAmount = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();

        productAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productAmount.setText(Integer.toString(this.amount));

        productName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productName.setText(product.getName());

        totalPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalPrice.setText(java.text.NumberFormat.getCurrencyInstance(java.util.Locale.GERMANY).format(amount * product.getPrice() / 100.0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(totalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel productAmount;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}

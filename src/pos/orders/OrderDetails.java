/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos.orders;

import java.text.NumberFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import pos.MainWindow;
import pos.products.Product;

/**
 *
 * @author Ahmet, Jordy, Duraid, Eric en Tako
 */
public class OrderDetails extends javax.swing.JPanel {
    private final MainWindow mainWindow;
    private final Date orderDate;
    /**
     * Creates new form OrderDetails
     
     */
    public OrderDetails(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.orderDate = new Date();
        initComponents();
        addProducts();
    }
    private void addProducts() {
    NumberFormat nf = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.GERMANY);
    final Basket basket = mainWindow.getBasket();
    DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
    for (Product product : basket.getProducts()) {
        int productAmount = basket.getProductAmount(product);
        Object[] row = new Object[]{
            productAmount,
            product.getName(),
            nf.format(product.getPrice() / 100.0),
            nf.format(productAmount * product.getPrice() / 100.0)};
        model.addRow(row);
    }
}

    //public OrderDetails(MainWindow mainWindow) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        adres = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        postcodeLabel = new javax.swing.JLabel();
        woonplaatsLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        priceLabel = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        orderButton = new javax.swing.JButton();
        postCode = new javax.swing.JTextField();
        woonPlaats = new javax.swing.JTextField();

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dateLabel.setText("Datum:");

        locationLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        locationLabel.setText("Adres:");

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nameLabel.setText("Naam:");

        name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        adres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        date.setText(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM, java.util.Locale.GERMAN).format(orderDate));

        postcodeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        postcodeLabel.setText("Post Code:");

        woonplaatsLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        woonplaatsLabel.setText("Woonplaats:");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Amount", "Product", "Price", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPane.setViewportView(orderTable);

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        priceLabel.setText("Total:");

        price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        price.setText(java.text.NumberFormat.getCurrencyInstance(java.util.Locale.GERMANY).format(mainWindow.getBasket().getTotalCosts() / 100.0));

        orderButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        orderButton.setText("Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        postCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        woonPlaats.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(517, 517, 517))
                    .addComponent(scrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(locationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(postcodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(woonplaatsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(312, 312, 312))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(woonPlaats, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(postCode, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adres, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel)
                    .addComponent(adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postcodeLabel)
                    .addComponent(postCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(woonplaatsLabel)
                    .addComponent(woonPlaats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(priceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateLabel, locationLabel, nameLabel, postcodeLabel, woonplaatsLabel});

    }// </editor-fold>//GEN-END:initComponents

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        mainWindow.getBasket().empty();
        mainWindow.showPanel(new OrderSend());
    }//GEN-LAST:event_orderButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adres;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton orderButton;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField postCode;
    private javax.swing.JLabel postcodeLabel;
    private javax.swing.JLabel price;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField woonPlaats;
    private javax.swing.JLabel woonplaatsLabel;
    // End of variables declaration//GEN-END:variables
}

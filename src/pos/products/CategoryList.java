/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos.products;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.Box;
import pos.MainWindow;

/**
 *
 * @author Tako, Ahmet, Eric, Jordy en Duraid 
 */
public class CategoryList extends javax.swing.JPanel {
    private final MainWindow mainWindow;
    /**
     * Creates new form CategoryList
     */
   
    /**
     * Creates new form CategoryList
     * @param mainWindow
     */
    public CategoryList(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        initComponents();
         addCategories();
    }

    public CategoryList() {
        throw new UnsupportedOperationException("deze functie is iets mee"); //To change body of generated methods, choose Tools | Templates.
    }
    
private void addCategories() {
    List<Category> cats = Category.findAll();
    for (final Category category : cats) {
        CategoryItem categoryItem = new CategoryItem(category);
        categoryItem.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            mainWindow.showPanel(new ProductList(mainWindow,category));
        }
    });
        categories.add(categoryItem);
    }
    categories.add(Box.createVerticalGlue());
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basket = new pos.orders.BasketPanel(mainWindow);
        categoriesScrollpane = new javax.swing.JScrollPane();
        categories = new javax.swing.JPanel();

        categoriesScrollpane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        categories.setLayout(new javax.swing.BoxLayout(categories, javax.swing.BoxLayout.Y_AXIS));
        categoriesScrollpane.setViewportView(categories);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(categoriesScrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(basket, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoriesScrollpane)
                    .addComponent(basket, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pos.orders.BasketPanel basket;
    private javax.swing.JPanel categories;
    private javax.swing.JScrollPane categoriesScrollpane;
    // End of variables declaration//GEN-END:variables
}

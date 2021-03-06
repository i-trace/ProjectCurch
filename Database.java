
package mesh.digitex.com;
/*
  @author @i-trace.mesh#
 */
public class DatabaseForm extends javax.swing.JFrame {

    /**
     * Creates new form DatabaseForm
     */
    public DatabaseForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Close = new javax.swing.JLabel();
        Collapse = new javax.swing.JLabel();
        BGDB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 5, 20, 15));

        Collapse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Collapse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CollapseMouseClicked(evt);
            }
        });
        getContentPane().add(Collapse, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 5, 20, 15));

        BGDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesh/digitex/com/databaseForm.png"))); // NOI18N
        getContentPane().add(BGDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void CollapseMouseClicked(java.awt.event.MouseEvent evt) {                                      
        this.setState(DatabaseForm.ICONIFIED);
    }                                     

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {                                   
        MainWin s= new MainWin();
           s.setVisible(true);
           this.dispose();
    }                                  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatabaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DatabaseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel BGDB;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Collapse;
    // End of variables declaration                   
}

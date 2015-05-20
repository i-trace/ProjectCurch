
package mesh.digitex.com;
import AppPackage.AnimationClass;
import java.util.*;
import javax.swing.*;
/*
  @author @i-trace.mesh#
 */
public class MainWin extends javax.swing.JFrame {
    boolean open_close ;
    int timeRun = 0;
    AnimationClass BB = new AnimationClass();
    @SuppressWarnings("CallToThreadStartDuringObjectConstruction")
    public MainWin() {
        initComponents();
        Login.setVisible(false);
        Password.setVisible(false);
        UserName.setVisible(false);
        //slide show
        Slideshow();
        // display time
        new Thread()
                {
                    @Override
                    public void run()
        {
            while(timeRun==0)
        {
            Calendar cal = new GregorianCalendar();
            int hour = cal.get(Calendar.HOUR);
            int min = cal.get(Calendar.MINUTE);
            int sec = cal.get(Calendar.SECOND);
            int AM_PM = cal.get(Calendar.AM_PM);
            @SuppressWarnings("UnusedAssignment")
            String day_night = "";
            if(AM_PM == 1)
        {
            day_night = "PM";
        }
            else
        {
            day_night = "AM";
        }
            String time = hour+":"+min+":"+sec+":"+day_night;
            Clock.setText(time);
        }
        }
                }.start();
    }

    // do not modify this code 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        close = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        Districts = new javax.swing.JLabel();
        Database = new javax.swing.JLabel();
        Clock = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        SlideShow1 = new javax.swing.JLabel();
        SlideShow2 = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        DatabaseLoginR = new javax.swing.JLabel();
        DatabaseLoginL = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        getContentPane().setLayout(null);

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(870, 4, 20, 20);

        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        getContentPane().add(min);
        min.setBounds(829, 4, 20, 20);

        Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesh/digitex/com/register_H.png"))); // NOI18N
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });
        Register.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RegisterMouseMoved(evt);
            }
        });
        getContentPane().add(Register);
        Register.setBounds(15, 338, 210, 82);

        Districts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesh/digitex/com/district_H.png"))); // NOI18N
        Districts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DistrictsMouseClicked(evt);
            }
        });
        Districts.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DistrictsMouseMoved(evt);
            }
        });
        getContentPane().add(Districts);
        Districts.setBounds(345, 338, 210, 82);

        Database.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesh/digitex/com/Database_H.png"))); // NOI18N
        Database.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatabaseMouseClicked(evt);
            }
        });
        Database.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DatabaseMouseMoved(evt);
            }
        });
        getContentPane().add(Database);
        Database.setBounds(672, 338, 210, 82);

        Clock.setForeground(new java.awt.Color(0, 0, 0));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Clock);
        Clock.setBounds(360, 60, 170, 30);

        UserName.setForeground(new java.awt.Color(0, 255, 0));
        UserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserName.setBorder(null);
        UserName.setOpaque(false);
        getContentPane().add(UserName);
        UserName.setBounds(185, 201, 240, 18);

        Password.setForeground(new java.awt.Color(0, 255, 0));
        Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password.setBorder(null);
        Password.setOpaque(false);
        getContentPane().add(Password);
        Password.setBounds(463, 236, 242, 18);

        SlideShow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesh/digitex/com/Slides3.png"))); // NOI18N
        getContentPane().add(SlideShow1);
        SlideShow1.setBounds(0, 120, 900, 200);

        SlideShow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesh/digitex/com/Slides2.png"))); // NOI18N
        SlideShow2.setText("jLabel1");
        getContentPane().add(SlideShow2);
        SlideShow2.setBounds(900, 120, 900, 200);

        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(658, 289, 67, 18);

        DatabaseLoginR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesh/digitex/com/DBloginR.png"))); // NOI18N
        getContentPane().add(DatabaseLoginR);
        DatabaseLoginR.setBounds(-300, 120, 300, 200);

        DatabaseLoginL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesh/digitex/com/DBloginL.png"))); // NOI18N
        getContentPane().add(DatabaseLoginL);
        DatabaseLoginL.setBounds(900, 120, 300, 200);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesh/digitex/com/church-Recovered.png"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 900, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
//close the app
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {                                   
        System.exit(0);
    }                                  
// minimise the app
    private void minMouseClicked(java.awt.event.MouseEvent evt) {                                 
       this.setState(MainWin.ICONIFIED);
    }                                
// move the mouse over the register button
    private void RegisterMouseMoved(java.awt.event.MouseEvent evt) {                                    
       if(open_close == false)
        {
        ImageIcon II = new ImageIcon(getClass().getResource("register.png"));
        Register.setIcon(II);
        open_close = true;
        }
        else if(open_close == true)
        {
        ImageIcon B = new ImageIcon(getClass().getResource("register_H.png"));   
        Register.setIcon(B);
        open_close = false; 
        }
    }                                   
// mouseclick the the register button
    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {                                      
       Registration S = new Registration();
       S.setVisible(true);
       this.dispose();
    }                                     
// move the mouse over the districts button
    private void DistrictsMouseMoved(java.awt.event.MouseEvent evt) {                                     
        if(open_close == false)
        {
        ImageIcon II = new ImageIcon(getClass().getResource("District.png"));
        Districts.setIcon(II);
        open_close = true;
        }
        else if(open_close == true)
        {
        ImageIcon B = new ImageIcon(getClass().getResource("District_H.png"));   
        Districts.setIcon(B);
        open_close = false; 
        }
    }                                    
// click the districts button 
    private void DistrictsMouseClicked(java.awt.event.MouseEvent evt) {                                       
        Districts S = new Districts();
        S.setVisible(true);
        this.dispose();
    }                                      
// move the mouse the mouse over the database button
    private void DatabaseMouseMoved(java.awt.event.MouseEvent evt) {                                    
        if(open_close == false)
        {
        ImageIcon II = new ImageIcon(getClass().getResource("Database.png"));
        Database.setIcon(II);
        open_close = true;
        }
        else if(open_close == true)
        {
        ImageIcon B = new ImageIcon(getClass().getResource("Database_H.png"));   
        Database.setIcon(B);
        open_close = false; 
        }
    }                                   
// click the database button
    private void DatabaseMouseClicked(java.awt.event.MouseEvent evt) {                                      
        
        AnimationClass AC = new AnimationClass();
        AC.jLabelXRight(-300, 150, 5, 2, DatabaseLoginR);
        AC.jLabelXLeft(150, -300, 2, 2, DatabaseLoginR);
        AC.jLabelXRight(450, 900, 2, 2, DatabaseLoginL);
        AC.jLabelXLeft(900, 450, 5, 2, DatabaseLoginL);
        Login.setVisible(true);
        Password.setVisible(true);
        UserName.setVisible(true);
        SlideShow1.setVisible(false);
        SlideShow2.setVisible(false);
    }                                     
//click the login button 
    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {                                   
        Login.setVisible(false);
        Password.setVisible(false);
        UserName.setVisible(false);
        DatabaseForm A = new DatabaseForm();
        A.setVisible(true);
        this.dispose();
    }                                  
    public final void Slideshow()
        {
            new Thread()
            {
                int count;
                @Override
                @SuppressWarnings("SleepWhileInLoop")
                public void run()
                {
                    try
                    {
                        while(true)
                        {
                            switch(count)
                            {
                                case 0:
                                  
                                   Thread.sleep(1500);
                                   BB.jLabelXLeft(0, -900, 20, 9, SlideShow1);
                                   BB.jLabelXLeft(900, 0, 20, 9, SlideShow2);
                                   count = 1;
                                    break;
                                case 1:
                                
                                   Thread.sleep(1500);
                                   BB.jLabelXRight(-900, 0, 20, 9, SlideShow1);
                                   BB.jLabelXRight(0, 900, 20, 9, SlideShow2);
                                   count = 2;
                                    break; 
                                case 2:
                                 
                                   Thread.sleep(1500);
                                   BB.jLabelXLeft(0, -900, 20, 9, SlideShow1);
                                   BB.jLabelXLeft(900, 0, 20, 9, SlideShow2);
                                   count = 3;
                                    break;
                                case 3:
                                   Thread.sleep(1500);
                                   BB.jLabelXRight(-900, 0, 20, 9, SlideShow1);
                                   BB.jLabelXRight(0, 900, 20, 9, SlideShow2);
                                   count = 4;
                                    break; 
                                case 4:
                                    
                                   Thread.sleep(1500);
                                   BB.jLabelXLeft(0, -900, 20, 9, SlideShow1);
                                   BB.jLabelXLeft(900, 0, 20, 9, SlideShow2);
                                   count = 0;
                                    break;    
                            }
                        }
                    }
                    catch(Exception e)
                            {
                                
                            }
                }
            }.start();
        }
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Clock;
    private javax.swing.JLabel Database;
    private javax.swing.JLabel DatabaseLoginL;
    private javax.swing.JLabel DatabaseLoginR;
    private javax.swing.JLabel Districts;
    private javax.swing.JLabel Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel SlideShow1;
    private javax.swing.JLabel SlideShow2;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel close;
    private javax.swing.JLabel min;
    // End of variables declaration                   
}

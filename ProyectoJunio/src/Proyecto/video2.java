package Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


public class video2 extends javax.swing.JFrame implements ActionListener{
   
	/**
	 * @param JButton boton
	 * @param MediaPlayer oracleVid
	 * @param JFXPanel jfxPanel
	 */
	JButton boton= new JButton();
    MediaPlayer oracleVid2;
	JFXPanel jfxPanel;


	/**
	 * @see video2()
	 */
	
    public video2() {
        initComponents();
    }

    /**
     * @see initComponents()                 
     */    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        System.out.println("entra?");
        boton.addActionListener(this);
        boton.setActionCommand("Parar");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(672, 517));
        jPanel1.setPreferredSize(new java.awt.Dimension(672, 517));
        jPanel1.setBackground(Color.black);
        setResizable(false);
        jButton1.setFont(new java.awt.Font("Tele-Marines", 0, 48)); // NOI18N
        jButton1.setText("Play");
        jButton1.addActionListener(this) ;
        jButton1.setActionCommand("play2");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        System.out.println("parece que si?");
        pack();
    }                       

                                      

  
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new video().setVisible(true);
            }
        });
    }

    // Variables declaracion                  
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // Fin variables declaracion                   
	@Override
	
	
	/**
	 * @see actionPerformed(ActionEvent e)
	 */
	
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
    	
		  
    	case "play2":
    		
   
    		jPanel1.removeAll();
			jPanel1.repaint();	
			jPanel1.setBackground(Color.black);
			jfxPanel = new JFXPanel(); 
	    	jPanel1.setLayout(new BorderLayout());
	        jPanel1.add(jfxPanel,BorderLayout.CENTER);
	        System.out.println("1.4");

	       
	    	Platform.runLater(new Runnable() {
	           
	             public void run() {
	            	 
	            	 System.out.println("1.5");
	                File file = new File("C:\\Users\\javie\\Downloads\\HaloReach.mp4");     
	                System.out.println("1.9");
	                     oracleVid2 = new MediaPlayer(                                       
	                        new Media(file.toURI().toString())
	                    );
	                    //se a�ade video al jfxPanel
	                     System.out.println("2");
	                    jfxPanel.setScene(new Scene(new Group(new MediaView(oracleVid2))));                    
	                    oracleVid2.setVolume(0.7);//volumen
	                    oracleVid2.setCycleCount(MediaPlayer.INDEFINITE);//repite video
	                    System.out.println("3");
	                    oracleVid2.play();//play video
	                    System.out.println("4");
	                   	  boton.setBounds(507, 407, 175, 73);   
	    	              boton.setText("Parar");
	    	              jfxPanel.add(boton);
	                    
	             }
	        });
		
		break;
    	case "Parar":
    		
    			  oracleVid2.stop();
    			  jfxPanel.setVisible(false);
    			  jPanel1.setVisible(false);
    			  this.dispose();
    		
    		break;
		}
		
	}
}

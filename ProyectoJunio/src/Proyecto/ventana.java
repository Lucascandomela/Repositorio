package Proyecto;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;


public class ventana extends javax.swing.JFrame implements ActionListener {

    /**
     * @see ventana
     */
    public ventana() {
    	   	
        initComponents();
        vervida(vida1);
    }

  /**
   * @see initComponents()
   */
                      
    private void initComponents() {

    	vida = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
    	texf1 = new javax.swing.JTextField();
    	texf2 = new javax.swing.JTextField();
    	texf3 = new javax.swing.JTextField();
    	texf4 = new javax.swing.JTextField();
    	texf5 = new javax.swing.JTextField();
		texf6= new javax.swing.JTextField();
		texf7= new javax.swing.JTextField();
		texf8= new javax.swing.JTextField();
		texf9= new javax.swing.JTextField();
		texf10= new javax.swing.JTextField();
		
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(this);
        jButton2.setActionCommand("continuar2");
        
        jButton3 = new javax.swing.JButton();
        jButton3.addActionListener(this);
        jButton3.setActionCommand("muerte1");
        
        jButton4 = new javax.swing.JButton();
        jButton4.addActionListener(this);
        jButton4.setActionCommand("continuar3");
        
        jButton5 = new javax.swing.JButton();
        jButton5.addActionListener(this);
        jButton5.setActionCommand("reiniciar");
        
        jButton6 = new javax.swing.JButton();
        jButton6.addActionListener(this);
        jButton6.setActionCommand("salir");
        
        jButton7 = new javax.swing.JButton();
        jButton7.addActionListener(this);
        jButton7.setActionCommand("tirada");
        
        jButton8 = new javax.swing.JButton();
        jButton8.addActionListener(this);
        jButton8.setActionCommand("continuar4");
        
        jButton9 = new javax.swing.JButton();
        jButton9.addActionListener(this);
        jButton9.setActionCommand("muerte2");
        
        jButton10 = new javax.swing.JButton();
        jButton10.addActionListener(this);
        jButton10.setActionCommand("continuar5");
        
        jButton11 = new javax.swing.JButton();
        jButton11.addActionListener(this);
        jButton11.setActionCommand("continuar6");
        
        jButton12 = new javax.swing.JButton();
        jButton12.addActionListener(this);
        jButton12.setActionCommand("tirada2");
        
        jButton13 = new javax.swing.JButton();
        jButton13.addActionListener(this);
        jButton13.setActionCommand("tirada3");
        
        jButton14 = new javax.swing.JButton();
        jButton14.addActionListener(this);
        jButton14.setActionCommand("continuar7");
        
        jButton15 = new javax.swing.JButton();
        jButton15.addActionListener(this);
        jButton15.setActionCommand("continuar8");
        
        jButton16 = new javax.swing.JButton();
        jButton16.addActionListener(this);
        jButton16.setActionCommand("continuar9");
        
        jButton17 = new javax.swing.JButton();
        jButton17.addActionListener(this);
        jButton17.setActionCommand("muerte3");
        
        jButton18 = new javax.swing.JButton();
        jButton18.addActionListener(this);
        jButton18.setActionCommand("tirada4");
        
        jButton19 = new javax.swing.JButton();
        jButton19.addActionListener(this);
        jButton19.setActionCommand("continuar10");
        
        jButton20 = new javax.swing.JButton();
        jButton20.addActionListener(this);
        jButton20.setActionCommand("capitulo2");
        
        jButton21 = new javax.swing.JButton();
        jButton21.addActionListener(this);
        jButton21.setActionCommand("continuar11");
        
        jButton22 = new javax.swing.JButton();
        jButton22.addActionListener(this);
        jButton22.setActionCommand("continuar12");
        
        jButton23 = new javax.swing.JButton();
        jButton23.addActionListener(this);
        jButton23.setActionCommand("continuar13");
        
        jButton24 = new javax.swing.JButton();
        jButton24.addActionListener(this);
        jButton24.setActionCommand("continuar14");
        
        jButton25 = new javax.swing.JButton();
        jButton25.addActionListener(this);
        jButton25.setActionCommand("continuar15");
        
        jButton26 = new javax.swing.JButton();
        jButton26.addActionListener(this);
        jButton26.setActionCommand("continuar16");
        
        jButton27 = new javax.swing.JButton();
        jButton27.addActionListener(this);
        jButton27.setActionCommand("continuar17");
        
        jButton28 = new javax.swing.JButton();
        jButton28.addActionListener(this);
        jButton28.setActionCommand("continuar19");
       
        
        jButton30 = new javax.swing.JButton();
        jButton30.addActionListener(this);
        jButton30.setActionCommand("tirada5");
        
        jButton31 = new javax.swing.JButton();
        jButton31.addActionListener(this);
        jButton31.setActionCommand("tirada6");
        
        jButton32 = new javax.swing.JButton();
        jButton32.addActionListener(this);
        jButton32.setActionCommand("continuar20");
        
        jButton33 = new javax.swing.JButton();
        jButton33.addActionListener(this);
        jButton33.setActionCommand("continuar21");
        
        jButton34 = new javax.swing.JButton();
        jButton34.addActionListener(this);
        jButton34.setActionCommand("continuar22");
        
        jButton35 = new javax.swing.JButton();
        jButton35.addActionListener(this);
        jButton35.setActionCommand("continuar23");
        
        jButton36 = new javax.swing.JButton();
        jButton36.addActionListener(this);
        jButton36.setActionCommand("decision1");
        
        jButton37 = new javax.swing.JButton();
        jButton37.addActionListener(this);
        jButton37.setActionCommand("decision2");
        
        jButton38 = new javax.swing.JButton();
        jButton38.addActionListener(this);
        jButton38.setActionCommand("decision3");
        
        jButton39 = new javax.swing.JButton();
        jButton39.addActionListener(this);
        jButton39.setActionCommand("decision4");
        
        jButton40 = new javax.swing.JButton();
        jButton40.addActionListener(this);
        jButton40.setActionCommand("tirada7");
        
        jButton41 = new javax.swing.JButton();
        jButton41.addActionListener(this);
        jButton41.setActionCommand("continuar24");
        
        jButton42 = new javax.swing.JButton();
        jButton42.addActionListener(this);
        jButton42.setActionCommand("tirada8");
        
        
        jButton43 = new javax.swing.JButton();
        jButton43.addActionListener(this);
        jButton43.setActionCommand("continuar21");
        
        jButton44 = new javax.swing.JButton();
        jButton44.addActionListener(this);
        jButton44.setActionCommand("tirada9");
        
        jButton45 = new javax.swing.JButton();
        jButton45.addActionListener(this);
        jButton45.setActionCommand("tirada10");
        
        jButton46 = new javax.swing.JButton();
        jButton46.addActionListener(this);
        jButton46.setActionCommand("continuar25");
        
        jButton47 = new javax.swing.JButton();
        jButton47.addActionListener(this);
        jButton47.setActionCommand("continuar26");
        
        jButton48 = new javax.swing.JButton();
        jButton48.addActionListener(this);
        jButton48.setActionCommand("muertecap2");
        
        jButton49 = new javax.swing.JButton();
        jButton49.addActionListener(this);
        jButton49.setActionCommand("muertecap3");

        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tele-Marines", 0, 18)); // NOI18N
        jLabel3.setText("INTRODUCCION");

        jLabel1.setText("<html>A�o 2253, la humanidad ha logrado unos significativos avances tecnol�gicos y ha logrado expandirse m�s all� de la Tierra. Controla varios planetas del sistema solar y se han enviado naves tripuladas fuera de este. <br> T� te llamas John, ex miembro de una de los cuerpos de �lite de la UNSC (United Nations Space Command). Ahora retirado, trabajas en Everlin, una empresa de rob�tica en Madrid.<html>");

        jLabel4.setFont(new java.awt.Font("Tele-Marines", 0, 18)); // NOI18N
        jLabel4.setText("rEGLAS DEL JUEGO");

        jLabel2.setText("<html>Al enfrentarte a tus enemigos, tendr�s que realizar tiradas con un bot�n que mostrar� un n�mero aleatorio. </br><br>Si pierdes todos tus puntos de vida morir�s y se acabar� el juego.<br>En algunas ocasiones deber�s escoger entre varias opciones para cpntinuar<html>");

        jButton1.setActionCommand("continuar");
        jButton1.addActionListener(this);
        jButton1.setFont(new java.awt.Font("Tele-Marines", 0, 12)); // NOI18N
        jButton1.setText("Continuar");

      
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

       
        bd.tiradas();
        
        
      
        
        pack();
        
        
        
        
        
        
    }// </editor-fold>    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }
    /**
     * @see reiniciarcap1(String)
     * @param vida1
     */
    
    //Metodo para reiniciar capitulo 1
    public void reiniciarcap1(String vida1) {
    	
    	 ResultSet rt;
    	 rt= bd.buscarvida();    	 
    	 int vidarestante=0;
    	 
    	 
    	 try {

    		 rt.next();
    		
    		
    		 vida1=Integer.toString(rt.getInt("vida"));
    		 vida.setText("Vida: "+vida1);  		
    		 vidarestante= Integer.parseInt(vida1);
    		
    		 if(vidarestante<=0) {
    				jLabel1 = new javax.swing.JLabel();
    				jLabel2 = new javax.swing.JLabel();
    				
    				jPanel1.removeAll();
        			jPanel1.repaint();	
        			
        			vervida(vida1);
            		vida.setBounds(580, 5, 50, 20);
            		jPanel1.add(vida);
        			
        			jLabel2.setBounds(25, 1, 550, 100);
        			jLabel2.setText("<html>Te has quedado sin vida<html>");
        			jPanel1.add(jLabel2);

        			jLabel1.setBounds(210, 100, 600, 300);
    	    		jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 50));
    	    		jLabel1.setText("Has muerto");
    	            jPanel1.add(jLabel1); 
    			 
    	            jButton5.setBounds(0, 407, 200, 73);
        	        jButton5.setFont(newFont3);
        	        jButton5.setText("Reiniciar");
                    jPanel1.add(jButton5);
                    

                    jButton6.setBounds(479, 407, 200, 73);
                    jButton6.setFont(newFont3);
                    jButton6.setText("Salir");
                    jPanel1.add(jButton6);
    		 
    		 }
    			} catch (SQLException e1) {
    					// TODO Auto-generated catch block
    				JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
    			}
    	 
    	
    }
    
    /**
     * @see reiniciarcap2(String)
     * @param vida1
     */
    
    //Metodo para reiniciar capitulo 2
    public void reiniciarcap2(String vida1) {

   	 ResultSet rt;
   	 rt= bd.buscarvida();    	 
   	 int vidarestante=0;
   	 
   	 
   	 try {

   		 rt.next();
   		
   		
   		 vida1=Integer.toString(rt.getInt("vida"));
   		 vida.setText("Vida: "+vida1);  		
   		 vidarestante= Integer.parseInt(vida1);
   		
   		 if(vidarestante<=0) {
   				jLabel1 = new javax.swing.JLabel();
   				jLabel2 = new javax.swing.JLabel();
   				
   				jPanel1.removeAll();
       			jPanel1.repaint();	
       			
       			vervida(vida1);
        		vida.setBounds(580, 5, 50, 20);
        		jPanel1.add(vida);
       			
       			jLabel2.setBounds(25, 1, 550, 100);
       			jLabel2.setText("<html>Te has quedado sin vida<html>");
       			jPanel1.add(jLabel2);

       			jLabel1.setBounds(210, 100, 600, 300);
   	    		jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 50));
   	    		jLabel1.setText("Has muerto");
   	            jPanel1.add(jLabel1); 
   			 
   	         jButton48.setBounds(0, 407, 200, 73);
   	         jButton48.setFont(newFont3);
   	         jButton48.setText("Reiniciar Capitulo 2");
                   jPanel1.add(jButton48);
                   

                   jButton6.setBounds(479, 407, 200, 73);
                   jButton6.setFont(newFont3);
                   jButton6.setText("Salir");
                   jPanel1.add(jButton6);
   		 
   		 }
   			} catch (SQLException e1) {
   					// TODO Auto-generated catch block
   				JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
   			}
    	
    }
    /**
     * @see reiniciarcap3(String)
     * @param vida1
     */
    
    //Metodo para reiniciar capitulo 3
    public void reiniciarcap3(String vida1) {
    	
    	 ResultSet rt;
       	 rt= bd.buscarvida();    	 
       	 int vidarestante=0;
       	 
       	 
       	 try {

       		 rt.next();
       		
       		
       		 vida1=Integer.toString(rt.getInt("vida"));
       		 vida.setText("Vida: "+vida1);  		
       		 vidarestante= Integer.parseInt(vida1);
       		
       		 if(vidarestante<=0) {
       			 
       				jLabel1 = new javax.swing.JLabel();
       				jLabel2 = new javax.swing.JLabel();
       				
       				jPanel1.removeAll();
           			jPanel1.repaint();	
           			
           			
           			vervida(vida1);
            		vida.setBounds(580, 5, 50, 20);
            		jPanel1.add(vida);
            		
            		
           			jLabel2.setBounds(25, 1, 550, 100);
           			jLabel2.setText("<html>Te has quedado sin vida<html>");
           			jPanel1.add(jLabel2);

           			jLabel1.setBounds(210, 100, 600, 300);
       	    		jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 50));
       	    		jLabel1.setText("Has muerto");
       	            jPanel1.add(jLabel1); 
       			 
       	            jButton49.setBounds(0, 407, 200, 73);
       	            jButton49.setFont(newFont3);
       	            jButton49.setText("Reiniciar Capitulo 3");
                    jPanel1.add(jButton49);
                       

                       jButton6.setBounds(479, 407, 200, 73);
                       jButton6.setFont(newFont3);
                       jButton6.setText("Salir");
                       jPanel1.add(jButton6);
       		 
       		 }
       			} catch (SQLException e1) {
       					// TODO Auto-generated catch block
       				JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
       			}
    	
	
 }
    /**
     * @see vervida(String)
     * @param vida1
     */
    
    //Metodo para obtener la vida restante
    public void vervida(String vida1) {
    	
   	 ResultSet rt;
	 rt= bd.buscarvida();
	 

	 try {

		 rt.next();
		
		
		 vida1=Integer.toString(rt.getInt("vida"));
		 vida.setText("Vida: "+vida1);
		
		 int vidarestante= Integer.parseInt(vida1);

			 
			 
		 
			if(vidarestante<=0) {  
				vida.setText("Vida: 0");
		 		
		 	}
			} catch (SQLException e1) {
					// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
			}
	 
	 
    }
	 	
    
 
    
    
public void actionPerformed(ActionEvent e){
 
	  
    	switch(e.getActionCommand()) {
    	
		  
    	case "continuar": //capitulo1 - diapositiva 0 continuar
    	
    		reiniciarcap1(vida1);
    		
    		jLabel5 = new javax.swing.JLabel();
    		jLabel6 = new javax.swing.JLabel();
    		jLabel7 = new javax.swing.JLabel();
    		
    		
    		//limpia el panel
    		jPanel1.removeAll();
    		jPanel1.repaint();	
    		
    		
    	
   
    		vervida(vida1);
    		vida.setBounds(580, 5, 50, 20);
    		jPanel1.add(vida);
    		
    		jLabel5.setBounds(25, 25, 600, 450);
    		jLabel5.setText("<html>El claxon del coche a tu espalda te despierta una vez m�s esa ma�ana en la rotonda del nudo de Manoteras en Madrid, donde confluyen varios accesos a autov�as y zonas urbanas. Ruidos de motores componen la atm�sfera que te rodea y maldices una vez m�s ir a trabajar. <br><br>Por todos lados te rodean veh�culos que junto al tuyo forman un largo atasco que impide que llegues a tiempo a la empresa. <br><br>Est�s a punto de volver a rendirte al cansancio cuando escuchas un gran golpe a escasos metros de ti. Sales r�pidamente del coche pues intuyes que puede haber heridos en el accidente, cuando de repente una enorme sombra se proyecta en toda la rotonda y avanza veloz hasta donde te alcanza la vista.  <br><br>Cuando miras hacia la causa del eclipsamiento, tu coraz�n se detiene, tus m�sculos se tornan r�gidos, un sudor frio resbala por tu frente y un nudo en la garganta te atenaza.  <br><br>La imagen es ins�lita: una nave gigantesca, de colores morados, azules y blancos sobrevuela Madrid. No has visto nada parecido en tu vida, pues hasta ahora nunca ha habido muestras de otras formas de vida en el universo.<html>");
    		jPanel1.add(jLabel5);
    		
    		
    		
    		jLabel6.setBounds(230, 30, 200, 50);
    		jLabel6.setFont(newFont);
    		jLabel6.setText("Capitulo 1");
            jPanel1.add(jLabel6);
        
            
            jButton2.setBounds(507, 407, 175, 73);
            jButton2.setFont(newFont1);
            jButton2.setText("Continuar");
            jPanel1.add(jButton2);
            
            
            
            
            
            
            break;
            
    	case "continuar2": //diapositiva 1  //continuar2
        	
    		jLabel7 = new javax.swing.JLabel();
    	    		
    		
    		jPanel1.removeAll();
    		jPanel1.repaint();	
    		
    		vervida(vida1);
    		vida.setBounds(580, 5, 50, 20);
     		jPanel1.add(vida);
    		
    		jLabel7.setBounds(25, 1, 600, 350);
    		jLabel7.setText("<html>Al cabo de unos minutos observando la nave, una enorme compuerta se abre y de ella sale lo que parecen numerosas naves m�s peque�as que se acercan a gran velocidad hacia la superficie. Observas el rumbo de algunas de estas que se dirigen a tu ubicaci�n.<br><br>  Calculas que est�n a unos 500 metros cuando de repente bajo la parte frontal de cada una de ellas aparece una especie de articulaci�n cuya punta desprende un brillo intenso. En un abrir y cerrar de ojos esos brillos son propulsados hasta la superficie causando intensas explosiones al alcanzar tierra y ves como pedazos de asfalto y piedras, veh�culos y personas son lanzadas por los aires. <br><br><br> �Qu� vas a hacer? <br><br><br> 1-Meterte en el coche y esconderte. <br><br><br> 2-Correr hacia la derecha en direcci�n a donde est� tu empresa<html>");
    		jPanel1.add(jLabel7);
    		
    		
    		
    		jButton3.setBounds(0, 407, 200, 73);
    		jButton3.setFont(newFont2);
    		jButton3.setText("Meterte en el coche y esconderte");
            jPanel1.add(jButton3);
            
            jButton4.setBounds(228, 407, 450, 73);
            jButton4.setFont(newFont2);
            jButton4.setText("Correr hacia la derecha en direcci�n a tu empresa");
            jPanel1.add(jButton4);
            reiniciarcap1(vida1);
    		  break;
    		  
    		  
    	case "muerte1": //eleccion 1- diapositiva 2
    		
    		jLabel8 = new javax.swing.JLabel();
    		jLabel9 = new javax.swing.JLabel();
    		
    		
    			jPanel1.removeAll();
    			jPanel1.repaint();	
    			
    			
    			vida.setBounds(580, 5, 50, 20);
    			vida.setText("Vida: 0");
        		jPanel1.add(vida);
    			
    			jLabel8.setBounds(25, 1, 550, 200);
    			jLabel8.setText("<html>Te metes corriendo a la parte de atr�s de tu coche y cierras fuerte los ojos tratando de conseguir que ninguno de esos disparos te alcance. Por desgracia eso no es suficiente y lo �ltimo que escuchas es uno de los proyectiles dirigi�ndose a tu posici�n, lo que hace que saltes por los aires.<html>");
    			jPanel1.add(jLabel8);
    			
    			jLabel9.setBounds(200, 65, 600, 350);
    		    jLabel9.setFont(new java.awt.Font("Kristen ITC", 0, 50)); 
    	        jLabel9.setText("Has muerto");
    	        jPanel1.add(jLabel9);
    	        
    	    	
    	      
    	        jButton5.setBounds(0, 407, 200, 73);
    	        jButton5.setFont(newFont3);
    	        jButton5.setText("Reiniciar");
                jPanel1.add(jButton5);
                

                jButton6.setBounds(479, 407, 200, 73);
                jButton6.setFont(newFont3);
                jButton6.setText("Salir");
                jPanel1.add(jButton6);
    	        
    	      break;    	
    		  
    			
    	case "reiniciar": //eleccion 1 - diapositiva 3
    		
    		
    		jLabel10 = new javax.swing.JLabel();
    		jLabel11 = new javax.swing.JLabel();
    		
    		
    		jPanel1.removeAll();
			jPanel1.repaint();	
			
			vida.setBounds(580, 5, 50, 20);
    		jPanel1.add(vida);
			
    		jLabel10.setBounds(190, 30, 350, 60);
    		jLabel10.setFont(newFont4);
    		jLabel10.setText("INTRODUCCION");
    		jPanel1.add(jLabel10);
    		
    		
    		jLabel11.setBounds(160, 240, 350, 60);
    		jLabel11.setFont(newFont4);
    		jLabel11.setText("rEGLAS DEL JUEGO");
    		jPanel1.add(jLabel11);
    		
    	
				initComponents();
			
    
    		  break;
    			
    	case "salir": //eleccion 2 - diapositiva 4
    		
    		
    		System.exit(0);
    		
    		  break;
    		  
    		  
    	case "continuar3": //eleccion 2 - diapositiva 2
    		
    		jButton8.setEnabled(false);
			jButton9.setEnabled(false);	
    		jLabel12 = new javax.swing.JLabel();
    		jLabel13 = new javax.swing.JLabel();
    		jLabel14 = new javax.swing.JLabel();
    	
    		
    		jPanel1.removeAll();
			jPanel1.repaint();	
			
			vervida(vida1);
			vida.setBounds(580, 5, 50, 20);
    		jPanel1.add(vida);
			
			jLabel12.setBounds(25, 1, 550, 100);
			jLabel12.setText("<html>Sales corriendo como el rayo saltando por encima de los coches y de los restos causados por explosiones con gran agilidad gracias a tu pasado entrenamiento militar.<br><br>   Una explosi�n, a causa de un disparo perdido de una nave, estalla cerca de ti (Tira suerte)<html>");
			jPanel1.add(jLabel12);
			
			
			jButton7.setBounds(25, 120, 200, 73);
			jButton7.setFont(newFont2);
			jButton7.setText("SUERTE");
			jPanel1.add(jButton7);
    		
			
			jLabel13.setBounds(220, 120, 120, 80);
			jLabel13.setFont(newFont4);
			jLabel13.setText("------->");
			jPanel1.add(jLabel13);
			
			
			texf1.setBounds(320, 125, 60, 60);
			texf1.setEditable(false);
			jPanel1.add(texf1);
			
			
			jLabel14.setBounds(25, 226, 550, 100);
			jLabel14.setText("<html>Mantienes la carrera hasta llegar a la puerta de tu empresa Everlin y ahora piensas si ser� mejor meterte en la empresa o en unos setos cercanos que pueden ser un buen escondite. Las naves te pisan los talones�<br<br>><br>�Qu� vas a hacer?<html>");
			jPanel1.add(jLabel14);
			
			
			jButton8.setBounds(0, 407, 200, 73);
			jButton8.setFont(newFont2);
			jButton8.setText("Meterte en la empresa");
			jPanel1.add(jButton8);
			
			jButton9.setBounds(479, 407, 200, 73);
			jButton9.setFont(newFont2);
			jButton9.setText("Esconderte en los setos");
			jPanel1.add(jButton9);
			
			reiniciarcap1(vida1);
		   
    		  break;
    		  
    		  
    	case "muerte2":
    		
    		jLabel8 = new javax.swing.JLabel();
    		jLabel9 = new javax.swing.JLabel();
    
    		
    		
    			jPanel1.removeAll();
    			jPanel1.repaint();	
    			
    			vida.setText("Vida: 0");
    			vida.setBounds(580, 5, 50, 20);
        		jPanel1.add(vida);
    			
    			jLabel8.setBounds(25, 1, 550, 200);
    			jLabel8.setText("<html>Te lanzas sobre unos setos esperando a que pase la nave, pero eso no ocurre. En su lugar se para frente a la empresa y desciende hasta unos 10 metros del suelo. Observas aterrorizado entre los setos como desembarcan unos seres. Intentas fijarte bien en su aspecto pero ya no importa. Antes de bajar de la nave te vieron esconderte y van a por ti. \r\n" + 
    					"Sientes un dolor intenso provocado por varios disparos de sus armas.\r\n" + 
    					"Uno de ellos se acerca y te da el golpe de gracia.\r\n" + 
    					"<html>");
    			jPanel1.add(jLabel8);
    			
    			jLabel9.setBounds(200, 65, 600, 350);
    		    jLabel9.setFont(new java.awt.Font("Kristen ITC", 0, 50)); 
    	        jLabel9.setText("Has muerto");
    	        jPanel1.add(jLabel9);
    	        
    	       
    	        jButton5.setBounds(0, 407, 200, 73);
    	        jButton5.setFont(newFont3);
    	        jButton5.setText("Reiniciar");
                jPanel1.add(jButton5);
                
                
          
                jButton6.setBounds(479, 407, 200, 73);
                jButton6.setFont(newFont3);
                jButton6.setText("Salir");
                
                jPanel1.add(jButton6);
                
    		
    		
    		break;
    		
    		case "tirada":
    			
    			 ResultSet rt;
    			 rt= bd.buscarvida();
    			 

    			 try {

    				 	rt.next();
    				 	int vida2=0;
    				 	vida2= rt.getInt("vida");
    				 	Random r = new Random();
    	    			int dado = r.nextInt(8)+1;  // Entre 0 y 7, m�s 1.
    	    			String resultado= Integer.toString(dado);
    	    			texf1.setText(resultado);
    	    			texf1.setHorizontalAlignment(JTextField.CENTER); 
    	    			texf1.setFont(newFont5);
    	    			int vidaquitada=0;
    	    			
    	    			if(dado==1) {
    	    				
    	    				vidaquitada=15;  
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);	
    	 
    	    			}else if(dado==2) {
    	    			
    	    				vidaquitada=12;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==3) {
    	    			
    	    				vidaquitada=8;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==4) {
    	    			
    	    				vidaquitada=6;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==5) {
    	    			
    	    				vidaquitada=4;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==6) {
    	    			
    	    				vidaquitada=3;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==7) {
    	    			
    	    				vidaquitada=1;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==8) {
    	    			
    	    				vidaquitada=0;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}
    	    			   System.out.println("Modificado");
    			
    					} catch (SQLException e1) {
    							// TODO Auto-generated catch block
    						JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
    					}
    			  	  		   	
    			jLabel12 = new javax.swing.JLabel();
        		jLabel13 = new javax.swing.JLabel();
        		jLabel14 = new javax.swing.JLabel();
        	
        		
        		jPanel1.removeAll();
    			jPanel1.repaint();	
    			
    			vervida(vida1);
    			vida.setBounds(580, 5, 50, 20);
        		jPanel1.add(vida);
    			
    			jLabel12.setBounds(25, 1, 550, 100);
    			jLabel12.setText("<html>Sales corriendo como el rayo saltando por encima de los coches y de los restos causados por explosiones con gran agilidad gracias a tu pasado entrenamiento militar.<br><br>   Una explosi�n, a causa de un disparo perdido de una nave, estalla cerca de ti (Tira suerte)<html>");
    			jPanel1.add(jLabel12);
    			
    			
    			jButton7.setBounds(25, 120, 200, 73);
    			jButton7.setFont(newFont2);
    			jButton7.setText("SUERTE");
    			jPanel1.add(jButton7);
        		
    			
    			jLabel13.setBounds(220, 120, 120, 80);
    			jLabel13.setFont(newFont4);
    			jLabel13.setText("------->");
    			jPanel1.add(jLabel13);
    			
    			
    			texf1.setBounds(320, 125, 60, 60);
    			texf1.setEditable(false);
    			jPanel1.add(texf1);
    			
    			
    			jLabel14.setBounds(25, 226, 550, 100);
    			jLabel14.setText("<html>Mantienes la carrera hasta llegar a la puerta de tu empresa Everlin y ahora piensas si ser� mejor meterte en la empresa o en unos setos cercanos que pueden ser un buen escondite. Las naves te pisan los talones�<br<br>><br>�Qu� vas a hacer?<html>");
    			jPanel1.add(jLabel14);
    			
    			
    			jButton8.setBounds(0, 407, 200, 73);
    			jButton8.setFont(newFont2);
    			jButton8.setText("Meterte en la empresa");
    			jPanel1.add(jButton8);
    			
    			jButton9.setBounds(479, 407, 200, 73);
    			jButton9.setFont(newFont2);
    			jButton9.setText("Esconderte en los setos");
    			jPanel1.add(jButton9);
    		   
    			jButton8.setEnabled(true);
 			    jButton9.setEnabled(true);	
    			jButton7.setEnabled(false);
    			
    			reiniciarcap1(vida1);
    			
    			break;
    			
    		case "continuar4":
    			
    			jLabel1 = new javax.swing.JLabel();
       
    			
    			jPanel1.removeAll();
    			jPanel1.repaint();	
    			
    			vervida(vida1);
    			vida.setBounds(580, 5, 50, 20);
        		jPanel1.add(vida);
    			
    			jLabel1.setBounds(20, 20, 600, 350);
    		    jLabel1.setText("<html>Entras a toda velocidad por la puerta, atraviesas los tornos de seguridad y te encuentras con una situaci�n de caos: gente corriendo en todas direcciones, otros con la mirada perdida debida a un estado de shock, otros  acurrucados en cualquier esquina llorando a causa de la desesperaci�n. Subes hasta el segundo piso donde apenas queda gente, tratan de esconderse en una habitaci�n al fondo del pasillo, a la cual t� tambi�n te diriges.\r\n <br><br>"  
    		    				+ "Entras en la habitaci�n en el mismo momento en que se oyen gritos de horror y disparos en las plantas de abajo. Un hombre cierra r�pidamente la puerta mientras te haces un hueco. Es un cuarto de limpieza peque�o, el cual est� albergando a ocho personas de las cuales una es una amiga que conociste al llegar a la empresa.\r\n<html>");
    	        jPanel1.add(jLabel1);
    	        
    			
                jButton10.setBounds(507, 407, 175, 73);
                jButton10.setFont(newFont1);
                jButton10.setText("continuar");
                jPanel1.add(jButton10);
    			
                reiniciarcap1(vida1);
    			
    			break;
    			
    		case "continuar5":
    			
    			jLabel1 = new javax.swing.JLabel();
    			jLabel2 = new javax.swing.JLabel();
    			jLabel3 = new javax.swing.JLabel();
    			
    			jPanel1.removeAll();
    			jPanel1.repaint();	
    			
    			vervida(vida1);
    			vida.setBounds(580, 5, 50, 20);
        		jPanel1.add(vida);
    			
    			jLabel1.setBounds(5, 3, 600, 202);
    		    jLabel1.setText("<html>-	�Sara!   -exclamas acerc�ndote a ella.<br><br>-	�John! Menos mal que est�s bien�<br><br>-  Chssst�   -un hombre os manda callar pues los disparos han disminuido de manera significativa, lo cual os preocupa.<br><br>Conten�is la respiraci�n a medida que se oyen golpes y cristales rotos en las habitaciones adyacentes y m�s tarde pasos acerc�ndose a vuestro escondite.<br><br>De golpe, la puerta se abre y observ�is a un peque�o alien�gena, de aproximadamente un metro de altura, con una especie de m�scara de gas verde, un extra�o caparaz�n morado a su espalda y lo que parece, a juzgar por tu pasado militar, una peque�a pistola con un cargador verde luminoso.<html>"); 
    		    jPanel1.add(jLabel1);
    			
    		    javax.swing.ImageIcon Imagen = new javax.swing.ImageIcon("C://Ordenador/grunt.jpg"); 
    		    javax.swing.JLabel Img = new javax.swing.JLabel(Imagen); 
    		    Img.setSize(400, 225); 
    		    jLabel2.setBounds(5, 230, 400, 225);
    		    jLabel2.add(Img); 
    		    jPanel1.add(jLabel2);
    	
    		    
    		    jButton11.setBounds(487, 397, 195, 83);
                jButton11.setFont(newFont1);
                jButton11.setText("continuar");
                jPanel1.add(jButton11);
                
                reiniciarcap1(vida1);
                
    			break;
    			
    			
    		case "continuar6":
    			
    			jLabel1 = new javax.swing.JLabel();
    			jLabel2 = new javax.swing.JLabel();
    			
    	
    			jPanel1.removeAll();
    			jPanel1.repaint();	
    			
    			vervida(vida1);
    			vida.setBounds(580, 5, 50, 20);
        		jPanel1.add(vida);
    			
    			jLabel1.setBounds(5, 5, 600, 300);
    		    jLabel1.setText("<html>El extraterrestre se ve sorprendido y ves el momento de atacar:<br><br><br><br><br><br><br><br><br>" +    
    		    		"Recoges el arma del suelo y la estudias detenidamente. Observas que el cargador es parecido a un elemento nuclear."+
    		    		"Al fondo del pasillo aparecen dos extraterrestres id�nticos al que acabas de eliminar. Por instinto apuntas al primero le disparas abati�ndole de dos disparos en el cuerpo. El otro lanza un grito y empieza a disparar a discreci�n unos 6 o 7 disparos, ninguno te llega a dar pues te has cubierto en el marco de la puerta, pero ves horrorizado como sus disparos han alcanzado a 3 personas que se escond�an contigo en el cuarto y los proyectiles les abrasan la piel.<br><br>" +
    		    		"Profieren unos gritos desgarradores antes de morir pues los disparos les alcanzaron en zonas vitales. Los dem�s se ocultan tambi�n en el marco de la puerta. Es el momento de abatir al segundo alien�gena:<html>");
    		    jPanel1.add(jLabel1);
    			
    		  
    		    jButton12.setBounds(25, 60, 200, 73);
    		    jButton12.setFont(newFont2);
    		    jButton12.setText("SUERTE");
    			jPanel1.add(jButton12);
        		
    			
    			jLabel13.setBounds(220, 60, 120, 80);
    			jLabel13.setFont(newFont4);
    			jLabel13.setText("------->");
    			jPanel1.add(jLabel13);
    			
    			
    			texf3.setBounds(320, 65, 60, 60);
    			texf3.setEditable(false);
    			jPanel1.add(texf3);
    			
    			
    			jButton13.setEnabled(false);
    			jButton13.setBounds(25, 345, 200, 73);
      		    jButton13.setFont(newFont2);
      		    jButton13.setText("SUERTE");
      			jPanel1.add(jButton13);
          		
      			
      			jLabel14.setBounds(220, 345, 120, 80);
      			jLabel14.setFont(newFont4);
      			jLabel14.setText("------->");
      			jPanel1.add(jLabel14);
      			
      			
      			texf2.setBounds(320, 350, 60, 60);
      			texf2.setEditable(false);
      			jPanel1.add(texf2);
      			
      		  jButton14.setEnabled(false);
      		  jButton14.setBounds(507, 407, 175, 73);
              jButton14.setFont(newFont1);
              jButton14.setText("continuar");
              jPanel1.add(jButton14);
              reiniciarcap1(vida1);
      			
    			break;
    			
    		case "tirada2":
    			jButton12.setEnabled(false);
				 jButton13.setEnabled(true);
    	
    			 rt= bd.buscarvida();
    			 

    			 try {
    				 
    				 	rt.next();
    				 	int vida2=0;
    				 	vida2= rt.getInt("vida");
    				 	Random r = new Random();
    	    			int dado = r.nextInt(8)+1;  // Entre 0 y 7, m�s 1.
    	    			String resultado= Integer.toString(dado);
    	    			texf3.setText(resultado);
    	    			texf3.setHorizontalAlignment(JTextField.CENTER); 
    	    			texf3.setFont(newFont5);
    	    			int vidaquitada=0;
    	    			
    	    			if(dado==1) {
    	    				
    	    				vidaquitada=15;  
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);	
    	 
    	    			}else if(dado==2) {
    	    			
    	    				vidaquitada=12;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==3) {
    	    			
    	    				vidaquitada=8;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==4) {
    	    			
    	    				vidaquitada=6;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==5) {
    	    			
    	    				vidaquitada=4;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==6) {
    	    			
    	    				vidaquitada=3;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==7) {
    	    			
    	    				vidaquitada=1;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==8) {
    	    			
    	    				vidaquitada=0;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}
    	    			   System.out.println("Modificado");
    			
    					} catch (SQLException e1) {
    							// TODO Auto-generated catch block
    						JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
    				
    					}
    			 
    			 jLabel1 = new javax.swing.JLabel();
     			jLabel2 = new javax.swing.JLabel();
     			
     	
     			jPanel1.removeAll();
     			jPanel1.repaint();	
     			
     			vervida(vida1);
     			vida.setBounds(580, 5, 50, 20);
         		jPanel1.add(vida);
     			
     			jLabel1.setBounds(5, 5, 600, 300);
     		    jLabel1.setText("<html>El extraterrestre se ve sorprendido y ves el momento de atacar:<br><br><br><br><br><br><br><br><br>" +    
     		    		"Recoges el arma del suelo y la estudias detenidamente. Observas que el cargador es parecido a un elemento nuclear."+
     		    		"Al fondo del pasillo aparecen dos extraterrestres id�nticos al que acabas de eliminar. Por instinto apuntas al primero le disparas abati�ndole de dos disparos en el cuerpo. El otro lanza un grito y empieza a disparar a discreci�n unos 6 o 7 disparos, ninguno te llega a dar pues te has cubierto en el marco de la puerta, pero ves horrorizado como sus disparos han alcanzado a 3 personas que se escond�an contigo en el cuarto y los proyectiles les abrasan la piel.<br><br>" +
     		    		"Profieren unos gritos desgarradores antes de morir pues los disparos les alcanzaron en zonas vitales. Los dem�s se ocultan tambi�n en el marco de la puerta. Es el momento de abatir al segundo alien�gena:<html>");
     		    jPanel1.add(jLabel1);
     			
     		  
     		    jButton12.setBounds(25, 60, 200, 73);
     		    jButton12.setFont(newFont2);
     		    jButton12.setText("SUERTE");
     			jPanel1.add(jButton12);
         		
     			
     			jLabel13.setBounds(220, 60, 120, 80);
     			jLabel13.setFont(newFont4);
     			jLabel13.setText("------->");
     			jPanel1.add(jLabel13);
     			
     			
     			texf3.setBounds(320, 65, 60, 60);
     			texf3.setEditable(false);
     			jPanel1.add(texf3);
     			
     			
     			
     			jButton13.setBounds(25, 345, 200, 73);
       		    jButton13.setFont(newFont2);
       		    jButton13.setText("SUERTE");
       			jPanel1.add(jButton13);
           		
       			
       			jLabel14.setBounds(220, 345, 120, 80);
       			jLabel14.setFont(newFont4);
       			jLabel14.setText("------->");
       			jPanel1.add(jLabel14);
       			
       			
       			texf2.setBounds(320, 350, 60, 60);
       			texf2.setEditable(false);
       			jPanel1.add(texf2);
       			
       	
       		  jButton14.setBounds(507, 407, 175, 73);
               jButton14.setFont(newFont1);
               jButton14.setText("continuar");
               jPanel1.add(jButton14);
    			
               reiniciarcap1(vida1);
    			break;
    			
    		case "tirada3":
    			
    			 jButton12.setEnabled(false);
				 jButton13.setEnabled(false);
				 jButton14.setEnabled(true);
    			 rt= bd.buscarvida();
    			 

    			 try {

    				 	rt.next();
    				 	int vida2=0;
    				 	vida2= rt.getInt("vida");
    				 	Random r = new Random();
    	    			int dado = r.nextInt(8)+1;  // Entre 0 y 7, m�s 1.
    	    			String resultado= Integer.toString(dado);
    	    			texf2.setText(resultado);
    	    			texf2.setHorizontalAlignment(JTextField.CENTER); 
    	    			texf2.setFont(newFont5);
    	    			int vidaquitada=0;
    	    			
    	    			if(dado==1) {
    	    				
    	    				vidaquitada=15;  
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);	
    	 
    	    			}else if(dado==2) {
    	    			
    	    				vidaquitada=12;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==3) {
    	    			
    	    				vidaquitada=8;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==4) {
    	    			
    	    				vidaquitada=6;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==5) {
    	    			
    	    				vidaquitada=4;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==6) {
    	    			
    	    				vidaquitada=3;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==7) {
    	    			
    	    				vidaquitada=1;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==8) {
    	    			
    	    				vidaquitada=0;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}
    	    			   System.out.println("Modificado");
    			
    					} catch (SQLException e1) {
    							// TODO Auto-generated catch block
    						JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
    					}
    			
    			 jLabel1 = new javax.swing.JLabel();
     			jLabel2 = new javax.swing.JLabel();
     			
     	
     			jPanel1.removeAll();
     			jPanel1.repaint();	
     		
     			vervida(vida1);
     			vida.setBounds(580, 5, 50, 20);
         		jPanel1.add(vida);
     			
     			jLabel1.setBounds(5, 5, 600, 300);
     		    jLabel1.setText("<html>El extraterrestre se ve sorprendido y ves el momento de atacar:<br><br><br><br><br><br><br><br><br>" +    
     		    		"Recoges el arma del suelo y la estudias detenidamente. Observas que el cargador es parecido a un elemento nuclear."+
     		    		"Al fondo del pasillo aparecen dos extraterrestres id�nticos al que acabas de eliminar. Por instinto apuntas al primero le disparas abati�ndole de dos disparos en el cuerpo. El otro lanza un grito y empieza a disparar a discreci�n unos 6 o 7 disparos, ninguno te llega a dar pues te has cubierto en el marco de la puerta, pero ves horrorizado como sus disparos han alcanzado a 3 personas que se escond�an contigo en el cuarto y los proyectiles les abrasan la piel.<br><br>" +
     		    		"Profieren unos gritos desgarradores antes de morir pues los disparos les alcanzaron en zonas vitales. Los dem�s se ocultan tambi�n en el marco de la puerta. Es el momento de abatir al segundo alien�gena:<html>");
     		    jPanel1.add(jLabel1);
     			
     		  
     		    jButton12.setBounds(25, 60, 200, 73);
     		    jButton12.setFont(newFont2);
     		    jButton12.setText("SUERTE");
     			jPanel1.add(jButton12);
         		
     			
     			jLabel13.setBounds(220, 60, 120, 80);
     			jLabel13.setFont(newFont4);
     			jLabel13.setText("------->");
     			jPanel1.add(jLabel13);
     			
     			
     			texf3.setBounds(320, 65, 60, 60);
     			texf3.setEditable(false);
     			jPanel1.add(texf3);
     			
     			
     			jButton13.setBounds(25, 345, 200, 73);
       		    jButton13.setFont(newFont2);
       		    jButton13.setText("SUERTE");
       			jPanel1.add(jButton13);
           		
       			
       			jLabel14.setBounds(220, 345, 120, 80);
       			jLabel14.setFont(newFont4);
       			jLabel14.setText("------->");
       			jPanel1.add(jLabel14);
       			
       			
       			texf2.setBounds(320, 350, 60, 60);
       			texf2.setEditable(false);
       			jPanel1.add(texf2);
       			
       		 
       		  jButton14.setBounds(507, 407, 175, 73);
               jButton14.setFont(newFont1);
               jButton14.setText("continuar");
               jPanel1.add(jButton14);
    			
               reiniciarcap1(vida1);
    			break;
    			
    			
    		case "continuar7":
    			
    			jLabel1 = new javax.swing.JLabel();
    			
    			jPanel1.removeAll();
    			jPanel1.repaint();	
    		
    			vervida(vida1);
    			vida.setBounds(580, 5, 50, 20);
        		jPanel1.add(vida);
    			
    			jLabel1.setBounds(25, 35, 600, 300);
    			jLabel1.setText("<html>El segundo extraterrestre yace abatido en el pasillo e informas a los dem�s que los gritos y disparos pueden haber alertado a otros que pueda haber.<br><br><br>" + 
    					"\r\n" + 
    					"Dos personas se niegan a abandonar el escondite y otras dos m�s tu amiga Sara e acompa�an. De las pistolas de plasma ca�das, entregas una a los que se quedan y otra se la das a un hombre que va contigo.<br><br><br>" + 
    					"\r\n" + 
    					"Antes de bajar las escaleras te asomas por la ventana. La vista es desoladora: Hay fuego y cad�veres por todas partes, edificios con agujeros enormes causados, seguramente, por impactos de los proyectiles de las naves, agujeros calcinados en el suelo por efecto de los mismos, naves alien�genas surcando el cielo combatiendo con las aeronaves de la UNSC () y hasta los rascacielos de Madrid se hayan ausentes a la vista que acostumbrabas los d�as anteriores.<br><br><br>" + 
    					"\r\n" + 
    					"Entre todo el caos divisas bengalas verdes a unos 2 kil�metros de distancia. Por tu experiencia en el ej�rcito, sabes que son bengalas de evacuaci�n y apuestas por ir hacia all� lo m�s r�pido posible junto con la aprobaci�n de los dem�s.<html>");
    			jPanel1.add(jLabel1);
    			
    			 jButton15.setBounds(507, 407, 175, 73);
                 jButton15.setFont(newFont1);
                 jButton15.setText("continuar");
                 jPanel1.add(jButton15);
                 reiniciarcap1(vida1);
                 
    			break;
    			
    			
    			
    		case "continuar8":
    			
    			jLabel1 = new javax.swing.JLabel();
    			
    			jPanel1.removeAll();
    			jPanel1.repaint();	
    			
    			vervida(vida1);
    			vida.setBounds(580, 5, 50, 20);
        		jPanel1.add(vida);
    			
    			jLabel1.setBounds(25, 10, 600, 300);
    			jLabel1.setText("<html>Avanz�is por una calle con edificios derruidos a ambos lados y veh�culos estrellados bloqueando la carretera, por lo que descart�is ir en coche.<br><br>" + 
    					"Llev�is recorrido la mitad del camino cuando a lo lejos escuch�is una gran cantidad de disparos, sonr�es pues muchos de los disparos pertenecen a armas que te resultan familiar, pues son de la UNSC.<br><br><br><br>" + 
    					"Os parapet�is tras un coche y asomas la cabeza para comprobar la situaci�n: una barricada improvisada tal la cual est� un grupo de soldados resistiendo oleadas de enemigos mientras esperan evacuaci�n.<br><br><br><br>" + 
    					"�Qu� vas a hacer?<html>");
    			jPanel1.add(jLabel1);
    			
    			
    			 jButton16.setBounds(12, 407, 225, 73);
                 jButton16.setFont(newFont2);
                 jButton16.setText("Correr hacia la barricada");
                 jPanel1.add(jButton16);
                 
                 jButton17.setBounds(457, 407, 225, 73);
                 jButton17.setFont(newFont2);
                 jButton17.setText("Esperar a que sea seguro");
                 jPanel1.add(jButton17);
                 reiniciarcap1(vida1);
    			
    			break;
    			
    			
    			
    		case "continuar9":
    			
    			jLabel1 = new javax.swing.JLabel();
    			
    			jPanel1.removeAll();
    			jPanel1.repaint();	
    	
    			vervida(vida1);
    			vida.setBounds(580, 5, 50, 20);
        		jPanel1.add(vida);
    			
    			jLabel1.setBounds(25, 10, 600, 300);
    			jLabel1.setText("<html>Corr�is primero con esperanza y luego, a medida que os acerc�is, con desesperaci�n. Pas�is cerca de un enemigo, igual al que derrotaste en la empresa, en el mismo momento en que un disparo desde la barricada le vuela la cabeza.<br><br>" + 
    					"\r\n" + 
    					"Avanz�is a tanta velocidad que los enemigos no se dan ni cuenta de vuestra presencia en el lateral derecho de la calle. Hasta que los gritos de �nimo por parte de los soldados de la barricada alertan a los extraterrestres y dos de ellos se plantan delante de vosotros justo antes de llegar a la barricada.<br><br>" +    		
    					"El primero es abatido por los disparos desesperados de tu compa�ero de empresa con su pistola de plasma. <br><br>"
    					+ "Del segundo te debes encargar t�:<html>");
    			jPanel1.add(jLabel1);
    			
    		
    			jButton18.setBounds(25, 345, 200, 73);
    			jButton18.setFont(newFont2);
    			jButton18.setText("SUERTE");
      			jPanel1.add(jButton18);
          		
      			
      			jLabel14.setBounds(220, 345, 120, 80);
      			jLabel14.setFont(newFont4);
      			jLabel14.setText("------->");
      			jPanel1.add(jLabel14);
      			
      			
      			texf4.setBounds(320, 350, 60, 60);
      			texf4.setEditable(false);
      			jPanel1.add(texf4);
      		
      			 jButton19.setEnabled(false);
      			 jButton19.setBounds(507, 407, 175, 73);
      			 jButton19.setFont(newFont1);
      			 jButton19.setText("continuar");
                 jPanel1.add(jButton19);
                 
                 reiniciarcap1(vida1);
    			break;
    			
    		case "muerte3":
    			
    			jLabel8 = new javax.swing.JLabel();
        		jLabel9 = new javax.swing.JLabel();
        
        		
        		
        			jPanel1.removeAll();
        			jPanel1.repaint();	
        			
        			vida.setText("Vida: 0");
        			vida.setBounds(580, 5, 50, 20);
            		jPanel1.add(vida);
        			
        			jLabel8.setBounds(25, 1, 550, 200);
        			jLabel8.setText("<html><br>Acord�is esperar tras el coche con la esperanza de que caigan todos los enemigos. Mala idea porque una aeronave de evacuaci�n de la UNSC aterriza y r�pidamente recoge a los soldaos supervivientes y vuelve a alzar el vuelo alej�ndose r�pidamente de la zona. Los gritos desesperados de tus compa�eros de empresa al ver partir la nave, alarman a vuestros enemigos que se frotan las manos por la facilidad de su nueva presa.<html>");
        			jPanel1.add(jLabel8);
        			
        			jLabel9.setBounds(200, 65, 600, 350);
        		    jLabel9.setFont(new java.awt.Font("Kristen ITC", 0, 50)); 
        	        jLabel9.setText("Has muerto");
        	        jPanel1.add(jLabel9);
        	        
        	       
        	        jButton5.setBounds(0, 407, 200, 73);
        	        jButton5.setFont(newFont3);
        	        jButton5.setText("Reiniciar");
        	      
                    jPanel1.add(jButton5);
                    
                    
              
                    jButton6.setBounds(479, 407, 200, 73);
                    jButton6.setFont(newFont3);
                    jButton6.setText("Salir");
                    
                    jPanel1.add(jButton6);
        		
        		
    			
    			break;
    			
    			case "tirada4":
    			jButton19.setEnabled(true);
    			jButton18.setEnabled(false);
    			rt= bd.buscarvida();
    			 

    			 try {
    				 
    				 	rt.next();
    				 	int vida2=0;
    				 	vida2= rt.getInt("vida");
    				 	Random r = new Random();
    	    			int dado = r.nextInt(8)+1;  // Entre 0 y 7, m�s 1.
    	    			String resultado= Integer.toString(dado);
    	    			texf4.setText(resultado);
    	    			texf4.setHorizontalAlignment(JTextField.CENTER); 
    	    			texf4.setFont(newFont5);
    	    			int vidaquitada=0;
    	    			
    	    			if(dado==1) {
    	    				
    	    				vidaquitada=15;  
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);	
    	 
    	    			}else if(dado==2) {
    	    			
    	    				vidaquitada=12;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==3) {
    	    			
    	    				vidaquitada=8;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==4) {
    	    			
    	    				vidaquitada=6;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==5) {
    	    			
    	    				vidaquitada=4;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==6) {
    	    			
    	    				vidaquitada=3;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==7) {
    	    			
    	    				vidaquitada=1;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}else if(dado==8) {
    	    			
    	    				vidaquitada=0;   
    	    				int vidatotal= vida2 - vidaquitada;
    	    				
    	    				bd.tiradas(vidatotal);
    	    				
    	    			}
    	    			   System.out.println("Modificado");
    			
    					} catch (SQLException e1) {
    							// TODO Auto-generated catch block
    						JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
    				
    					}
    			 
    			 jLabel1 = new javax.swing.JLabel();
     			
     			jPanel1.removeAll();
     			jPanel1.repaint();	
     			reiniciarcap1(vida1);
     			vervida(vida1);
     			vida.setBounds(580, 5, 50, 20);
         		jPanel1.add(vida);
     			
     			jLabel1.setBounds(25, 10, 600, 300);
     			jLabel1.setText("<html>Corr�is primero con esperanza y luego, a medida que os acerc�is, con desesperaci�n. Pas�is cerca de un enemigo, igual al que derrotaste en la empresa, en el mismo momento en que un disparo desde la barricada le vuela la cabeza.<br><br>" + 
     					"\r\n" + 
     					"Avanz�is a tanta velocidad que los enemigos no se dan ni cuenta de vuestra presencia en el lateral derecho de la calle. Hasta que los gritos de �nimo por parte de los soldados de la barricada alertan a los extraterrestres y dos de ellos se plantan delante de vosotros justo antes de llegar a la barricada.<br><br>" +    		
     					"El primero es abatido por los disparos desesperados de tu compa�ero de empresa con su pistola de plasma. <br><br>"
     					+ "Del segundo te debes encargar t�:<html>");
     			jPanel1.add(jLabel1);
     			
     		
     			jButton18.setBounds(25, 345, 200, 73);
     			jButton18.setFont(newFont2);
     			jButton18.setText("SUERTE");
       			jPanel1.add(jButton18);
           		
       			
       			jLabel14.setBounds(220, 345, 120, 80);
       			jLabel14.setFont(newFont4);
       			jLabel14.setText("------->");
       			jPanel1.add(jLabel14);
       			
       			
       			texf4.setBounds(320, 350, 60, 60);
       			texf4.setEditable(false);
       			jPanel1.add(texf4);
       		
       			 
       			 jButton19.setBounds(507, 407, 175, 73);
       			 jButton19.setFont(newFont1);
       			 jButton19.setText("continuar");
                  jPanel1.add(jButton19);
    			
    			break;
    			
    			
    			case "continuar10":
    			
    				jLabel1 = new javax.swing.JLabel();
    				jLabel2 = new javax.swing.JLabel();
    				
        			jPanel1.removeAll();
        			jPanel1.repaint();	
        			
        			vervida(vida1);
        			vida.setBounds(580, 5, 50, 20);
            		jPanel1.add(vida);
        			
        			jLabel1.setBounds(25, 10, 600, 200);
        			jLabel1.setText("<html>Los soldados os abren su parte izquierda de la barricada y entr�is a toda prisa. A los pocos minutos una nave de evacuaci�n de la UNSC aterriza y los soldaos os ordenan entrar. \r\n" + 
        					"A continuaci�n entran ellos a toda velocidad y el que parece el l�der del escuadr�n lanza un grito al piloto, el cu�l cierra r�pidamente la compuerta y alza el vuelo alej�ndose de aquella ciudad de muerte.\r\n" + 
        					"<html>");
        			jPanel1.add(jLabel1);
        			
        			jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 50));
        			jLabel2.setBounds(25, 100, 600, 300);
        			jLabel2.setText("<html>Capitulo 1 terminado<html>");
        			jPanel1.add(jLabel2);
        			
       
        			 jButton20.setBounds(440, 407, 250, 73);
        			 jButton20.setFont(newFont1);
        			 jButton20.setText("Siguiente Capitulo");
                     jPanel1.add(jButton20);
                     
                     reiniciarcap1(vida1);
        		        			
    			break;
    			
    			case "capitulo2":
    				
    				
    				jLabel1 = new javax.swing.JLabel();  			
    				jLabel2 = new javax.swing.JLabel();  	
    				
        			jPanel1.removeAll();
        			jPanel1.repaint();	
        			bd.tiradas();
        			
        			vervida(vida1);
        			vida.setBounds(580, 5, 50, 20);
            		jPanel1.add(vida);

        			jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 50));
        			jLabel2.setBounds(25, 30, 600, 50);
        			jLabel2.setText("Capitulo 2");
        			jPanel1.add(jLabel2);
        			
       
        			jLabel1.setBounds(25, 180, 600, 200);
        			jLabel1.setText("<html>Sales de la tienda de campa�a com�n con la impresi�n de haber dormido tres d�as, y con los ojos medio cerrados observas lo que pasa a t� alrededor: veh�culos tanto ligeros como blindados movi�ndose en todas direcciones, civiles refugi�ndose del fr�o matutino en las grandes carpas instaladas por el ej�rcito, naves de desembarco de tropas aterrizando y despegando�<br><br>" +
        					"Caminas por el campamento cuando te fijas que casi todos los soldados se dirigen r�pido a una misma direcci�n y decides ver qu� pasa.<br><br>" + 
        					"Al llegar ves un a todos alrededor de un Scorpion (tanque pesado terrestre), y sobre su ca��n a un general que empieza a hablar�<br><br>" + 
        					"<html>");
        			jPanel1.add(jLabel1);
        			
        			 jButton21.setBounds(440, 407, 250, 73);
        			 jButton21.setFont(newFont1);
        			 jButton21.setText("continuar");
                     jPanel1.add(jButton21);
    				
    				break;
    				
    			case "continuar11":


    				jLabel1 = new javax.swing.JLabel();  			
    				
        			jPanel1.removeAll();
        			jPanel1.repaint();	
        			
        			vervida(vida1);
        			vida.setBounds(580, 5, 50, 20);
            		jPanel1.add(vida);
	
        			jLabel1.setBounds(25, 110, 600, 200);
        			jLabel1.setText("<html>- �Soldados!      - grita el general, dirigi�ndose a todos los presentes   -Ma�ana al salir el sol realizaremos una ofensiva para acabar con la que parece ser la nave madre de esos cerdos. El ataque se realizar� en dos frentes�. El primero a las 7:00 lo realizar�n los ODST lanz�ndose a en c�psulas a lo largo de la playa de Castell�n, junto con la mayor parte de las fuerzas a�reas, para crear una distracci�n y vaciar su nave lo m�ximo posible; el segundo lo realizar�n las tropas de infanter�a ligera y mecanizada que se encargar�n de abatir al m�ximo n�mero de enemigos para que un grupo de asalto se infiltre en la nave con una carga explosiva de gran magnitud y hacerla estallar desde dentro� �Esos cerdos no conocen la valent�a de los hombres y mujeres de la UNSC! �Esos cabrones no tienen ni puta idea de lo que les viene encima! �Sin prisioneros!... �POR LA TIERRA!<br><br>" + 
        					"Un clamoroso grito de guerra resuena en las gargantas de los all� presentes, que sin remediarlo, t� tambi�n lo vociferas. Todos empiezan a ponerse en marcha y a prepararse para el d�a de ma�ana.\r\n" + 
        					"<html>");
        			jPanel1.add(jLabel1);
    				
        			 jButton22.setBounds(440, 407, 250, 73);
        			 jButton22.setFont(newFont1);
        			 jButton22.setText("continuar");
                     jPanel1.add(jButton22);
    				
    				break;
    				
    			case "continuar12":
    				

    				jLabel1 = new javax.swing.JLabel();  			
    				
        			jPanel1.removeAll();
        			jPanel1.repaint();	
        			
        			vervida(vida1);
        			vida.setBounds(580, 5, 50, 20);
            		jPanel1.add(vida);
	
        			jLabel1.setBounds(25, 30, 600, 400);
        			jLabel1.setText("<html>A lo lejos ves a un oficial ODST que da instrucciones a sus subordinados. Ardes en deseos de vengar tantas vidas sesgadas a manos de unos cobardes invasores y vas corriendo a ofrecer tus servicios.<br><br>" + 
    
        					"Te plantas delante de �l y te mira sorprendido preguntando --�Qui�n eres?<br><br>" + 
        					"Contestas que eres un ex miembro de los ODST retirado hace cuatro a�os y que deseas volver a servir al ej�rcito.<br><br>" + 
      
        					"-	�Oh vaya! Un desertor    -exclama mientras sonr�e al o�r las risas de los dem�s.<br><br>" + 
        					"T� lo miras molesto, pero mantienes la boca cerrada respetando la cadena de mando.<br><br>" + 
        					"-	Est� bien novato, puedes unirte a nuestro escuadr�n, aunque no creo que aguantes en combate ni diez segundos� Coge un equipo en la armer�a y prep�rate, ma�ana a las 5:00 estate presente en la zona de despegue A117.<br><br>" + 

        					"Asientes y te diriges r�pido a la armer�a. Una vez recogido tu equipo, te pasas por la cantina para despejarte antes de ir a dormir.<html>");
        			jPanel1.add(jLabel1);
    				
        			 jButton23.setBounds(440, 407, 250, 73);
        			 jButton23.setFont(newFont1);
        			 jButton23.setText("continuar");
                     jPanel1.add(jButton23);
    				
    				
    				break;
    				
    				case "continuar13":
    				

    				jLabel1 = new javax.swing.JLabel();  			
    				
        			jPanel1.removeAll();
        			jPanel1.repaint();	
        			
        			vervida(vida1);
        			vida.setBounds(580, 5, 50, 20);
            		jPanel1.add(vida);
	
        			jLabel1.setBounds(25, 30, 600, 400);
        			jLabel1.setText("<html>Entras con la intenci�n de tomarte una cerveza para relajarte pero nada m�s abrir la puerta un bullicio enorme te sacude los o�dos a la vez que olor a comida te hace salivar. Sin pensarlo dos veces te sientas en uno de los pocos espacios libres que quedan y pides algo de comer y una cerveza. Junto a ti se sienta un hombre que reconoces por ser del escuadr�n al que te han asignado. Se llama Brad y te cuenta cosas muy interesantes sobre el enemigo.<br><br>" + 
        					"Se hacen llamar �El Covennant� y son un conjunto de razas alien�genas aliadas.<br><br>" + 
        					"Los grunt son a raza aparentemente mas d�bil y por la descripci�n sabes que son los que te encontraste en la empresa<br><br>" + 
        					"Luego tambi�n est�n los Brutes, seres de unos dos metros y medio, muy fuertes y m�s listos que los grunt.<br><br>" + 
        					"Del resto de las especies todav�a no se sabe nada, al igual del motivo de su hostilidad contra los humanos sin ning�n tipo de provocaci�n previo.<br><br>" + 
        					"<html>");
        			jPanel1.add(jLabel1);
    				
        			 jButton24.setBounds(440, 407, 250, 73);
        			 jButton24.setFont(newFont1);
        			 jButton24.setText("continuar");
                     jPanel1.add(jButton24);    				
    				
    				break;
    				
    				case "continuar14":
        				

        				jLabel1 = new javax.swing.JLabel();  			
        				
            			jPanel1.removeAll();
            			jPanel1.repaint();	
            			
            			vervida(vida1);
            			vida.setBounds(580, 5, 50, 20);
                		jPanel1.add(vida);
    	
            			jLabel1.setBounds(25, 30, 600, 400);
            			jLabel1.setText("<html>Todav�a est� oscuro cuando te equipas, compruebas las armas y te diriges al aer�dromo. Es una noche oscura tan s�lo iluminada por la Luna, ya que para evitar que el enemigo os detecte con alguna de sus naves, apenas est�n iluminadas algunas pistas de aterrizaje. Te encuentras con tu nuevo escuadr�n en la zona acordada, todos impacientes por llegar al campo de batalla.<br><br>" + 
            					"Pasa algo m�s de una hora hasta que por fin el general da la orden de embarcar y lanzase al ataque.<br><br>" + 
            					"A la se�al de una luz roja, los ODST suben a sus respectivas naves. Colocados en fila india, todos comienzan a subir por la rampa y al llegar ocupan sus c�psulas de salto. T� te metes en la �ltima c�psula y te atas los cinturones mientras comienza r�pidamente el ascenso.<br><br>" + 
            					"-No te mees encima desertor    - te dice un compa�ero en frente tuya mientras gui�a.<br><br>" + 
            					"T� le dedicas una sonrisa burlona y una peineta.<br><br>" + 
            					"Tu transporte empieza a vibrar intensamente a causa de explosiones que se suceden cerca de la nave, y esta en consecuencia acelera la velocidad. De repente las compuertas de las c�psulas se cierran y una luz verde inunda la bodega de la nave. Es la se�al de salto y la cuenta atr�s comienza. 8�7�6�5�4...<br><br>" + 
            					"<html>");
            			jPanel1.add(jLabel1);
        				
            			 jButton25.setBounds(440, 407, 250, 73);
            			 jButton25.setFont(newFont1);
            			 jButton25.setText("continuar");
                         jPanel1.add(jButton25);    				
        				
        				break;
        				
    				case "continuar15":	
    					
    					
    					jPanel1.removeAll();
            			jPanel1.repaint();	
            			
            			vervida(vida1);
            			vida.setBounds(580, 5, 50, 20);
                		jPanel1.add(vida);
            			
            			jButton26.setBounds(130, 42, 400, 400);
            	
    					jButton26.setFont(new Font("Tele-Marines", 0, 140));
    					jButton26.setText("3");
                        jPanel1.add(jButton26);    	
    					
    					break;
    					
    				case "continuar16":	
    					
    					
    					jPanel1.removeAll();
            			jPanel1.repaint();	
            			
            			vervida(vida1);
            			vida.setBounds(580, 5, 50, 20);
                		jPanel1.add(vida);
            			
            			jButton27.setBounds(130, 42, 400, 400);
            			jButton27.setFont(new Font("Tele-Marines", 0, 140));
            			jButton27.setText("2");
                        jPanel1.add(jButton27);    	
    					

    					break;
    				case "muertecap2":	
    					
    					jLabel1 = new javax.swing.JLabel();  			
        				jLabel2 = new javax.swing.JLabel();  	
        				
            			jPanel1.removeAll();
            			jPanel1.repaint();	
            			
            			vervida(vida1);
            			vida.setBounds(580, 5, 50, 20);
                		jPanel1.add(vida);

            			jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 50));
            			jLabel2.setBounds(25, 30, 600, 50);
            			jLabel2.setText("Capitulo 2");
            			jPanel1.add(jLabel2);
            			
           
            			jLabel1.setBounds(25, 180, 600, 200);
            			jLabel1.setText("<html>Sales de la tienda de campa�a com�n con la impresi�n de haber dormido tres d�as, y con los ojos medio cerrados observas lo que pasa a t� alrededor: veh�culos tanto ligeros como blindados movi�ndose en todas direcciones, civiles refugi�ndose del fr�o matutino en las grandes carpas instaladas por el ej�rcito, naves de desembarco de tropas aterrizando y despegando�<br><br>" +
            					"Caminas por el campamento cuando te fijas que casi todos los soldados se dirigen r�pido a una misma direcci�n y decides ver qu� pasa.<br><br>" + 
            					"Al llegar ves un a todos alrededor de un Scorpion (tanque pesado terrestre), y sobre su ca��n a un general que empieza a hablar�<br><br>" + 
            					"<html>");
            			jPanel1.add(jLabel1);
            			
            			 jButton21.setBounds(440, 407, 250, 73);
            			 jButton21.setFont(newFont1);
            			 jButton21.setText("continuar");
                         jPanel1.add(jButton21);
                         
    					break;
    				case "continuar17":	
	
    					
    					jPanel1.removeAll();
            			jPanel1.repaint();	
            			
            			vervida(vida1);
            			vida.setBounds(580, 5, 50, 20);
                		jPanel1.add(vida);
            			
    					jButton28.setBounds(130, 42, 400, 400);
    					jButton28.setFont(new Font("Tele-Marines", 0, 140));
    					jButton28.setText("1");
                        jPanel1.add(jButton28);    	
    					
    					break;
    					
    			
    					
    				case "continuar19":	
    					
    					video v = new video();
    					v.setVisible(true);
    					
    					jLabel1 = new javax.swing.JLabel();
    	    			jLabel2 = new javax.swing.JLabel();
    	    			jLabel13 = new javax.swing.JLabel();
    	    		
    	    			jLabel14 = new javax.swing.JLabel();
    	    		
    	    			jPanel1.removeAll();
    	    			jPanel1.repaint();	
    	    		
    	    			vervida(vida1);
    	    			vida.setBounds(580, 5, 50, 20);
    	        		jPanel1.add(vida);
    	    			
    	    			jLabel1.setBounds(5, 30, 600, 30);
    	    		    jLabel1.setText("<html>Recoges el casco a toda prisa y te levantas cubri�ndote en un mont�culo. Dos enormes Brutes se acercan corriendo a ti a punto de disparar:<html>");
    	    		    jPanel1.add(jLabel1);
    	    			
    	    		  
    	    		    jButton30.setBounds(30, 95, 200, 73);
    	    		    jButton30.setFont(newFont2);
    	    		    jButton30.setText("SUERTE");
    	    			jPanel1.add(jButton30);
    	        		
    	    			
    	    			jLabel13.setBounds(220, 85, 120, 80);
    	    			jLabel13.setFont(newFont4);
    	    			jLabel13.setText("------->");
    	    			jPanel1.add(jLabel13);
    	    			
    	    			
    	    			texf5.setBounds(320, 100, 60, 60);
    	    			texf5.setEditable(false);
    	    			jPanel1.add(texf5);
    	    			
    	    			
    	    			jLabel2.setBounds(5, 215, 600, 30);
    	    		    jLabel2.setText("<html>Abatidos, saltas el mont�culo mientras tus compa�eros avanzan y muchos caen.\r\n" + 
    	    		    		"Delante de ti hay 3 grunt y debes abatirles:\r\n" + 
    	    		    		"<html>");
    	    		    jPanel1.add(jLabel2);
    	    			
    	    			
    	    			jButton31.setEnabled(false);
    	    			jButton31.setBounds(25, 320, 200, 73);
    	    			jButton31.setFont(newFont2);
    	    			jButton31.setText("SUERTE");
    	      			jPanel1.add(jButton31);
    	          		
    	      			
    	      			jLabel14.setBounds(220, 320, 120, 80);
    	      			jLabel14.setFont(newFont4);
    	      			jLabel14.setText("------->");
    	      			jPanel1.add(jLabel14);
    	      			
    	      			
    	      			texf6.setBounds(320, 325, 60, 60);
    	      			texf6.setEditable(false);
    	      			jPanel1.add(texf6);
    	      			
    	      		  
    	      		  jButton32.setEnabled(false);
    	      		  jButton32.setBounds(507, 407, 175, 73);
    	              jButton32.setFont(newFont1);
    	              jButton32.setText("continuar");
    	              jPanel1.add(jButton32);
    	              reiniciarcap2(vida1);
    					
    					break;
    					
    				case "tirada5":
    					
    					
    	    			jButton30.setEnabled(false);
    	    			jButton31.setEnabled(true);
    	    			 rt= bd.buscarvida();
    	    			 

    	    			 try {
    	    				 
    	    				 	rt.next();
    	    				 	int vida2=0;
    	    				 	vida2= rt.getInt("vida");
    	    				 	Random r = new Random();
    	    	    			int dado = r.nextInt(8)+1;  // Entre 0 y 7, m�s 1.
    	    	    			String resultado= Integer.toString(dado);
    	    	    			texf5.setText(resultado);
    	    	    			texf5.setHorizontalAlignment(JTextField.CENTER); 
    	    	    			texf5.setFont(newFont5);
    	    	    			int vidaquitada=0;
    	    	    			
    	    	    			if(dado==1) {
    	    	    				
    	    	    				vidaquitada=15;  
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);	
    	    	 
    	    	    			}else if(dado==2) {
    	    	    			
    	    	    				vidaquitada=12;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==3) {
    	    	    			
    	    	    				vidaquitada=8;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==4) {
    	    	    			
    	    	    				vidaquitada=6;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==5) {
    	    	    			
    	    	    				vidaquitada=4;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==6) {
    	    	    			
    	    	    				vidaquitada=3;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==7) {
    	    	    			
    	    	    				vidaquitada=1;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==8) {
    	    	    			
    	    	    				vidaquitada=0;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}
    	    	    			   System.out.println("Modificado");
    	    			
    	    					} catch (SQLException e1) {
    	    							// TODO Auto-generated catch block
    	    						JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
    	    				
    	    					}
    	    			
    	    			jLabel1 = new javax.swing.JLabel();
     	    			jLabel2 = new javax.swing.JLabel();
     	    			jLabel13 = new javax.swing.JLabel();
     	    			jLabel14 = new javax.swing.JLabel();
     	    			
     	    			
     	    			jPanel1.removeAll();
     	    			jPanel1.repaint();	
     	    		
     	    			vervida(vida1);
     	    			vida.setBounds(580, 5, 50, 20);
     	        		jPanel1.add(vida);
     	    			
     	    			jLabel1.setBounds(5, 15, 600, 30);
     	    		    jLabel1.setText("<html>Recoges el casco a toda prisa y te levantas cubri�ndote en un mont�culo. Dos enormes Brutes se acercan corriendo a ti a punto de disparar:<html>");
     	    		    jPanel1.add(jLabel1);
     	    			
     	    		  
     	    		    jButton30.setBounds(25, 80, 200, 73);
     	    		    jButton30.setFont(newFont2);
     	    		    jButton30.setText("SUERTE");
     	    			jPanel1.add(jButton30);
     	        		
     	    			
     	    			jLabel13.setBounds(220, 70, 120, 80);
     	    			jLabel13.setFont(newFont4);
     	    			jLabel13.setText("------->");
     	    			jPanel1.add(jLabel13);
     	    			
     	    			
     	    			texf5.setBounds(320, 85, 60, 60);
     	    			texf5.setEditable(false);
     	    			jPanel1.add(texf5);
     	    			
     	    			
     	    			jLabel2.setBounds(5, 80, 600, 300);
     	    		    jLabel2.setText("<html>Abatidos, saltas el mont�culo mientras tus compa�eros avanzan y muchos caen.\r\n" + 
     	    		    		"Delante de ti hay 3 grunt y debes abatirles:\r\n" + 
     	    		    		"<html>");
     	    		    jPanel1.add(jLabel2);
     	    			
     	    			
     	    			
     	    			jButton31.setBounds(25, 325, 200, 73);
     	    			jButton31.setFont(newFont2);
     	    			jButton31.setText("SUERTE");
     	      			jPanel1.add(jButton31);
     	          		
     	      			
     	      			jLabel14.setBounds(220, 325, 120, 80);
     	      			jLabel14.setFont(newFont4);
     	      			jLabel14.setText("------->");
     	      			jPanel1.add(jLabel14);
     	      			
     	      			
     	      			texf6.setBounds(320, 330, 60, 60);
     	      			texf6.setEditable(false);
     	      			jPanel1.add(texf6);
     	      			
     	      			
     	      		  jButton32.setEnabled(false);
     	      		  jButton32.setBounds(507, 407, 175, 73);
     	              jButton32.setFont(newFont1);
     	              jButton32.setText("continuar");
     	              jPanel1.add(jButton32);
     					
     	             reiniciarcap2(vida1);
    					break;
    					
    				case "tirada6":
    					
    					jButton31.setEnabled(false);
    					jButton32.setEnabled(true);
    					 rt= bd.buscarvida();
    	    			 

    	    			 try {
    	    				 
    	    				 	rt.next();
    	    				 	int vida2=0;
    	    				 	vida2= rt.getInt("vida");
    	    				 	Random r = new Random();
    	    	    			int dado = r.nextInt(8)+1;  // Entre 0 y 7, m�s 1.
    	    	    			String resultado= Integer.toString(dado);
    	    	    			texf6.setText(resultado);
    	    	    			texf6.setHorizontalAlignment(JTextField.CENTER); 
    	    	    			texf6.setFont(newFont5);
    	    	    			int vidaquitada=0;
    	    	    			
    	    	    			if(dado==1) {
    	    	    				
    	    	    				vidaquitada=15;  
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);	
    	    	 
    	    	    			}else if(dado==2) {
    	    	    			
    	    	    				vidaquitada=12;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==3) {
    	    	    			
    	    	    				vidaquitada=8;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==4) {
    	    	    			
    	    	    				vidaquitada=6;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==5) {
    	    	    			
    	    	    				vidaquitada=4;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==6) {
    	    	    			
    	    	    				vidaquitada=3;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==7) {
    	    	    			
    	    	    				vidaquitada=1;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==8) {
    	    	    			
    	    	    				vidaquitada=0;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}
    	    	    			   System.out.println("Modificado");
    	    			
    	    					} catch (SQLException e1) {
    	    							// TODO Auto-generated catch block
    	    						JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
    	    				
    	    					}
    	    			 jLabel1 = new javax.swing.JLabel();
     	    			jLabel2 = new javax.swing.JLabel();
     	    			jLabel13 = new javax.swing.JLabel();
     	    			jLabel14 = new javax.swing.JLabel();
     	    		
     	    			
     	    			jPanel1.removeAll();
     	    			jPanel1.repaint();	
     	    		
     	    			vervida(vida1);
     	    			vida.setBounds(580, 5, 50, 20);
     	        		jPanel1.add(vida);
     	    			
     	    			jLabel1.setBounds(5, 15, 600, 30);
     	    		    jLabel1.setText("<html>Recoges el casco a toda prisa y te levantas cubri�ndote en un mont�culo. Dos enormes Brutes se acercan corriendo a ti a punto de disparar:<html>");
     	    		    jPanel1.add(jLabel1);
     	    			
     	    		  
     	    		    jButton30.setBounds(25, 80, 200, 73);
     	    		    jButton30.setFont(newFont2);
     	    		    jButton30.setText("SUERTE");
     	    			jPanel1.add(jButton30);
     	        		
     	    			
     	    			jLabel13.setBounds(220, 70, 120, 80);
     	    			jLabel13.setFont(newFont4);
     	    			jLabel13.setText("------->");
     	    			jPanel1.add(jLabel13);
     	    			
     	    			
     	    			texf5.setBounds(320, 85, 60, 60);
     	    			texf5.setEditable(false);
     	    			jPanel1.add(texf5);
     	    			
     	    			
     	    			jLabel2.setBounds(5, 80, 600, 300);
     	    		    jLabel2.setText("<html>Abatidos, saltas el mont�culo mientras tus compa�eros avanzan y muchos caen.\r\n" + 
     	    		    		"Delante de ti hay 3 grunt y debes abatirles:\r\n" + 
     	    		    		"<html>");
     	    		    jPanel1.add(jLabel2);
     	    			
     	    			
     	    			jButton31.setEnabled(false);
     	    			jButton31.setBounds(25, 325, 200, 73);
     	    			jButton31.setFont(newFont2);
     	    			jButton31.setText("SUERTE");
     	      			jPanel1.add(jButton31);
     	          		
     	      			
     	      			jLabel14.setBounds(220, 325, 120, 80);
     	      			jLabel14.setFont(newFont4);
     	      			jLabel14.setText("------->");
     	      			jPanel1.add(jLabel14);
     	      			
     	      			
     	      			texf6.setBounds(320, 330, 60, 60);
     	      			texf6.setEditable(false);
     	      			jPanel1.add(texf6);
     	      			
     	      		  
     	      		  jButton32.setBounds(507, 407, 175, 73);
     	              jButton32.setFont(newFont1);
     	              jButton32.setText("continuar");
     	              jPanel1.add(jButton32);
     	              reiniciarcap2(vida1);
     	              
    					break;
    					
    				case "continuar20": //20
    					
    					jLabel1 = new javax.swing.JLabel();
    					jLabel2 = new javax.swing.JLabel();
    					
    					jPanel1.removeAll();
    	    			jPanel1.repaint();	
    	    			
    	    			vervida(vida1);
    	    			vida.setBounds(580, 5, 50, 20);
    	        		jPanel1.add(vida);
    	    		
    	    			jLabel1.setBounds(5, 15, 600, 300);
    	    		    jLabel1.setText("<html>Cinco m�s llegan, pero te tiras al suelo y lanzas una granada. A los segundos te cae una lluvia de sangre morada, la se�al de continuar. Una nave como las del d�a en la autopista se planta a unos cien metros de ti a unos diez metros de altura y saltan unos 20 enemigos de toda clase. Te das pr�cticamente por muerto cuando dos cazas de las fuerzas a�reas lanzan una andanada de misiles contra la nave y esta cae y explota sobre los reci�n desembarcados.<br><br><br>" + 
    	    		    		"Tras varias horas de batalla acab�is tomando la playa.<br><br><br>" + 
    	    		    		"Con una gran dosis de suerte y destreza sobreviv�s unos pocos. En el suelo, una multitud de cad�veres de todas las razas yacen en el suelo calcinado por el fuego y el plasma. Recogiendo munici�n de compa�eros ca�dos encuentras a un spartan abatido con un tiro de plasma en el cuello. Sin dudarlo un segundo, pero con muestras de respeto, te deshaces de tu uniforme y te ajustas la armadura Spartan. \r\n" + 
    	    		    		"<html>");
    	    		    jPanel1.add(jLabel1);
    	    		    
    	    			
            			jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 30));
            			jLabel2.setBounds(25, 250, 600, 200);
            			jLabel2.setText("<html>Capitulo 2 terminado<html>");
            			jPanel1.add(jLabel2);
    	    		    
    	    		  
      	      		  jButton33.setBounds(440, 407, 250, 73);
      	              jButton33.setFont(newFont1);
      	              jButton33.setText("Siguiente Capitulo");
      	              jPanel1.add(jButton33);
    					break;
    					   		
    				case "continuar21":
    					jLabel1 = new javax.swing.JLabel();
    					
    					jPanel1.removeAll();
    	    			jPanel1.repaint();	
    	    			bd.tiradas();
    	    			vervida(vida1);
    					
    					jLabel1.setBounds(210, 100, 600, 300);
    		    		jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 50));
    		    		jLabel1.setText("Capitulo 3");
    		            jPanel1.add(jLabel1);
    		        
    		            
    		              jButton34.setBounds(440, 407, 250, 73);
    		              jButton34.setFont(newFont1);
        	              jButton34.setText("continuar");
        	              jPanel1.add(jButton34);
    					
    					break;
    					
    				case "continuar22":
    					
    					jLabel1 = new javax.swing.JLabel();
    					
    					jPanel1.removeAll();
    	    			jPanel1.repaint();	
    	    			
    	    			vervida(vida1);
    					
    					jLabel1.setBounds(5, 60, 600, 300);   		   
    		    		jLabel1.setText("<html>Esta armadura azul Spartan es una maravilla de la ingenier�a y de la ciencia, ya que al pon�rtela lo �nico que notas son unos pinchazos a lo largo de la columna vertebral para conectarse a tu red neuronal y lo que consigues es un cuerpo mejorado, fuerza y resistencia aumentados, punter�a, aguante a heridas, curaci�n r�pida�<br><br>" + 
    		    				"Los pocos ODST supervivientes se re�nen en tu posici�n viendo en tu armadura un posible l�der que les ordene que hacer ahora. Son unos 30 y arden en deseos de vengar a sus muchos compa�eros ca�dos.<br><br>" + 
    		    				"Echados en el suelo descansando y comiendo algo sintoniz�is las radios esperando noticias de la batalla por destruir la gran nave. Por fin escuch�is una voz que describe una situaci�n agridulce: Los valientes de la UNSC se han abierto paso a trav�s de las filas enemigas, no sin sufrir un cuantioso n�mero de bajas. Aun as� el plan sigue adelante y el Warthog encargado de llevar la bomba encargada de destruir la nave est� en camino por una carretera cerca de vuestra posici�n. Sin decir nada os mir�is e inmediatamente os levant�is todos y corr�is hacia la carretera para uniros al convoy.<br><br><html>");
    		            jPanel1.add(jLabel1);
    		        
    		            
    		              jButton35.setBounds(440, 407, 250, 73);
    		              jButton35.setFont(newFont1);
        	              jButton35.setText("Continuar");
        	              jPanel1.add(jButton35);
        	              
        	              
    					
    					break;
    					
    				case "continuar23":
    					
    					jLabel1 = new javax.swing.JLabel();
    					
    					jPanel1.removeAll();
    	    			jPanel1.repaint();	
    	    			
    	    			vervida(vida1);
    					
    					jLabel1.setBounds(15, 35, 600, 250);
    		    		jLabel1.setText("<html>Avanz�is un par de kil�metros a buen ritmo y tras una colina escuch�is movimiento y dada la zona hostil en la que os encontr�is, supon�is que es el Covenant, con lo cual avanz�is con precauci�n.<br><br>" + 
    		    				"Efectivamente, al asomaros por la cresta de la colina, divis�is una barricada de forma circular en cuyo centro se haya el tramo de carretera que tiene que atravesar el convoy. Unos 80 invasores de muchas especies se concentran en su interior. Form�is un c�rculo para debatir vuestra actuaci�n y se aportan distintas ideas de acci�n. De todas ellas, cuatro son las m�s habladas, pero t� tienes decides que hacer...<br><br>"
    		    				+"1-	Atacar de frente por sorpresa.<br><br>" + 
    		    				"2-	Seleccionar objetivos para los primeros disparos de manera simult�nea.<br><br>" + 
    		    				"3-	Evitar el bloqueo y dirigirse hacia el campo de batalla.<br><br>" + 
    		    				"4-	Esperar a que llegue el convoy y empiece el intercambio de disparos para actuar.<br><br>" + 
    		    				"<html>");
    		            jPanel1.add(jLabel1);
    		            
    		              jButton36.setBounds(8, 317, 240, 73);
    		              jButton36.setFont(newFont6);
        	              jButton36.setText("Atacar de frente por sorpresa");
        	              jPanel1.add(jButton36);
        	              
        	              jButton37.setBounds(330, 317, 350, 73);
        	              jButton37.setFont(newFont6);
        	              jButton37.setText("Seleccionar objetivos para los primeros disparos de manera simult�nea.");
        	              jPanel1.add(jButton37);
        	              
        	              jButton38.setBounds(330, 407, 250, 73);
        	              jButton38.setFont(newFont6);
        	              jButton38.setText("Evitar el bloqueo y dirigirse hacia el campo de batalla.");
        	              jPanel1.add(jButton38);
        	              
        	              jButton39.setBounds(8, 407, 250, 73);
        	              jButton39.setFont(newFont6);
        	              jButton39.setText("Esperar a que llegue el convoy y empiece el intercambio de disparos para actuar.");
        	              jPanel1.add(jButton39);
    					
    					break;
    				case "decision1":
    					
    						jLabel1 = new javax.swing.JLabel();
    		     			jLabel2 = new javax.swing.JLabel();
    		     			jLabel13 = new javax.swing.JLabel();
    		     			
    		     			jPanel1.removeAll();
        	    			jPanel1.repaint();	
        	    			
        	    			vervida(vida1);
    		     	
    		     			jPanel1.removeAll();
    		     			jPanel1.repaint();	
    		     		
    		     			vervida(vida1);
    		     			vida.setBounds(580, 5, 50, 20);
    		         		jPanel1.add(vida);
    		     			
    		     			jLabel1.setBounds(5, 5, 600, 150);
    		     		    jLabel1.setText("<html>Te lanzas colina abajo y tus hombres te siguen gritando como locos y disparando mientas corren hacia la barricada para al menos cubrirse con ella. La mayor�a caen antes de llegar a ella. A ti es al que m�s han disparado por verte como su l�der� (al ir de cara, la tirada ser� muy dif�cil)<html>");
    		     		    jPanel1.add(jLabel1);
    		     			
    		     		  
    		     		    jButton40.setBounds(25, 137, 200, 73);
    		     		    jButton40.setFont(newFont2);
    		     		    jButton40.setText("SUERTE");
    		     			jPanel1.add(jButton40);
    		         		
    		     			
    		     			jLabel13.setBounds(220, 137, 120, 80);
    		     			jLabel13.setFont(newFont4);
    		     			jLabel13.setText("------->");
    		     			jPanel1.add(jLabel13);
    		     			
    		     			
    		     			texf7.setBounds(320, 142, 60, 60);
    		     			texf7.setEditable(false);
    		     			jPanel1.add(texf7);
    		     			
    		     			jLabel2.setBounds(5, 250, 600, 100);
    		     		    jLabel2.setText("<html>Tras unos minutos de intenso tiroteo, hab�is abatido a unos 20 cuando llega el convoy y, tras unas cuantas muertes sufridas tambi�n de estos, despej�is la zona.<html>");
    		     		    jPanel1.add(jLabel2);
    		     			
    		     		   reiniciarcap3(vida1); 
    					
    					break;
    				case "tirada7":
    					
    	    			rt= bd.buscarvida();
    	    			 try {
    	    				 
    	    				 	rt.next();
    	    				 	int vida2=0;
    	    				 	vida2= rt.getInt("vida");
    	    				 	Random r = new Random();
    	    	    			int dado = r.nextInt(8)+1;  // Entre 0 y 7, m�s 1.
    	    	    			String resultado= Integer.toString(dado);
    	    	    			texf7.setText(resultado);
    	    	    			texf7.setHorizontalAlignment(JTextField.CENTER); 
    	    	    			texf7.setFont(newFont5);
    	    	    			int vidaquitada=0;
    	    	    			
    	    	    			if(dado==1) {
    	    	    				
    	    	    				vidaquitada=30;  
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);	
    	    	 
    	    	    			}else if(dado==2) {
    	    	    			
    	    	    				vidaquitada=25;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==3) {
    	    	    			
    	    	    				vidaquitada=18;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==4) {
    	    	    			
    	    	    				vidaquitada=14;  
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==5) {
    	    	    			
    	    	    				vidaquitada=10;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==6) {
    	    	    			
    	    	    				vidaquitada=8;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==7) {
    	    	    			
    	    	    				vidaquitada=5;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==8) {
    	    	    			
    	    	    				vidaquitada=3;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}
    	    	    			   System.out.println("Modificado");
    	    			
    	    					} catch (SQLException e1) {
    	    							// TODO Auto-generated catch block
    	    						JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
    	    				
    	    					}
    	    			 
    	    				jLabel1 = new javax.swing.JLabel();
    		     			jLabel2 = new javax.swing.JLabel();
    		     			jLabel13 = new javax.swing.JLabel();
    		     			
    		     			jPanel1.removeAll();
        	    			jPanel1.repaint();	
        	    			
        	    			vervida(vida1);
    		     	
    		     			jPanel1.removeAll();
    		     			jPanel1.repaint();	
    		     		
    		     			vervida(vida1);
    		     			vida.setBounds(580, 5, 50, 20);
    		         		jPanel1.add(vida);
    		     			
    		     			jLabel1.setBounds(5, 5, 600, 150);
    		     		    jLabel1.setText("<html>Te lanzas colina abajo y tus hombres te siguen gritando como locos y disparando mientas corren hacia la barricada para al menos cubrirse con ella. La mayor�a caen antes de llegar a ella. A ti es al que m�s han disparado por verte como su l�der� (al ir de cara, la tirada ser� muy dif�cil)<html>");
    		     		    jPanel1.add(jLabel1);
    		     			
    		     		  
    		     		    jButton40.setBounds(25, 137, 200, 73);
    		     		    jButton40.setFont(newFont2);
    		     		    jButton40.setText("SUERTE");
    		     			jPanel1.add(jButton40);
    		         		
    		     			
    		     			jLabel13.setBounds(220, 137, 120, 80);
    		     			jLabel13.setFont(newFont4);
    		     			jLabel13.setText("------->");
    		     			jPanel1.add(jLabel13);
    		     			
    		     			
    		     			texf7.setBounds(320, 142, 60, 60);
    		     			texf7.setEditable(false);
    		     			jPanel1.add(texf7);
    		     			
    		     			jLabel2.setBounds(5, 250, 600, 100);
    		     		    jLabel2.setText("<html>Tras unos minutos de intenso tiroteo, hab�is abatido a unos 20 cuando llega el convoy y, tras unas cuantas muertes sufridas tambi�n de estos, despej�is la zona.<html>");
    		     		    jPanel1.add(jLabel2);
    		     			

      		              jButton41.setBounds(440, 407, 250, 73);
      		              jButton41.setFont(newFont1);
      		              jButton41.setText("Continuar");
          	              jPanel1.add(jButton41);
          	              
          	            reiniciarcap3(vida1); 
    					
    					break;
    					
    				case "decision2":
    					
    					jLabel1 = new javax.swing.JLabel();
		     			jLabel2 = new javax.swing.JLabel();
		     			jLabel13 = new javax.swing.JLabel();
		     			
		     			jPanel1.removeAll();
    	    			jPanel1.repaint();	
    	    			
    	    			vervida(vida1);
		     	
		     			jPanel1.removeAll();
		     			jPanel1.repaint();	
		     		
		     			vervida(vida1);
		     			vida.setBounds(580, 5, 50, 20);
		         		jPanel1.add(vida);
		     			
		     			jLabel1.setBounds(5, 5, 600, 150);
		     		    jLabel1.setText("<html>Baj�is sigilosamente la colina y os posicion�is tras rocas, troncos de �rbol y cualquier cobertura disponible. Por radio, acord�is uno a uno a quien o a quienes abatir�is cada uno con la primera r�faga. Tras 10 minutos de asignaci�n de objetivos abr�s fuego.<br><br>" + 
		     		    		"Pill�is por sorpresa a vuestros invasores que con la primera andanada de disparos caen m�s de la mitad. El resto lanza un brutal contrataque con granadas y armas posicionadas de plasma y caen casi la mitad de tus hombres.<html>");
		     		    jPanel1.add(jLabel1);
		     			
		     		  
		     		    jButton42.setBounds(25, 160, 200, 73);
		     		    jButton42.setFont(newFont2);
		     		    jButton42.setText("SUERTE");
		     			jPanel1.add(jButton42);
		         		
		     			
		     			jLabel13.setBounds(220, 160, 120, 80);
		     			jLabel13.setFont(newFont4);
		     			jLabel13.setText("------->");
		     			jPanel1.add(jLabel13);
		     			
		     			
		     			texf8.setBounds(320, 165, 60, 60);
		     			texf8.setEditable(false);
		     			jPanel1.add(texf8);
		     			
		     			jLabel2.setBounds(5, 250, 600, 100);
		     		    jLabel2.setText("<html>Tras unos minutos de intenso tiroteo, hab�is abatido a unos 20 cuando llega el convoy y, tras unas cuantas muertes sufridas tambi�n de estos, despej�is la zona.<html>");
		     		    jPanel1.add(jLabel2);
		     		   reiniciarcap3(vida1); 
    					
    					break;
    				case "tirada8":
    					
    	    			rt= bd.buscarvida();
    	    			 try {
    	    				 
    	    				 	rt.next();
    	    				 	int vida2=0;
    	    				 	vida2= rt.getInt("vida");
    	    				 	Random r = new Random();
    	    	    			int dado = r.nextInt(8)+1;  // Entre 0 y 7, m�s 1.
    	    	    			String resultado= Integer.toString(dado);
    	    	    			texf8.setText(resultado);
    	    	    			texf8.setHorizontalAlignment(JTextField.CENTER); 
    	    	    			texf8.setFont(newFont5);
    	    	    			int vidaquitada=0;
    	    	    			
    	    	    			if(dado==1) {
    	    	    				
    	    	    				vidaquitada=15;  
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);	
    	    	 
    	    	    			}else if(dado==2) {
    	    	    			
    	    	    				vidaquitada=12;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==3) {
    	    	    			
    	    	    				vidaquitada=8;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==4) {
    	    	    			
    	    	    				vidaquitada=6;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==5) {
    	    	    			
    	    	    				vidaquitada=4;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==6) {
    	    	    			
    	    	    				vidaquitada=3;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==7) {
    	    	    			
    	    	    				vidaquitada=1;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}else if(dado==8) {
    	    	    			
    	    	    				vidaquitada=0;   
    	    	    				int vidatotal= vida2 - vidaquitada;
    	    	    				
    	    	    				bd.tiradas(vidatotal);
    	    	    				
    	    	    			}
    	    	    			   System.out.println("Modificado");
    	    			
    	    					} catch (SQLException e1) {
    	    							// TODO Auto-generated catch block
    	    						JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
    	    				
    	    					}
    	    			 
    	    			 
    	    				jLabel1 = new javax.swing.JLabel();
    		     			jLabel2 = new javax.swing.JLabel();
    		     			jLabel13 = new javax.swing.JLabel();
    		     			
    		     			jPanel1.removeAll();
        	    			jPanel1.repaint();	
        	    			
        	    			vervida(vida1);
    		    
    		     			vida.setBounds(580, 5, 50, 20);
    		         		jPanel1.add(vida);
    		     			
    		     			jLabel1.setBounds(5, 5, 600, 150);
    		     		    jLabel1.setText("<html>Baj�is sigilosamente la colina y os posicion�is tras rocas, troncos de �rbol y cualquier cobertura disponible. Por radio, acord�is uno a uno a quien o a quienes abatir�is cada uno con la primera r�faga. Tras 10 minutos de asignaci�n de objetivos abr�s fuego.<br><br>" + 
    		     		    		"Pill�is por sorpresa a vuestros invasores que con la primera andanada de disparos caen m�s de la mitad. El resto lanza un brutal contrataque con granadas y armas posicionadas de plasma y caen casi la mitad de tus hombres.<html>");
    		     		    jPanel1.add(jLabel1);
    		     			
    		     		  
    		     		    jButton40.setBounds(25, 160, 200, 73);
    		     		    jButton40.setFont(newFont2);
    		     		    jButton40.setText("SUERTE");
    		     			jPanel1.add(jButton40);
    		         		
    		     			
    		     			jLabel13.setBounds(220, 160, 120, 80);
    		     			jLabel13.setFont(newFont4);
    		     			jLabel13.setText("------->");
    		     			jPanel1.add(jLabel13);
    		     			
    		     			
    		     			texf8.setBounds(320, 165, 60, 60);
    		     			texf8.setEditable(false);
    		     			jPanel1.add(texf8);
    		     			
    		     			jLabel2.setBounds(5, 250, 600, 100);
    		     		    jLabel2.setText("<html>Tras unos minutos de intenso tiroteo, hab�is abatido a unos 20 cuando llega el convoy y, tras unas cuantas muertes sufridas tambi�n de estos, despej�is la zona.<html>");
    		     		    jPanel1.add(jLabel2);
    	    			 
    		     		 
    		     		  jButton41.setBounds(440, 407, 250, 73);
       		              jButton41.setFont(newFont1);
       		              jButton41.setText("Continuar");
           	              jPanel1.add(jButton41);
           	           reiniciarcap3(vida1); 
           	       	
      					break;
      					
      				case "decision3":
      					
      					
      					jLabel8 = new javax.swing.JLabel();
      	        		jLabel9 = new javax.swing.JLabel();
      	        
      	        		
      	        		
      	        			jPanel1.removeAll();
      	        			jPanel1.repaint();	
      	        			
      	        			vida.setText("Vida: 0");
      	        			vida.setBounds(580, 5, 50, 20);
      	            		jPanel1.add(vida);
      	        			
      	        			jLabel8.setBounds(25, 1, 550, 200);
      	        			jLabel8.setText("<html><br>Rode�is el bloqueo tras unas horas atravesando un espeso bosque y lleg�is al lugar donde est� habiendo una cruenta batalla. Ocup�is posiciones y cuando est�is apunto de avanzar escuch�is una inmensa explosi�n a vuestras espaldas. Es la bomba que transportaba el convoy. No hay tiempo de traer m�s. Los invasores logran alcanzar la victoria con la ayuda de las armas de artiller�a pesada de la nave.<html>");
      	        			jPanel1.add(jLabel8);
      	        			
      	        			jLabel9.setBounds(200, 65, 600, 350);
      	        		    jLabel9.setFont(new java.awt.Font("Kristen ITC", 0, 50)); 
      	        	        jLabel9.setText("Has muerto");
      	        	        jPanel1.add(jLabel9);
      	        	        
      	        	       
      	        	      jButton43.setBounds(1, 407, 280, 73);
      	        	      jButton43.setFont(newFont3);
      	        	      jButton43.setText("Reiniciar Capitulo");
      	        	      jPanel1.add(jButton43);
      	                    
      	                    
      	              
      	                    jButton6.setBounds(479, 407, 200, 73);
      	                    jButton6.setFont(newFont3);
      	                    jButton6.setText("Salir");
      	                    
      	                    jPanel1.add(jButton6);
      					
      	                  reiniciarcap3(vida1); 
      					break;
      					          					
      				case "decision4":
		
      					jLabel1 = new javax.swing.JLabel();		     			
		     			jLabel13 = new javax.swing.JLabel();
		     			
		     			jPanel1.removeAll();
    	    			jPanel1.repaint();	
    	    			
    	    			vervida(vida1);
		    
		     			vida.setBounds(580, 5, 50, 20);
		         		jPanel1.add(vida);
		     			
		         		
		     			jLabel1.setBounds(5, 35, 600, 150);
		     		    jLabel1.setText("<html>Tom�is posiciones sigilosamente parapetados tras rocas y troncos. Esper�is pacientemente cuando finalmente lega el convoy. Vuestros compa�eros de la UNSC atacan valientemente y cuando todos los invasores se fijan en ellos, corr�is hacia la barricada y empez�is a disparar. Por orden tuya, abat�s primero a los que est�n en posiciones elevadas con armas autom�ticas de posici�n y proyectiles, una vez hecho, salt�is la barricada y avanz�is de manera fulminante hacia el enemigo. Con la zona ya despejada hac�is recuento de ca�dos. Tira suerte para ver cuanta vida has perdido (teniendo en cuenta el factor sorpresa se reducir� el da�o recibido).<html>");
		     		    jPanel1.add(jLabel1);
		     			
		     	
		     		    jButton44.setBounds(25, 260, 200, 73);
		     		    jButton44.setFont(newFont2);
		     		    jButton44.setText("SUERTE");
		     			jPanel1.add(jButton44);
		         		
		     			
		     			jLabel13.setBounds(220, 260, 120, 80);
		     			jLabel13.setFont(newFont4);
		     			jLabel13.setText("------->");
		     			jPanel1.add(jLabel13);
		     			
		     			
		     			texf9.setBounds(320, 265, 60, 60);
		     			texf9.setEditable(false);
		     			jPanel1.add(texf9);
		     			reiniciarcap3(vida1); 
		
      					break;
      					
      				case "tirada9":
      					
      					rt= bd.buscarvida();
   	    			 try {
   	    				 
   	    				 	rt.next();
   	    				 	int vida2=0;
   	    				 	vida2= rt.getInt("vida");
   	    				 	Random r = new Random();
   	    	    			int dado = r.nextInt(8)+1;  // Entre 0 y 7, m�s 1.
   	    	    			String resultado= Integer.toString(dado);
   	    	    			texf9.setText(resultado);
   	    	    			texf9.setHorizontalAlignment(JTextField.CENTER); 
   	    	    			texf9.setFont(newFont5);
   	    	    			int vidaquitada=0;
   	    	    			
   	    	    			if(dado==1) {
   	    	    				
   	    	    				vidaquitada=12;  
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);	
   	    	 
   	    	    			}else if(dado==2) {
   	    	    			
   	    	    				vidaquitada=10;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==3) {
   	    	    			
   	    	    				vidaquitada=8;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==4) {
   	    	    			
   	    	    				vidaquitada=6;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==5) {
   	    	    			
   	    	    				vidaquitada=4;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==6) {
   	    	    			
   	    	    				vidaquitada=3;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==7) {
   	    	    			
   	    	    				vidaquitada=1;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==8) {
   	    	    			
   	    	    				vidaquitada=0;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}
   	    	    			   System.out.println("Modificado");
   	    			
   	    					} catch (SQLException e1) {
   	    							// TODO Auto-generated catch block
   	    						JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
   	    				
   	    					}
   	    			 
   	    			jLabel1 = new javax.swing.JLabel();
	     			jLabel2 = new javax.swing.JLabel();
	     			jLabel13 = new javax.swing.JLabel();
	     			
	     			jPanel1.removeAll();
	    			jPanel1.repaint();	
	    			
	    			vervida(vida1);
	    
	     			vida.setBounds(580, 5, 50, 20);
	         		jPanel1.add(vida);
	     			
	         		
	     			jLabel1.setBounds(5, 35, 600, 150);
	     		    jLabel1.setText("<html>Tom�is posiciones sigilosamente parapetados tras rocas y troncos. Esper�is pacientemente cuando finalmente lega el convoy. Vuestros compa�eros de la UNSC atacan valientemente y cuando todos los invasores se fijan en ellos, corr�is hacia la barricada y empez�is a disparar. Por orden tuya, abat�s primero a los que est�n en posiciones elevadas con armas autom�ticas de posici�n y proyectiles, una vez hecho, salt�is la barricada y avanz�is de manera fulminante hacia el enemigo. Con la zona ya despejada hac�is recuento de ca�dos. Tira suerte para ver cuanta vida has perdido (teniendo en cuenta el factor sorpresa se reducir� el da�o recibido).<html>");
	     		    jPanel1.add(jLabel1);
	     			
	     		    
	     		    jButton44.setEnabled(false);
	     		    jButton44.setBounds(25, 260, 200, 73);
	     		    jButton44.setFont(newFont2);
	     		    jButton44.setText("SUERTE");
	     			jPanel1.add(jButton44);
	         		
	     			
	     			jLabel13.setBounds(220, 260, 120, 80);
	     			jLabel13.setFont(newFont4);
	     			jLabel13.setText("------->");
	     			jPanel1.add(jLabel13);
	     			
	     			
	     			texf9.setBounds(320, 265, 60, 60);
	     			texf9.setEditable(false);
	     			jPanel1.add(texf9);
   	    			 

		     		  jButton41.setBounds(440, 407, 250, 73);
  		              jButton41.setFont(newFont1);
  		              jButton41.setText("Continuar");
      	              jPanel1.add(jButton41);
      	            reiniciarcap3(vida1); 
      					break;
		
      					
      				case "continuar24":
      					
      					jLabel1 = new javax.swing.JLabel();		     			
		     			jLabel13 = new javax.swing.JLabel();
		     			jLabel2 = new javax.swing.JLabel();
		    			jLabel3 = new javax.swing.JLabel();
		    			
		     			jPanel1.removeAll();
    	    			jPanel1.repaint();	
    	    			
    	    			vervida(vida1);
		    
		     			vida.setBounds(580, 5, 50, 20);
		         		jPanel1.add(vida);
		     			
		         		
		     			jLabel1.setBounds(5, 5, 600, 35);
		     		    jLabel1.setText("<html>Un Warthog se adelanta al resto y te gritan que subas a toda prisa.<br>" + 
		     		    		"Sin esperar a tus compa�eros saltas a la parte de atr�s coche y sigue la carretera a gran velocidad.<html>");
		     		    jPanel1.add(jLabel1);
		     			
		     		    
		     		    javax.swing.ImageIcon Imagen1 = new javax.swing.ImageIcon("C:\\Users\\javie\\Desktop\\a1.png"); 
		    		    javax.swing.JLabel Img1 = new javax.swing.JLabel(Imagen1); 
		    		    Img1.setSize(400, 225); //hacer tama�o
		    		    jLabel2.setBounds(5, 67, 400, 225);
		    		    jLabel2.add(Img1); 
		    		    jPanel1.add(jLabel2);
		    		    		    		   
		     			
		     			jLabel3.setBounds(5, 325, 600, 65);
		     		    jLabel3.setText("<html>No hay tiempo!!!    - exclama el copiloto    - nuestras fuerzas est�n sufriendo muchas bajas y seg�n los esc�neres t�rmicos la nave est� acumulando energ�a en su ca��n principal. Con tal cantidad de energ�a podr�a volar una ciudad entera. Necesitamos que cojas la bomba y te subas a esa nave de inmediato.<html>");
		     		    jPanel1.add(jLabel3);
    	    			
		     		    
		     		      jButton46.setBounds(440, 407, 250, 73);
	  		              jButton46.setFont(newFont1);
	  		              jButton46.setText("Continuar");
	      	              jPanel1.add(jButton46);
	      	            reiniciarcap3(vida1); 
      					break;
      					
      					
      				case "tirada10":
      					
      					rt= bd.buscarvida();
   	    			 try {
   	    				 
   	    				 	rt.next();
   	    				 	int vida2=0;
   	    				 	vida2= rt.getInt("vida");
   	    				 	Random r = new Random();
   	    	    			int dado = r.nextInt(8)+1;  // Entre 0 y 7, m�s 1.
   	    	    			String resultado= Integer.toString(dado);
   	    	    			texf10.setText(resultado);
   	    	    			texf10.setHorizontalAlignment(JTextField.CENTER); 
   	    	    			texf10.setFont(newFont5);
   	    	    			int vidaquitada=0;
   	    	    			
   	    	    			if(dado==1) {
   	    	    				
   	    	    				vidaquitada=15;  
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);	
   	    	 
   	    	    			}else if(dado==2) {
   	    	    			
   	    	    				vidaquitada=12;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==3) {
   	    	    			
   	    	    				vidaquitada=8;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==4) {
   	    	    			
   	    	    				vidaquitada=6;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==5) {
   	    	    			
   	    	    				vidaquitada=4;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==6) {
   	    	    			
   	    	    				vidaquitada=3;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==7) {
   	    	    			
   	    	    				vidaquitada=1;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}else if(dado==8) {
   	    	    			
   	    	    				vidaquitada=0;   
   	    	    				int vidatotal= vida2 - vidaquitada;
   	    	    				
   	    	    				bd.tiradas(vidatotal);
   	    	    				
   	    	    			}
   	    	    			   System.out.println("Modificado");
   	    			
   	    					} catch (SQLException e1) {
   	    							// TODO Auto-generated catch block
   	    						JOptionPane.showMessageDialog(null, "Busqueda incorrecta");
   	    				
   	    					}
   	    			jLabel1 = new javax.swing.JLabel();
  					jLabel2 = new javax.swing.JLabel();	
  					
  					jPanel1.removeAll();
	    			jPanel1.repaint();	
	    			
	    			vervida(vida1);
	    
	     			vida.setBounds(580, 5, 50, 20);
	         		jPanel1.add(vida);
  					
  					
  					jLabel1.setBounds(5, 25, 600, 50);
	     		    jLabel1.setText("<html>Te das cuenta de que creen que eres el anterior due�o de la armadura y que conoces los planes, pero no hay tiempo de explicaciones. Est�is atravesando el campo de batalla cuando una explosi�n lanza el veh�culo hacia adelante<html>");
	     		    jPanel1.add(jLabel1);
  					
  					
  					jButton45.setBounds(25, 158, 200, 73);
 	     		    jButton45.setFont(newFont2);
 	     		    jButton45.setText("SUERTE");
 	     			jPanel1.add(jButton45);
 	         		
 	     			
 	     			jLabel13.setBounds(220, 158, 120, 80);
 	     			jLabel13.setFont(newFont4);
 	     			jLabel13.setText("------->");
 	     			jPanel1.add(jLabel13);
 	     			
 	     			
 	     			texf10.setBounds(320, 163, 60, 60);
 	     			texf10.setEditable(false);
 	     			jPanel1.add(texf10);
 	     			
 	     			jLabel2.setBounds(5, 260, 600, 35);
	     		    jLabel2.setText("<html>Te levantas, coges la bomba y echas a correr�<html>");
	     		    jPanel1.add(jLabel2);
	     		    
	     		      jButton47.setBounds(440, 407, 250, 73);
		              jButton47.setFont(newFont1);
		              jButton47.setText("Continuar");
		              jPanel1.add(jButton47);
		              reiniciarcap3(vida1); 
	     			
	         		
      					break;
      					
      				case "continuar25":
      					
      					jLabel1 = new javax.swing.JLabel();
      					jLabel2 = new javax.swing.JLabel();	
      					
      					jPanel1.removeAll();
    	    			jPanel1.repaint();	
    	    			
    	    			vervida(vida1);
    	    
    	     			vida.setBounds(580, 5, 50, 20);
    	         		jPanel1.add(vida);
      					
      					
      					jLabel1.setBounds(5, 25, 600, 50);
		     		    jLabel1.setText("<html>Te das cuenta de que creen que eres el anterior due�o de la armadura y que conoces los planes, pero no hay tiempo de explicaciones. Est�is atravesando el campo de batalla cuando una explosi�n lanza el veh�culo hacia adelante<html>");
		     		    jPanel1.add(jLabel1);
      					
      					
		     		    jButton45.setBounds(25, 158, 200, 73);
	 	     		    jButton45.setFont(newFont2);
	 	     		    jButton45.setText("SUERTE");
	 	     			jPanel1.add(jButton45);
	 	         		
	 	     			
	 	     			jLabel13.setBounds(220, 158, 120, 80);
	 	     			jLabel13.setFont(newFont4);
	 	     			jLabel13.setText("------->");
	 	     			jPanel1.add(jLabel13);
	 	     			
	 	     			
	 	     			texf10.setBounds(320, 163, 60, 60);
	 	     			texf10.setEditable(false);
	 	     			jPanel1.add(texf10);
     	     			
     	     			jLabel2.setBounds(5, 260, 600, 35);
		     		    jLabel2.setText("<html>Te levantas, coges la bomba y echas a correr�<html>");
		     		    jPanel1.add(jLabel2);
		     		   reiniciarcap3(vida1); 
		     		  
      					
      					break;
      					
      				case "continuar26":
      					
      					
      					jPanel1.removeAll();
    	    			jPanel1.repaint();	
    	    			System.out.println("entra?");
    	    			video2 v2 = new video2();
    					v2.setVisible(true);
    					System.out.println("salio");
    	    			
    	    			jLabel1.setBounds(210, 100, 600, 300);
    		    		jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 50));
    		    		jLabel1.setText("FIN");
    		            jPanel1.add(jLabel1);
    	    			
    	    			
      					break;
      					
      				case "muertecap3":
      					
      					jLabel1 = new javax.swing.JLabel();
    					
    					jPanel1.removeAll();
    	    			jPanel1.repaint();	
    	    			
    	    			vervida(vida1);
    					
    					jLabel1.setBounds(210, 100, 600, 300);
    		    		jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 50));
    		    		jLabel1.setText("Capitulo 3");
    		            jPanel1.add(jLabel1);
    		        
    		            
    		              jButton34.setBounds(440, 407, 250, 73);
    		              jButton34.setFont(newFont1);
        	              jButton34.setText("continuar");
        	              jPanel1.add(jButton34);
      					
      					break;
    }
}

    // Declaracion de variables                
    protected javax.swing.JButton jButton1;
    protected javax.swing.JButton jButton2;
    protected javax.swing.JButton jButton3;
    protected javax.swing.JButton jButton4;
    protected javax.swing.JButton jButton5;
    protected javax.swing.JButton jButton6;  
    protected javax.swing.JButton jButton7;
    protected javax.swing.JButton jButton8;
    protected javax.swing.JButton jButton9;
    protected javax.swing.JButton jButton10;
    protected javax.swing.JButton jButton11;
    protected javax.swing.JButton jButton12;
    protected javax.swing.JButton jButton13;
    protected javax.swing.JButton jButton14;
    protected javax.swing.JButton jButton15;
    protected javax.swing.JButton jButton16;
    protected javax.swing.JButton jButton17;
    protected javax.swing.JButton jButton18;
    protected javax.swing.JButton jButton19;
    protected javax.swing.JButton jButton20;
    protected javax.swing.JButton jButton21;
    protected javax.swing.JButton jButton22;
    protected javax.swing.JButton jButton23;
    protected javax.swing.JButton jButton24;
    protected javax.swing.JButton jButton25;
    protected javax.swing.JButton jButton26;
    protected javax.swing.JButton jButton27;
    protected javax.swing.JButton jButton28;
    protected javax.swing.JButton jButton29;
    protected javax.swing.JButton jButton30;
    protected javax.swing.JButton jButton31;
    protected javax.swing.JButton jButton32;
    protected javax.swing.JButton jButton33;
    protected javax.swing.JButton jButton34;
    protected javax.swing.JButton jButton35;
    protected javax.swing.JButton jButton36;
    protected javax.swing.JButton jButton37;
    protected javax.swing.JButton jButton38;
    protected javax.swing.JButton jButton39;
    protected javax.swing.JButton jButton40;
    protected javax.swing.JButton jButton41;
    protected javax.swing.JButton jButton42;
    protected javax.swing.JButton jButton43;
    protected javax.swing.JButton jButton44;
    protected javax.swing.JButton jButton45;
    protected javax.swing.JButton jButton46;
    protected javax.swing.JButton jButton47;
    protected javax.swing.JButton jButton48;
    protected javax.swing.JButton jButton49;
    
    
    String vida1="";
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
    protected javax.swing.JLabel jLabel9;
    protected javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel jLabel11;   
    protected javax.swing.JLabel jLabel12;
    protected javax.swing.JLabel jLabel13;
    protected javax.swing.JLabel jLabel14;
    protected javax.swing.JLabel vida;
	 BD bd= new BD();
    protected javax.swing.JTextField texf1;
    protected javax.swing.JTextField texf2;
    protected javax.swing.JTextField texf3;
    protected javax.swing.JTextField texf4;
    protected javax.swing.JTextField texf5;
    protected javax.swing.JTextField texf6;
    protected javax.swing.JTextField texf7;
    protected javax.swing.JTextField texf8;
    protected javax.swing.JTextField texf9;
    protected javax.swing.JTextField texf10;
    Image imagenFondo;
    URL fondo;
    
    
    protected javax.swing.JPanel jPanel1;
    Font newFont3 = new Font("Tele-Marines", 0, 14);
    Font newFont = new Font("Tele-Marines", 0, 24);
    Font newFont6 = new Font("Kristen ITC", 0, 11);
    Font newFont1 = new Font("Tele-Marines", 0, 12);
    Font newFont4 = new Font("Tele-Marines", 0, 18);
    Font newFont2 = new Font("Kristen ITC", 0, 14);
    Font newFont5 = new Font("Kristen ITC", 0, 29);
    // Fin de declaracion de variables                  
}
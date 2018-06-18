package Proyecto;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class audio {
	/**
	 * 
	 * @param Player player
	 * @param FileInputStream fis
	 * @param BufferedInputStream bis
	 * 
	 * @see sonido()
	 */
	
	//metodo para reproducir audio mp3
 	public void sonido(){
	 
		
		try {
         FileInputStream fis;
         Player player;
         fis = new FileInputStream(
                 "C:\\Users\\javie\\Downloads\\Victory.mp3");
         BufferedInputStream bis = new BufferedInputStream(fis);

         player = new Player(bis); // Llamada a constructor de la clase Player
         player.play();          // Llamada al método play
     } catch (JavaLayerException e1) {
         e1.printStackTrace();
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     }
}
}

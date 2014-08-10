//importaciones necesarias
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class fondoMenu extends JPanel{
	
	public Image imagenFondo;
	public URL fondo;
	
	public fondoMenu(){
		fondo= this.getClass().getResource("/imagenes/menu.jpg"); //trae la imagen
		imagenFondo= new ImageIcon(fondo).getImage(); //ubica la imagen en la ventana
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this); //ubica la imagen
			
	}
	
}

//package prueba;

//public class claseprueba {
//
//	public static void main(String[] args) {
//		System.out.println("prueba prueba");
//	}

//}

import java.awt.*;
import javax.swing.*;


public class Ventana extends JFrame {
	
	fondoMenu menu;
	JButton bot1, bot2, bot3;//para los botones
	
	public Ventana()
	{
		this.setSize(720,500); //tamano de la ventana
		this.setTitle("Menu Principal"); //titulo de la ventana
		this.setLocationRelativeTo(null); //ubica la ventana en el centro de la pantalla
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cuando se seleccione la x se cierra
		
        bot1= new JButton("Nuevo Juego");
        bot2= new JButton("Opciones");
        bot3= new JButton("Creditos");
        
		Container contenedor= getContentPane(); //se crea el contenedor
		menu= new fondoMenu();
		//se agregan los botones a la pantalla
		menu.add(bot1); 
		menu.add(bot2);
		menu.add(bot3);
		contenedor.add(menu); //utiliza la funcion panel para que aparezca la imagen
		
		
		this.setVisible(true); //hace la ventana visible	
			
	}
	
	
	public static void main (String[] args) {
		
		Ventana menuPrincipal= new Ventana(); //llama la funcion de ventana para que se ejecute
		
	}
	
	
}


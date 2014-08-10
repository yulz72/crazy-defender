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
	MenuBar barra= new MenuBar();
    Menu programa = new Menu("Programa");
    Menu ayuda = new Menu("Ayuda");
	
	public Ventana()
	{
		this.setSize(720,500); //tamano de la ventana
		this.setTitle("Menu Principal"); //titulo de la ventana
		this.setLocationRelativeTo(null); //ubica la ventana en el centro de la pantalla
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cuando se seleccione la x se cierra
		
        setMenuBar(barra); //barras de prueba
        barra.add(programa);
        barra.add(ayuda);
           
        programa.add("Nuevo Juego");
        programa.add("Abrir");
        programa.addSeparator();
        programa.add("Salir");
        ayuda.add("Ayuda General");
        ayuda.addSeparator();
        ayuda.add("Acerca de...");
        
		Container contenedor= getContentPane(); //se crea el contenedor
		menu= new fondoMenu();
		contenedor.add(menu); //utiliza la funcion panel para que aparezca la imagen
		
		
		this.setVisible(true); //hace la ventana visible	
			
	}
	
	
	public static void main (String[] args) {
		
		Ventana menuPrincipal= new Ventana(); //llama la funcion de ventana para que se ejecute
		
	}
	
	
}


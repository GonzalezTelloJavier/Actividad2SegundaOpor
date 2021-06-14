package app.ito.poo;
import java.util.Scanner;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.time.LocalDate;

import excepciones.ito.poo.EliminaCancion;
import clases.ito.poo.Cancion;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import excepciones.ito.poo.*;
import clases.ito.poo.Composici�n;
import excepciones.ito.poo.ExisteCancion;
import Texto.ito.poo.*;
import excepciones.ito.poo.ConsultaCancion;



public class App1<Interprete> {
	static Scanner lector= new Scanner(System.in);
	static Cancion e;
	static Composici�n c;
	static Archivo1 archivo;
	static Archivo2 archivo2;
	static String interprete;
	
	
	
	static void menu() throws  HeadlessException, Titulo, Solicitante, ConsultaCancion, ExisteCancion, EliminaCancion, EliminaInterprete, FileNotFoundException {
		Comenzar();
		IniciarP();
		final JPanel 
		panel=new JPanel();
		boolean error=true;
		while(error) {
		try {
		boolean ciclo=true;
		int respuesta=0;
		while(ciclo) {
		String opciones="-Seleccione la opccion que desee:-\n1)[A�adir composici�n]\n2)[Mostrar Composici�nes]\n3)[Eliminar Composici�n]\n4)[AgregarInterprete]\n5)[EliminaInterprete]\n7)[Exit] ";
		respuesta=Integer.parseInt(JOptionPane.showInputDialog(opciones));
		//metodo para a�adir genero
		/*System.out.print("
		 * 
		 * 
		 * 
		 * */
		switch(respuesta) {
		case 1:AgregaComposicion();break;
		case 2:muestraCancion();break;
		case 3:EliminaComposicion();break;
		case 4:AgregarInterprete();break;
		case 5:EliminaInterprete();break;
		case 6:guardaRegistro();ciclo=false;error=false;break;
		default:JOptionPane.showMessageDialog(null,"Ingresar opcion");
		  }
		}
		
		}catch(Titulo e){
			
			JOptionPane.showMessageDialog(panel,e.getMessage(),"���ERROR!!!", JOptionPane.ERROR_MESSAGE);
			
		}catch(Solicitante e ) {
			
			JOptionPane.showMessageDialog(panel,e.getMessage(),"���ERROR!!!", JOptionPane.ERROR_MESSAGE);
			
		}catch(	ExisteCancion e) {
			
			JOptionPane.showMessageDialog(panel,e.getMessage(),"���ERROR!!!", JOptionPane.ERROR_MESSAGE);
			
		}catch(EliminaInterprete e) {
			
			JOptionPane.showMessageDialog(panel,e.getMessage(),"���ERROR!!!", JOptionPane.ERROR_MESSAGE);
			
		}catch(EliminaCancion e) {
			
			JOptionPane.showMessageDialog(panel,e.getMessage(),"���ERROR!!!", JOptionPane.ERROR_MESSAGE);
			
		}catch(ConsultaCancion e) {
			
			JOptionPane.showMessageDialog(panel,e.getMessage(),"���ERROR!!!", JOptionPane.ERROR_MESSAGE);
			
		}
		}
	}
	
	static Composici�n capturarComposici�n()throws Titulo, Solicitante, ExisteCancion, EliminaInterprete,EliminaCancion, ConsultaCancion  {
	Composici�n n= new Composici�n(null, null, null, null, null, 0, 0);
	
	
			String titulos, solicitantes, generoMusical, fechaRegistro, fechaEstreno; int minutos, segundos;
			titulos=JOptionPane.showInputDialog("Inserte el titulo de la cancion");
			solicitantes=JOptionPane.showInputDialog("Inserte el nombre de interprete que lo solicita:");
			generoMusical=JOptionPane.showInputDialog("inserte el genero musical");
			fechaRegistro=JOptionPane.showInputDialog("Fecha en que se registro la canci�n??\nFavor de insertar:(a�o-mes-d�a):");
			fechaEstreno=JOptionPane.showInputDialog("Fecha que en se estreno la canci�n??\nFavor de insertar:(a�o-mes-d�a):");
			minutos=Integer.parseInt(JOptionPane.showInputDialog("Inserte duracion en minutos: "));
			segundos=Integer.parseInt(JOptionPane.showInputDialog("Inserte duracion en segundos: "));
			n.setTitulo(titulos);
			n.setSolicitantes(solicitantes);
			n.setGeneroMusical(generoMusical);
			n.setFechaRegistro(LocalDate.parse(fechaRegistro));
			n.setFechaEstreno(LocalDate.parse(fechaEstreno));
			n.setMinutos(minutos);
			n.setSegundos(segundos);
			
			return n;
				
			
		}
	
	static void Comenzar() {
		e=new Cancion();
	}
	
	static void AgregaComposicion() throws Titulo, Solicitante, HeadlessException , ExisteCancion, ConsultaCancion, EliminaCancion, EliminaInterprete, FileNotFoundException {
		Composici�n nueva;
		nueva= capturarComposici�n();
		e.ExisteCancion(nueva);
		e.addItem(nueva);
	    JOptionPane.showMessageDialog(null, "**Su composicion se agrego exitosamente**");
			if(e.isFull())
				e.incrementaArreglo();
		
	}
	static Composici�n Composicionaleatorio(String aleatorio) {
		c = null;int i=0;
		for(;i<e.getSize();i++) {
			c=e.getItem(i);
			System.out.println(e.getItem(i)+"\nEs la composci�n?"+aleatorio);lector.nextLine();
			if(lector.nextLine().equalsIgnoreCase("si"))
				break;
			c=null;
		}
		return c;	
	}
	
	static void AgregarInterprete() {
		
		if(!e.isFree()) {
			c=Composicionaleatorio ("Ingresando...");
			System.out.println("Introduce el nombre del Interprete");
			c.AgregarInterpret(lector.nextLine());
		}else
			System.out.println("No hay composiciones existentes");
	}
	
	
	static void EliminaInterprete() {
		
		if(!e.isFree()){
			c=Composicionaleatorio ("Eliminando...");
			System.out.println("Introduce el nombre del Interprete para eliminarlo");
			c.EliminarInterpret(lector.nextLine());
		}else
			System.out.println("No hay composiciones existentes");
	}

    static void muestraCancion() {
		
		
		if(e.isFree())
			JOptionPane.showMessageDialog(null,"���No se encontro ninguna composicion!!!");
		else {
			
		String cuentas="";
		for(int i=0;i<e.getSize();i++)
			cuentas=cuentas+"\n"+(e.getItem(i));
		JOptionPane.showMessageDialog(null,cuentas);
		
		  }
        }
    	
		//static void EliminaCancion(int a){
			//String cancion = "";
			//e.getItem(a).setTitulo(cancion);
			
		//}
    
		
    static void EliminaComposicion() throws EliminaCancion {
		int pos=0;
		if(e.isFree())
			JOptionPane.showMessageDialog(null,"Aun no hay canciones");
		else {
			boolean CUENTA=true;
			while(CUENTA) {
		    String cuentas="";
		    
		    for(int i=0;i<e.getSize();i++)
			    cuentas=cuentas+"\n"+(i+1)+")"+(e.getItem(i));
		    pos=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la cancion a borrarr\n"+cuentas));
		    if((e.getSize())>=pos&&pos>0) {
		    	e.EliminaCancion(e.getItem(pos-1));
		    	e.clear(e.getItem(pos-1));
		    	
		    	JOptionPane.showMessageDialog(null,"Cancion borrarda con exito");
		    	CUENTA=false;
		    }	
		    else
		    	
		    	JOptionPane.showMessageDialog(null,"Aun no hay canciones!!, no se pueden borrarr");
		    }
		}
	}
		
	static void guardaRegistro() throws FileNotFoundException , ExisteCancion , EliminaInterprete, ConsultaCancion {
			if (e.isFree()) {
				
			}
			else {
				archivo=new Archivo1("Guarda Canciones");
				for(int i=0;i<e.getSize();i++) {
					archivo.writeString(e.getItem(i).getGeneroMusical());
					archivo.writeString(e.getItem(i).getTitulo());
					archivo.writeString(e.getItem(i).getSolicitantes());
					if(e.getItem(i).getFechaRegistro()==null) {
						archivo.writeString(e.getItem(i).getFechaEstreno().toString());
						archivo.writeStringLn("null");	
					}
					else {
						archivo.writeString(e.getItem(i).getFechaRegistro().toString());
						archivo.writeStringLn(e.getItem(i).getFechaEstreno().toString());	
					}
					
				}
				archivo.close();
			}
						
		}
		static void IniciarP() throws FileNotFoundException, Titulo ,ExisteCancion {
			boolean existe=false;
			try {
				archivo2= new Archivo2("Guardando composiciones");
				existe=true;
			}catch(FileNotFoundException e) {
				System.err.println("Creando composiciones...");
			}
			if(existe)
				LTexto();
			
		}
		
		static void LTexto() throws Titulo ,ExisteCancion {
			
			while(!archivo2.isEOF()) {
				Composici�n n=null;
				n.setTitulo(archivo2.readString());
				n.setMinutos(archivo2.readInt());
				n.setSegundos(archivo2.readInt());
				n.setGeneroMusical(archivo2.readString());
				n.setSolicitantes(archivo2.readString());
				n.setFechaRegistro(LocalDate.parse(archivo2.readString()));
				n.setFechaEstreno(LocalDate.parse(archivo2.readString()));
				String fechaAct;
				fechaAct=archivo2.readString();
				if(fechaAct.equals("null")) 
					n.setFechaEstreno(null);
				else
					n.setFechaEstreno(LocalDate.parse(fechaAct));
				e.addItem(c);
				archivo2.isFinLinea();
			
				
			}
		}
		
		
		  
}

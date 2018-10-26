import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Servidor {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ServerSocket paquete_recibir = new ServerSocket(9999);
		
		Secuenciador recibido;
		ArrayList<Boolean> lins1;
		ArrayList<Boolean> lins2;
		ArrayList<Boolean> lins3;
		ArrayList<Boolean> lins4;
		
		while(true){

		Socket misocket = paquete_recibir.accept();
		
		ObjectInputStream paquete_recibido = new ObjectInputStream(misocket.getInputStream());
		
		recibido = (Secuenciador) paquete_recibido.readObject();
		

		for(Boolean e:recibido.lin1) {
			System.out.println(e);
		}
		System.out.println();
		

		}
		 
	}
	
	}


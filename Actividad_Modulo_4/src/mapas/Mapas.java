package mapas;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class Mapas {

	public static void main(String[] args) {
		System.out.println("********* HashMap *********");
		//Declaramos el objeto mapa
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		//Ingresamos los pares key-value con el metodo put
		mapa.put(12, "Camilo Vargas");		mapa.put(16, "Jefferson Lerma");
		mapa.put(2, "Carlos Cuesta");		mapa.put(11, "Jhon Arias");
		mapa.put(23, "Davinson Sanchez");	mapa.put(10, "James Rodriguez");
		mapa.put(4 , "Santiago Arias");	    mapa.put(24, "Jhon Cordoba");
		mapa.put(17, "Johan Mujica");		mapa.put(7, "Luis Diaz");
		mapa.put(6, "Richard Rios");
		
		// Imprimimos el mapa con un iterador
		Iterator<Integer> it = mapa.keySet().iterator();
		while(it.hasNext()){
		  Integer key = it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + mapa.get(key));
		  
		  		  
		}
		System.out.println("Método size(): "+mapa.size());
		System.out.println("Método isEmpty(): "+mapa.isEmpty());
		System.out.println("Método containsKey(): "+mapa.containsKey(23));
		System.out.println("Método containValue(): "+mapa.containsValue("Luis"));
		System.out.println("Método get(): "+mapa.get(6));
		System.out.println("Método entrySet(): "+mapa.entrySet());
		System.out.println("Método keySet(): "+mapa.keySet());
		System.out.println("Método remove(): "+mapa.remove(6));
		System.out.println("Comprobación método remove: "+mapa.get(6));
		
	}

}

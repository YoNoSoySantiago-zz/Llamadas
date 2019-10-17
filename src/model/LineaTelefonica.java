package model;
import java.util.ArrayList;
public class LineaTelefonica{
	private ArrayList<LineaBasica> basicas = new ArrayList<LineaBasica>();
	private ArrayList<LineaCelular> celulares = new ArrayList<LineaCelular>();
	private ArrayList<LineaVozIP> vozIPs = new ArrayList<LineaVozIP>();

	public int calcularCostos(){
		int result=0;
		for(int i = 0; i<basicas.size();i++){
			result += basicas.get(i).getDuracionLlamadaLocal()*35;	
		}
		for(int i = 0; i<celulares.size();i++){
			result += celulares.get(i).getDuracionLlamadaLocal()*35;
			result += celulares.get(i).getDuracionLlamadaCelular()*10;
		}
		for(int i = 0; i<celulares.size();i++){
			result += vozIPs.get(i).getDuracionLlamadaLocal()*35;
			result += vozIPs.get(i).getDuracionLlamadaCelular()*7;
			result += vozIPs.get(i).getDuracionLlamadaCelular()*80;
		}
		return result;
	}


}
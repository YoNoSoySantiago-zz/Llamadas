package model;
import java.util.ArrayList;
public class LineaTelefonica{
	private ArrayList<LineaBasica> basicas = new ArrayList<LineaBasica>();
	private ArrayList<LineaCelular> celulares = new ArrayList<LineaCelular>();
	private ArrayList<LineaVozIP> vozIPs = new ArrayList<LineaVozIP>();

	public void addBasica(int duracionLlamadaLocal){
		LineaBasica basica = new LineaBasica(duracionLlamadaLocal);
		basicas.add(basica);
	}
	public void addCelular(int duracionLlamadaLocal, int duracionLlamadaCelular){
		LineaCelular celular = new LineaCelular(duracionLlamadaLocal,duracionLlamadaCelular);
		celulares.add(celular);
	}
	public void addVozIP(int duracionLlamadaLocal, int duracionLlamadaCelular, int duracionLlamadaInternacional){
		LineaVozIP vozIP = new LineaVozIP(duracionLlamadaLocal, duracionLlamadaCelular, duracionLlamadaInternacional);
		vozIPs.add(vozIP);
	}

	public int calcularCostos(){
		int result=0;
		for(int i = 0; i<basicas.size();i++){
			result += basicas.get(i).getDuracionLlamadaLocal()*35;	
		}
		for(int i = 0; i<celulares.size();i++){
			result += celulares.get(i).getDuracionLlamadaLocal()*35;
			result += celulares.get(i).getDuracionLlamadaCelular()*10;
		}
		for(int i = 0; i<vozIPs.size();i++){
			result += vozIPs.get(i).getDuracionLlamadaLocal()*35;
			result += vozIPs.get(i).getDuracionLlamadaCelular()*7;
			result += vozIPs.get(i).getDuracionLlamadaCelular()*80;
		}
		return result;
	}


}
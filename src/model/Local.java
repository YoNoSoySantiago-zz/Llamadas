package model;
public abstract class Local{
	private int duracionLlamadaLocal;
	public Local(int duracionLlamadaLocal){
		this.duracionLlamadaLocal = duracionLlamadaLocal;
	}
	public int getDuracionLlamadaLocal(){
		return this.duracionLlamadaLocal;
	}
}
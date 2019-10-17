package model;
public class LineaVozIP extends Local{
	private int duracionLLamdaCelular;
	private int duracionLLamdaInternacional;

	public LineaVozIP(int duracionLLamdaLocal, int duracionLLamdaCelular, int duracionLLamdaInternacional){
		super(duracionLLamdaLocal);
		this.duracionLLamdaCelular = duracionLLamdaCelular;
		this.duracionLLamdaInternacional = duracionLLamdaInternacional;
	}
	public int getDuracionLlamadaCelular(){
		return this.duracionLLamdaCelular;
	}
	public int getDuracionLLamadaInternacional(){
		return this.duracionLLamdaInternacional;
	}
}
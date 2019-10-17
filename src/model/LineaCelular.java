package model;
public class LineaCelular extends Local{
	private int duracionLlamdaCelular;

	public LineaCelular(int duracionLlamdaLocal, int duracionLlamdaCelular){
		super(duracionLlamdaLocal);
		this.duracionLlamdaCelular = duracionLlamdaCelular;
	}
	public int getDuracionLlamadaCelular(){
		return this.duracionLlamdaCelular;
	}
}
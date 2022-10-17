package ifsc;

public class Caminhao extends Veiculo{

	private int eixos;
       public Caminhao() {}
       public Caminhao(String placa,int ano,int eixos) {
	      super.getPlaca();
	      super.getAno();
	      this.eixos =eixos;	
	}
	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	@Override
	public String toString() {
		return  "Caminhao placa: " + this.getPlaca() + " Ano: "+ this.getAno() + " Eixos: " + this.getEixos();
	}
}

package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Caminhao> listaCaminhoes= new ArrayList<>();
		ArrayList<Onibus> listaOnibus= new ArrayList<>();
		
		Caminhao caminhao1 = new Caminhao();
		caminhao1.setPlaca("ABC1234");
		caminhao1.setAno(1990);
		caminhao1.setEixos(6);
		
		Caminhao caminhao2 = new Caminhao();
		caminhao2.setPlaca("DEF5678");
		caminhao2.setAno(2000);
		caminhao2.setEixos(8);
		
		Caminhao caminhao3 = new Caminhao();
		caminhao3.setPlaca("GHI9012");
		caminhao3.setAno(2012);
		caminhao3.setEixos(4);
		
		Onibus oni1 = new Onibus();
		oni1.setPlaca("JKL1234");
		oni1.setAno(2018);
		oni1.setAssentos(40);
		
		Onibus oni2 = new Onibus();
		oni2.setPlaca("MNO5678");
		oni2.setAno(2003);
		oni2.setAssentos(50);
		
		Onibus oni3 = new Onibus();
		oni3.setPlaca("PQR9012");
		oni3.setAno(2020);
		oni3.setAssentos(60);
		
		listaCaminhoes.add(caminhao1);
		listaCaminhoes.add(caminhao2);
		listaCaminhoes.add(caminhao3);
		
		listaOnibus.add(oni1);
		listaOnibus.add(oni2);
		listaOnibus.add(oni3);
		
		for(Caminhao lisC: listaCaminhoes) {
			System.out.println(lisC.toString());
		}
		for(Onibus lisO: listaOnibus) {
			System.out.println(lisO.toString());
		}
		
	}

}

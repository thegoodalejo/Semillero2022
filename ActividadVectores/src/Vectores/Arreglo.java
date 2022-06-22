package Vectores;

import java.util.ArrayList;

public class Arreglo {
	
	Arreglo(int[] elementos){
		for (int i=0;i<elementos.length;i++)
		{
			this.elementos.add(elementos[i]);
		}
	}
	public ArrayList<Integer> elementos = new ArrayList<>();
	
	public void ordenarMenorAMayor(ArrayList<Integer> arreglo)
	{
		int aux;
		for (int j=0;j<arreglo.size();j++){
			for (int i=0;i<arreglo.size()-1;i++) {
				if (arreglo.get(i)>=arreglo.get(i+1)) {
					aux = arreglo.get(i+1);
					arreglo.set(i+1,arreglo.get(i));
					arreglo.set(i,aux);
				}
			}
		}
	}
	
	public void ordenarMayorAMenor(ArrayList<Integer> arreglo)
	{
		int aux;
		for (int j=0;j<arreglo.size();j++){
			for (int i=arreglo.size()-1;i>0;i--) {
				if (arreglo.get(i)>=arreglo.get(i-1)) {
					aux = arreglo.get(i-1);
					arreglo.set(i-1,arreglo.get(i));
					arreglo.set(i,aux);
				}
			}
		}
	}
	
	
}

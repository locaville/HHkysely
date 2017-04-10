package fi.hh.gitgud.kysely.bean;

public final class Iteraatio {
	
	public int kertoma(int numero) {
		int vastaus = 1;
		
		if (numero < 0){
			System.out.println("Numeron pitää olla 0 tai suurempi.");
		}else{
			for (int i = 1; i <= numero; i++) {
				vastaus = vastaus * i;
			}
		}
		
		return vastaus;
	}

	public static void main(String[] args) {
		Iteraatio it = new Iteraatio();
		System.out.println(it.kertoma(5));

	}

}

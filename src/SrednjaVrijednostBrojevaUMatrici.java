public class SrednjaVrijednostBrojevaUMatrici {
	/*
	 * Naci Srednju vrijednost kolona i redova.
	 */
	public static void main(String[] args) {

		int[][] niz = kerirajNiz();
		printNiz(niz);

		System.out.println("Srednja vrijednost redova je: ");
		for (int i = 0; i < niz.length; i++) {
			double sredVrRed = srednjaVrijednostRedova(niz[i]);
			System.out.println(sredVrRed);
		}
		
		System.out.println("Srednja vrijednost kolona  je: ");
		for (int j = 0; j < niz[0].length; j++) {
			double sredVrKol = srednjaVrijednostKolone(niz, j);
			System.out.println(sredVrKol);
		}
	}
	
	

	private static double srednjaVrijednostKolone(int[][] niz, int j ) {
		double suma =0;
		for (int i = 0; i < niz.length; i++) {
			suma = suma + niz[i][j];
		}
		double srednjaVrijednostKolone = suma / (niz.length );
		return srednjaVrijednostKolone;
	}



	private static double srednjaVrijednostRedova(int[] niz) {
		double suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma = suma + niz[i];
		}
		double srednjaVrijednostReda = suma / (niz.length );
		return srednjaVrijednostReda;
	}

	private static int[][] kerirajNiz() {
		System.out.println("Zadaj visinu niza: ");
		int visinaNiza = TextIO.getlnInt();

		System.out.println("Zadaj sirinu niza: ");
		int sirinaNiza = TextIO.getlnInt();

		int[][] matrica = new int[visinaNiza][sirinaNiza];

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.println("Unesite broj: ");
				matrica[i][j] = TextIO.getlnInt();
			}
		}
		System.out.println();
		return matrica;
	}

	private static void printNiz(int[][] niz) {

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(niz[i][j] + ", ");
			}
			System.out.println();
		}
	}
}

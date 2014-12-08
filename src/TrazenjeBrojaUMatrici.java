
public class TrazenjeBrojaUMatrici {
public static void main(String[] args) {
	
	int [][] niz = kerirajNiz();
	printNiz(niz);
	
	System.out.println("Unesi broj koji trazis: ");
	int numTrazi= TextIO.getInt();
	
	trazi( niz, numTrazi);
	
	
}

private static int [] trazi(int[][] niz, int numTrazi) {
	int idx = -1;
	int [] trazi = new int [1];
	for (int i = 0; i < niz.length; i++) {
		for ( int j=0; j < niz[i].length; j++) {
			if ( numTrazi == niz[i][j]) {
				System.out.printf("Broj koji trazis je u nizu i na poziciji je %d ,%d", i,j);
				trazi [0] = i;
				trazi [0] = j;
			}
		}
	}
	return trazi;
	
}

private static void printNiz(int [][] niz) {
	String zarez = ", ";
	for (int i = 0; i < niz.length; i++) {
		for ( int j=0; j < niz[i].length; j++) {

							System.out.print(niz[i][j] + ", ");
				
		}
		System.out.println();
	}
	
}

private static int [][] kerirajNiz() {
	System.out.println("Zadaj visinu niza: ");
	int visinaNiza = TextIO.getlnInt();
	
	System.out.println("Zadaj sirinu niza: ");
	int sirinaNiza = TextIO.getlnInt();
	
	int [][] matrica =  new int [visinaNiza][sirinaNiza];
	
	for ( int i=0; i < matrica.length; i++) {
		for ( int j=0; j < matrica[i].length; j++) {
			System.out.println("Unesite broj: ");
			matrica [i][j] = TextIO.getlnInt();
		}
	}System.out.println();
	return matrica;
} 


}

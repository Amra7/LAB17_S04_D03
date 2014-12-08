
public class FunkUnosNizaDvijeDim {

	private static int[][] kreirajNiz() {
		System.out.print("Unesite visinu niza: ");
		int nizVis = TextIO.getlnInt();
		
		System.out.print("Unesite sirinu niza: ");
		int nizSir = TextIO.getlnInt();
		
		int[][] niz = new int[nizVis][nizSir];
		
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print("Unesite broj u niz: ");
				niz[i][j] = TextIO.getlnInt();
			}
		}
		
		return niz;
		
	}
	
	private static void print(int[][] niz) {
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if (j != niz[j].length-1){
					System.out.print(niz[i][j] + ", ");
				} else {
					System.out.print(niz[i][j]);
				}
				
			}System.out.println();
		}		
	}
	
	private static void trazi(int[][] niz, int numSrch) {
		
		int idx = -1;
		boolean postoji = false;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if (niz [i][j] == numSrch) {
					System.out.printf("Broj je na koordinatama %d, %d", i, j);
					System.out.println();
					postoji = true;
				}
			} 
		} if (postoji == false) {
			System.out.println("Broj nije pronadjen");
			System.out.println(idx);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[][] niz = kreirajNiz();
		print(niz);
		
		System.out.println();
		System.out.print("Unesite broj koji trazite: ");
		int numSrch = TextIO.getlnInt();
		trazi(niz, numSrch);

	}

	

	

}

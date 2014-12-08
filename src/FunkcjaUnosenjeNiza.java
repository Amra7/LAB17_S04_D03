public class FunkcjaUnosenjeNiza {
	public static void main(String[] args) {

		System.out.println("Unesi jedan broji koji odredjuje velicinu niza: ");
		int velicinaNiza = TextIO.getInt();

		int[] niz = new int[velicinaNiza];
		niz = unosenjeNiza(velicinaNiza);

		System.out.println("Vas niz je: ");
		ispisNiza(niz);

		System.out.println("\nUnesi broj koji trazis: ");
		int trazeniBr = TextIO.getInt();

		traziInt(niz, trazeniBr);

	}

	private static int traziInt(int[] niz, int trazeniBr) {
		int pozicija = 0;
		int index = -1;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == trazeniBr) {
				pozicija = i;
				System.out.printf("Trazani broj je na poziciji niz %d .", i);
				return pozicija;
			}
		}
		System.out.printf( "Nema trazenog broja!" + index);
		return pozicija;

	}

	private static void ispisNiza(int[] niz) {
		String zarez = ", ";
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == niz[niz.length - 1]) {
				System.out.print(niz[i]);
			} else {
				System.out.print(niz[i] + zarez);
			}
		}

	}

	private static int[] unosenjeNiza(int velicinaNiza) {
		int[] unosNiz = new int[velicinaNiza];
		for (int i = 0; i < unosNiz.length; i++) {
			System.out.println("Unesi broj: ");
			unosNiz[i] = TextIO.getlnInt();
		}
		return unosNiz;

	}

}

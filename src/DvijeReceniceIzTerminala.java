/*
 * Unijeti dvije recenice sa terminala i uporediti ih da li imaju istih rijeci.
 */
public class DvijeReceniceIzTerminala {
public static void main(String[] args) {
//String recenica1 = null, recenica2 = null;
	
	while ( args.length != 0) {
		System.out.println("Unesi prvu recenicu: ");
		String recenica1 = args[0];
		
//		 recenica1 = TextIO.getlnString();
		
		System.out.println("Unesi drugu recenicu: ");
//	recenica2 = TextIO.getlnString();
		String recenica2 = args[0];
	}
	 String [] recenica1Niz = split(recenica1);
	 String [] recenica2Niz = split(recenica2);
	 
	 poredjenjeRijeci (recenica1Niz, recenica2Niz);
	 
	 
}



private static void poredjenjeRijeci(String[] recenica1Niz,
		String[] recenica2Niz) {
	for ( int i = 0; i < recenica1Niz.length; i++) {
		for ( int j = 0; i < recenica2Niz.length; i++) {
			if ( recenica1Niz[i] == recenica2Niz[j] )  {
				System.out.println("Iste rijeci u recenicama su: " + recenica1Niz[i]);
			}else {
				System.out.println("Nema zajednickih rijeci!");
			}
		}
		
	}
	
	
}

public static String [] split( String rec) {
	String razmak = " ";
	String []  temp ;
	temp = rec.split(razmak);
	for ( int i=0; i<temp.length; i++){
		System.out.println( temp[i]);
	}
	return temp;
}
}

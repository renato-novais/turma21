package lista6.programa;

import lista6.classes.Cachorro;
import lista6.classes.Cavalo;
import lista6.classes.Preguica;

public class programa {

			public static void main(String[] args) {
			Cachorro cachorro = new Cachorro("Cachorro",  4);
			Cavalo cavalo = new Cavalo("Cavalo", 5);
			Preguica preguica = new Preguica("Preguiça",  3);
			
			System.out.println("=== CACHORRO ====");
			System.out.println(cachorro);
			cachorro.emitirSom();
			cachorro.correr();
			
			System.out.println("=== CAVALO ===");
			System.out.println(cavalo);
			cavalo.emitirSom();
			cavalo.correr();
			
			System.out.println("=== PREGUIÇA ====");
			System.out.println(preguica);
			preguica.emitirSom();
			preguica.subirEmArvore();

		}

	}
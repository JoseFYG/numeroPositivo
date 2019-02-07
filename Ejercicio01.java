package Practica_16;

public class Ejercicio01 {

	public static void main(String[] args) {

		int array[] = new int[1000];
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * 6 + 1);
			switch (array[i]) {
			case 1:
				cont1 += 1;
				break;
			case 2:
				cont2 += 1;
				break;
			case 3:
				cont3 += 1;
				break;
			case 4:
				cont4 += 1;
				break;
			case 5:
				cont5 += 1;
				break;
			case 6:
				cont6 += 1;
				break;
			}

		}

		System.out.println(
				"Número de veces de la cara 1 es " + cont1 + " y su proporción es " + (double) cont1 / 10 + "%");
		System.out.println(
				"Número de veces de la cara 2 es " + cont2 + " y su proporción es " + (double) cont2 / 10 + "%");
		System.out.println(
				"Número de veces de la cara 3 es " + cont3 + " y su proporción es " + (double) cont3 / 10 + "%");
		System.out.println(
				"Número de veces de la cara 4 es " + cont4 + " y su proporción es " + (double) cont4 / 10 + "%");
		System.out.println(
				"Número de veces de la cara 5 es " + cont5 + " y su proporción es " + (double) cont5 / 10 + "%");
		System.out.println(
				"Número de veces de la cara 6 es " + cont6 + " y su proporción es " + (double) cont6 / 10 + "%");

	}

}

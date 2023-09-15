import java.util.Scanner;

public class arrays1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int end = 0;
		while (end != 1) {
			System.out.println("Que ejercicio quieres hacer?");
			int chs = 0;
			chs = sc.nextInt();
			while(chs >4&&chs<9||chs==10) {
				System.out.println("Comming soon");
				System.out.println("Que ejercicio quieres hacer?");
				chs = sc.nextInt();
			}
			while (chs > 11 || chs < 1) {
				System.out.println("Numero invalido (1-11)");
				chs = sc.nextInt();
			}
			
			switch (chs) {
			case 1:
				// Ex1

				int nums[] = new int[100];
				int buscar = 0, cont = 0;
				System.out.println("generando array...");
				for (int i = 0; i < 100; i++) {
					nums[i] = (int) (Math.random() * 5 + 1);
				}
				System.out.println("Array generada  >>>>>>");
				System.out.println("Array: ");
				for (int i = 0; i < 100; i++) {
					System.out.print(nums[i]);
				}
				System.out.print("\nQue numero quieres buscar?");
				buscar = sc.nextInt();
				while (buscar > 5 || buscar < 1) {
					System.out.println("Numero invalido (1-5)");
					buscar = sc.nextInt();
				}
				for (int i = 0; i < 100; i++) {
					if (nums[i] == buscar) {
						cont++;
					}
				}

				System.out.println("El número " + buscar + " se repite " + cont + " veces.");
				buscar = 0;
				cont = 0;

				// Ex1 Fin
				break;
			case 2:
				// Ex2

				int tmps_2[] = new int[100];
				for (int i = 0; i < 100; i++) {
					tmps_2[i] = 101;
				}

				int cant_2 = 0, max_2 = 0, min_2 = 0, med_2 = 0, cont_per_2 = 0, per_2 = 0;
				System.out.println("Cuantos numeros vas a analizar?");
				cant_2 = sc.nextInt();
				while (cant_2 > 100 || cant_2 < 1) {
					System.out.println("Numero invalido (1-100)");
					cant_2 = sc.nextInt();
				}

				for (int i = 0; i < cant_2; i++) {
					System.out.println("Temperatura " + (i + 1) + ": ");
					tmps_2[i] = sc.nextInt();
					while (tmps_2[i] > 100 || tmps_2[i] < 0) {
						System.out.println("Numero invalido (0-100)");
						tmps_2[i] = sc.nextInt();
					}
				}
				max_2 = tmps_2[0];
				min_2 = tmps_2[0];
				for (int i = 0; i < 100; i++) {
					if (tmps_2[i] != 101) {
						// Max && Min
						if (tmps_2[i] > max_2) {
							max_2 = tmps_2[i];
						} else if (tmps_2[i] < min_2) {
							min_2 = tmps_2[i];
						}
						// Media
						med_2 += tmps_2[i];
					}
				}
				med_2 /= cant_2;
				for (int i = 0; i < 100; i++) {
					if (tmps_2[i] != 101) {
						if (tmps_2[i] >= med_2) {
							cont_per_2++;
						}
					}
				}
				per_2 = ((cont_per_2 * 100) / cant_2);
				System.out.println("Maxima: " + max_2);
				System.out.println("Minimo: " + min_2);
				System.out.println("Media: " + med_2);
				System.out.println("Porcentaje: " + per_2 + "% ");
				cant_2 = 0;
				max_2 = 0;
				min_2 = 0;
				med_2 = 0;
				cont_per_2 = 0;
				per_2 = 0;

				// Ex2 Fin
				break;
			case 3:
				// Ex3

				int a_3[] = { 69, 17, 11, 34, 90, 45, 12, 24 };
				int b_3[] = new int[a_3.length];
				int chs_3 = 0, tmp_3 = 0;
				System.out.println("Array de base: ");
				for (int i = 0; i < a_3.length; i++) {
					System.out.print(a_3[i] + " ");
				}
				System.out.println(
						"\nQue metodo de inversion prefieres?\nMetodo de Array Aux --> 1\nMetodo de la Variable Aux -->2");
				chs_3 = sc.nextInt();

				while (chs_3 != 1 && chs_3 != 2) {
					System.out.println("Opcion no valida (1||2)");
					chs_3 = sc.nextInt();
				}
				switch (chs_3) {
				case 1:
					for (int i = 0; i < a_3.length; i++) {
						b_3[i] = a_3[(a_3.length - i - 1)];
					}
					for (int i = 0; i < a_3.length; i++) {
						System.out.print(b_3[i] + " ");
					}
					break;
				case 2:
					for (int i = 0; i < (a_3.length / 2); i++) {
						tmp_3 = a_3[i];
						a_3[i] = a_3[a_3.length - i - 1];
						a_3[a_3.length - i - 1] = tmp_3;
					}
					for (int i = 0; i < a_3.length; i++) {
						System.out.print(a_3[i] + " ");
					}
					break;
				}

				// Ex3 fin
				break;
			case 4:
				// Ex4

				int a[] = new int[10];
				int b[] = new int[a.length];

				int tmp_4 = 0;
				int small_4, prev_num_4 = 0, cont_4 = 0;
				System.out.println("Array base: ");
				for (int i = 0; i < a.length; i++) {
					a[i] = (int) (Math.random() * 5 + 1);
					System.out.print(a[i] + " ");
				}

				for (int i = 0; i < a.length; i++) {
					small_4 = i;
					for (int j = i; j < a.length; j++) {
						if (a[j] < a[small_4]) {
							small_4 = j;
						}
					}
					tmp_4 = a[i];
					a[i] = a[small_4];
					a[small_4] = tmp_4;
				}
				prev_num_4 = a[0];
				b[0] = a[0];
				for (int i = 1; i < a.length; i++) {
					if (a[i] != prev_num_4) {
						cont_4++;
						b[cont_4] = a[i];
						prev_num_4 = a[i];
					}
				}

				System.out.println("\nArray ordenada:");
				for (int i = 0; i < a.length; i++) {
					System.out.print(a[i] + " ");
				}
				System.out.println("\nArray sin redundantes: ");
				for (int i = 0; i <= cont_4; i++) {
					System.out.print(b[i] + " ");
				}

				// Ex4 Fin
				break;
			case 9:
				// Ex9
				int chs_9 = 0;
				System.out.println("De cuanto debe ser la matriz? ");
				chs_9 = sc.nextInt();
				while (chs_9 > 10 || chs_9 < 1) {
					System.out.println("Numero invalido (1-10)");
					chs_9 = sc.nextInt();
				}
				// el 9 no lo entendí.
				// Ex9 Fin
				break;
			case 11:
				// Ex11

				int chs_11 = 0, cont_11 = 0, hz_11 = 0, vc_11 = 0, pos_1_11 = 0, pos_2_11 = 0;
				System.out.println("De cuanto debe ser la matriz? ");
				chs_11 = sc.nextInt();
				while (chs_11 > 10 || chs_11 < 1) {
					System.out.println("Numero invalido (1-10)");
					chs_11 = sc.nextInt();
				}
				int espiral[][] = new int[chs_11][chs_11];
				for (int i = 0; i < (chs_11 * chs_11); i++) {

					switch (cont_11) {
					case 0:
						for (int j = 0; j < (chs_11 - vc_11); j++) {
							espiral[pos_1_11][pos_2_11] = i;
							pos_2_11 += 1;
							i++;
						}
						pos_2_11 -= 1;
						pos_1_11 += 1;
						cont_11++;
						hz_11++;
						break;
					case 1:
						for (int j = 0; j < (chs_11 - hz_11); j++) {
							espiral[pos_1_11][pos_2_11] = i;
							pos_1_11 += 1;
							i++;
						}
						pos_1_11 -= 1;
						pos_2_11 -= 1;
						cont_11++;
						vc_11++;
						break;
					case 2:
						for (int j = 0; j < (chs_11 - vc_11); j++) {
							espiral[pos_1_11][pos_2_11] = i;
							pos_2_11 -= 1;
							i++;
						}
						pos_2_11 += 1;
						pos_1_11 -= 1;
						cont_11++;
						hz_11++;
						break;
					case 3:
						for (int j = 0; j < (chs_11 - hz_11); j++) {
							espiral[pos_1_11][pos_2_11] = i;
							pos_1_11 -= 1;
							i++;
						}
						pos_1_11 += 1;
						pos_2_11 += 1;
						cont_11++;
						vc_11++;
						break;

					default:

						break;
					}
					if (cont_11 == 4) {
						cont_11 = 0;
					}
					i--;
				}
				for (int i = 0; i < chs_11; i++) {
					for (int j = 0; j < chs_11; j++) {
						if (espiral[i][j] < 10) {
							System.out.print("0" + espiral[i][j] + " ");
						} else {
							System.out.print(espiral[i][j] + " ");
						}
					}
					System.out.print("\n");
				}

				// Ex11 Fin
				break;
			}
			System.out.println("\nQuieres analizar algún ejercicio más? (0 Sí // 1 No)");
			end = sc.nextInt();
			while (end > 1 || end < 0) {
				System.out.println("Numero invalido (0-1)");
				end = sc.nextInt();
			}
		}
	}
}
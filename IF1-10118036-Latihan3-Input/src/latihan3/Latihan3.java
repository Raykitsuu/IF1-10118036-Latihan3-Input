/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA			: Adrian C. Senna
 * KELAS		: IF-1
 * NIM			: 10118036
 * Deskripsi Program	: Program ini berisi program untuk menampilkan cara input dalam bahasa pemrograman Java.
 */
public class Latihan3 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.print("Masukan nama anda: ");
		Scanner scanner = new Scanner(System.in);

		String nama = scanner.next();
		System.out.println("Nama anda adalah " + nama);
	}
	
}

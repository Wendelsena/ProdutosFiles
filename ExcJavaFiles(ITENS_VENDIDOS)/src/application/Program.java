package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.Sales;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Please, enter with name, unit price and quantity: ");
		String inputData = sc.nextLine();

		// Dividir a string em partes usando split()
		String[] part = inputData.split(", ");

		// Extrair e converter os dados
		String name = part[0].trim();
		double unitPrice = Double.parseDouble(part[1].trim());
		int quantity = Integer.parseInt(part[2].trim());

		Sales sale = new Sales(name, unitPrice, quantity);

		System.out.println(sale);

		// indicando um caminho
		String file = "C:\\temp\\out\\summary.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			// Escrevendo os dados no arquivo CSV
			bw.write(sale.toString());
			bw.newLine();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}

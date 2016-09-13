package poprawkaCzerwiec;

import java.util.Scanner;

public class MainApp {

	private Scanner scanner = new Scanner(System.in);
	
	public void Wlacz() {
		
		try {
			
			Methods plik = new Methods("debt.txt");
			
			while(true) {
				
				System.out.println("Witaj w programie! Co chcesz zrobic?" +"\n" +
				"(1) Wyswietl liste krajow z informacja o powierzchni na 1000 mieszkancow" + "\n" +
				"(2) Wyswietl liste krajow posortowanych wedlug liczby ludnosci" + "\n" +
				"(3) Dodaj kraj do listy" + "\n" +
				"(4) Wyswietl liste" + "\n" +
				"(5) Zapisz stan do pliku" + "\n" + 
				"(6) Wyjscie z programu");
				
				int o = scanner.nextInt();
				switch (o) {
				case 1:
					plik.convertData();
					break;
				case 2:
					plik.sortByPopulation();
					break;
				case 3:
					try {
						Line line = addNewCountry();
						plik.addLine(line);
						
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				case 4:
					plik.showData();
					break;
				case 5:
					
				case 6:
					return;
				default:
					System.out.println("Wybierz liczbe z zakresu 1-4!");
				}
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	private Line addNewCountry() throws Exception {
		
		System.out.println("Podaj nazwe kraju");
		String country = scanner.next();
		
		System.out.println("Podaj rozmiar powierzchni");
		Integer area = scanner.nextInt();
		
		System.out.println("Podaj liczbe ludnosci");
		Integer population = scanner.nextInt();
		
		return new Line(country, area, population);
	}
	
	
	public static void main(String[] args) {
		
		MainApp program = new MainApp();
		program.Wlacz();
		
	}
	
}

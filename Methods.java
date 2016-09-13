package poprawkaCzerwiec;

import java.util.ArrayList;
import java.util.Collections;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;

public class Methods {

	private ArrayList<Line> lista = new ArrayList<>();
	
	
	public Methods(String filePath) throws Exception {
		
	this.readData(filePath);
		
	}
	
	public void saveData() throws Exception {
	
		
		FileWriter writer = new FileWriter("debt.txt");
		for (Line line : lista) {
			writer.write(String.parseStr(line));
		}
	}
	
	public void showData() {
		for (Line line : lista) {
			System.out.println(line.getCountry() + ", " + line.getArea() + ", " + line.getPopulation());
		}
	}
	
	public void convertData() {
		
		for (Line line : lista) {
			System.out.println(
					line.getCountry() + "," + ( (double) line.getArea()/line.getPopulation()*1000));
		}
		
	}
	
	public void sortByPopulation() {
		
		Collections.sort(lista);
		
		for (Line line : lista) {
			System.out.println(
					line.getCountry() + ", " + line.getPopulation());
		}
		
		
	}
	
	public void addLine(Line l) {
		lista.add(l);
	}
	private void readData(String filePath) throws Exception {
		
		BufferedReader file = new BufferedReader(new FileReader(filePath));
		
			String line;
			
			while ((line = file.readLine()) != null) {
				String[] column = line.split(";");
				
				Line newline = new Line(column[0], Integer.parseInt(column[1]), Integer.parseInt(column[2]));
				this.addLine(newline);
			}
		
		file.close();
		
	}
	
}

package poprawkaCzerwiec;

public class Line implements Comparable<Line> {

	private String country;
	private Integer area;
	private Integer population;
	
	public Line (String country, Integer area, Integer population) throws Exception {
		
		if (country == null || country.isEmpty() ) {
			throw new Exception("Nie podano nazwy kraju");
		} else if (area <= 0) {
			throw new Exception("Powierzchnia nie moze byc rowna lub mniejsza od zera");
		} else if (population <= 0) {
			throw new Exception("Populacja nie moze byc rowna lub mniejsza od zera");
		}
 		
		
		this.country = country;
		this.area = area;
		this.population = population;
		
		
	}
	
	
	@Override
	public int compareTo(Line l) {
		return this.getPopulation().compareTo(l.getPopulation());
		
		
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	
}

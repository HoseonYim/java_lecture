package java20210110;

public class Country {
    private int population;
    private String capital;
    private String language;
    private String name;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printPopulation(int population){
        System.out.printf("The population is %d.\n",population);
    }

    public void printCapital(String capital){
        System.out.printf("The capital is %s.\n",capital);
    }

    public void printLanguage(String language){
        System.out.printf("The language is %s.\n",language);
    }
    public void printCountryInfo(String name, int population, String capital, String language){
        System.out.printf("%s's population is %d, the capital is %s. They are using %s.\n",name, population, capital, language);
    }
}

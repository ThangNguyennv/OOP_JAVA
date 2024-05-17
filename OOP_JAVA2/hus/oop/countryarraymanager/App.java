package OOP_JAVA2.hus.oop.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        

        /* TODO: write code to test program */
        // testOriginalData();
        // testSortIncreasingByPopulation();
        // testSortDecreasingByPopulation();
        // testSortIncreasingByArea();
        // testSortDecreasingByArea();
        // testSortIncreasingByGdp();
        // testSortDecreasingByGdp();
        // testFilterAfricaCountry();
        // testFilterAsiaCountry();
        // testFilterEuropeCountry();
        // testFilterNorthAmericaCountry();
        // testFilterOceaniaCountry();
        // testFilterSouthAmericaCountry();
        // testFilterMostPopulousCountries();
        // testFilterLeastPopulousCountries();
        // testFilterLargestAreaCountries();
        // testFilterSmallestAreaCountries();
        // testFilterHighestGdpCountries();
        // testFilterLowestGdpCountries();
        System.out.println("hihi");
        

    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                * TODO: create Country and append countries into 
                * CountryArrayManager here.
                */
                Country newCountry = null;
                if (dataList.get(5).equals("Asia")){
                    newCountry = new AsiaCountry(dataList.get(0), dataList.get(1),
                                                Integer.parseInt(dataList.get(2)),
                                                Double.parseDouble(dataList.get(3)),
                                                Double.parseDouble(dataList.get(4)));
                } else if (dataList.get(5).equals("Africa")){
                    newCountry = new AfricaCountry(dataList.get(0), dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                } else if (dataList.get(5).equals("Oceania")){
                    newCountry = new OceaniaCountry(dataList.get(0), dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                } else if (dataList.get(5).equals("Europe")){
                    newCountry = new EuropeCountry(dataList.get(0), dataList.get(1),
                             Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                } else if (dataList.get(5).equals("South America")){
                    newCountry = new SouthAmericaCountry(dataList.get(0), dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                } else {
                    newCountry = new NorthAmericaCountry(dataList.get(0), dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }
                if(newCountry != null){
                    countryManager.append(newCountry);
                }
        }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        System.out.println("Countries sorted in increasing order by population:");
        for (Country country : countries) {
            System.out.println(country.getName() + ": " + country.getPopulation());
        }
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingPopulation();
        System.out.println("Countries sorted in decreasing order by population:");
        for (Country country : countries) {
            System.out.println(country.getName() + ": " + country.getPopulation());
        }
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingArea();
        System.out.println("Countries sorted in increasing order by area:");
        for (Country country : countries) {
            System.out.println(country.getName() + ": " + country.getArea());
        }
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingArea();
        System.out.println("Countries sorted in decreasing order by area:");
        for (Country country : countries) {
            System.out.println(country.getName() + ": " + country.getArea());
        }
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingGdp();
        System.out.println("Countries sorted in increasing order by GDP:");
        for (Country country : countries) {
            System.out.println(country.getName() + ": " + country.getGdp());
        }
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingGdp();
        System.out.println("Countries sorted in decreasing order by GDP:");
        for (Country country : countries) {
            System.out.println(country.getName() + ": " + country.getGdp());
        }
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAfricaCountry();
        for (Country country : countries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLargestAreaCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterHighestGdpCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLowestGdpCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }
}

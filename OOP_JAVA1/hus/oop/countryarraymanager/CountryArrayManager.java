package hus.oop.countryarraymanager;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population 
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for(int i = 0; i < newArray.length-1; i++){
            for(int j = i + 1; j < newArray.length; j++){
                if(newArray[i].getPopulation() > newArray[j].getPopulation()){
                    Country tmp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = tmp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population 
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for(int i = 0; i < newArray.length-1; i++){
            for(int j = i + 1; j < newArray.length; j++){
                if(newArray[i].getPopulation() < newArray[j].getPopulation()){
                    Country tmp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = tmp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for(int i = 0; i < newArray.length-1; i++){
            for(int j = i + 1; j < newArray.length; j++){
                if(newArray[i].getArea() > newArray[j].getArea()){
                    Country tmp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = tmp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for(int i = 0; i < newArray.length-1; i++){
            for(int j = i + 1; j < newArray.length; j++){
                if(newArray[i].getArea() < newArray[j].getArea()){
                    Country tmp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = tmp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for(int i = 0; i < newArray.length-1; i++){
            for(int j = i + 1; j < newArray.length; j++){
                if(newArray[i].getGdp() > newArray[j].getGdp()){
                    Country tmp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = tmp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for(int i = 0; i < this.length-1; i++){
            for(int j = i + 1; j < this.length; j++){
                if(newArray[i].getGdp() < newArray[j].getGdp()){
                    Country tmp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = tmp;
                }
            }
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        int count = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof AfricaCountry){
                count++;
            }
        }
        AfricaCountry[] africaCountry = new AfricaCountry[count];
        int tmp = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof AfricaCountry){
                africaCountry[tmp++] = (AfricaCountry)countries[i];
            }
        }
        return africaCountry;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        int count = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof AsiaCountry){
                count++;
            }
        }
        AsiaCountry[] asiaCountry = new AsiaCountry[count];
        int tmp = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof AsiaCountry){
                asiaCountry[tmp++] = (AsiaCountry)countries[i];
            }
        }
        return asiaCountry;
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        int count = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof EuropeCountry){
                count++;
            }
        }
        EuropeCountry[] europeCountry = new EuropeCountry[count];
        int tmp = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof EuropeCountry){
                europeCountry[tmp++] = (EuropeCountry)countries[i];
            }
        }
        return europeCountry;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        int count = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof NorthAmericaCountry){
                count++;
            }
        }
        NorthAmericaCountry[] northAmericaCountry = new NorthAmericaCountry[count];
        int tmp = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof NorthAmericaCountry){
                northAmericaCountry[tmp++] = (NorthAmericaCountry)countries[i];
            }
        }
        return northAmericaCountry;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        int count = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof OceaniaCountry){
                count++;
            }
        }
        OceaniaCountry[] oceaniaCountry = new OceaniaCountry[count];
        int tmp = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof OceaniaCountry){
                oceaniaCountry[tmp++] = (OceaniaCountry)countries[i];
            }
        }
        return oceaniaCountry;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        int count = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof SouthAmericaCountry){
                count++;
            }
        }
        SouthAmericaCountry[] southAmericaCountry = new SouthAmericaCountry[count];
        int tmp = 0;
        for(int i = 0; i < this.length; i++){
            if(countries[i] instanceof SouthAmericaCountry){
                southAmericaCountry[tmp++] = (SouthAmericaCountry)countries[i];
            }
        }
        return southAmericaCountry;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] newArray = sortByDecreasingPopulation();
        Country[] resultArray = new Country[howMany];
        for(int i = 0; i < howMany; i++){
            resultArray[i] = newArray[i];
        }
        return resultArray;

    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] newArray = sortByIncreasingPopulation();
        Country[] resultArray = new Country[howMany];
        for(int i = 0; i < howMany; i++){
            resultArray[i] = newArray[i];
        }
        return resultArray;

    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] newArray = sortByDecreasingArea();
        Country[] resultArray = new Country[howMany];
        for(int i = 0; i < howMany; i++){
            resultArray[i] = newArray[i];
        }
        return resultArray;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] newArray = sortByIncreasingArea();
        Country[] resultArray = new Country[howMany];
        for(int i = 0; i < howMany; i++){
            resultArray[i] = newArray[i];
        }
        return resultArray;

    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] newArray = sortByDecreasingGdp();
        Country[] resultArray = new Country[howMany];
        for(int i = 0; i < howMany; i++){
            resultArray[i] = newArray[i];
        }
        return resultArray;

    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] newArray = sortByIncreasingGdp();
        Country[] resultArray = new Country[howMany];
        for(int i = 0; i < howMany; i++){
            resultArray[i] = newArray[i];
        }
        return resultArray;

    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }
        
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}

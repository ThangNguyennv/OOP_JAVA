package book;
import java.util.*;
import java.io.*;
public class App {
    private final static String COMMA_DELIMITER = ",";
    private final static BookManager bookManager = new BookManager();

    public App() {

    }

    public static void init() {
        String filePath = "data_bookmanager/books.csv";
        readListData(filePath);
    }

    public static void main(String[] args) {
        init();
        filterBooksPagesHigherThan();
        filterBooksPagesLowerThan();
        testFilterBooksOfAuthor();
        testFilterBooksOfGenre();
        testFilterBooksOfPublisher();
        testOriginalData();
        testPriceOfBooksDecresing();
        testPriceOfBooksIncreasing();
        testSortDecreasingGenreAndPrice();
        testSortIncreasingGenreAndPrice();
    }

    public static String[] parseDataLineToArray(String dataline) {
        if(dataline == null) {
            return null;
        }
        return dataline.split(COMMA_DELIMITER);
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
                 * TODO: create Book and append books into BookManager here.
                 */
                Book newBook = null;
                newBook = new Book(dataList.get(0), 
                            dataList.get(1),
                            dataList.get(2),
                            Integer.parseInt(dataList.get(3)), 
                            Double.parseDouble(dataList.get(4)), 
                            dataList.get(5));
                if (newBook != null) {
                    bookManager.append(newBook);
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

    public static void writeListData(String fileName, List<String> functionResults) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String result : functionResults) {
                writer.write(result);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void filterBooksPagesHigherThan() {
        List<Book> listBooksPagesHigherThan = bookManager.filterBooksPagesHigherThan(100);
        for(Book book : listBooksPagesHigherThan) {
            System.out.println(book.toString());
        }
    }

    public static void filterBooksPagesLowerThan() {
        List<Book> listBooksPagesLowerThan = bookManager.filterBooksPagesLowerThan(100);
        for(Book book : listBooksPagesLowerThan) {
            System.out.println(book.toString());
        }
    }

    public static void testFilterBooksOfAuthor() {
        List<Book> listBooksOfAuthor = bookManager.filterBooksOfAuthor("Jane Austen");
        for(Book book : listBooksOfAuthor) {
            System.out.println(book.toString());
        }
    }

    public static void testFilterBooksOfGenre() {
        List<Book> listBooksOfGenre = bookManager.filterBooksOfGenre("Philosophical");
        for(Book book : listBooksOfGenre) {
            System.out.println(book.toString());
        }
    }

    public static void testFilterBooksOfPublisher() {
        List<Book> listBooksOfPublisher = bookManager.filterBooksOfPublisher("Wordsworth Editions");
        for(Book book : listBooksOfPublisher) {
            System.out.println(book.toString());
        }
    }

    public static void testOriginalData() {
        String codesString = bookManager.titleOfBooksToString(bookManager.getBookList());
        System.out.print(codesString);
    }

    public static void testPriceOfBooksDecresing() {
        List<Book> listPriceOfBooksDecresing = bookManager.sortDecreasingPrice();
        for(Book book : listPriceOfBooksDecresing) {
            System.out.println(book.toString());
        }
    }

    public static void testPriceOfBooksIncreasing() {
        List<Book> listPriceOfBooksIncreasing = bookManager.sortIncresingPrice();
        for(Book book : listPriceOfBooksIncreasing) {
            System.out.println(book.toString());
        }
    }

    public static void testSortDecreasingGenreAndPrice() {
        List<Book> listSortDecreasingGenreAndPrice = bookManager.sortDecreasingGenreAndPrice();
        for(Book book : listSortDecreasingGenreAndPrice) {
            System.out.println(book.toString());
        }
    }

    public static void testSortIncreasingGenreAndPrice() {
        List<Book> listSortIncreasingGenreAndPrice = bookManager.sortIncreasingGenreAndPrice();
        for(Book book : listSortIncreasingGenreAndPrice) {
            System.out.println(book.toString());
        }   
    }
}

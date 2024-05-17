package book;
import java.util.*;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public void add(Book book, int index) {
        bookList.add(index, book);
    }

    public void append(Book book) {
        bookList.add(book);
    }

    public Book bookAt(int index) {
        if (index >= 0 && index < bookList.size()) {
            return bookList.get(index);
        }
        return null;
    }

    public boolean checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            return false;
        } else {
            return true;
        }
    }

    public List<Book> filterBookHighestPages(int howMany) {
        List<Book> listDecreasingPages = sortDecreasingPages();
        List<Book> listBookHighestPages = new ArrayList<>();
        for(int i = 0; i < howMany; i++) {
            listBookHighestPages.add(listDecreasingPages.get(i));
        }
        return listBookHighestPages;
    }

    public List<Book> filterBookLowestPages(int howMany) {
        List<Book> listIncresingPages = sortIncreasingPages();
        List<Book> listBookLowesPages = new ArrayList<>();
        for(int i = 0; i < howMany; i++) {
            listBookLowesPages.add(listIncresingPages.get(i));
        }
        return listBookLowesPages;
    }

    public List<Book> filterBooksOfAuthor(String nameAuthor) {
        List<Book> listBooksOfAuthor = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getAuthor().equals(nameAuthor)) {
                listBooksOfAuthor.add(bookList.get(i));
            }
        }
        return listBooksOfAuthor;
    }

    public List<Book> filterBooksOfGenre(String nameGenre) {
        List<Book> listBooksOfGenre = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getGenre().equals(nameGenre)) {
                listBooksOfGenre.add(bookList.get(i));
            }
        }
        return listBooksOfGenre;
    }

    public List<Book> filterBooksOfPublisher(String namePublisher) {
        List<Book> listBooksOfPublisher = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getPublisher().equals(namePublisher)) {
                listBooksOfPublisher.add(bookList.get(i));
            }
        }
        return listBooksOfPublisher;
    }

    public List<Book> filterBooksPagesHigherThan(double threshold) {
        List<Book> listBooksPagesHigherThan = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getPages() > threshold) {
                listBooksPagesHigherThan.add(bookList.get(i));
            }
        }
        return listBooksPagesHigherThan;
    }

    public List<Book> filterBooksPagesLowerThan(double threshold) {
        List<Book> listBooksPagesLowerThan = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getPages() < threshold) {
                listBooksPagesLowerThan.add(bookList.get(i));
            }
        }
        return listBooksPagesLowerThan;
    }

    public List<Book> getBookList() {
        return this.bookList;
    }

    public void print(List<Book> listBook) {
        for (Book book : listBook) {
            System.out.println(book.toString());
        }
    }

    public void remove(Book book) {
        bookList.remove(book);
    }

    public void remove(int index) {
        bookList.remove(index);
    }

    public List<Book> sortDecreasingGenreAndPrice() {
        List<Book> sortedBooks = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            sortedBooks.add(bookList.get(i));
        }
        Collections.sort(sortedBooks, new Comparator<Book>(){
            public int compare(Book book1, Book book2) {
                int genreComparison = book2.getGenre().compareTo(book1.getGenre());
                if (genreComparison != 0) {
                    return genreComparison;
                }
                return Double.compare(book2.getPrice(), book1.getPrice());
            }
        });
        return sortedBooks;
    }

    public List<Book> sortDecreasingPages() {
        List<Book> sortedBooks = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            sortedBooks.add(bookList.get(i));
        }
        for(int i = 0; i < sortedBooks.size() - 1; i++) {
            for(int j = i + 1; j < sortedBooks.size(); j++) {
                if(sortedBooks.get(i).getPages() < sortedBooks.get(j).getPages()) {
                    Book temp = sortedBooks.get(i);
                    sortedBooks.set(i, sortedBooks.get(j));
                    sortedBooks.set(j, temp);
                }
            }
        }
        return sortedBooks;
    }

    public List<Book> sortDecreasingPrice() {
        List<Book> sortedBooks = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            sortedBooks.add(bookList.get(i));
        }
        for(int i = 0; i < sortedBooks.size() - 1; i++) {
            for(int j = i + 1; j < sortedBooks.size(); j++) {
                if(sortedBooks.get(i).getPrice() < sortedBooks.get(j).getPrice()) {
                    Book temp = sortedBooks.get(i);
                    sortedBooks.set(i, sortedBooks.get(j));
                    sortedBooks.set(j, temp);
                }
            }
        }
        return sortedBooks;
    }

    public List<Book> sortIncreasingByGenreAndTitle() {
        List<Book> sortedBooks = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            sortedBooks.add(bookList.get(i));
        }
        Collections.sort(sortedBooks, new Comparator<Book>(){
            public int compare(Book book1, Book book2) {
                int genreComparison = book1.getGenre().compareTo(book2.getGenre());
                if (genreComparison != 0) {
                    return genreComparison;
                }
                return book1.getTitle().compareTo(book2.getTitle());
            }
        });
        return sortedBooks;
    }

    public List<Book> sortIncreasingGenreAndPrice() {
        List<Book> sortedBooks = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            sortedBooks.add(bookList.get(i));
        }
        Collections.sort(sortedBooks, new Comparator<Book>(){
            public int compare(Book book1, Book book2) {
                int genreComparison = book1.getGenre().compareTo(book2.getGenre());
                if (genreComparison != 0) {
                    return genreComparison;
                }
                return Double.compare(book1.getPrice(), book2.getPrice());
            }
        });
        return sortedBooks;
    }

    public List<Book> sortIncreasingPages() {
        List<Book> result = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            result.add(bookList.get(i));
        }
        for(int i = 0; i < result.size() - 1; i++) {
            for(int j = i + 1; j < result.size(); j++) {
                if(result.get(i).getPages() > result.get(j).getPages()) {
                    Book temp = result.get(i);
                    result.set(i, result.get(j));
                    result.set(j, temp);
                }
            }
        }
        return result;
    }

    public List<Book> sortIncresingPrice() {
        List<Book> result = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            result.add(bookList.get(i));
        }
        for(int i = 0; i < result.size() - 1; i++) {
            for(int j = i + 1; j < result.size(); j++) {
                if(result.get(i).getPrice() > result.get(j).getPrice()) {
                    Book temp = result.get(i);
                    result.set(i, result.get(j));
                    result.set(j, temp);
                }
            }
        }
        return result;
    }

    public String titleOfBooksToString(List<Book> listBook) {
        StringBuilder sb = new StringBuilder();
        for (Book book : listBook) {
            sb.append(book.getTitle()).append(", ");
        }
        // Xoa dau ', ' cuoi cung
        if(sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}

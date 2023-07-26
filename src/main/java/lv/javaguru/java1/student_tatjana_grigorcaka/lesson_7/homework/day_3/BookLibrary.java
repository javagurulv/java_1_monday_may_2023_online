package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_3;


import java.util.ArrayList;
import java.util.List;

class BookLibrary {
    public static void main(String[] args) {

        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943, 50);
        Book book2 = new Book("The Alchemist ", "Paulo Coelho", 1988, 100);

        List<Book> allBooks = new ArrayList<>();
        //count books
        int size = allBooks.size();
        //add book
        allBooks.add(book1);
        allBooks.add(book2);

        for (int i = 0; i < allBooks.size(); i++) {
            Book book = allBooks.get(i);
        }
    }

    private List<Book> allBooks = new ArrayList<>();

   public void addBook(List<Book> allBooks, String title, String author, int year, int page) {
        allBooks.add(new Book(title, author, year, page)); }

    public List<Book> findBookByTitle(List<Book> allBooks, String title) {
        List<Book> findTitle = new ArrayList<>();
        for (int i = 0; i < allBooks.size(); i++) {
            Book book = allBooks.get(i);
            if (book.getTitle().equals(title))
            {
                System.out.println("RESULT: " + book.getTitle() + " " + title);
                findTitle.add(book);
            }
        }
        return findTitle;
    }

    public List<Book> findBookByAuthor(List<Book> allBooks, String author) {
        List<Book> findAuthor = new ArrayList<>();
        for (int i = 0; i < allBooks.size(); i++) {
            Book book = allBooks.get(i);
            if (book.getAuthor().equals(author))
            {
                System.out.println("RESULT: " + book.getAuthor() + " " + author);
                findAuthor.add(book);
            }
        }
        return findAuthor;
    }

    public int sumPage(List<Book> allBooks, String author) {
        int sum = 0;
        for (int i = 0; i < allBooks.size(); i++) {
            Book book = allBooks.get(i);
            if (book.getAuthor().equals(author))
            {
                System.out.println("RESULT: " + book.getAuthor() + " " + author);
                sum = sum + book.getPage();
            }
        }
        return sum;
    }

    public int countBooks(List<Book> allBooks) {
        int count = allBooks.size();
        return count;
    }

    public void removeBook(List<Book> allBooks, String title, String author, int year) {
        for (int i = 0; i < allBooks.size(); i++) {
            Book book = allBooks.get(i);
            if ((book.getYear() == year) && (book.getTitle().equals(title)) && (book.getAuthor().equals(author)))
            {
                allBooks.remove(book);
            }
        }
    }
}




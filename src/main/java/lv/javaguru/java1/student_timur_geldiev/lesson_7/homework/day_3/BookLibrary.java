package lv.javaguru.java1.student_timur_geldiev.lesson_7.homework.day_3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookLibrary {

    public static void main(String[] args) {

        Book book1 = new Book("The Grapes of Wrath", "John Steinbeck", 1939);

        List<Book> books = new ArrayList<>();
        books.add(book1);


        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

        }

        BookLibrary test = new BookLibrary();
        test.checkAmountOfList(books);
        test.checkFindBookName(books);
        test.checkFindAuthor(books);
        test.checkDeleteBook(books);

    }
    public List<Book> findBookName(List<Book> bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title of book you want to find: ");
        String title = sc.nextLine();
        List<Book> foundBook = new ArrayList<>();
        for (int i=0; i<bookList.size(); i++){
            Book book = bookList.get(i);
            if(book.getTitle().equals(title)){
                foundBook.add(book);

            }
        }return foundBook;

    }
    public List<Book> findBookByAuthor(List<Book> bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter author you want to find: ");
        String author = sc.nextLine();
        List<Book> foundAuthor = new ArrayList<>();
        for (int i=0; i<bookList.size(); i++){
            Book book = bookList.get(i);
            if(book.getAuthor().equals(author)){
                foundAuthor.add(book);

            }
        }return foundAuthor;

    }
    public List<Book> deleteBook(List<Book> bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title you want to delete: ");
        String title = sc.nextLine();
        System.out.println("Enter author you want to delete: ");
        String author = sc.nextLine();
        System.out.println("Enter release year you want to delete: ");
        int year = sc.nextInt();
        List<Book> foundBook = new ArrayList<>();
        for (int i=0; i<bookList.size(); i++){
            Book book = bookList.get(i);
            if(book.getAuthor().equals(author) || book.getTitle().equals(title) || book.getReleaseYear() == year){
                foundBook.remove(book);

            }
        }return foundBook;

    }
    public void checkAmountOfList(List<Book> books){
        int expected = 1;
        int actual = books.size();
        if(actual == expected){
            System.out.println("Pass");
        } else{
            System.out.println("Fail");
        }
    }
    public void checkFindBookName(List<Book> books){
        String  expected = "The Grapes of Wrath";
        List<Book> foundBooks = findBookName(books);
        boolean found = false;
        for (Book book : foundBooks) {
            if (book.getTitle().equals(expected)) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
    public void checkFindAuthor(List<Book> books){
        String  expected = "John Steinbeck";
        List<Book> foundAuthor = findBookByAuthor(books);
        boolean found = false;
        for (Book book : foundAuthor) {
            if (book.getAuthor().equals(expected)) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
    public void checkDeleteBook(List<Book> books){
        String  expected = "The Grapes of Wrath";
        List<Book> foundBooks = deleteBook(books);
        boolean notFound = true;
        for (Book book : foundBooks) {
            if (book.getTitle().equals(expected)) {
                notFound = false;
                break;
            }
        }
        if(notFound){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}

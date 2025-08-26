/*
Exercise 1: Array of Objects 
Bruce Eckel emphasizes that arrays of objects store references, not objects themselves. 
Task 
1. Create a class Book with fields title and author. 
2. Create an array of 3 Book references. 
3. Initialize each element with a new Book object. 
4. Print out the titles of all books. 
*/
class Book {
    String title;
    String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
public class exercise1{
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("4 hours work week", "tim ferris");
        books[1] = new Book("Rich dad Poor dad", "Robrt kiyosaki");
        books[2] = new Book("Atomic habbits", "james clear");
        System.out.println("title : ");
        for (int i=0;i<3;i++) {
            System.out.println(books[i].title);
        }
    }
}
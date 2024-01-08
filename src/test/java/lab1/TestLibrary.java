package lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLibrary {
    private Library library;
    private Book book1;
    @BeforeEach
    public void generateLibrary(){
        library = new Library();
        book1 = new Book("1984", "George Orwell", "00000001", 1949);
    }
    @Test
    public void testAddBook(){
        library.addBook(book1);
        Assertions.assertEquals(2, library.getLibrary().size());
    }
    @Test
    public void testFindBook(){
        library.addBook(book1);

        Book bookFound = library.findBook(book1.getTitle());
        Assertions.assertEquals("1984", bookFound.getTitle());
    }
    @Test
    public void testRemovedBookFound(){
        library.addBook(book1);
        String bookRemoved = library.removeBook("00000001");
        Assertions.assertEquals("The book was removed!", bookRemoved);
    }
    @Test
    public void testRemovedBookNotFound() {
        library.addBook(book1);
        ;
        String bookRemoved = library.removeBook("0000002");
        Assertions.assertEquals("The book was not found!", bookRemoved);
    }
}

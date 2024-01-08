package lab1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "333333333", 1937));
        library.addBook(new Book("The Great Gatsby", "F.Scott Fitzgerald", "222222222", 1925));
        library.addBook(new Book("The little prince", "Antoine de Saint-Exupery", "111111111", 1943));

        System.out.println("Library before changes: ");
        library.showBooks();

        Book isBookFound = library.findBook("The Hobbit");
        if (isBookFound != null) {
            System.out.println("The book was found: ");
            library.showBookInfo(isBookFound);
        } else {
            System.out.println("The book was not found!");
        }
        String isBookRemoved = library.removeBook("111111111");
        System.out.println(isBookRemoved + "\n");
        //Checking library after changes
        System.out.println("Library after changes: ");
        library.showBooks();
    }
}

package lab6;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema( 10, 20);
        int[] seatsBook = {3, 4, 5};
        cinema.bookSeats(1, 2, seatsBook);
        cinema.printSeatingArrangement(0);
    }
}

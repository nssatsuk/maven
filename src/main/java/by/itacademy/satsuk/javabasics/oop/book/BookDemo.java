package by.itacademy.satsuk.javabasics.oop.book;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("101474756", "(Ня)бачная Беларусь", "Шуфлядка Писателя",
                "27.42 BYN", "Шуфлядка Писателя", "2026", 336);
        Book book2 = new Book("10150463", "Сёстры", "Ксения Зарецкая",
                "36.67 BYN", "Издательство OZ", "2026", 448);
        Book book3 = new Book("101513699", "Над Нёманам", "Эліза Ажэшка",
                "38.42 BYN", "Папуры", "2026", 496);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}

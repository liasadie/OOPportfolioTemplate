public class Bookshelf {
    public static void main(String[] args) {
        Book book1 = new Book("The Hunger Games", "Suzanne Collins", "Scholastic Press", 2008);
        Book book2 = new Book("Harry Potter and the philosopher's stone", "J.K. Rowling", "Bloomsbury", 1997);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925);

        System.out.println(book1);
        System.out.println("\n" + book2);
        System.out.println("\n" + book3);

        book1.setTitle("The Lord of the Rings");
        book1.setAuthor("J.R.R. Tolkien");
        book1.setPublisher("George Allen & Unwin");
        book1.setCopyrightDate(1954);

        System.out.println("\nUpdated Book1:\n" + book1);
    }
}

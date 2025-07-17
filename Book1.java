class Author {
    String name;
    Author(String name) { this.name = name; }
}

class Book1 {
    String title;
    Author author;
    Book1(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book1 b = new Book1("Harry Potter", new Author("J.K. Rowling"));
        System.out.println(b.title + " by " + b.author.name);
    }
}
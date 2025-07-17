class Author {
    String name, email;
    char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return name + " (" + gender + ") - " + email;
    }
}

class Book {
    String name;
    Author author;
    double price;
    int qty;

    Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String toString() {
        return "Book: " + name + "\nAuthor: " + author + 
               "\nPrice: ₹" + price + "\nStock: " + qty;
    }

    public static void main(String[] args) {
        Author a = new Author("J.K. Rowling", "jk@example.com", 'F');
        Book b = new Book("Harry Potter", a, 499.99, 100);
        System.out.println(b);
    }
}
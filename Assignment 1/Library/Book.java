public class Book {
    public String name;
    public String author;

    public Book(String name, String author) {
        setAuthor(author);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

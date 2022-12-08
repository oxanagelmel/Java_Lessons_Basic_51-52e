package lesson7Dez06;

public class Book { //Rechte Maustaste -> Generate -> Constructor
    private int page;
    private String name;
    private String author;

    public int getPage() { //-"- -> Getter
        return page;
    }

    public String getName() {
        return name;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public Book(int page, String name, String author) {
        this.page = page;
        this.name = name;
        this.author = author;
    }

    public Book(int page, String name) {
        this.page = page;
        this.name = name;
    }
}

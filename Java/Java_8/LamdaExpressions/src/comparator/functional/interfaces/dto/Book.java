package comparator.functional.interfaces.dto;


public class Book {

    private String name;
    private String pages;

    public Book(String name, String pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages='" + pages + '\'' +
                '}';
    }
}

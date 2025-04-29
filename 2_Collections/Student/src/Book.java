public class Book {
    private String name;
    private int year;
    private int numberOfPages;

    public Book(String name, int year, int numberOfPages) {
        this.name = name;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "[Название книги: " + name + ", год выпуска: "
                + year + ", количество страниц: " + numberOfPages + "]";
    }
}

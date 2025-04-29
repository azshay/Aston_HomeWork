import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String group;
    private List<Book> books;

    public Student(String name, String surname, String group, List<Book> books) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return String.format("[Имя: %s]\n[Фамилия: %s]\n[Группа: %s]\n[Книги: %s]",
                name, surname, group, books);
    }
}

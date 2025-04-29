import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        List<Book> books1 = Arrays.asList(
                new Book("Book1", 1999, 200),
                new Book("Book2", 2005, 150),
                new Book("Book3", 2010, 300),
                new Book("Book4", 2001, 250),
                new Book("Book5", 1998, 180)
        );

        List<Book> books2 = Arrays.asList(
                new Book("Book6", 2003, 220),
                new Book("Book7", 2007, 190),
                new Book("Book8", 2015, 280),
                new Book("Book9", 2002, 210),
                new Book("Book10", 1995, 170)
        );

        List<Book> books3 = Arrays.asList(
                new Book("Book11", 2004, 230),
                new Book("Book12", 2008, 260),
                new Book("Book13", 2012, 290),
                new Book("Book14", 2006, 240),
                new Book("Book15", 1997, 160)
        );

        List<Book> books4 = Arrays.asList(
                new Book("Book16", 2009, 270),
                new Book("Book17", 2011, 310),
                new Book("Book18", 2000, 200),
                new Book("Book19", 1996, 140),
                new Book("Book20", 2018, 320)
        );

        List<Book> books5 = Arrays.asList(
                new Book("Book21", 1954, 432),
                new Book("Book22", 2001, 552),
                new Book("Book23", 2044, 122),
                new Book("Book24", 2059, 244),
                new Book("Book25", 2199, 555)
        );

        students.add(new Student("Роман", "Погорелов", "ПИ-410", books1));
        students.add(new Student("Евгений", "Локтев", "ПИ-410", books2));
        students.add(new Student("Артур", "Симоненко", "ПИ-410", books3));
        students.add(new Student("Динар", "Тругов", "ПИ-410", books4));
        students.add(new Student("Ильдар", "Смирнов", "ПИ-410", books5));

        students.stream().peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt((Book::getNumberOfPages)))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Год найденной книги: " + year),
                        () -> System.out.println("Книга не найдена")
                );
    }
}

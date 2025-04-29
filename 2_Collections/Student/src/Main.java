import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Java для чайников", "Евгений Тапочкин"));
        books.add(new Book("Java для новеньких", "Артем Долгопрудов"));
        books.add(new Book("Java для стареньких", "Шарон Желудев"));

        students.add(new Student("Роман", "Погорелов", "ПИ-410", books));
        students.add(new Student("Евгений", "Локтев", "ПИ-410", books));
        students.add(new Student("Артур", "Симоненко", "ПИ-410", books));
        students.add(new Student("Динар", "Тругов", "ПИ-410", books));

        students.stream().peek();
    }
}

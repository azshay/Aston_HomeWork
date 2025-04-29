import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static MyArrayList<Integer> myArrayList = new MyArrayList<>();
    static ArrayList<Integer> test = new ArrayList<>();

    public static void main(String[] args) {
        // Тесты для собственного аналога ArrayList

        MyArrayList<String> languages = new MyArrayList<>();
        System.out.println("Создан новый список: " + languages);
        System.out.println("Пустой ли список? " + languages.isEmpty());

        languages.add("Java");
        languages.add("C++");
        languages.add(1, "Python");
        System.out.println("\nПосле добавления элементов: " + languages);
        System.out.println("Размер списка: " + languages.size());
        System.out.println("Элемент по индексу 2: " + languages.get(2));

        List<String> webLanguages = Arrays.asList("JavaScript", "PHP", "HTML");
        languages.addAll(webLanguages);
        System.out.println("\nПосле addAll в конец: " + languages);

        List<String> mobileLanguages = Arrays.asList("Kotlin", "Dart");
        languages.addAll(2, mobileLanguages);
        System.out.println("После addAll по индексу 2: " + languages);

        MyArrayList<Integer> numbers = new MyArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.addAll(Arrays.asList(30, 40, 50));
        System.out.println("\nСписок чисел: " + numbers);

        // Тесты для собственного аналога HashSet
    }
}

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    static MyArrayList<String> languages = new MyArrayList<>();
    static MyHashSet<String> myHashSet = new MyHashSet<>();

    public static void main(String[] args) {
        // Тесты для собственного аналога ArrayList

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

        System.out.println("\nТесты для HashSet:\n");

        System.out.println("Добавление элементов:");
        System.out.println("add('Java'): " + myHashSet.add("Java"));
        System.out.println("add('Python'): " + myHashSet.add("Python"));
        System.out.println("add('Java'): " + myHashSet.add("Java"));
        System.out.println("Set: " + myHashSet);

        System.out.println("\nПроверка содержимого:");
        System.out.println("contains('Python'): " + myHashSet.contains("Python"));
        System.out.println("size(): " + myHashSet.size());
        System.out.println("contains('C++'): " + myHashSet.contains("C++"));
        System.out.println("size(): " + myHashSet.size());

        System.out.println("\nУдаление элементов:");
        System.out.println("remove('Python'): " + myHashSet.remove("Python"));
        System.out.println("size(): " + myHashSet.size());
        System.out.println("remove('C++'): " + myHashSet.remove("C++"));
        System.out.println("Set: " + myHashSet);
        System.out.println("size(): " + myHashSet.size());

        System.out.println("\nДобавление нескольких элементов:");
        myHashSet.add("JavaScript");
        myHashSet.add("Kotlin");
        myHashSet.add("Go");
        System.out.println("Set: " + myHashSet);
        System.out.println("size(): " + myHashSet.size());
    }
}

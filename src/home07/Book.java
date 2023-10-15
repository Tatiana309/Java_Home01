package home07;

public class Book {
    // модификатор private - свойство, конструктор, метод доступны только в текущем классе
    private String name; // значение по умолчанию null (как и для всех ссылочных типов)
    private boolean isPublished; // // значение по умолчанию false (для типа boolean)
    // хранит ссылки на нескольких авторов
    private Author[] authors;

    // ПКМ -> Generate -> Constructor
    // numberOfAuthors - размер массива authors
    // значение numberOfAuthors должно находиться в диапазоне [1, 5)
    public Book(String name, int numberOfAuthors) {
        setName(name); // вызов метода внутри класса

        //Задание 1
        if (numberOfAuthors < 1 || numberOfAuthors >= 5) {
            throw new IllegalArgumentException("numberOfAuthors must be in range [1, 5)");
        }
        authors = new Author[numberOfAuthors];
        for (int i = 0; i < numberOfAuthors; i++) {
            authors[i] = new Author();
        }
    }

    // ПКМ -> Generate -> Setter
    public void setName(String name) { // Setter
        // if (name == null) return;
        if (name == null) { // если значение name равно null
            // будет выброшено исключение, программа завершит выполнение с ошибкой
            throw new IllegalArgumentException("name not null");
        }
        this.name = name;
    }

    // ПКМ -> Generate -> Getter
    public String getName() { // Getter
        return name;
    }
    // ПКМ -> Generate -> Setter and Getter

    // метод добавления нового автора в массив authors
    // author не может быть null ссылкой
    // новые авторы не должны перезаписывать уже существующих в массиве

    //Задание 2
    public void addAddAuthor(Author author) {

        if (author == null) {
            throw new IllegalArgumentException("author cannot be null");
        }
        int newSize = authors.length +1; // Увеличиваем размер на один элемент
        Author[] newAuthors = new Author[newSize];
        System.arraycopy(authors, 0, newAuthors, 0, authors.length);
        authors = newAuthors;
        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null) {
                boolean exists = false;
                for (int j = 0; j < authors.length; j++) {
                    if (authors[j] == author) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    authors[i] = author;
                    return;
                }
            }
        }


    }

    //вывод данных для проверки метода
    public String Info() {
        String spisokAuthors = "";
        for (int j = 0; j < authors.length; j++) {
            spisokAuthors += authors[j].getInfo() + " ";
        }
        return name + spisokAuthors;
    }
}

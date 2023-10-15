package home07;

public class Home07 {
    public static void main(String[] args) {
        Author author01 = new Author(1);
        System.out.println(author01.id); // 1
        author01.name = "Tom";
        Author author02 = new Author(2, "Jack");
        author02.name = "   ";
        author02.id = -300;
        Author author03 = new Author();

        String info02 = author02.getInfo();
        author02.printInfo();
        author02.getInfo(null);
        author03.getInfo("author03");

        Book book01 = new Book("Java", 2);
        book01.setName("Java 21");
        // book01.setName(null);
        book01.addAddAuthor(author01);
        book01.addAddAuthor(author02);
        book01.addAddAuthor(author03);


        System.out.println("Test ");
        Book book02=new Book("Test",3);
        System.out.println(book02.Info());
        book02.addAddAuthor(author01);
        System.out.println(book02.Info());


        //задание 3

        Cat cat1 = new Cat("Мурка", 2.5);
        Cat cat2 = new Cat("Барсик", 3.2);

        System.out.println(cat2.attack(cat1));
        System.out.println(cat1.getVictories());
        System.out.println(cat2.getVictories());
    }
}

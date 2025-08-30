//        (Задание № 1)

class Animal{
    String name;
    String type;


    void animalInfo(){
        System.out.println(" Это: " + type + ", по имени " + name);
    }

}


//        (Задание № *3)


class Book{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString(){
        return title + "(" + author + ")";
    }
}

//        (Задание № 2)

class Library {
    private Book[] books;
    private int count;


    public Library(int size) {
        books = new Book[size];
        count = 0;
    }


    public void addBook(String title, String author) {
        if (count < books.length) {
            books[count] = new Book(title, author);
            count++;
            System.out.println("Книга " + title + " добавлена в библиотеку.");
        } else {
            System.out.println("Библиотека заполнена. Невозможно добавить книгу " + title + ".");
        }
    }

    public void showBooks() {
        if (count == 0) {
            System.out.println("Библиотека пуста.");
            return;
        }
        System.out.println("Список книг в библиотеке:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    public String findBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return "Книга " + title + " найдена.";
            }

        }
        return "Книга " + title + " не найдена.";
    }


    public String getAuthorByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return "Автор книги \"" + title + "\": " + books[i].getAuthor();
            }
        }
        return "Книга \"" + title + "\" не найдена.";
    }
}







    public class HW9 {
        public static void main(String[] args) {

            //                (ДЗ № 9)
            System.out.println("ДЗ № 9");


            //        (Задание № 1)

            System.out.println(" ");
            System.out.println("Первое задание:");
            System.out.println(" ");


            Animal example1 = new Animal();

            example1.type = "Кот";
            example1.name = "Мурзик";

            example1.animalInfo();

            Animal example2 = new Animal();

            example2.type = "Собака";
            example2.name = "Джек";

            example2.animalInfo();


            //        (Задание № 2)

            System.out.println(" ");
            System.out.println("Второе задание:");
            System.out.println(" ");


            Library book1 = new Library(4);

            book1.addBook("Дети Капитана Гранта", "Жуль Верн");
            book1.addBook("Ромео и Джульета", "Уильям Шекспир");
            book1.addBook("Гарри Поттер и филосовский камень", "Джоан Роулинг");
            book1.addBook("Война и мир", "Лев Толстой");
            book1.addBook("Карлсон", "Астрид Линдгрен");

            book1.showBooks();

            System.out.println(book1.findBook("Гарри Поттер и филосовский камень"));
            System.out.println(book1.findBook("Карлсон"));

            System.out.println(book1.getAuthorByTitle("Дети Капитана Гранта"));
            System.out.println(book1.getAuthorByTitle("Война и мир"));

        }
    }

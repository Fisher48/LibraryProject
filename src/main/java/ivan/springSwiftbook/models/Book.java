package ivan.springSwiftbook.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Book {

    int id;

    @NotEmpty(message = "Название книги должно быть заполнено")
    String title;

    @NotEmpty(message = "Автор должен быть указан")
    String author;

    @Min(value = 1200, message = "Год издания должен быть больше 1200")
    int year;

    public Book() {

    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

package ivan.springSwiftbook.models;

import javax.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "ФИО не может быть пустым")
    private String full_name;
    
    @Min(value = 1900, message = "Год рождения должен быть выше 1900")
    private Integer birthdate;

    // Страна, Город, Индекс (6 цифр)
    // Russia, Moscow, 562712
//    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}",
//            message = "Your address should be in this format: Country, City, Postal Code (6 digits)")
//    private String address;

    public Person() {

    }

    public Person(int id, String full_name, Integer birthdate) {
        this.id = id;
        this.full_name = full_name;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Integer getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }
}



package entities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class client {

    private static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    private String Name;
    private String Email;
    private LocalDate Date;
    
    public client(String name, String email, LocalDate date) {
        Name = name;
        Email = email;
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String toString(){
        return Name + " " + Email+ " " + Date.format(fmt1);
    }
}

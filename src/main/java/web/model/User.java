package web.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "firstName")
    @NotEmpty(message = "First name should not be empty")
    @NotBlank(message = "First name should not be empty")
    @Size(min = 1, max = 30, message = "First name should be under 30 characters")
    private String firstName;

    @Column(name = "lastName")
    @NotEmpty(message = "Last name should not be empty")
    @NotBlank(message = "Last name should not be empty")
    @Size(min = 1, max = 30, message = "Last name should be under 30 characters")
    private String lastName;

    @Column(name = "email")
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Invalid email")
    private String email;

    public User() {

    }

    public User(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

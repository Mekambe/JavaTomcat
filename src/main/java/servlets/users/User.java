package servlets.users;

public class User {

   private String firstName;
   private String lastName;
    private String age;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public User(String firstName, String lastName, String age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
}

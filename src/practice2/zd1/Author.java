package practice2.zd1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public String getName(){return name;}

    public String getEmail(){return email;}

    public void setEmail(String email){this.email = email;}

    public char getGender(){return gender;}

    @Override
    public String toString(){
        return "Author{" +
                "Name - " + name +
                ", Email - " + email +
                ", Gender - " + gender + '\'' +
                "}";
    }
}
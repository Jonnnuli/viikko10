package userstorage.viikko9;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;
    protected int image;

    private ArrayList<String> degrees = new ArrayList<>();

    public User(String firstName, String lastName, String email, String degreeProgram, int image, ArrayList<String> degrees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.image = image;
        this.degrees = degrees;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public void setImage1(int image1) {
        if (image1 == 1) this.image = R.drawable.ukkeli1;
        if (image1 == 2) this.image = R.drawable.possu;
        if (image1 == 3) this.image = R.drawable.ukkeli2;
    }

    public int getImage() {
        return image;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public ArrayList<String> getDegrees() {
        return degrees;
    }

    public String getDegreesString() {
        String s = ", ";
        String degreeString = String.join(s, degrees);
        return degreeString;
    }

}

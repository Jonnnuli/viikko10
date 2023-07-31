package userstorage.viikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class AddUserActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    RadioButton radioButton1;
    RadioButton radioButton2;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup2 = findViewById(R.id.radioGroup2);

    }
    public void addUser(View view) {
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        radioButton1 = findViewById(radioButtonId);
        String degreeProgram = radioButton1.getText().toString();
        EditText firstName = findViewById(R.id.editTextFirstName);
        EditText lastName = findViewById(R.id.editTextLastName);
        EditText email = findViewById(R.id.editTextEmail);

        String firstNameString = firstName.getText().toString();
        String lastNameString = lastName.getText().toString();
        String emailString = email.getText().toString();

        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        CheckBox checkBox4 = findViewById(R.id.checkBox4);

        boolean isChecked1 = checkBox1.isChecked();
        boolean isChecked2 = checkBox2.isChecked();
        boolean isChecked3 = checkBox3.isChecked();
        boolean isChecked4 = checkBox4.isChecked();

        ArrayList<String> degrees = new ArrayList<>();

        if (isChecked1) {
            String cb1 = checkBox1.getText().toString();
            degrees.add(cb1);
        }

        if (isChecked2) {
            String cb2 = checkBox2.getText().toString();
            degrees.add(cb2);
        }

        if (isChecked3) {
            String cb3 = checkBox3.getText().toString();
            degrees.add(cb3);
        }

        if (isChecked4) {
            String cb4 = checkBox4.getText().toString();
            degrees.add(cb4);
        }

        int radioButtonId2 = radioGroup2.getCheckedRadioButtonId();
        radioButton2 = findViewById(radioButtonId2);
        String imageString = radioButton2.getText().toString(); // tulee Kuva 1, Kuva 2 tai Kuva 3
        int image = 0;
        if (imageString.equals("Kuva 1")) image = R.drawable.ukkeli1;
        if (imageString.equals("Kuva 2")) image = R.drawable.possu;
        if (imageString.equals("Kuva 3")) image = R.drawable.ukkeli2;

        UserStorage.getInstance().addUser(new User(firstNameString, lastNameString, emailString, degreeProgram, image, degrees));
        //UserStorage.getInstance().saveUsers(view.getContext());
        UserStorage.getInstance().saveUsers(this);
        Toast.makeText(this, "Lisäsit käyttäjän!", Toast.LENGTH_SHORT).show();

    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
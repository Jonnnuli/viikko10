package userstorage.viikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
App where you can add users and list them.
Jonna Helaakoski 2023
 */
public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserStorage us = UserStorage.getInstance();

        context = MainActivity.this;
        UserStorage.getInstance().loadUsers(context);

    }

    public void switchToAddUser(View view) {
        Intent intent = new Intent(this, AddUserActivity.class);
        startActivity(intent);
    }

    public void switchToUserList(View view) {
        //UserStorage.getInstance().saveUsers(context);
        //UserStorage.getInstance().loadUsers(context);
        Intent intent = new Intent(this, UserListActivity.class);
        startActivity(intent);
    }

    public void saveUsers(View view) {
        UserStorage.getInstance().saveUsers(context);
    }

    public void loadUsers(View view) {
        UserStorage.getInstance().loadUsers(context);
    }
}
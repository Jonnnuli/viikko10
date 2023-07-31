package userstorage.viikko9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import java.util.Collections;
import java.util.Comparator;

public class UserListActivity extends AppCompatActivity {

    private UserStorage userStorage;
    private RecyclerView recyclerView;

    private Adapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        userStorage = UserStorage.getInstance();
        recyclerView = findViewById(R.id.rvUserList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setAdapter(new UserListAdapter(getApplicationContext(), userStorage.getUsers()));

        //
        Collections.sort(userStorage.getUsers(), new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user1.getLastName().compareToIgnoreCase(user2.getLastName());
            }
        });
        recyclerView.setAdapter(new UserListAdapter(getApplicationContext(), userStorage.getUsers()));



    }

    public void goBack2(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
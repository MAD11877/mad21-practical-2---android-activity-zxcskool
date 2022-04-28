package sg.edu.np.madpractical2_zixian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User newuser = new User("World", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", 1, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView greet = findViewById(R.id.greeting);
        TextView description = findViewById(R.id.description);
        Button followbtn = findViewById(R.id.followbtn);
        greet.setText("Hello " + newuser.name + "!");
        description.setText(newuser.description);
        followbtn.setText("Follow");
    }

    public void onClick(View v){
        Button followbtn = findViewById(R.id.followbtn);
        boolean follow = newuser.followed;;

        if (!newuser.followed){
            followbtn.setText("Followed");
            newuser.followed = true;
        }
        else if (newuser.followed){
            followbtn.setText("Follow");
            newuser.followed = false;
        }
    }

}
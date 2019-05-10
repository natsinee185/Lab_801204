package th.ac.su.ict.natsinee.multipletestactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.time.Instant;

public class SecondTestActivity extends AppCompatActivity {

    private ImageView imgView01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_test);

        imgView01 = findViewById(R.id.imgView01);




    }
}

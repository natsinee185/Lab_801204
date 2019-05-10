package th.ac.su.ict.natsinee.registerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class registerapp2Activity extends AppCompatActivity {

    private Button nextButton;
    private TextView textName;
    private TextView teamName;
    private ImageView green;
    private ImageView blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerapp2);

        textName = findViewById(R.id.textName);
        teamName = findViewById(R.id.teamName);
        nextButton = findViewById(R.id.nextButton);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
//        String email = intent.getStringExtra("email");
//        String phone = intent.getStringExtra("phone");

        teamName.setText("Team Green");
        textName.setText(name);

        Intent intent1 = new Intent(registerapp2Activity.this,registerapp3Activity.class);

        intent1.putExtra("name",textName.getText().toString());


        startActivityForResult(intent1,1000);

    }
}

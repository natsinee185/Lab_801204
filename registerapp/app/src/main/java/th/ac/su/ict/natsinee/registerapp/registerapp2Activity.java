package th.ac.su.ict.natsinee.registerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class registerapp2Activity extends AppCompatActivity {

    private Button nextButton;
    private TextView textName;
    private TextView teamName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerapp2);

        textName = findViewById(R.id.textName);
        teamName = findViewById(R.id.teamName);
        nextButton = findViewById(R.id.nextButton);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        textName.setText(name);

        //Intent intent = new Intent(registerapp2Activity.this,registerapp3Activity.class);

      //  intent.putExtra("name",textName.getText().toString());
//        intent.putExtra("email",textEmail.getText().toString());
//        intent.putExtra("phone",textPhone.getText().toString());

      //  startActivityForResult(intent,1000);

    }
}

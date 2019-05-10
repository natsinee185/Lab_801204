package th.ac.su.ict.natsinee.registerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class registerapp3Activity extends AppCompatActivity {

    private TextView textName;
    private TextView textEmail;
    private TextView textPhone;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerapp3);


        textName = findViewById(R.id.textName);
        textEmail = findViewById(R.id.textEmail);
        textPhone = findViewById(R.id.textPhone);
        submitButton = findViewById(R.id.submitButton);

    }
}

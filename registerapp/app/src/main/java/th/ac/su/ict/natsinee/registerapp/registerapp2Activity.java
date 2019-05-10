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
        String message = intent.getStringExtra("message");

        textName.setText(message);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.putExtra("message",textName.getText().toString());

                setResult(RESULT_OK,intent);

                finish();
            }
        });

    }
}

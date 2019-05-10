package th.ac.su.ict.natsinee.registerapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textName;
    private TextView textEmail;
    private TextView textPhone;
    private Button nextButton;

    private void hideVirtualKeyboard(View v){
        InputMethodManager methodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        methodManager.hideSoftInputFromWindow(v.getWindowToken(),0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textName = findViewById(R.id.textName);
        textEmail = findViewById(R.id.textEmail);
        textPhone = findViewById(R.id.textPhone);
        nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,registerapp3Activity.class);

                intent.putExtra("name",textName.getText().toString());
                intent.putExtra("email",textEmail.getText().toString());
                intent.putExtra("phone",textPhone.getText().toString());

                startActivityForResult(intent,1000);


            }
        });


    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        //super.onActivityResult(requestCode, resultCode, data);
//        if( requestCode == 1000 && resultCode == RESULT_OK ) {
//            String editMessage = data.getStringExtra("name");
//
//            textName.setText((editMessage));
//        }
//    }
//


}

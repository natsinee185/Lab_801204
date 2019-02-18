package th.ac.su.ict.natsinee.fancycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.shashank.sony.fancytoastlib.FancyToast;

import life.sabujak.roundedbutton.RoundedButton;

public class MainActivity extends AppCompatActivity {


    Button btnOK;

    RoundedButton roundedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOK = findViewById(R.id.btnOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FancyToast.makeText(MainActivity.this,"ป๊อปอายสวย", Toast.LENGTH_SHORT,FancyToast.ERROR,true).show();

                Log.d("debug","fc");
            }
        });
        roundedButton  = findViewById(R.id.roundedButton);
        roundedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FancyToast.makeText(MainActivity.this,"สวัสดีจ่ะคนสวย",FancyToast.LENGTH_LONG,FancyToast.CONFUSING,true).show();
            }
        });
    }
}
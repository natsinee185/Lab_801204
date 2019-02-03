package th.ac.su.ict.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    private TextView colorView;
    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private Button button06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        colorView = findViewById(R.id.colorView);
        button01 = findViewById(R.id.button01);
        button02 = findViewById(R.id.button02);
        button03 = findViewById(R.id.button03);
        button04 = findViewById(R.id.button04);
        button05 = findViewById(R.id.button05);
        button06 = findViewById(R.id.button06);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.parseColor("#EBE1DD"));
                colorView.setText("235 255 221");
            }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.parseColor("#ECCBCA"));
                colorView.setText("236 203 202");
            }
        });
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.parseColor("#75839C"));
                colorView.setText("117 131 156");
            }
        });
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.parseColor("#99A9BF"));
                colorView.setText("153 169 191");
            }
        });
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.parseColor("#C3CCD5"));
                colorView.setText("195 204 213");
            }
        });
        button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.parseColor("#DDE2E5"));
                colorView.setText("221 226 229");
            }
        });
    }
}
//    TextView label = ( TextView ) this.findViewById ( R.id.label );
//
//            label.setTextColor ( Color.GREEN );
package th.ac.su.ict.natsinee.multipleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        textView1 = findViewById(R.id.textView1);
//        textView2 = findViewById(R.id.textView2);
//        textView3 = findViewById(R.id.textView3);
//        //สร้างตัวแปล
//        Intent intent = getIntent();
//        //primitive datatpe
//
//        Double sum = intent.getDoubleExtra("GPA",-1);
//
//
//
//        Bundle bundle = intent.getBundleExtra("student");
//        int id = bundle.getInt("id");
//
//        //show
////        textView2.setText(v2+"");
//
//        textView3.setText(sum+"");
//

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("student");
        int id = bundle.getInt("id");
        String name = bundle.getString("name");
        Double gpa = bundle.getDouble("gpa");
        textView3.setText(id+" "+name+" "+gpa);


    }
}

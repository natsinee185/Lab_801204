package th.ac.su.ict.natsinee.multipleactivity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button calButton;
    private EditText num1;
    private EditText num2;
    private EditText num3;

    private static final int SETTING_ACTIVITY_rEQUEST_CODE = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calButton = findViewById(R.id.calButton);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);

        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Double text1 = 0;
//                text1 = Double.parseDouble(num1.getText().toString());
//                Double text2 = 0;
//                text2 = Double.parseDouble((num2.getText().toString()));
//                float sum;
//                sum = text1+text2;

//                Double v1 = Double.parseDouble(num1.getText().toString());
//                Double v2 = Double.parseDouble(num2.getText().toString());
//                Double sum = v1+v2;

               // Toast.makeText(MainActivity.this, "sum ="+sum, Toast.LENGTH_SHORT).show();
//                Integer v2 = Integer.parseInt(num2.getText().toString());
//                Double v3 = Double.parseDouble(num3.getText().toString());

                //ซแง
//                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
////                intent.putExtra("name","popeye");
////                intent.putExtra("id",13600185);
////                intent.putExtra("gpa",3.50);
//
//
//                Bundle bundle = new Bundle();
//                bundle.putInt("id",13600185);
//                bundle.putString("name","Natsinee");
//                bundle.putDouble("gpa",4.00);
//
//                intent.putExtra("stusent",bundle);
//
//
//
//                startActivity(intent);


                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                Student student1 = new Student();
                student1.id = 60123;
                student1.name = "Supanat";
                student1.gpa = 3.14;

                Bundle bundle = new Bundle();
                bundle.putInt("id",student1.id);
                bundle.putString("name",student1.name);
                bundle.putDouble("gpa",student1.gpa);

                intent.putExtra("student", bundle);
                startActivity(intent);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id==R.id.action_settings){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
           //startActivity(intent);
            //ส่งกลับมาได้
            startActivityForResult(intent,1000);
        }


        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SETTING_ACTIVITY_rEQUEST_CODE){

            Toast.makeText(MainActivity.this,data.getStringExtra("selected_color"),Toast.LENGTH_SHORT).show();
        }



    }
}



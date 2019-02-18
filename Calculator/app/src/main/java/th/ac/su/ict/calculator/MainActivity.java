package th.ac.su.ict.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText01;
    EditText editText02;
    Button btncal;
    Button btnclear;
    TextView tvResult;
    RadioGroup rgOperator;

//    RadioButton rbPlus;
//    RadioButton rbMinus;
//    RadioButton rbMultiply;
//    RadioButton rbDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //inflate

        editText01 = findViewById(R.id.editText01);
        editText02 = findViewById(R.id.editText02);
        btncal = findViewById(R.id.btncal);
        btnclear = findViewById(R.id.btnclear);
        tvResult = findViewById(R.id.tvResult);
        rgOperator = findViewById(R.id.rgOperator);

//        rbPlus = findViewById(R.id.rbPlus);
//        rbMinus = findViewById(R.id.rbMinus);
//        rbMultiply = findViewById(R.id.rbMultiply);
//        rbDivide = findViewById(R.id.rbDivide);



        btnclear.setOnClickListener(listener);
        btncal.setOnClickListener(listener);

        /*
        //Anomount class
        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int text1 = Integer.parseInt(editText01.getText().toString());
               int text2 = Integer.parseInt(editText02.getText().toString());
               int result = text1+text2;

               // Log.d("calculation","result = "+result);
               // Toast.makeText(MainActivity.this,"result"+result,Toast.LENGTH_LONG).show();
                tvResult.setText(result+"");
            }
        }); */
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(v == btncal){
                int text1 = Integer.parseInt(editText01.getText().toString());
                int text2 = Integer.parseInt(editText02.getText().toString());
                int result = 0;
                switch (rgOperator.getCheckedRadioButtonId()){
                    case R.id.rbPlus:
                        result = text1+text2;
                        tvResult.setText("="+result);
                    break;
                    case R.id.rbMinus:
                        result = text1-text2;
                        tvResult.setText("="+result);
                        break;
                    case R.id.rbMultiply:
                        result = text1*text2;
                        tvResult.setText("="+result);
                        break;
                    case R.id.rbDivide:
                        result = text1/text2;
                        tvResult.setText("="+result);
                        break;
               }


//                if(rbPlus.isChecked()){
//                    result = text1+text2;
//                    tvResult.setText("="+result);
//                }
//                if(rbMinus.isChecked()){
//                    result = text1-text2;
//                    tvResult.setText("="+result);
//                }
//                if(rbMultiply.isChecked()){
//                    result = text1*text2;
//                    tvResult.setText("="+result);
//                }
//                if(rbDivide.isChecked()){
//                    result = text1/text2;
//                    tvResult.setText("="+result);
//                }



//                Toast.makeText(MainActivity.this,"calculate",Toast.LENGTH_LONG).show();
            }
            if(v == btnclear){

                tvResult.setText("= 0");
                editText01.setText("");
                editText02.setText("");
                //Toast.makeText(MainActivity.this,"clear",Toast.LENGTH_LONG).show();


            }
            //Toast.makeText(MainActivity.this,"click",Toast.LENGTH_LONG).show();

        }
    };

}

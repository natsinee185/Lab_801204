package th.ac.su.ict.natsinee.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;//ฝฝแสดงที่ListView
    private ArrayList<String> toDoItems;//DataSource
    private ArrayAdapter<String> arrayAdapter;//ตัวเกลางที่ชื่อม
    private Button btnAdd;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//inflate

        listView = findViewById(R.id.listView);
        btnAdd = findViewById(R.id.btnAdd);
        editText = findViewById(R.id.editText);
        toDoItems = new ArrayList<>(); //instantiate
                                //contractor
        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,toDoItems);//DataSource
        listView.setAdapter(arrayAdapter);//ตัวเกลางที่ชื่อม

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // toDoItems.add("Hello");
                // arrayAdapter.notifyDataSetChanged();

//                String message = editText.getText().toString();
               //toDoItems.add(massage);
                //editText.setText("");

                //toDoItems.add(editText.getText().toString());
                //TextUtils.isEmpty(message)==false
//               if (!TextUtils.isEmpty(message)) {
//                   toDoItems.add(0, editText.getText().toString());
//                   arrayAdapter.notifyDataSetChanged();
//                   editText.setText("");
//                   hideKeeyboard(v);
//               }
             //toDoItems.remove(item);
             //arrayAdapter.notifyDataSetChanged();

                addItem(editText.getText().toString());
                hideKeeyboard(v);
            }
        });
//        toDoItems.add("ดีจ้า");
//        for(int i=0; i<30;i++){
//        String item = "Hello"+1;
//        toDoItems.add(item);
//        }
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (keyCode == KeyEvent.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_DOWN){
                    Log.d("key listener","key pressd");
                    addItem(editText.getText().toString());
                    hideKeeyboard(v);
                }
                return false;
            }
        });
        }
    private void hideKeeyboard(View vie){
        InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(vie.getWindowToken(),0);
    }
    private void addItem(String item){
        String message = editText.getText().toString();
        //toDoItems.add(massage);
        //editText.setText("");

        //toDoItems.add(editText.getText().toString());
        //TextUtils.isEmpty(message)==false
        if (!TextUtils.isEmpty(message)) {
            toDoItems.add(0, editText.getText().toString());
            arrayAdapter.notifyDataSetChanged();
            editText.setText("");

        }
    }
}

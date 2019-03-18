package th.ac.su.ict.natsinee.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

                //String item = editText.getText().toString();
               //toDoItems.add(item);
                //editText.setText("");

                //toDoItems.add(editText.getText().toString());
               toDoItems.add(0,editText.getText().toString());
                arrayAdapter.notifyDataSetChanged();
                editText.setText("");



             //toDoItems.remove(item);
             //arrayAdapter.notifyDataSetChanged();

            }
        });


        //toDoItems.add("ดีจ้า");
//        for(int i=0; i<30;i++){
//            String item = "Hello"+1;
//            toDoItems.add(item);
//        }



        }

}

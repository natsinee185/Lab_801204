package th.ac.su.ict.natsinee.firebasedemo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TextView tvfirstname;
    private EditText edName;
    private EditText edId;
    private EditText edGpa;
    private EditText edTel;
    private Button btSave;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvfirstname = findViewById(R.id.tvfirstname);
        edName = findViewById(R.id.edName);
        edId = findViewById(R.id.edId);
        edGpa = findViewById(R.id.edGpa);
        edTel = findViewById(R.id.edTel);
        btSave = findViewById(R.id.btSave);

        //ดึงค่า
        /*DatabaseReference reference = database.getReference("firstname");
        DatabaseReference referenceName = database.getReference("name");

        referenceName.setValue("Popeye");
        reference.setValue("natsinee");*/


        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* DatabaseReference referenceName = database.getReference("name");
                referenceName.setValue(edName.getText().toString());

                DatabaseReference referenceId = database.getReference("id");
                referenceId.setValue(111);

                DatabaseReference referenceGpa = database.getReference("GPA");
                //referenceGpa.setValue(4.00);
                referenceGpa.child("2017").child("1").setValue("1.5");
                referenceGpa.child("2017").child("2").setValue("2.3");
                referenceGpa.child("2017").child("3").setValue("3.7");
                referenceGpa.child("2018").child("1").setValue("4.0");
                referenceGpa.child("2018").child("2").setValue("3.5");
                referenceGpa.child("2018").child("3").setValue("2.3");
                */

               DatabaseReference reference = database.getReference("student");

               Map student = new HashMap();
                Map student1 = new HashMap();
               student.put("name",edName.getText().toString());
               //student.put("gpa",3.9);
               student.put("gpa",edGpa.getText().toString());

               String id = edId.getText().toString();
               student.put("id",id);
               student.put("tel",edTel.getText().toString());

               student1.put("name","Natsinee");
               student1.put("id","185");

               student.put("student1",student1);
               //
               //reference.push().setValue(student);
                reference.child(id).setValue(student);



            }
        });

       /* reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull final DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tvfirstname.setText(value);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        Map map = (Map)dataSnapshot.getValue();
        Map map1 = (Map) dataSnapshot.child("User").getValue();
        String user1 = String.valueOf(map1.get("Jin"));
        String username = String.valueOf(map.get("username"));
          ntextview.setText(username+" "+user1);

        */


    }
}

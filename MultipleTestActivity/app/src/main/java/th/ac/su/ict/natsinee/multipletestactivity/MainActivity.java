package th.ac.su.ict.natsinee.multipletestactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView img01;
    private ImageView img02;
    private ImageView img03;
    private TextView studentTv01;
    private TextView studentTv02;
    private TextView studentTv03;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentTv01 = findViewById(R.id.studentTv01);

        Intent intent = new Intent(MainActivity.this, SecondTestActivity.class);

    }
}
//imageView.buildDrawingCache();
//        Bitmap image= imageView.getDrawingCache();
//
//        Bundle extras = new Bundle();
//        extras.putParcelable("imagebitmap", image);
//        intent.putExtras(extras);
//        startActivity(intent);
//
//
//        Bundle extras = getIntent().getExtras();
//        Bitmap bmp = (Bitmap) extras.getParcelable("imagebitmap");
//
//        image.setImageBitmap(bmp );
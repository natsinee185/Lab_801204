package th.ac.su.ict.natsinee.discountcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView tvUpdate;
    private TextView tvPriceResult;
    private EditText edtPrice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBarPercentOff);
        tvUpdate = findViewById(R.id.tvUpdate);
        tvPriceResult = findViewById(R.id.tvPriceResult);
        edtPrice = findViewById(R.id.edtPrice);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBar.setProgress(progress);
                //tvUpdate.setText(""+progress+"%");

               // tvUpdate.setText(seekBar.getProgress()+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tvUpdate.setText(seekBar.getProgress()+"%");
            }
        });
    }
}

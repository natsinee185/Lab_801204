package th.ac.su.ict.natsinee.discountcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView tvUpdate;
    private TextView tvPriceResult;
    private EditText edtPrice;
    private CheckBox cbTax;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBarPercentOff);
        tvUpdate = findViewById(R.id.tvUpdate);
        tvPriceResult = findViewById(R.id.tvPriceResult);
        edtPrice = findViewById(R.id.edtPrice);
        cbTax = findViewById(R.id.cbTax);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBar.setProgress(progress);
                //tvUpdate.setText(""+progress+"%");
                tvUpdate.setText(seekBar.getProgress()+"%");


                if(edtPrice.getText().length() != 0) {
                    float oriPrice = 0;
                    oriPrice = Float.parseFloat(edtPrice.getText().toString());
                    float percent = seekBar.getProgress();

                    float noVat;
                    float discout = 0;
                    float seekbar = seekBar.getProgress();
                    //หาส่วนลด
                    discout = (percent / 100) * oriPrice;
                    float vat;
                    float fnPrice = 0;
                    //หาราคารวมvat
                    if(cbTax.isChecked()){
                        noVat = oriPrice - discout;
                        vat = (float)0.07*noVat;
                        noVat +=vat;
                        fnPrice = discout+noVat;
                    }
                    //หาราคาไม่รวมvat
                    else {
                        noVat = oriPrice-discout;
                    }
                    tvPriceResult.setText(Float.toString(noVat));
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //tvUpdate.setText(seekBar.getProgress()+"%");


            }
        });
    }
}

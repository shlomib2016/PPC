package il.ac.huji.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }

    public void  calctip(View v) {

        final TextView mTextView = (TextView) findViewById(R.id.txtTipResult);
        EditText medit = (EditText) findViewById(R.id.edtBillAmount);

        if (medit.getText().toString().trim().length() > 0) {

            double sum = Double.parseDouble(medit.getText().toString());

            boolean isChecked = ((CheckBox) findViewById(R.id.chkRound)).isChecked();

            if (isChecked) {
                double tip = Math.ceil(sum * 0.12);
                mTextView.setText(Double.toString(tip));
            } else {
                double tip = (sum * 0.12);
                mTextView.setText(Double.toString(tip));
            }

        }
    }
}

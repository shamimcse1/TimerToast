package codercamp.com.timertoast;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SimpleToast(View view) {

        Toast.makeText(this, "Simple Toast", Toast.LENGTH_SHORT).show();
    }

    public void TimerToast(View view) {

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Toast.makeText(MainActivity.this, "Please wait "+millisUntilFinished/1000, Toast.LENGTH_SHORT).show();
                view.setVisibility(View.INVISIBLE);

            }

            @Override
            public void onFinish() {

                view.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
}
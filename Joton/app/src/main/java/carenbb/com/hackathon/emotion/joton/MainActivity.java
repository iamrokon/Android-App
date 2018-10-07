package carenbb.com.hackathon.emotion.joton;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv =(TextView) findViewById(R.id.textView10);
        Typeface tf1=Typeface.createFromAsset(getAssets(),"font/SolaimanLipi.ttf");
        tv.setTypeface(tf1);


        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (waited < 3000) {
                        sleep(150);
                        waited += 150;
                    }
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    finish();
                    Intent i = new Intent(getApplicationContext(), UserSelectActivity.class);
                    startActivity(i);
                }
            }
        };
        splashThread.start();
    }


    @Override
    public void onBackPressed() {

        return;
    }
    
}

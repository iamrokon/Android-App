package carenbb.com.hackathon.emotion.joton;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_select);

        TextView tv =(TextView) findViewById(R.id.textView20);
        TextView tv2 =(TextView) findViewById(R.id.textView21);
        Button btn1=(Button) findViewById(R.id.button20);
        Button btn2=(Button) findViewById(R.id.button21);
        Typeface tf1=Typeface.createFromAsset(getAssets(),"font/SolaimanLipi.ttf");
        tv.setTypeface(tf1);
        tv2.setTypeface(tf1);
        btn1.setTypeface(tf1);
        btn2.setTypeface(tf1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeInfoActivity.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), WorkerRegistrationActivity.class);
                startActivity(i);
            }
        });
    }

}

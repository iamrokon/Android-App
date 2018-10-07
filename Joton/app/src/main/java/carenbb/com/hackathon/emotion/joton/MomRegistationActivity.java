package carenbb.com.hackathon.emotion.joton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MomRegistationActivity extends AppCompatActivity {

    public Spinner datype;
    public LinearLayout mainlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mom_registation);
        setContentView(R.layout.content_mom_registration);
        mainlayout=(LinearLayout)this.findViewById(R.id.liner_option);
        datype=(Spinner)findViewById(R.id.spinner6);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       Spinner spnAge = (Spinner) findViewById(R.id.spinner1);
        Spinner spnDays = (Spinner) findViewById(R.id.spinner2);
        Spinner spnWeight = (Spinner) findViewById(R.id.spinner3);
        Spinner spnSerial = (Spinner) findViewById(R.id.spinner4);

        List<String> lsAge = new ArrayList<String>();
        for(int i=17;i<71;i++)
            lsAge.add("    "+String.valueOf(i)+" বছর  ");
        ArrayAdapter<String> adpAge = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lsAge);
        adpAge.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       // spnAge.setAdapter(adpAge);

        List<String> lsDays = new ArrayList<String>();
        for(int i=1;i<151;i++)
            lsDays.add("    "+String.valueOf(i)+" দিন  ");
        ArrayAdapter<String> adpDays = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lsDays);
        adpDays.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      //  spnDays.setAdapter(adpDays);

        List<String> lsWeight = new ArrayList<String>();
        for(int i=30;i<101;i++)
            lsWeight.add("    "+String.valueOf(i)+" কেজি ");
        ArrayAdapter<String> adpWeight = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lsWeight);
        adpWeight.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnWeight.setAdapter(adpWeight);
        List<String> lsDivision = new ArrayList<String>();
        for(int i=1;i<8;i++)
            lsWeight.add("    "+String.valueOf(i)+" বিভাগ");
        ArrayAdapter<String> adpDivision = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lsDivision);
        adpWeight.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnWeight.setAdapter(adpDivision);

        List<String> lsDistrict = new ArrayList<String>();
        for(int i=1;i<64;i++)
            lsWeight.add("    "+String.valueOf(i)+" জেলা ");
        ArrayAdapter<String> adpDristict = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lsDistrict);
        adpWeight.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnWeight.setAdapter(adpDristict);

        List<String> lsUpzella = new ArrayList<String>();
        for(int i=1;i<500;i++)
            lsWeight.add("    "+String.valueOf(i)+" উপজেলা ");
        ArrayAdapter<String> adpUpzella = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lsUpzella);
        adpWeight.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnWeight.setAdapter(adpUpzella);


        List<String> lsSerial = new ArrayList<String>();
        for(int i=1;i<10;i++)
            lsSerial.add("    "+String.valueOf(i)+" নাম্বার চলতেছে ");
        ArrayAdapter<String> adpSerial = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lsSerial);
        adpSerial.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnSerial.setAdapter(adpSerial);
        List<String> lsDropdown = new ArrayList<String>();
        for(int i=1;i<3;i++)
            lsSerial.add(" শিশু জন্মেরঃ  "+String.valueOf(i)+" ");
        ArrayAdapter<String> adpdropdown = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lsDropdown);
        adpdropdown.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnSerial.setAdapter(adpdropdown);







                List<String>data1=new ArrayList<String>();
                data1.add("আগে");
                data1.add("পরে");


                ArrayAdapter<String>adapter=new ArrayAdapter<String> (this,android.R.layout.simple_spinner_item,data1);
                adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
                datype.setAdapter(adapter);
                if(datype.getSelectedItem().toString().equals("পরে")){
                    mainlayout.setVisibility(LinearLayout.GONE);
                }
                else {
                    mainlayout.setVisibility(LinearLayout.VISIBLE);
                }

                // here we set the listener
                datype.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
            }

            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                // here we change layout visibility again
                if(datype.getSelectedItem().toString().equals("পরে")){
                    mainlayout.setVisibility(LinearLayout.GONE);
                }
                else {
                    mainlayout.setVisibility(LinearLayout.VISIBLE);
                }
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        }




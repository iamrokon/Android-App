/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package carenbb.com.hackathon.emotion.joton;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class InfoChildDeasesDetailActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "info";
    public String infoName;
    public int infoID;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_detail);

        Intent intent = getIntent();
        infoName = intent.getStringExtra(EXTRA_NAME);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(infoName);

        loadBackdrop();
    }

    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        TextView tv1=(TextView) findViewById(R.id.tvAtInfoDetail1);
        Typeface tf1=Typeface.createFromAsset(getAssets(),"font/SolaimanLipi.ttf");
        tv1.setTypeface(tf1);
        for (int i=0;i<DataChildDeasesInfo.infos.length;i++)
        {
            DataChildDeasesInfo infoTmp = DataChildDeasesInfo.infos[i];
            String tmp= infoTmp.getInfo();
            tv1.setText(tmp);
            if (tmp.compareTo(infoName)==0)
            {

                Glide.with(this).load(infoTmp.getImageResourceId()).centerCrop().into(imageView);

                tv1.setText(infoTmp.getDescription());
                break;
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sample_actions, menu);
        return true;
    }
}

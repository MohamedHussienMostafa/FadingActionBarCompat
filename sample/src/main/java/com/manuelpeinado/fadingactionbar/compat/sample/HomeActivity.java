package com.manuelpeinado.fadingactionbar.compat.sample;
/*
 * Copyright (C) 2013 Manuel Peinado
 * Copyright (C) 2013 César Díez Sánchez
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

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    private List<ActivityInfo> activitiesInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setInitialData();
        setViews();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Class<? extends Activity> class_ = activitiesInfo.get(position).activityClass;
        Intent intent = new Intent(this, class_);
        startActivity(intent);
    }

    private void setInitialData() {
        activitiesInfo = new ArrayList<ActivityInfo>();
        activitiesInfo.add(new ActivityInfo(ScrollViewActivity.class, getString(R.string.activity_title_scrollview)));
        activitiesInfo.add(new ActivityInfo(ListViewActivity.class, getString(R.string.activity_title_listview)));
        activitiesInfo.add(new ActivityInfo(LightBackgroundActivity.class, getString(R.string.activity_title_light_bg)));
        activitiesInfo.add(new ActivityInfo(LightActionBarActivity.class, getString(R.string.activity_title_light_ab)));
        activitiesInfo.add(new ActivityInfo(SampleFragmentActivity.class, getString(R.string.activity_title_fragment)));
        activitiesInfo.add(new ActivityInfo(NoParallaxActivity.class, getString(R.string.activity_title_no_parallax)));
        activitiesInfo.add(new ActivityInfo(NavigationDrawerActivity.class, getString(R.string.activity_title_navigation)));
    }

    private void setViews() {
        String[] titles = getActivityTitles();
        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, titles));
        listView.setOnItemClickListener(this);
    }

    private String[] getActivityTitles() {
        String[] result = new String[activitiesInfo.size()];
        int i = 0;
        for (ActivityInfo info : activitiesInfo) {
            result[i++] = info.titleResource;
        }
        return result;
    }

}

package com.example.notice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView noticeListView;
    private NoticeListAdapter adapter;
    private List<Notice> noticeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noticeListView = (ListView) findViewById(R.id.noticeListView);
        noticeList = new ArrayList<Notice>();
        noticeList.add(new Notice("공지사항입니다.","이유정","2020-11-15"));
        noticeList.add(new Notice("공지사항입니다.","이유정","2020-11-15"));
        noticeList.add(new Notice("공지사항입니다.","이유정","2020-11-15"));
        noticeList.add(new Notice("공지사항입니다.","이유정","2020-11-15"));
        noticeList.add(new Notice("공지사항입니다.","이유정","2020-11-15"));

        adapter = new NoticeListAdapter(getApplicationContext(),noticeList);
        noticeListView.setAdapter(adapter);

        final LinearLayout notice = (LinearLayout)findViewById(R.id.notice);
    }
    class BackgroundTask extends AsyncTask<Void, Void, String>
    {
        String target;

        @Override
        protected void onPreExecute(){
            target="https://";//PHP주소
        }

        @Override
        protected String doInBackground(Void... voids) {
            return null;
        }

    }
}
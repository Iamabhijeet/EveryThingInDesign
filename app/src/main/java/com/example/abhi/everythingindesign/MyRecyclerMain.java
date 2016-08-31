package com.example.abhi.everythingindesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_main);
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_main);

        getData();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(MyRecyclerMain.this);
        mRecyclerView.setLayoutManager(mLayoutManager);
//Adapter is created in the last step
        mAdapter = new CustomAdapter(myData);
        mAdapter.setContext(MyRecyclerMain.this);
        mRecyclerView.setAdapter(mAdapter);

    }
    protected RecyclerView mRecyclerView;
    protected CustomAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
//    private String[] mDataSet = {"ABHIJEET",};
//    private int mDatasetTypes[] = {FIRST, SECOND, THIRD}; //view types

    public ArrayList<DataSet> myData = new ArrayList<>();

    private void getData(){

        this.myData = new ArrayList<>();
        for (int i=0;i<13;i++){
            int x = i%3;
            DataSet myData = new DataSet();
            switch (x){
                case 0 : myData.type = 0;
                    myData.content = "Abhijeet";break;
                case 1 : myData.type = 1;
                    myData.content = "http://i.imgur.com/DvpvklR.png";break;
                case 2 :  myData.type = 0;
                    myData.content = "Babar";break;
                default:
            }
            this.myData.add(myData);
        }
    }

    public class DataSet {
        public int type;
        public String content;
    }
}




package com.example.databindingtext5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import android.os.Bundle;

import com.example.databindingtext5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ObservableList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        list = new ObservableArrayList<>();
        list.add("study");
        list.add("work");
        list.add("up");
        binding.setList(list);
        binding.setUpdata(new Updata());
    }
    public class Updata{
        public void change() {
            for (int i = 0;i < list.size();i ++) {
                list.set(i,"以改变" + i);
            }
        }
    }
}

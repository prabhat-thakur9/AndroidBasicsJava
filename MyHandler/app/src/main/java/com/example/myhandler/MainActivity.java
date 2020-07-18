package com.example.myhandler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    Thread thread;
    Handler handler;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.progressBar);
        thread=new Thread(new MyThread());
        thread.start();
        handler=new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                progressBar.setProgress(msg.arg1);
            }
        };


    }
    class MyThread implements Runnable{
        @Override
        public void run() {

            for(int i=0;i<100;i++)
            {
                Message message=Message.obtain();
                message.arg1=1;
                handler.sendMessage(message);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
package com.wsl.library.radar.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

import com.wsl.library.radar.RadarView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    private RadarView radarView;
    private SeekBar seekBar1;
    private SeekBar seekBar2;
    private SeekBar seekBar3;
    private SeekBar seekBar4;
    private SeekBar seekBar5;

    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int number5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radarView = (RadarView) findViewById(R.id.rv3);
        seekBar1 = (SeekBar) findViewById(R.id.number1);
        seekBar2 = (SeekBar) findViewById(R.id.number2);
        seekBar3 = (SeekBar) findViewById(R.id.number3);
        seekBar4 = (SeekBar) findViewById(R.id.number4);
        seekBar5 = (SeekBar) findViewById(R.id.number5);
        seekBar1.setOnSeekBarChangeListener(this);
        seekBar2.setOnSeekBarChangeListener(this);
        seekBar3.setOnSeekBarChangeListener(this);
        seekBar4.setOnSeekBarChangeListener(this);
        seekBar5.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()) {
            case R.id.number1:
                number1 = progress;
                break;
            case R.id.number2:
                number2 = progress;
                break;
            case R.id.number3:
                number3 = progress;
                break;
            case R.id.number4:
                number4 = progress;
                break;
            case R.id.number5:
                number5 = progress;
                break;
        }
        radarView.setValues(number1, number2, number3, number4, number5);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}

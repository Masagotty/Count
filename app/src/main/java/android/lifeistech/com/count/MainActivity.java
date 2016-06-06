package android.lifeistech.com.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    TextView text2;
    TextView text3;
    int count1;
    int count2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        text3 = (TextView)findViewById(R.id.text3);
        count1 = 0;
        count2 = 0;
    }

    public void plus1(View v){
        count1 ++;

        text1.setText(count1 + "回ボタンが押されました！");
    }

    public void plus2(View v){
        count2 ++;

        text2.setText(count2 + "回ボタンが押されました！");
    }

    public void subtract1(View v){
        count1 --;

        text1.setText(count1 + "回ボタンが押されました！");
    }

    public void subtract2(View v){
        count2 --;

        text2.setText(count2 + "回ボタンが押されました！");
    }

    public void sum(View v){
        text3.setText("合計は" + (count1 + count2)  + "です！");
    }
    
}

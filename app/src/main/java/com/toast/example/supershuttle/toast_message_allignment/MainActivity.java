package com.toast.example.supershuttle.toast_message_allignment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

}

public void showToast(View v){
    switch(v.getId()){

        case R.id.btop:
            Toast toast = Toast.makeText(getApplicationContext(), "Awesome", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP, 0, 0);
            toast.show();
            break;

        case R.id.bbottom:
            Toast toast1 = Toast.makeText(getApplicationContext(), "Awesome", Toast.LENGTH_SHORT);
            toast1.setGravity(Gravity.BOTTOM, 0, 0);
            toast1.show();
            break;

        case R.id.bcenter:
            Toast toast2 = Toast.makeText(getApplicationContext(), "Awesome", Toast.LENGTH_SHORT);
            toast2.setGravity(Gravity.CENTER, 0, 0);
            toast2.show();
            break;

        case R.id.btopright:
            Toast toast3 = Toast.makeText(getApplicationContext(), "Awesome", Toast.LENGTH_SHORT);
            toast3.setGravity(Gravity.RIGHT, 0, 0);
            toast3.show();
            break;


        case R.id.bcenter_vithaxis:
        Toast toast4 = Toast.makeText(getApplicationContext(), "Awesome", Toast.LENGTH_SHORT);
        toast4.setGravity(Gravity.CENTER, 100, 200);
        toast4.show();
        break;

        case R.id.bcenter_vithaxis2:
        Toast toast5 = Toast.makeText(getApplicationContext(), "Awesome", Toast.LENGTH_SHORT);
        toast5.setGravity(Gravity.CENTER, 100, -300);
        toast5.show();
        break;
    }
}
}

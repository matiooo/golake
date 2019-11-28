package ir.hhadanooo.golake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ir.hhadanooo.golake.pack_hadanooo.Activity_hadanooo;
import ir.hhadanooo.golake.pack_matiooo.Activity_matiooo;

public class MainActivity extends AppCompatActivity {

    Button btn_matiooo,btn_hadanooo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_matiooo = findViewById(R.id.matiooo);
        btn_hadanooo = findViewById(R.id.hadanooo);


        btn_matiooo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Activity_matiooo.class));
            }
        });
        btn_hadanooo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Activity_hadanooo.class));
            }
        });

    }
}

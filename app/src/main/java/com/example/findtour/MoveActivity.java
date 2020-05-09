package com.example.findtour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoveActivity extends AppCompatActivity {
    private Button buttonMove;
    private Button buttonMoveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        buttonMove = (Button) findViewById(R.id.btn_move_activity);
        buttonMoveData = (Button) findViewById(R.id.btn_move_activity_data);

        buttonMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(MoveActivity.this, SecondActivity.class);
                startActivity(moveIntent);
            }
        });
        buttonMoveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveWithDataIntent = new Intent(MoveActivity.this, MoveDataActivity.class);
                moveWithDataIntent.putExtra(MoveDataActivity.EXTRA_NAME, "DicodingAcademy Boy");
                moveWithDataIntent.putExtra(MoveDataActivity.EXTRA_AGE, 5);
                startActivity(moveWithDataIntent);
            }
        });
    }
}

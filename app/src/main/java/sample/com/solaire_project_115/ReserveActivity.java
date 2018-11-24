package sample.com.solaire_project_115;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ReserveActivity extends AppCompatActivity {

    ImageView seat_1,seat_2,seat_3,seat_4,seat_5,
            seat_6,seat_7,seat_8,seat_9,seat_10,
            seat_11,seat_12,seat_13,seat_14,seat_15,
            seat_16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);
        seat_1 = findViewById(R.id.seat_1);
        seat_2 = findViewById(R.id.seat_2);
        seat_3 = findViewById(R.id.seat_3);
        seat_4 = findViewById(R.id.seat_4);
        seat_5 = findViewById(R.id.seat_5);
        seat_6 = findViewById(R.id.seat_6);
        seat_7 = findViewById(R.id.seat_7);
        seat_8 = findViewById(R.id.seat_8);
        seat_9 = findViewById(R.id.seat_9);
        seat_10 = findViewById(R.id.seat_10);
        seat_11 = findViewById(R.id.seat_11);
        seat_12 = findViewById(R.id.seat_12);
        seat_13 = findViewById(R.id.seat_13);
        seat_14 = findViewById(R.id.seat_14);
        seat_15 = findViewById(R.id.seat_15);
        seat_16 = findViewById(R.id.seat_16);
    }

}

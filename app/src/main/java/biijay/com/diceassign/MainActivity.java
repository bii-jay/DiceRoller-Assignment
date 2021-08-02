package biijay.com.diceassign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDicy1;
    private ImageView imageViewDicy2;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicy1 = findViewById(R.id.imageView1);
        imageViewDicy2 = findViewById(R.id.imageView2);

        Button button = findViewById(R.id.myBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RollOurDice();

            }
        });

    }

    private  void RollOurDice() {

        int myRanNumber1 = myRandomNumber.nextInt(6)+1;
        int myRanNumber2 = myRandomNumber.nextInt(6)+1;

        switch (myRanNumber1) {
            case 1:
                imageViewDicy1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDicy1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDicy1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDicy1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDicy1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDicy1.setImageResource(R.drawable.dice6);
                break;
        }

        switch (myRanNumber2) {
            case 1:
                imageViewDicy2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDicy2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDicy2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDicy2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDicy2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDicy2.setImageResource(R.drawable.dice6);
                break;
        }


    }
}

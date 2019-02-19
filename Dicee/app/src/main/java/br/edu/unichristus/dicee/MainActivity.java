    package br.edu.unichristus.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FINAL DECLARA UMA CONSTANTE

        Button roolButton = findViewById(R.id.button);
        final ImageView lefDice = findViewById(R.id.image_left);
        final ImageView rightDice = findViewById(R.id.image_right);

        final int [] diceeArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        roolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random numberRandom = new Random();
                int number1 = numberRandom.nextInt(6); //aleatório de 0 à 5
                lefDice.setImageResource(diceeArray[number1]);
                int number2 = numberRandom.nextInt(6);
                rightDice.setImageResource(diceeArray[number2]);
                Toast.makeText(MainActivity.this, "Os números lançados foram:"+number1+" e "+number2, Toast.LENGTH_SHORT).show();
                Log.d("Dice", "ROLAMENTO REALIZADO!!!!!!");
            }
        });

    }
}

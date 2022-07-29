package sg.edu.rp.c346.id20026389.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    Button btnShowMovies;
    Button back;
    ListView lvMovie;
    ArrayList<Movie>alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnShowMovies = findViewById(R.id.btnShow);
        back = findViewById(R.id.buttonBack);
        lvMovie = findViewById(R.id.listViewShowMovies);
        alMovieList = new ArrayList<>();
        caMovie = new CustomAdapter(this, R.layout.row, alMovieList);
        lvMovie.setAdapter(caMovie);

        lvMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SecondActivity.this,
                        ThirdActivity.class);
                startActivity(i);
            }
        });

//        btnShowMovies.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (lvMovie.)
//            }
//        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i = new Intent(SecondActivity.this,
                        //MainActivity.class);
                //startActivity(i);
                finish();
            }
        });

    }
}
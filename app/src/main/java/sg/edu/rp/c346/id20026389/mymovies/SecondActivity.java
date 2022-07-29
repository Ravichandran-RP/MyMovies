package sg.edu.rp.c346.id20026389.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movie>alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvMovie = findViewById(R.id.listViewShowMovies);
        alMovieList = new ArrayList<>();


    }
}
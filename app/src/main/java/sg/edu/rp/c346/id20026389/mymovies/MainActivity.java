package sg.edu.rp.c346.id20026389.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTitle,tvGenre,tvYear;
    EditText etTtile,etGenre,etYear;
    Button btnInsert,btnShow;
    Spinner spnRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitle=findViewById(R.id.tvMovieTitle);
        tvGenre=findViewById(R.id.tvGenre);
        tvYear=findViewById(R.id.tvYear);
        etTtile=findViewById(R.id.etMovieTitle);
        etGenre=findViewById(R.id.etGenre);
        etYear=findViewById(R.id.etYear);
        btnInsert=findViewById(R.id.btnInsert);
        btnShow=findViewById(R.id.btnShow);
        spnRating=findViewById(R.id.spinnerRating);


    }

}
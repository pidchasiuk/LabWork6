package ua.kpi.comsys.iv7112;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

public class FilmActivity extends AppCompatActivity {

    private FilmAdapter mAdapter;
    private ListView lv;

    ArrayList<Movie> movies;
    ArrayList<String> titles = new ArrayList<>();
    ArrayList<String> years = new ArrayList<>();
    ArrayList<String> types = new ArrayList<>();
    ArrayList<Integer> posters = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);


        {
            try {
                movies = ReadJSON.readMovieJSONFile(this);
                for (int i = 0; i < movies.size(); i++) {
                    titles.add(movies.get(i).getTitle());
                    years.add(movies.get(i).getYear());
                    types.add(movies.get(i).getType());
                    posters.add(getResourceId(this, movies.get(i).getPoster().replace(".jpg", "")));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        lv = (ListView) findViewById(R.id.list_view1);
        mAdapter = new FilmAdapter(this, titles, years, types, posters);
        lv.setAdapter(mAdapter);
    }


    public static int getResourceId(Context context, String name) {
        name = name.toLowerCase();
        return context.getResources().getIdentifier(name, "drawable", context.getPackageName());
    }
}
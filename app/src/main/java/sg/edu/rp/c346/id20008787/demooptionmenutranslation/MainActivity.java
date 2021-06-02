package sg.edu.rp.c346.id20008787.demooptionmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewTranslatedText;
    TextView textViewTranslkatedText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTranslatedText = findViewById(R.id.textViewTranslatedText);
        textViewTranslkatedText2 = findViewById(R.id.textViewTranslatedText2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //menu.add(0,0,0, "English");
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.EnglishSelection) {
            textViewTranslatedText.setText("Hello");
        }
        else if(item.getItemId() == R.id.italianSelection) {
            textViewTranslatedText.setText("ciao");
        }
        else {
            textViewTranslatedText.setText("Error translation");
        }
        return super.onOptionsItemSelected(item);


    }
}
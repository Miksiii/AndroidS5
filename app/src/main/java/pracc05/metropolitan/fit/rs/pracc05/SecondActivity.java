package pracc05.metropolitan.fit.rs.pracc05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private ImageView imageView;
    private int[] images = {R.drawable.ic_girl};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = (ImageView) findViewById(R.id.imageView);
        registerForContextMenu(imageView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.id_cs324:
                Toast.makeText(this, "Choosen: " + item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_ma101:
                Toast.makeText(this, "Choosen: " + item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_om350:
                Toast.makeText(this, "Choosen: " + item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_cs111:
                Toast.makeText(this, "Choosen: " + item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onContextItemSelected(item);
    }
}

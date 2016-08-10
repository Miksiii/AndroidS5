package pracc05.metropolitan.fit.rs.pracc05;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.menu.menu_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intentToOpenWebView = new Intent("android.intent.action.VIEW");

        switch (item.getItemId()) {
            case R.id.id_fit:
                intentToOpenWebView.setData(Uri.parse("http://fit.metropolitan.edu.rs/"));
                startActivity(intentToOpenWebView);
                return true;
            case R.id.id_fm:
                intentToOpenWebView.setData(Uri.parse("http://fm.metropolitan.edu.rs/"));
                startActivity(intentToOpenWebView);
                return true;
            case R.id.id_fdu:
                intentToOpenWebView.setData(Uri.parse("http://fdu.metropolitan.edu.rs/"));
                startActivity(intentToOpenWebView);
                return true;
            case R.id.id_next:
                Intent intentToChangeActivity = new Intent("pracc05.metropolitan.fit.rs.pracc05.SecondActivity");
                startActivity(intentToChangeActivity);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

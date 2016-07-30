package ejemplo.sergio.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }


    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.top_menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help:
                Toast.makeText(getApplicationContext(), "No hay info",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.checked:

                if (item.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Ha aceptado los terminos",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "No ha aceptado los terminos",
                            Toast.LENGTH_SHORT).show();

                }


                return true;
            case R.id.submenu:

                if (item.isChecked()) {
                    item.setChecked(false);

                }else{
                    item.setChecked(true);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
        }



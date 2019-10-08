package id.ac.poliban.mi.yusfan.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        //mengenalkan view component ke object
        //atau variable kita
        Button btArsenal = findViewById(R.id.btArsenal);
        Button btPorto = findViewById(R.id.btPorto);
        Button btBarcelona = findViewById(R.id.btBarcelona);
        Button btColoColo = findViewById(R.id.btColoColo);
        Button btBocajr = findViewById(R.id.btBocaJr);
        Button btFiorentina = findViewById(R.id.btFiorentina);

        //event listener & event handler
        //menggunakan lamda expression
        btArsenal.setOnClickListener(view -> Toast.makeText(this, "Arsenal : 1886", Toast.LENGTH_SHORT).show());
        btPorto.setOnClickListener(view -> Toast.makeText(this, "Porto : 1893", Toast.LENGTH_SHORT).show());
        btBarcelona.setOnClickListener(view -> Toast.makeText(this, "Barcelona : 1899", Toast.LENGTH_SHORT).show());
        btColoColo.setOnClickListener(view -> Toast.makeText(this, "Colo-Colo : 1925", Toast.LENGTH_SHORT).show());
        btBocajr.setOnClickListener(view -> Toast.makeText(this, "Boca Junior : 1925", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener(view ->{
            Toast.makeText(this, "Fiorentina : 1926", Toast.LENGTH_SHORT).show();
            finish();//aplikasi dihancurkan
        });

    }
}

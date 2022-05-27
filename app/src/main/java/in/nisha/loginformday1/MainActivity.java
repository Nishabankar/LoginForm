package in.nisha.loginformday1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Username;
    private TextView Password;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.edtuser);
        Password = findViewById(R.id.edtpass);
        btn = findViewById(R.id.edtBtn);
        btn.setOnClickListener(new BtnListener());
    }

    class BtnListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Username.setText("Nisha");
            Password.setText("Nisha#123");
        }
    }
}
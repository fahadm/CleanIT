package urbanUnit.waterAndSanitationHackathon.crowdsourcingandcomplaintmanagementsystem;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class complaint_screenActivity extends Activity {

	private String array_spinner[];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complaint_screen);
        array_spinner=new String[5];
        array_spinner[0]="Highest";
        array_spinner[1]="High";
        array_spinner[2]="Medium";
        array_spinner[3]="Low";
        array_spinner[4]="Lowest";
        Spinner s = (Spinner) findViewById(R.id.Spinner01);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, array_spinner);
        s.setAdapter(adapter);
        
        Button btn = (Button) findViewById(R.id.CSubmit);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				   Toast.makeText(complaint_screenActivity.this, "Your Compain Has Been Registered Successfully",
			                Toast.LENGTH_SHORT).show();
				   Intent intent = new Intent (complaint_screenActivity.this, first_screenActivity.class);
				   startActivity(intent);
			        
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}

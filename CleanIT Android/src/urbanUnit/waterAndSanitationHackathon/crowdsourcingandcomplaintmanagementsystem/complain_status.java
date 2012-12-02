package urbanUnit.waterAndSanitationHackathon.crowdsourcingandcomplaintmanagementsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class complain_status extends Activity {
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.complain_status);
	        ImageView image = (ImageView) findViewById(R.id.main_logo);
	        image.setBackgroundResource(R.drawable.wslogo);
	        Button btn = (Button) findViewById(R.id.CCStatus);
	        btn.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toast.makeText(complain_status.this, "Complaint Status: OPEN (2 Days Remaining)",
			                Toast.LENGTH_SHORT).show();
					Intent intent = new Intent (complain_status.this, ViewStatus.class);
					startActivity(intent);
				}
			});
	    }

}

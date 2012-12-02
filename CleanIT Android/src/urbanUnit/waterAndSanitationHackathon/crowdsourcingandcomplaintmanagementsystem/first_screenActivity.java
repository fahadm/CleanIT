package urbanUnit.waterAndSanitationHackathon.crowdsourcingandcomplaintmanagementsystem;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class first_screenActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);
        ImageView image = (ImageView) findViewById(R.id.main_logo);
        image.setBackgroundResource(R.drawable.wslogo);
        Button Submit = (Button) findViewById(R.id.SubmitComplaint);
        Button AboutUs = (Button) findViewById(R.id.AboutUs);
        Button CrowdSourcing = (Button) findViewById(R.id.CrowdSourcing);
        Button SenitationArticals = (Button) findViewById(R.id.SenitationArticals);
        Button Status = (Button) findViewById(R.id.Status);
        Submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (first_screenActivity.this, complaint_screenActivity.class);
				startActivity(intent);
			}
		});
        AboutUs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (first_screenActivity.this, contact_us.class);
				startActivity(intent);
			}
		});
        CrowdSourcing.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (first_screenActivity.this, crowd_sourcing_screenActivity.class);
				startActivity(intent);
			}
		});
        Status.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (first_screenActivity.this, ViewStatus.class);
				startActivity(intent);
			}
		});
        SenitationArticals.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (first_screenActivity.this, statscategory.class);
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

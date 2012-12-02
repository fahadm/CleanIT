package urbanUnit.waterAndSanitationHackathon.crowdsourcingandcomplaintmanagementsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class statscategory extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statscategory);
        
        Button btn1 = (Button) findViewById(R.id.areastat);
        Button btn2 = (Button) findViewById(R.id.monthstat);
        btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (statscategory.this, areastat.class);
				startActivity(intent);
				
			}
		});
        
        btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (statscategory.this, monthstat.class);
				startActivity(intent);
				
			}
		});

}

}

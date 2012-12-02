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
import android.widget.Toast;

public class crowd_sourcing_screenActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crowd_sourcing_screen);
   
        Button btn = (Button) findViewById(R.id.CSSubmit);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				   Toast.makeText(crowd_sourcing_screenActivity.this, "Thanks For Your FeedBack.",
			                Toast.LENGTH_SHORT).show();
				   Intent intent = new Intent (crowd_sourcing_screenActivity.this, first_screenActivity.class);
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

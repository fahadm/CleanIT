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

public class ViewStatus extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_status);
        ImageView image = (ImageView) findViewById(R.id.main_logo);
        image.setBackgroundResource(R.drawable.wslogo);
        Button cstatus = (Button) findViewById(R.id.VCStatus);
        cstatus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (ViewStatus.this, complain_status.class);
				startActivity(intent);
			}
		});
        Button btn = (Button) findViewById(R.id.VAStatus);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (ViewStatus.this, AreaStatus.class);
				startActivity(intent);
			}
		});
    }
}
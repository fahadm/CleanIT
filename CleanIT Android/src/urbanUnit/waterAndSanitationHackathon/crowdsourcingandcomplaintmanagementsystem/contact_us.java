package urbanUnit.waterAndSanitationHackathon.crowdsourcingandcomplaintmanagementsystem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class contact_us extends Activity {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.contact_us);
	        ImageView image = (ImageView) findViewById(R.id.main_logo);
	        image.setBackgroundResource(R.drawable.wslogo);

}
	 
	 
}

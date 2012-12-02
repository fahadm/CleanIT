package urbanUnit.waterAndSanitationHackathon.crowdsourcingandcomplaintmanagementsystem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class areastat extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areastat);
        ImageView image = (ImageView) findViewById(R.id.areaimage);
        image.setBackgroundResource(R.drawable.shot2);

}

}

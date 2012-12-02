package urbanUnit.waterAndSanitationHackathon.crowdsourcingandcomplaintmanagementsystem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class monthstat extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monthstat);
        ImageView image = (ImageView) findViewById(R.id.monthimage);
        image.setBackgroundResource(R.drawable.shot1);
}

}

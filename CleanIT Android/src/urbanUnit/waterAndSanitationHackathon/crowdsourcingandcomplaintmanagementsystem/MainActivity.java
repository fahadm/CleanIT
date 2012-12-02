package urbanUnit.waterAndSanitationHackathon.crowdsourcingandcomplaintmanagementsystem;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView image1, image2, image3;
	Animation animationSlideInLeft, animationSlideOutRight;
	ImageView curSlidingImage;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler();
        ImageView image = (ImageView) findViewById(R.id.imageView1);
		image.setBackgroundResource(R.drawable.index);
		image1 = (ImageView)findViewById(R.id.image1);
	    image2 = (ImageView)findViewById(R.id.image2);
	    image3 = (ImageView)findViewById(R.id.image3);
	    image1.setBackgroundResource(R.drawable.drop1);
	    image2.setBackgroundResource(R.drawable.drop1);
	    image3.setBackgroundResource(R.drawable.drop1);
	       animationSlideInLeft = AnimationUtils.loadAnimation(this,
	         android.R.anim.slide_in_left);
	       animationSlideOutRight = AnimationUtils.loadAnimation(this,
	         android.R.anim.slide_out_right);
	       animationSlideInLeft.setDuration(1000);
	       animationSlideOutRight.setDuration(1000);
	       animationSlideInLeft.setAnimationListener(animationSlideInLeftListener);
	       animationSlideOutRight.setAnimationListener(animationSlideOutRightListener);

	       curSlidingImage = image1;
	       image1.startAnimation(animationSlideInLeft);
	       image1.setVisibility(View.VISIBLE);
        handler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				finish();
				Intent intent = new Intent (MainActivity.this, first_screenActivity.class);
				startActivity(intent);
			}
		}, 5000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    protected void onPause() {
     // TODO Auto-generated method stub
     super.onPause();
     image1.clearAnimation();
     image2.clearAnimation();
     image3.clearAnimation();
    }
     
    AnimationListener animationSlideInLeftListener
    = new AnimationListener(){

     @Override
     public void onAnimationEnd(Animation animation) {
      // TODO Auto-generated method stub
      
      if(curSlidingImage == image1){
       image1.startAnimation(animationSlideOutRight);
      }else if(curSlidingImage == image2){
       image2.startAnimation(animationSlideOutRight);
      }else if(curSlidingImage == image3){
       image3.startAnimation(animationSlideOutRight);
      } 
     }

     @Override
     public void onAnimationRepeat(Animation animation) {
      // TODO Auto-generated method stub
      
     }

     @Override
     public void onAnimationStart(Animation animation) {
      // TODO Auto-generated method stub
      
     }};
      
    AnimationListener animationSlideOutRightListener
    = new AnimationListener(){
      @Override
     public void onAnimationEnd(Animation animation) {
      // TODO Auto-generated method stub
       if(curSlidingImage == image1){
        curSlidingImage = image2;
        image2.startAnimation(animationSlideInLeft);
        image1.setVisibility(View.INVISIBLE);
        image2.setVisibility(View.VISIBLE);
        image3.setVisibility(View.INVISIBLE);
       }else if(curSlidingImage == image2){
        curSlidingImage = image3;
        image3.startAnimation(animationSlideInLeft);
        image1.setVisibility(View.INVISIBLE);
        image2.setVisibility(View.INVISIBLE);
        image3.setVisibility(View.VISIBLE);
       }else if(curSlidingImage == image3){
        curSlidingImage = image1;
        image1.startAnimation(animationSlideInLeft);
        image1.setVisibility(View.VISIBLE);
        image2.setVisibility(View.INVISIBLE);
        image3.setVisibility(View.INVISIBLE);
       }
     }

     @Override
     public void onAnimationRepeat(Animation animation) {
      // TODO Auto-generated method stub
      
     }
     @Override
     public void onAnimationStart(Animation animation) {
      // TODO Auto-generated method stub
       
     }};
   
}

package urbanUnit.waterAndSanitationHackathon.crowdsourcingandcomplaintmanagementsystem;

import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;


public class AreaStatus  extends MapActivity
{
	private MapView myMap;
	 
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.area_status);
		initMap();
		initMyLocation();
		List<Overlay> mapOverlays = myMap.getOverlays();
		Drawable drawable = this.getResources().getDrawable(R.drawable.drop);
		Drawable drawable1 = this.getResources().getDrawable(R.drawable.pin);
		HelloItemizedOverlay itemizedoverlay = new HelloItemizedOverlay(drawable, this);
		HelloItemizedOverlay itemizedoverlay1 = new HelloItemizedOverlay(drawable1, this);
		
		LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

		Criteria criteria = new Criteria();
		String provider = locationManager.getBestProvider(criteria, false);
		Location location = locationManager.getLastKnownLocation(provider);
		
		int lat = (int) (location.getLatitude() * 1E6);
		int lng = (int) (location.getLongitude() * 1E6);
		

		GeoPoint point = new GeoPoint(lat , lng);
		//GeoPoint point = new GeoPoint(74,32);
		Random rand = new Random();
	//    int num = 
//	    System.out.println("Generated Random Number between 0 to 10 is : " + num);
	    int numNoRange = rand.nextInt();
		for(int i = 0 ; i<5 ; i+=1)
		{
			
			point = new GeoPoint(lat+rand.nextInt(1000),lng+rand.nextInt(1000));
			OverlayItem overlayitem = new OverlayItem(point, "Water Problem!", "I live in Mughalpura Lahore, here no water from last three days Please Help.!");
			itemizedoverlay1.addOverlay(overlayitem);
			mapOverlays.add(itemizedoverlay1);
			point = new GeoPoint(lat,lng+rand.nextInt(1000));
			overlayitem = new OverlayItem(point, "Sanitation Problem", "No Sanitaion System in Defence DHA do something fast.");
			itemizedoverlay.addOverlay(overlayitem);
			mapOverlays.add(itemizedoverlay);
			point = new GeoPoint(lat+rand.nextInt(1000),lng);
			overlayitem = new OverlayItem(point, "Managment Problem", "There is no cleanleness in Anarkali Lahore take some actions.");
			itemizedoverlay.addOverlay(overlayitem);
			mapOverlays.add(itemizedoverlay);
			point = new GeoPoint(lat+rand.nextInt(1000),lng+rand.nextInt(1000));
			overlayitem = new OverlayItem(point, "Attention Required", "Here in Grw no water supply since two days.");
			itemizedoverlay.addOverlay(overlayitem);
			mapOverlays.add(itemizedoverlay);
		
		//overlayitem = new OverlayItem(point, "No Water Supply!", "There is No Water Supply Here in my Area Plz help");
		
	//	itemizedoverlay.addOverlay(overlayitem);
	//	mapOverlays.add(itemizedoverlay);
		}
	}
 
	
	private void initMap() {
		myMap = (MapView) findViewById(R.id.mymap);
 
		@SuppressWarnings("deprecation")
		View zoomView = myMap.getZoomControls();
		LinearLayout myzoom = (LinearLayout) findViewById(R.id.myzoom);
		myzoom.addView(zoomView);
		myMap.displayZoomControls(true);
 
	}
 
	/**
	 * Initialises the MyLocationOverlay and adds it to the overlays of the map
	 */
	private void initMyLocation() {
		MyLocationOverlay myLocOverlay = new MyLocationOverlay(this, myMap);
		myLocOverlay.enableMyLocation();
		myLocOverlay.enableCompass();
		myMap.getOverlays().add(myLocOverlay);
 
	}
 
	@Override
	protected boolean isRouteDisplayed() 
	{
		return false;
	}
	
	
}

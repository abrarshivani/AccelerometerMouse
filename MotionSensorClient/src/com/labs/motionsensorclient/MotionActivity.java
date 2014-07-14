package com.labs.motionsensorclient;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MotionActivity extends Activity implements SensorEventListener {

	NetWork net;
	TextView x, y;
	SensorManager sensorManager;
	Sensor s;
	int i = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_motion);
		sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		s = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		x = (TextView) findViewById(R.id.textView2);
		y = (TextView) findViewById(R.id.textView4);
		net = new NetWork();
		
	}

	@Override
	protected void onPause() {
		super.onPause();
		sensorManager.unregisterListener(this);
	}

	@Override
	protected void onResume() {
		super.onResume();
		sensorManager.registerListener(this, s, SensorManager.SENSOR_MIN);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_motion, menu);
		return true;
	}

	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub

	}

	public void onSensorChanged(SensorEvent event) {
		if (i >= 20) {
			x.setText("" + event.values[0]);
			y.setText("" + event.values[1]);
			net.p = new POINT();
			net.p.setX(event.values[0]);
			net.p.setY(event.values[1]);
			Thread T = new Thread(net);
			T.start();
			i=0;
		}
		i++;
	}

	class NetWork implements Runnable {

		POINT p;
		CLIENT c;

		public void run() {
			c = new CLIENT();
			c.sendPoint(p);
		}
	}
}

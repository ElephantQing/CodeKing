/**
 * 
 */
package cn.sh.xq.codeking;

import cn.sh.xq.codeking.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author xiangqing
 *
 */
public class NavigatorActivity extends Activity {
public Button ScanCode;
public Button CreateCode;


	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.navigator_activity);
		this.ScanCode =(Button) findViewById(R.id.ScanCode);
		this.CreateCode=(Button) findViewById(R.id.CreateCode);
		this.ScanCode.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent readStIntent =new Intent(NavigatorActivity.this,ScanStandardCodeActivity.class);
				startActivity(readStIntent);
			}
		});
		this.CreateCode.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent readStIntent =new Intent(NavigatorActivity.this,CreateStandardCodeActivity.class);
				startActivity(readStIntent);
			}
		});	
	}

	/**
	 * 
	 */


}

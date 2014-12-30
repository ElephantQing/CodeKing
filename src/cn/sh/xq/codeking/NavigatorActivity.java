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
public Button readStBtn;
public Button createStBtn;


	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.navigator_activity);
		this.readStBtn =(Button) findViewById(R.id.readStBtn);
		this.createStBtn=(Button) findViewById(R.id.createStBtn);
		this.readStBtn.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent readStIntent =new Intent(NavigatorActivity.this,ReadStandardCodeActivity.class);
				startActivity(readStIntent);
			}
			
			
		});
		
		
	}

	/**
	 * 
	 */


}

/**
 * 
 */
package cn.sh.xq.codeking;

import cn.sh.xq.codeking.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author xiangqing
 *
 */
public class ReadStandardCodeActivity extends Activity {
	private Button scanStBtn;
	private EditText scanStContent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.readstandardcode_activity);
		this.scanStBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(ReadStandardCodeActivity.this, "你可以扫描条形码或者二维码",
						Toast.LENGTH_SHORT).show();
				Intent startScanIntent = new Intent(
						ReadStandardCodeActivity.this,
						com.zxing.activity.CaptureActivity.class);
				startActivityForResult(startScanIntent, 0);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onActivityResult(int, int,
	 * android.content.Intent)
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode == RESULT_OK) {
			String result = data.getExtras().getString("result");
			this.scanStContent.setText(result);
		}

	}

}

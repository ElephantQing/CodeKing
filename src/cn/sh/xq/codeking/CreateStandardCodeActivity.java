/**
 * 
 */
package cn.sh.xq.codeking;

import com.google.zxing.WriterException;
import com.zxing.encoding.EncodingHandler;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * @author xiangqing
 *
 */
public class CreateStandardCodeActivity extends Activity {
	private Button createBtn;
	private EditText createContent;
	private ImageView createImg;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.createstandardcode_activity);
		createBtn = (Button) findViewById(R.id.createQRCode);
		createContent = (EditText) findViewById(R.id.createString);
		createImg = (ImageView) findViewById(R.id.createRQCodeImg);
		createBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					String contentString = createContent.getText().toString();
					if (!contentString.equals("")) {
						// 根据字符串生成二维码图片并显示在界面上，第二个参数为图片的大小（350*350）
						Bitmap qrCodeBitmap = EncodingHandler.createQRCode(
								contentString, 350);
						createImg.setImageBitmap(qrCodeBitmap);
					} else {
						Toast.makeText(CreateStandardCodeActivity.this,
								"Text can not be empty", Toast.LENGTH_SHORT)
								.show();
					}
				} catch (WriterException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onActivityResult(int, int,
	 * android.content.Intent)
	 */
}

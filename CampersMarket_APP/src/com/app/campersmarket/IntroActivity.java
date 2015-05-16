package com.app.campersmarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;


/**
 * 용어 정리
 * 
 * 액티비티 : 웹에서의 화면 개념. 앱을 실행할 때 디바이스에서 뜨는 화면을 액티비티라고 한다.
 */
public class IntroActivity extends Activity {
	//핸들러 선언
	Handler handler; 

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    //인트로 화면이므로 안드로이드 기본 타이틀을 뜨지 않도록 한다.
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    
	    //어떤 레이아웃을 사용할 것인지 연결해준다.
	    //activity_intro는 res(resource) > layout안에 위치한다.
	    //해당 폴더에 파일을 저장할 경우 해당 파일에 대한 정보가 'R'에 저장되어 클래서에서 호출할 수 있다.
	    setContentView(R.layout.activity_intro);
	    
	    //핸들러를 선언(핸들러 설명은 나중에)
	    handler = new Handler();
	    
	    //앱에서 특별한 입력 없이 핸들러가 알아서 Runnable객체를 
	    handler.postDelayed(new Runnable() {
				
				@Override
				public void run() {
					// TODO 어떠한 입력 없이 다음 액티비티로 넘어갈 수 있도록
					
					// 다음으로 보여줄 액티비티 클래스를 설정
					/* 인텐트(Intent)
					 *
					 * 안드로이드 시스템에서 커뮤티케이션을 담당하고 있다.
					 * 컴포넌트간의 호출과 정보 전달의 역할을 한다.
					 * 
					 * 이 소스에서는 타겟 컴포넌트(MainActivity)를 설정하는 정도로만 알아보자.
					 */
					Intent intent = new Intent(IntroActivity.this, MainActivity.class);
					
					// 액티비티로 이동
					startActivity(intent);
					
					/* finish()
					 * 
					 * 안드로이드 액티비티는 액티비티가 하나 실행될 때마다 기존의 액티비티는 살아있는 상태에서
					 * 새로운 액티비티가 하나씩 위로 쌓이게 되는 구조로 로딩된다.
					 * 
					 * 메인액티비티로 넘어간뒤 디바이스의 뒤로가기 버튼을 눌렀을 때 인트로 액티비티로 돌아오지 않는 정책을 위해서
					 * 메인액티비티로 이동한 뒤 인트로 액티비티를 소멸시켜, 뒤로가기 버튼을 눌러도 인트로 액티비티로 돌아오지 않도록 한다.
					 */
					finish();
				}
			// 밀리초 단위 : 5초뒤 다음 액티비티로 이동
			}, 5000);
	}
	

}

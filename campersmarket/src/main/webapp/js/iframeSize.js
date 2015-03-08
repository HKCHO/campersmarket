/**
 * campersmarket의 iframe 높이를 자동적으로 설정해줍니다.
 * iframe 내부 html에 해당 코드를 삽입합니다.
 */

function setFrameSize(name){
	var innerBody = document.body; //iframe 내부의 <body>
	var thisFrame = $(parent.document.all(name)); //현재 html의 상위 <iframe>
	var min_height = 460; //iframe의 최소높이, 픽셀값
	var i_height = innerBody.scrollHeight + (innerBody.offsetHeight-innerBody.clientHeight);
	//innerBody의 (scrollHeight) 내용의 높이에 (offsetHeight - clientHeignt)해당 엘리먼트의 margin값을 더하면 총 높이가 나온다.
	//MDN에서 내용을 확인 할 수 있다.(scrollHeight 내가 번역함 푸핫)
	
	if(i_height < min_height) i_height = min_height;
	thisFrame.css('height',i_height);

	parent.scrollTo(1,1); //부모문서의 스크롤 위치를 1, 1로 옮긴다
}

var oldFn = "";                           			  //window.onload function을 문자열로 받을 변수 선언
if (window.onload != null) {	            			  //기존 window.onload function이 있을 경우
  oldFn = new String(window.onload);     			    //그 function을 문자열로 받는다.
  oldFn = oldFn.substring(22, oldFn.length - 2);  // 문자열로 받은 function에서 필요한 함수부분문 문자열로 잘라낸다.
}
window.onload = new Function("setFrameSize('cm-content');" + oldFn + ";"); //프레임 조정 function에 기존 onload function을 넣는다.
/**
 * 캠퍼스 마켓 JavaScript Source
 * 2015-03-22 조현권
 */

//------------------------------------------------------------------------------
//PURPOSE : 테스트용 콘솔
//DETAIL  : 콘솔창으로 테스트 정보를 띄우고, 배포 전 검색하여 한꺼번에 지울 수 있도록.
//CREATE  : 2015-03-22 조현권
//------------------------------------------------------------------------------
function cmtest(param) {
		var testParam = 'cmtest : ' + param;
		console.log(testParam);
};

//------------------------------------------------------------------------------
//PURPOSE : 새로고침 단축키 막기
//DETAIL  : Refresh Event를 막고, iFrame내부의 화면만 새로고침.
//CREATE  : 2015-03-20 조현권
//------------------------------------------------------------------------------
$(window).keydown(function (event){
  if (event.metaKey) console.log("command pressed");
});//아직 적용하지 않고, 서버사이드 제작한 뒤 적용
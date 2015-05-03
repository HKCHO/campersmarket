$(function(){
	
	$('#carpoolRegBtn').click(function(){
		
		console.log("가입버튼 누름");
	  
//	  $.post('../../membersControl/members/add.do' //  URL 
//	      , {  //서버에 보낼 데이터를 객체에 담아 넘긴다 
//	        position : $('#rank').val(),     //직급 
//	        name : $('#name').val(),  //이름
//	        email : $('#email').val(),   //이메일 
//	        phone : $('#phone').val()  //폰번호 
//	      } 
//	      , function(result){ // 서버로부터 응답을 받았을 때 호출될 메서드
//	        if (result.status == "success") {
//	          alert("성공!! ");
//	          location.href="/staffmanager/main.html";
//	          
//	        } else {
//	          alert("등록 실패!");
//	        }
//	      }
//	      , 'map' // 서버가 보낸 데이터를 JSON 형식으로 처리
//	      )
//	    //서버 요청이 실패했을 때 호출될 함수 등록   
//	   .fail(function(jqXHR, textStatus, errorThrown){ 
//	     alert(textStatus + ":" + errorThrown);
//	   });
		$.ajax({
      url: '../../membersControl/members/add.do',
      data: {
		      		position : $('#rank').val(),      //직급 
				      name : $('#name').val(),  				//이름
				      email : $('#email').val(),		    //이메일 
				      phone : $('#phone').val()
		      	},
      success: function(result){
      	alert("success");
      },
      error: function( jqXhr, textStatus, errorThrown ){
          console.log( errorThrown );
      }
  });
	  
	}); 
	
	$(document).ready(function() {
		//스크롤 이벤트 발생 시
		$(window).scroll(function() {
		var scrollHeight = $(window).scrollTop()+$(window).height();
		var documentHeight = $(document).height();
		if (scrollHeight = documentHeight) {
		for(var i=0; i <10; i++) {
		$("<h1>무한 스크롤 </h1>").appendTo("body");
		}
		}
		});
		});
//		$(document).ready(function() {
//		for(var i=0; i<20; i++) {
//		$("<h1>무한 스크롤</h1>").appendTo("body");
//		}
//		});
	
  
});//ready()

function search_local(){
	alert("검색");
}



//가입완료 버튼

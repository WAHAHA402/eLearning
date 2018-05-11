$(function() {
	var url1,url2;
	$.ajax({
		url: "http://localhost:8080/eLearning/authenticate/getInfo",
		type: "get",
		async: true,
		success: function(result) {
			if(result.extend.status==0){
				url1 = "http://localhost:8080/eLearning/InfoPush/randomRecommend";
				url2 = "http://localhost:8080/eLearning/InfoPush/randomGuessHobby";
			}else if(result.extend.status==1){
				url1 = "http://localhost:8080/eLearning/InfoPush/recommendContent";
				url2 = "http://localhost:8080/eLearning/InfoPush/recommendHobby";
			}
			//请求1
			$.ajax({
				url: url1,
				type: "get",
				async: true,
				success: function(result) {
					add_skill(result);
				}
			});
			function add_skill(result){
				var info = result.extend.pageInfo.list;
				$("#skill1>a>img").attr("src",info[0].picture);
				$("#skill1>div>a").html(info[0].title);
				
				$("#skill2>a>img").attr("src",info[1].picture);
				$("#skill2>div>a").html(info[1].title);
				
				$("#skill3>a>img").attr("src",info[2].picture);
				$("#skill3>div>a").html(info[2].title);
				
				$("#skill4>a>img").attr("src",info[3].picture);
				$("#skill4>div>a").html(info[3].title);
				
				$("#skill5>a>img").attr("src",info[4].picture);
				$("#skill5>div>a").html(info[4].title);
			}
			
			//请求2
			$.ajax({
				url: url2,
				type: "get",
				async: true,
				success: function(result) {
					add_like(result);
				}
			});
			function add_like(result){
				var info = result.extend.pageInfo.list;
				$("#like1>a>img").attr("src",info[0].picture);
				$("#like1>div>a").html(info[0].title);
				
				$("#like2>a>img").attr("src",info[1].picture);
				$("#like2>div>a").html(info[1].title);
				
				$("#like3>a>img").attr("src",info[2].picture);
				$("#like3>div>a").html(info[2].title);
				
				$("#like4>a>img").attr("src",info[3].picture);
				$("#like4>div>a").html(info[3].title);
				
				$("#like5>a>img").attr("src",info[4].picture);
				$("#like5>div>a").html(info[4].title);
			}
		}
	});
})
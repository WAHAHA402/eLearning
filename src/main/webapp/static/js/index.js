window.onload = function() {

	//banner左侧内容栏
	$(function() {
		var thisTime;
		//鼠标离开左侧内容栏
		$('.cat_wrap .cat_list .float').mouseleave(function(even) {
			thisTime = setTimeout(thisMouseOut, 1000);
		});
		//鼠标点击左侧内容栏   滑动出弹层
		$('.cat_wrap .cat_list .float').mouseenter(function() {
			$(this).addClass("active").siblings().removeClass("active");
			clearTimeout(thisTime);
			var thisUB = $('.cat_wrap .cat_list .float').index($(this));
			if($.trim($('.cat_subcont .cat_sublist').eq(thisUB).html()) != "") {
				$('.cat_subcont').addClass('active');
				$('.cat_sublist').hide();
				$('.cat_sublist').eq(thisUB).show();
			} else {
				$('.cat_subcont').removeClass('active');
			}
		});
		//函数——执行鼠标离开左侧内容栏的动作
		function thisMouseOut() {
			$('.cat_subcont').removeClass('active');
			$('.cat_wrap .cat_list .float').removeClass('active');
		}
		$('.cat_subcont').mouseenter(function() {
			clearTimeout(thisTime);
			$('.cat_subcont').addClass('active');
		});
		$('.cat_subcont').mouseleave(function() {
			$('.cat_subcont').removeClass('active');
			$('.cat_wrap .cat_list .float').removeClass('active');
		});
	});
	//控制轮播图
	var imgList = document.getElementById("imgList")
	var imgArr = document.getElementsByClassName("img")
	imgList.style.width = 962 * imgArr.length + "px"
	var navA = document.getElementsByClassName("a")
	var index = 0
	navA[index].style.backgroundColor = "white"
	for(var i = 0; i < navA.length; i++) {
		navA[i].num = i
		navA[i].onclick = function() {
			clearInterval(timer)
			index = this.num
			setA()
			move(imgList, "left", -962 * index, 40, function() {
				autoChange()
			})
		}
	}
	autoChange()

	function setA() {
		if(index >= imgArr.length - 1) {
			index = 0
			imgList.style.left = 0
		}
		for(var i = 0; i < navA.length; i++) {
			navA[i].style.backgroundColor = ""
		}
		navA[index].style.backgroundColor = "white"
	}
	var timer

	function autoChange() {
		timer = setInterval(function() {
			index++
			index %= imgArr.length
			move(imgList, "left", -962 * index, 40, function() {
				//修改导航按钮
				setA()
			})
		}, 3000)
	}
	
	search()
	function search(){
		$("#txtSearch")
		.on('keyup focus',function(){
			var txt = this.value.trim()
			if (txt){
				$("#search-helper").show()
			}
		})
		.blur(function(){
			$("#search-helper").hide()
		})
	}
	
	$("#1").click(function(){
		var url = "http://localhost:8080/eLearning/infoCollection/updateClickContent";
		$.ajax({
			type:"get",
			url:url,
			data: "category=" + $("#1").attr("id"),
			async:true,
			success:function(result){
				window.location.href="css.html";
			}
		});
	})
	
	$("#2").click(function(){
		var url = "http://localhost:8080/eLearning/infoCollection/updateClickContent";
		$.ajax({
			type:"get",
			url:url,
			data: "category=" + $("#2").attr("id"),
			async:true,
			success:function(result){
				window.location.href="angular.html";
			}
		});
	})
	
	$("#3").click(function(){
		var url = "http://localhost:8080/eLearning/infoCollection/updateClickContent";
		$.ajax({
			type:"get",
			url:url,
			data: "category=" + $("#3").attr("id"),
			async:true,
			success:function(result){
				window.location.href="java.html";
			}
		});
	})
	
	$("#4").click(function(){
		var url = "http://localhost:8080/eLearning/infoCollection/updateClickContent";
		$.ajax({
			type:"get",
			url:url,
			data: "category=" + $("#4").attr("id"),
			async:true,
			success:function(result){
				window.location.href="android.html";
			}
		});
	})
	
	$("#5").click(function(){
		var url = "http://localhost:8080/eLearning/infoCollection/updateClickContent";
		$.ajax({
			type:"get",
			url:url,
			data: "category=" + $("#5").attr("id"),
			async:true,
			success:function(result){
				window.location.href="mongoDB.html";
			}
		});
	})
	
	//搜索结果
	$('#search').click(function(){
		window.location.href = 'search.html'
		var url = "http://localhost:8080/eLearning/InfoPush/searchItems";
		var content = $('#txtSearch').val();
		$.ajax({
			type:"get",
			url:url,
			async:true,
			data:"content=" + content,
			success:function(result){
				add_result(result);
//				build_page_nave(result);
			}
		});
		
		function add_result(result){
			$('#picture>img .title .detail').empty()
			var info = result.extent.pageInfo.list
			$('#lesson1').eq(0).$('.picture>img').css("src","info[0].picture")
			$('#lesson1').eq(0).$('.title').html('info[0].title')
			$('#lesson1').eq(0).$('.detail').html('info[0].details')
			
			$('#lesson1').eq(1).$('.picture>img').css("src","info[1].picture")
			$('#lesson1').eq(1).$('.title').html('info[1].title')
			$('#lesson1').eq(1).$('.detail').html('info[1].details')
			
			$('#lesson1').eq(2).$('.picture>img').css("src","info[2].picture")
			$('#lesson1').eq(2).$('.title').html('info[2].title')
			$('#lesson1').eq(2).$('.detail').html('info[2].details')
			
			$('#lesson1').eq(3).$('.picture>img').css("src","info[3].picture")
			$('#lesson1').eq(3).$('.title').html('info[3].title')
			$('#lesson1').eq(3).$('.detail').html('info[3].details')
		}
	})
	
		function build_page_nave(result){
			var firstPage = $('.pagination').eq(0)
			var prePage = $('.pagination').eq(1)
			var nextPage = $('.pagination').eq(6)
			var lastPage = $('.pagination').eq(7)
			var currentPage = result.extend.pageInfo.navigatepageNums.pageNum
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPage.addClass("disabled");
				prePage.addClass("disabled");
			} else {
				//翻页
				firstPage.click(function() {
					to_page(1);
					firstPage.addClass('active')
				});
				prePage.click(function() {
					to_page(currentPage - 1);
				});
			}
			
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPage.addClass("disabled");
				lastPage.addClass("disabled");
			} else {
				nextPage.click(function() {
					to_page(currentPage + 1);
				});
				lastPage.click(function() {
					to_page(result.extend.pageInfo.navigatepageNums.pages);
				});
			}
			
			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var num = $('.pagination').eq(item)
				if (currentPage == item) {
					num.addClass("active");
				}
				num.click(function() {
					to_page(item);
				});
			});

		}
}


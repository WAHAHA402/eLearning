$(function(){
	search()
	clickTabs()
	clickPagination()
	
	function search(){
		$('#txtSearch').on('keyup focus',function(){
			var txt = this.value.trim()
			if (txt){
				$("#search-helper").show()
			}
		})
		.blur(function(){
			$('#search-helper').hide()
		})
	}
	
	function clickTabs(){
		var $lis = $('#search-detail>ul>li')
		var $contents = $('#search-detail>div')
		$lis.click(function(){
			$lis.removeClass('current')
			this.className = 'current'
			$contents.hide()
			var index = $(this).index()
			$contents.eq(index).show()
		})
	}
	
	function clickPagination(){
		var $paginations = $('.pagination>li>a')
		var $lesson = $('#lessons>div:not(:last)')
		$paginations.click(function(){
			$paginations.removeClass('active')
			this.className = 'active'
			$lesson.hide()
			var $li = $(this).parent('li')
			var index = $li.index()
			$lesson.eq(index-1).show()
		})
	}
	
	
	
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
	
})
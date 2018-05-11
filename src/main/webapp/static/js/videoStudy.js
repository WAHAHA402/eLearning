$(function(){
	search()
	clickPagination()
	
	function search(){
		$('#txtSearch')
		.on('keyup focus',function(){
			var txt = this.value.trim()
			if (txt){
				$("#search-helper").show()
			}
		})
		.blur(function(){
			$('#search-helper').hide()
		})
	}
	
	function clickPagination(){
		var $paginations = $('.pagination>li>a')
		var $study = $('#study>div')
		$paginations.click(function(){
			$paginations.removeClass('active')
			this.className = 'active'
			$study.hide()
			var $lis = $(this).parent('li')
			var index = $lis.index()
			$study.eq(index - 1).show()
		})
	}
	
})
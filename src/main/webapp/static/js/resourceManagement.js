$(function(){
	search()
	
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

})
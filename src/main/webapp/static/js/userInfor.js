  function fileSelect() {
  	document.getElementById("fileToUpload").click();
  }

  function isSure() {
  	var mes = confirm("还未保存，您确定要退出吗？")
  	if(mes == true) {
  		window.location.href = "loginSuccessfully.html"
  	} else {
  		window.location.href = "userInfor.html"
  	}
  }
  function save(){
	  $.ajax({
			url: "http://localhost:8080/eLearning/authenticate/saveInfo",
			type: "POST",
			data: $("#infoForm").serialize(),
			success: function(result){
				//alert(result.msg);
				if(result.code==100){
					//员工保存成功：
					alert("保存成功");
				}else{
					
				}
				
			}
		});
  }

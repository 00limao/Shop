window.onload = function () {
    var userN = document.getElementById("username");
    var Psw = document.getElementById("psw");
    userN.onblur = function () {
        var user = this.value.match(/^[\w]{6,14}$/);
        if (user == null){
            document.getElementById("span1").innerText="用户名不合法";
        } else
        {
            document.getElementById("span1").innerText="用户名合法";
        }
    }
    Psw.onblur = function(){
        var PSW = this.value.match(/^[a-z0-9]{6,14}$/);
        if (PSW == null){
            document.getElementById("span2").innerText="密码不合法";
        } else
        {
            document.getElementById("span2").innerText="密码合法";
        }
    }
    var PSw = document.getElementById("psw1");
    PSw.onblur = function () {
        var PSW = this.value.match(/^[a-z0-9]{6,14}$/);
        if(PSw.value == Psw.value & PSW != null)
        {
            document.getElementById("span3").innerText="密码相同";
        }else
        {
            document.getElementById("span3").innerText="密码不同";
        }
    }
    var Email = document.getElementById("em");
    Email.onblur = function () {
        var Em = this.value.match(/^([\w]+)@(163|qq|126)(\.com|\.cn|\.org)$/);
        if (Em == null){
            document.getElementById("span4").innerText="邮箱不合法";
        } else
        {
            document.getElementById("span4").innerText="邮箱合法";
        }
    }
    var Tel = document.getElementById("tell");
    Tel.onblur = function () {
        var TEL =this.value.match(/^[+][8][6]\s\d{11}$/);
        if(TEL == null)
        {
            document.getElementById("span5").innerText="手机号不合法";
         }else{
            document.getElementById("span5").innerText="手机号合法";
        }

    }
    var submit = document.getElementById("sub");
    submit.onclick = function () {
       if (userN.value == null|| Psw.value ==null|| Email.value ==''||Tel.value == ''||zipcod.value == ''||ID.value == ''){
           alert("注册失败");
       }else{
           alert("注册成功");
       }
    }


}
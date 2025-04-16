$(function() {
    //读取并比对user数据
    function compare(inputUser,inputPw) {
        var storedUser = localStorage.getItem("storedUser");
        var storedPw = localStorage.getItem("storedPw");
        if(storedUser == inputUser && storedPw ==inputPw){
            alert("登入成功")
            window.location.href = "enter0.html";
        }else{
            alert("帐号密码输入错误")
        }
    }
    // 将管理人初始数据存入缓存
    var user0 = "SeiryoQ";
    var pw0 = "123456";
    if (!localStorage.getItem("storedUser")) {
        localStorage.setItem("storedUser", user0);
    }
    if (!localStorage.getItem("storedPw")) {
        localStorage.setItem("storedPw", pw0);
    }

    function inputAccount(inputUser,inputPw,inputSex,inputSl){
        localStorage.setItem("storedUser", inputUser);
        localStorage.setItem("storedPw", inputPw);
        localStorage.setItem("storedSex", inputSex);
        localStorage.setItem("storedSl", inputSl);
    }
    //抓取用户名和密码
    function inputUser(){
        var user = $(".user").val();
        return user
    }
    function inputPw(){
        var pw = $(".pw").val();
        return pw
    }
    //验证密码
    function pwConfirm () {
        $(this).siblings("span").remove();
        var reg = /^[1-9][0-9]{5}$/;
        var pw = inputPw();
        if ($.trim(pw) == "") {
            $(this).after("<span>账号密码不允许为空</span>")
            return false;
        } else if (!reg.test(pw)) {
            $(this).after("<span>密码数字组成的六位数，且不能用0开头</span>")
            return false;
        } else {
            return true;
        }
    }
    //验证账号
    function acConfirm() {
        $(this).siblings("span").remove();
        var reg = /^(?=.*[A-Z])[A-Za-z0-9]{7}$/;
        var user = inputUser();
        if ($.trim(user) == "") {
            $(this).after("<span>账号密码不允许为空</span>")
            return false;
        } else if (!reg.test(user)) {
            $(this).after("<span>账号长度为7位及有字母数字组成，且包含大写字母</span>")
            return false;
        } else {
            return true;
        }
    }
    function sexComfirm(){
        $(this).siblings("span").remove();
        var reg = /^(男|女)$/;
        var inputSex = $("#sex").val();
        if($.trim(inputSex) == ""){
            $(this).after("<span>性别不允许为空</span>")
            return false;
        }else if(!reg.test(inputSex)){
            $(this).after("<span>性别只能是男或者女</span>")
            return false;
        }else{
            return true;
        }
    }
    function sgConfirm(){
        $(this).siblings("span").remove();
        var reg = /^.{0,50}$/;
        var inputSlogan = $("#slogan").val();
        if(!reg.test(inputSlogan)){
            $(this).after("<span>仅限50字</span>")
            return false;
        }else{
            return true;
        }
    }

    //绑定对比系统信息事件
    $(".user").on("blur",acConfirm);
    $(".pw").on("blur",pwConfirm);
    $("#sex").on("blur",sexComfirm);
    $("#slogan").on("blur",sgConfirm);
    $("#login").on("click",function(){
        if(acConfirm() && pwConfirm()){
            var inputUser = $(".user").val();
            var inputPw = $(".pw").val();
            compare(inputUser,inputPw);
        }
    });
    $("#signup").on("click",function(){
        if(acConfirm() && pwConfirm() && sexComfirm() && sgConfirm()){
            var inputUser = $(".user").val();
            var inputPw = $(".pw").val();
            var inputSex = $("#sex").val();
            var inputSl = $("#slogan").val();
            if ($.trim(inputSl) == ""){
                inputSl = "无";
            }
            inputAccount(inputUser,inputPw,inputSex,inputSl);
            alert("注册成功！");
            window.location.href = "login.html"
        }else{
            alert("不符合注册条件")
        }
    });
});

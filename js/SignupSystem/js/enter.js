$(function(){
    $("#sign").on("click",function(){
        window.location.href = "signup.html";
    });
    $(function() {
        // 特定账号的用户名和密码
        var specialUser = 'SeiryoQ';
        var specialPw = '123456';

        // 获取当前存储的用户名和密码
        var currentUser = localStorage.getItem("storedUser");
        var currentPw = localStorage.getItem("storedPw");

        // 检查当前登录用户是否是特定账号
        if(currentUser === specialUser && currentPw === specialPw) {
            var index = 0;
            $.each(currentUser,function(i,name){
                $("table").append("<tr><td>"+name+"</td></tr>")
                i++;
            });
            $.each(currentPw,function(i,name){
                $("table").append("<tr><td>"+currentPw+"</td></tr>")
            });
            $.each(currentUser,function(i,name){
                $("table").append("<tr><td>"+localStorage.getItem("storedSex")+"</td></tr>")
            });
            $.each(currentUser,function(i,name){
                $("table").append("<tr><td>"+currentUser+"</td></tr>")
            });
            $.each(currentUser,function(i,name){
                $("table").append("<tr><td>"+currentUser+"</td></tr>")
            });
            // // 根据获取的信息更新表格
            // updateTableWithAccountsInfo(allAccountsInfo);
        } else {
            var tableContent = "<tr>" +
                "<td>" + currentUser + "</td>" +
                "<td>" + currentPw + "</td>" +
                "<td>" + localStorage.getItem("storedSex") + "</td>" +
                "<td>" + localStorage.getItem("storedSl") + "</td>" +
                "<td><input type='button' value='编辑' class='bt'></td>" +
                "</tr>";
            $("table").append(tableContent);
        }
        //编辑
        $("table").on("click",".bt",function(){
            var $pw = $(this).siblings("td:eq(0)");
            var $sex = $(this).siblings("td:eq(1)");
            var $sl = $(this).siblings("td:eq(2)");
            // 创建一个输入框，并设置相应的属性
            var $input = $("<input>").attr({
                "type": "text",
                "value": "value",
                "class": "editInput"
            });
            $pw.replaceWith($input);
            $sex.replaceWith($input);
            $sl.replaceWith($input);
            $(this).attr("value","保存");
        });


    });

    // function getAllAccountsInfo() {
    //     return [
    //         $.each(data,function(i,name){
    //     ];
    // }
    //
    // // 使用账户信息更新表格的函数
    // function updateTableWithAccountsInfo(accountsInfo) {
    //     var $table = $("table");
    //     $table.empty(); // 清空现有表格内容
    //     $.each(accountsInfo, function(index, account) {
    //         $table.append("<tr>" +
    //             "<td>" + account.user + "</td>" +
    //             "<td>" + account.pw + "</td>" +
    //             "<td>" + account.sex + "</td>" +
    //             "<td>" + account.sl + "</td>" +
    //             "</tr>");
    //     });
    // }
});
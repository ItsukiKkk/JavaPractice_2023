$(function(){
    // localStorage.clear();
    load();
    $("#title").on("keydown",function(kc){
        if(kc.keyCode == 13){
            var data = get();
            data.push({title:$(this).val(),done:false});
            // set(data);
            set(data);
            load();
            $(this).val("");
        }
    });
    $("ol").on("click","input",function(){
        var data = get();
        var changeId = $(this).siblings("a").attr("id");
        data[changeId].done = $(this).prop("checked");
        set(data);
        load();
    });
    $("ul").on("click","input",function(){
        var data = get();
        var changeId = $(this).siblings("a").attr("id");
        data[changeId].done = $(this).prop("checked");
        set(data);
        load();
    });
    $("section").on("click", "a", function() {
        var data = get(); // 获取当前数据
        var itemId = $(this).attr("id"); // 获取要删除项的索引
        data.splice(itemId, 1); // 从数据中移除相应的项目
        set(data); // 更新本地存储
        load(); // 重新加载视图
    });
    function set(data){
        if(data != null){
            localStorage.setItem("listtodo",JSON.stringify(data));
        }
    }

    function get(){
        var data = localStorage.getItem("listtodo");
        if(data !== null){
            return JSON.parse(data);
        }else{
            return [];
        }
    }
    function load(){
        $("ol,ul").empty();
        var data = get();
        $.each(data,function(i,name){
            if(name.done){
                $("ul").prepend("<li><input type='checkbox' checked>"+name.title+"<a href='javascript:;' id="+i+"></a></li>")
            }else{
                $("ol").prepend("<li><input type='checkbox'>"+name.title+"<a href='javascript:;' id="+i+"></a></li>")
            }
        });
        $("#todocount").html($("ol").children().length);
        $("#donecount").html($("ul").children().length);
    }

})
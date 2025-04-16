//多行删除
var isMulDel = false;
var delRowId;
var delRow;
var priceDeleted;
//删除按钮
//多行删除
function mulDel() {
    $("input[name='item']:checked").each(function() {
        $(this).closest("tr").remove();
    });
    $("#allCb").prop('checked',false);
}
//删除后更新选中选项
function updateCheckboxState() {
    var allItems = $("input[name='item']").length;
    var checkedItems = $("input[name='item']:checked").length;
    $("#allCb").prop('checked', allItems === checkedItems);
}
//绑定事件进行更新
function bindEventHandlers() {
    $(".deleteRow").off("click").on("click", function() {
        delRow = $(this).closest("tr");
        mask();
        $("#dialog").css("display", "block");
    });
    $("#btnSure").off("click").on("click", function() {
        $("#dialog").css("display", "none");
        $("#mask").css("display", "none");
        if (delRow) {
            delRow.remove();
            delRow = null; // 清除引用
        } else {
            mulDel(); // 多行删除
        }
        updateTotal();
    });

    $("input[name='item'], #allCb").off("change").on("change", function() {
        updateTotal();
        updateCheckboxState();
    });

    plusPrice();
    minusPrice();
}
//遮罩和选项
function mask(){
    var bh = $("body").height();
    var bw = $("body").width();
    $("#mask").css({
        display:"block",
        height:bh+"px",
        width:bw+"px",
    })
}


//价格变动
function calPrice($BtnObj,number){
    var $tdObj = $BtnObj.parent().next();
    var price = parseFloat($tdObj.text().substr(1));
    var $tdObjTotal = $tdObj.next();
    var total = price*number;
    $tdObjTotal.html("&yen;"+total.toFixed(2));
};
function calTotalPrice(){
    var sum = 0;
    // console.info($(":checked").parents().siblings("td[title='price']").length)
    $("input[name='item']:checked").closest("tr").find("td[title='price']").each(function(){
        sum = sum+parseFloat($(this).text().substr(1));
    });
    $("#spanTotal").html("￥"+sum);
    return sum;
}
//显示总数
function totalNum(){
        var totalNum = 0;
        //this是checked元素
    $("input[name='item']:checked").closest("tr").find(".txt").each(function (){
            var value = parseInt($(this).val()); // 获取每个元素的值并转换为数字
            if (!isNaN(value)) {
                totalNum += value;
            }
        });
        $(".cal span").eq(0).text(totalNum);
}
//价格+
function plusPrice(){
    $("input.btnAdd").click(function(){
        var $input = $(this).siblings("input[type='text']");
        var num = parseInt($input.val());
        num++;
        $input.val(num);
        calPrice($(this), num);
        calTotalPrice();
        totalNum();
    });
}
//价格-
function minusPrice(){
    $("input.btnMinus").click(function(){
        var $input = $(this).siblings("input[type='text']");
        var num = parseInt($input.val());
        if(num > 1) {
            num--;
            $input.val(num);
            calPrice($(this), num);
            if($(":checked"))
            calTotalPrice();
            totalNum();
        }
    });
}




//reload
function updateTotal() {
    calTotalPrice();
    totalNum();
}


//onload
$(function(){
    //删除按钮
    $("tr td a").click(function(){
        mask();
        $("#dialog").css("display","block");
    });
    //多行删除
    $("#delAll").click(function(){
        isMulDel = true;
        $("#mask").css("display","block");
        $("#dialog").show();
    });
    //mask
    $("tr td a").click(function(){
        mask();
        $("#dialog").css("display","block");
        delRow = $(this).closest("tr");
    });
    //提示框的取消按钮
    $("#cancel").click(function(){
        $("#dialog").css("display","none");
        $("#mask").css("display","none");
    });
    //按提示框的确定
        bindEventHandlers();


    //全选按钮
    $("#allCb").click(function(){
        $("input[type='checkbox']").prop('checked', $(this).prop('checked'));
        calTotalPrice();
        totalNum();
    });
    $("input[name='item']").click(function() {
        // 如果有任何一个单个选项取消选择，则取消全选选项
        if (!$(this).prop("checked")) {
            $("#allCb").prop("checked", false);
        }
        //如果所有已选单选按钮的对象长度等于总按钮对象长度
        if ($("input[name='item']:checked").length == $("input[name='item']").length) {
            $("#allCb").prop("checked", true);
        } else {
            $("#allCb").prop("checked", false);
        }
    });
    //增加减少
    plusPrice();
    minusPrice();
    // 选中checkbox
    $(":checkbox:gt(0)").click(function (){
        // reload();
        calTotalPrice();
        totalNum();
    });
});

//多行删除
var isMulDel = false;
function mulDel(){
    var delCount;
    //得到一个JQ对象数组；each
    $cbObjs = $("input[type='checkbox']:checked");
    delCount = $cbObjs.length;
    if (delCount != 0) {
        $cbObjs.each(function () {
            $(this).parents("tr").remove();
        });
    }
}
//删除按钮
function mask(){
    var bh = $("body").height();
    var bw = $("body").width();
    $("#mask").css({
        display:"block",
        height:bh+"px",
        width:bw+"px",
    })
}
var delRowId;
var delRow;
var priceDeleted;
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
    $("#tabOrder td[title='price']").each(function(){
        sum = sum+parseFloat($(this).text().substr(1));
    });
    $("#spanTotal").html("￥"+sum);
    return sum;
}
//onload
$(function(){
    //删除按钮
    $("tr td a").click(function(){
        mask();
        $("#dialog").css("display","block");
    });

    $("tr td a").click(function(){
        mask();
        $("#dialog").css("display","block");
        delRow = $(this).closest("tr");
    });

    $("#btnSure").click(function (){
        $("#dialog").css("display","none");
        $("#mask").css("display","none");
        //得到这行的价格后修改总价格
        priceDeleted = parseFloat($("#tabOrder tr td[title='price']").text().substr(1));
        console.info(priceDeleted);
        var endPrice = parseFloat(calTotalPrice())-priceDeleted;
        $("#spanTotal").html("￥"+endPrice);
        if(!isMulDel){
            delRow.remove();
        }else{
            mulDel();
        }
        $("#dialog").hide();
        $("#mask").hide();
    });
    $("#cancel").click(function(){
        $("#dialog").css("display","none");
        $("#mask").css("display","none");
    });
    //多行删除
    $("#delAll").click(function(){
        isMulDel = true;
        $("#mask").css("display","block");
        $("#dialog").show();
    });
    $("#btnSure").click(function(){
        if(!isMulDel){
            $("table tr[id='"+delRowId+"']").remove();
        }else{
            mulDel();
        }
        $("#dialog").hide();
        $("#mask").hide();
    });

    //价格
    $("input.btnAdd").click(function(){
        var $input = $(this).siblings("input[type='text']");
        var num = parseInt($input.val());
        num++;
        $input.val(num);
        calPrice($(this), num);
        calTotalPrice();
    });
    $("input.btnMinus").click(function(){
        var $input = $(this).siblings("input[type='text']");
        var num = parseInt($input.val());
        if(num > 1) {
            num--;
            $input.val(num);
            calPrice($(this), num);
            calTotalPrice();
        }
    });
    $("input[type='button']").click(function(){
        var totalNum = 0;
        //不用得到一个JQ对象数组，得值现用；each
        $(".txt").each(function (){
            var value = parseFloat($(this).val()); // 获取每个元素的值并转换为数字
            if (!isNaN(value)) {
                totalNum += value;
            }
        });
        var span1 = $(".cal span").eq(0).text(totalNum);
    });
});

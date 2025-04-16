function initType(){
    var foodType = new Array("休闲零食","营养保健","参茸滋补","茶叶","酒类","全球美食","生鲜蔬果","杨柳米面");
    for(var i in foodType){
        var obj = document.createElement("li");
        obj.innerHTML = "<a href='#'>"+foodType[i]+"</a>";
        obj.className = "info";
        document.getElementById("foods").appendChild(obj);
    }
}
function Food(desc, price, sale, pic){
    this.desc = desc;
    this.price = price;
    this.sale = sale;
    this.pic = pic;
}
var foods = new Array () ;
foods [0] = new Food("【百草味】坚果零食特产干果 奶油味夏威夷果200gx3包送开果器", 46.90, 9257, "images/food1.jpg");
foods [1] = new Food(" 【顺丰包邮】费列罗进口巧克力48粒零食品 妇女节礼盒生日礼物",133.00, 13000, "images/food2.jpg");
foods [2] = new Food("卡可芙 进口料408 克臻萃松露巧克力8口味 礼盒装 零食品特价包邮",19.90, 72000, "images/food3.jpg");
foods [3] = new Food("零食坚果特产 二级美国山核桃碧根果长寿果特价 250g装",7.5,220, "images/food4.jpg");
foods [4] = new Food("珠穆朗玛金牌金丝肉松饼30g 福建特产月饼 糕点皮薄 特价20个包邮", 0.1, 437, "images/food5.jpg");
foods [5] = new Food("河南特产 香辣零食 卫龙亲嘴烧 辣条 辣面筋 13克 60包包邮批发", 0.1, 1083, "images/food6.jpg");
foods [6] = new Food("80局美食 儿肘記フ 素火爆筋 麻辣素食 満50包包郎全国",0.1, 466, "images/food7.jpg");
foods [7] = new Food ("味芝元鱼排20克洞庭野生香辣烟熏鱼块 湖南特产零食小吃 味之源",0.99, 3057, "images/food8.jpg");
function showFoods (){
    var divPro = document. getElementById ("show") ;
    divPro.innerHTML = "";
    for (var i in foods) {
        var dlObj = document.createElement("dl");
        var content = "<dt><img src='" + foods[i]["pic"] + "'/></dt>";
        content += "<dd><p>¥<span>" + foods[i]["price"] + "</span></p>销量:<span>" + foods[i]["sale"] + "</span></dd>";
        content += "<dd>" + foods[i]["desc"] + "</dd>";
// alert (content);
        dlObj.innerHTML = content;
        dlObj.className = "eachPro";
        divPro.appendChild(dlObj);
    }
}
function sortByPrice(){
    foods.sort(function(a, b) {
        return a.price - b.price;
    });
    showFoods();
}
function sortBySale(){
    foods.sort(function(a, b) {
        return a.sale - b.sale;
    });
        showFoods();
}
function sortPro(){
    var selValue = document.getElementById("sort").value;
    if(selValue == 1){
        sortByPrice();
    }else if(selValue == 2){
        sortBySale();
    }
}


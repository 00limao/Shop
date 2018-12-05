/*
window.onload = function () {
    var switch1 = false;
    $("#ul li").each(function () {
        $(this).click(function () {
            if( switch1==false)
            {
                $(this).append($("<div style='height: 100px;width: 100px;border: 1px solid black;' />"));
                switch1 = true;
            }else if(switch1 == true)
            {
                $(this).children("div").remove();
                switch1 = false;
            }
        })
    })
}*/
window.onload = function (ev) {
    $(".Firlist").css("display","none");
        $(".left_click").click(function () {
            $(".Firlist").toggle();
            $(".left_click").css("background","cornflowerblue");
            $(".left_click1").css("background","white");

        })
    $(".Firlist1").css("display","none");
    $(".left_click1").click(function () {
        $(".Firlist1").toggle();
        $(".left_click").css("background","white");
        $(".left_click1").css("background","cornflowerblue")
    })
}
















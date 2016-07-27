/**
 * Created by wuhongxu on 2016/7/24.\
 */
$(document).ready(function(){
    index();
})
function addUser(){
    loadWraper("User/addUser");
}
function index(){
    loadWraper("index/indexPage");
}
function addUserGroup(){
    loadWraper("User/addUserGroup");
}
//进一步封装
function loadWraper(url){
    loadPanel(url,"#hudongwuxian");
}
/*
调用此方法 可以使用ajax在传入的模块中加载需要的页面

 */
function loadPanel(url,panel){
    $.ajax({
        type:"get",
        url:url,
        success:function(data){
            $(panel).html(data);
        },
        error:function(){
            $(panel).html("服务器错误");
        }
    });
}
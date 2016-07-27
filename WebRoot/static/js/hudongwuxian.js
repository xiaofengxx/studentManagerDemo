/**
 * Created by wuhongxu on 2016/7/24.\
 */
$(document).ready(function(){
    index();
})
function addUser(){
    loadWraper("User/addUser");
}
function logout() {
    loadWraper("user/logout");
}
function index(){
    loadWraper("index/indexPage");
}
function loadWraper(url){
    $.ajax({
        type:"get",
        url:url,
        success:function(data){
            $("#hudongwuxian").html(data);
        },
        error:function(){
            $("#hudongwuxian").html("服务器错误");
        }
    });
}
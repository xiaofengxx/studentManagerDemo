/**
 * Created by wuhongxu on 2016/7/24.\
 */
// $(document).ready(function(){
//     index();
// })
$(function () {
    $('body').on('pjax:end', function () {
        //当pjax请求结束
        //重新绑定事件
        //重新绘图
        draw();
    });

    $(document).pjax('a[target!=_blank]', '#hudongwuxian', {
        fragment: '#hudongwuxian',
        timeout: 8000,
        show: 'fade',
        cache: true,
        storage:true
    });
    function draw() {
        $('#easypiechart-teal').easyPieChart({
            scaleColor: false,
            barColor: '#1ebfae'
        });

        $('#easypiechart-orange').easyPieChart({
            scaleColor: false,
            barColor: '#ffb53e'
        });

        $('#easypiechart-red').easyPieChart({
            scaleColor: false,
            barColor: '#f9243f'
        });

        $('#easypiechart-blue').easyPieChart({
            scaleColor: false,
            barColor: '#30a5ff'
        });
    }

    function addUser() {
        loadWraper("User/addUser");
    }

    function logout() {
        loadWraper("user/logout");
    }

    function index() {
        loadWraper("index/indexPage");
    }

    function addUserGroup() {
        loadWraper("User/addUserGroup");
    }

    function enrollStudent() {
        loadWraper("Student/enrollStudent");
    }

//进一步封装
    function loadWraper(url) {
        alert(url);
        if (url == null || url == "")
            return;
        loadPanel(url, "#hudongwuxian");
    }

    /*
     调用此方法 可以使用ajax在传入的模块中加载需要的页面

     */
    function loadPanel(url, panel) {
        $.ajax({
            type: "get",
            url: url,
            beforeSend: function (xhr) {
                xhr.setRequestHeader('X-PJAX', 'true');
            },
            success: function (data) {
                $(panel).html(data);
                draw();
            },
            error: function () {
                $(panel).html("服务器错误");
            }
        });
    }
});

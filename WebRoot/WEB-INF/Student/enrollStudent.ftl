<div id="hudongwuxian">
    <div class="clear-margin content">
        <div class="item">
            <div class="clearfix  far-bottom">
                <span class="title">报名学生</span>
                <button class="btn btn-success pull-right">添加报名信息</button>
            </div>
            <form>
                <span>
                    <label for="all-search" class="sr-only">search</label>
                    <div class="input-group pull-left hdwx-input-sm">
                        <input type="text" class="form-control" id="all-search" placeholder="">
                        <span class="input-group-btn">
                            <button type="button" class="btn btn-success">
                                <i class="glyphicon glyphicon-search"></i>
                            </button>
                        </span>
                    </div>
                    <div class="pull-right hdwx-input-sm">
                        <label for="dtp_input2" class="col-md-12 control-label sr-only">Date Picking</label>
                        <div class="input-group date form_date col-md-12" data-date="" data-date-format="dd MM yyyy" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" value=""disabled>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                        </div>
                        <input type="hidden" id="dtp_input2" value=""><br>
                    </div>
                </span>
            </form>

            <table class="table table-hover table-striped">
                <thead>
                <th>
                    用户组
                </th>
                <th>
                    批量编辑
                </th>
                <th>
                    操作时间
                </th>
                <th>
                    操作
                </th>
                <th>
                    操作用户
                </th>
                </thead>
                <tr>
                    <td>
                        管理
                    </td>
                    <td>
                        <a class="text-success">编辑</a>
                    </td>
                    <td>
                        操作时间
                    </td>
                    <td>
                        <a class="text-success">增加</a>/
                        <a class="text-success">修改</a>/
                        <a class="text-success">删除</a>/
                        <a class="text-success">停用</a>
                    </td>
                    <td>
                        操作用户
                    </td>
                </tr>
                <tr>
                    <td>
                        咨询师
                    </td>
                    <td>

                    </td>
                    <td>

                    </td>
                    <td>

                    </td>
                    <td>

                    </td>
                </tr>
            </table>
            <a class="text-success">添加用户组+</a>
            <button class="btn btn-success center-block">保存</button>
        </div>
    </div>
    <script type="text/javascript">
        $('.form_date').datetimepicker({
            language:  'fr',
            weekStart: 1,
            todayBtn:  1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            minView: 2,
            forceParse: 0
        });
    </script>
</div>
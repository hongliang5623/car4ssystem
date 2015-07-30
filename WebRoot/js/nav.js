// 导航栏配置文件
var outlookbar=new outlook();
var t;
t=outlookbar.addtitle('了解售后','售后简介',1)
outlookbar.additem('关于售后',t,'functionpags/aboutus/instro.jsp')
outlookbar.additem('业务简介',t,'functionpags/aboutus/busses.jsp')
outlookbar.additem('联系我们',t,'functionpags/aboutus/connect.jsp')
//车主菜单      车主业务1
t=outlookbar.addtitle('基本设置','车主业务',1)
outlookbar.additem('查看消费情况',t,'functionpags/profile.html')
outlookbar.additem('查看现用套餐',t,'functionpags/profile.html')
outlookbar.additem('修改使用套餐',t,'functionpags/chanagepass.html')
outlookbar.additem('修改使登陆账户',t,'functionpags/chanagepass.html')


//车主业务2
t=outlookbar.addtitle('服务预约','车主业务',1)
outlookbar.additem('保养预约',t,'functionpags/chanagepass.html')
outlookbar.additem('维修预约',t,'functionpags/chanagepass.html')
//车主业务3
t=outlookbar.addtitle('厂商交流','车主业务',1)
outlookbar.additem('在线咨询',t,'functionpags/manframe.html')
outlookbar.additem('服务评价',t,'functionpags/manframe.html')
//outlookbar.additem('修改现有文章',t,'modify.php')
//outlookbar.additem('撰写最新文章',t,'sub_new.php')
//outlookbar.additem('投稿给文学报',t,'#')


//经理菜单     管理首页
/*
 * t=outlookbar.addtitle('退出系统','管理首页',1)
outlookbar.additem('点击退出登录',t,'loginout.php')
t=outlookbar.addtitle('请求审批','易货管理',1)

t=outlookbar.addtitle('发布通知','广告新闻',1)
*/
//员工菜单   业务处理 用户管理1
t=outlookbar.addtitle('用户资料','用户管理',1)
outlookbar.additem('查看用户',t,'ShowOwnerAction')
outlookbar.additem('添加用户',t,'functionpags/custombuss/tianjia.jsp')
//业务处理  处理业务3
t=outlookbar.addtitle('维修处理','用户管理',1)
outlookbar.additem('填写维修单',t,'functionpags/custombuss/weixiud.jsp')
outlookbar.additem('填写保养单',t,'functionpags/custombuss/baoyangd.jsp')
outlookbar.additem('编辑套餐',t,'functionpags/custombuss/taocan.jsp')

t=outlookbar.addtitle('用户业务','用户管理',1)
outlookbar.additem('客户预约查看',t,'functionpags/custombuss/checkyuyue.jsp')
outlookbar.additem('客户评价查看',t,'functionpags/custombuss/checkcomment.jsp')
outlookbar.additem('保养提醒',t,'functionpags/custombuss/checkcare.jsp')

t=outlookbar.addtitle('填写申请','审批管理',1)
outlookbar.additem('出差申请',t,'functionpags/apply/apply_out.jsp')
outlookbar.additem('维修申请',t,'functionpags/apply/apply_repair.jsp')
outlookbar.additem('零件申请',t,'functionpags/apply/apply_tool.jsp')

t=outlookbar.addtitle('请求审批','审批管理',1)
outlookbar.additem('出差审批',t,'ShowApplyOutAction')
outlookbar.additem('维修审批',t,'ShowApplyrRepairAction')
outlookbar.additem('零件审批',t,'ShowApplyToolsAction')

t=outlookbar.addtitle('查看通知','审批管理',1)
outlookbar.additem('出差通知',t,'ShowReadOutAction')
outlookbar.additem('维修通知',t,'ShowReadRepareAction')
outlookbar.additem('零件领取通知',t,'ShowReadToolsAction')

t=outlookbar.addtitle('查看维修','历史账单',1)
outlookbar.additem('维修单查看',t,'ShowRepareAction')
outlookbar.additem('保养单查看',t,'ShowBaoyangAction')
outlookbar.additem('零件使用查看',t,'ShowToolsPassAction')

t=outlookbar.addtitle('查看业务','历史账单',1)
outlookbar.additem('外出记录查看',t,'ShowOutPassAction')
outlookbar.additem('公司套餐查看',t,'ShowPackageAction')


t=outlookbar.addtitle('仓库管理','仓库管理',1)
outlookbar.additem('库存查看',t,'loginout.php')
outlookbar.additem('零件补充',t,'loginout.php')
outlookbar.additem('零件查看',t,'loginout.php')
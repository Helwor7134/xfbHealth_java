# 学付宝健康上报工具

[点击这里获取安卓程序](https://www.helwor.top/index.php/2020/09/06/383/ "")

### 原理就是伪造客户端请求，完成打卡操作

> 注意：请求头中的cookie信息需要换成自己的，这是用来识别用户的。同理，如果你拿到了很多人的cookie信息，就可以实现批量打卡

> 由于我没有写登录模块，所以想要知道自己的cookie信息就需要手动对已经登录好的软件抓一下包，如下图所示，这是抓取的软件健康上报页面点击提交按钮后软件向后端发送的请求，这其中的内容就包含了你所需要的所有信息，请求头的最后一项便是你自己的cookie信息
>![fiddle](https://pic.downk.cc/item/5f51be87160a154a676982d6.png "fiddle")

### 请求体中具体的参数演示以及对应的效果
+ phone=123456789
+ jqqx=%E9%83%91%E5%B7%9E%E5%B8%82%E9%87%91%E6%B0%B4%E5%8C%BA（这里使用的是url编码）
+ jqqxbz=
+ cxzz=1000000000
+ mqzz=0
+ whpl=0
+ yqryjc=0
+ backdate=
+ zzbz=
+ json=true

![demo](https://pic.downk.cc/item/5f51be87160a154a676982d3.png "demo")

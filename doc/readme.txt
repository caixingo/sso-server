1.sso登录包含三个工程，公用组件sso-common，客户端sso-client，服务器工程sso-server。
2.sso-common工程是sso客户端sso-client和sso-server服务器端公用的工程，需要用到里面的一些公共类。
3.数据库用的mysql,运行工程之前需要先建库，否则数据源加载失败。
4.sso-server工程启动之后需要初始化单点登录功能。初始化访问路径:工程域名路径/account/init
在初始化页面需要把sso-server工程web.xml里面的APP_KEY和APP_SECRET填入输入框。
5.单点登录使用https，需要进行Https的相应配置。不了解配置https的同学网上搜索下。
6.我配置的本地服务器测试域名是uic.pcitc.com，可以自己进行修改。
7.整个单点登录功能对传输数据使用对称加密，并且对加密数据进行了数字签名。
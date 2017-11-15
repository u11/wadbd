感谢网上各路大神们提供的技术。

这个软件主要用于协助开发。

当前版本的功能:通过wifi连接调试，让安卓开发无需USB线。需要root。

使用说明:

1)点击设置service.adb.tcp.port
2)点击Stop adbd
3)点击Start adbd

4)在电脑端cmd窗口输入adb connect ip,ip为手机端的程序上显示的ip

说明:
1)要断开连接只需要输入adb disconnect
2)要查看当前链接的设备请输入adb devices

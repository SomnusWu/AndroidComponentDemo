
# Android组件化 Demo
## 组件化 -> 开发时是 application，发版时是 library

* 使用[arouter](https://github.com/alibaba/ARouter) 作为组件间的跳转。
* 注意用ARouter时 ：多个Module中不能使用相同的分组名  比如：path = "/path1/activity1",path = "/path1/activity2" ，否则会跳转失败。
* gradle.properties 中设置 IsBuildMudle=false 可以编译运行整个project，注意IsBuildMudle变量设置改变时，要对gradle进行sy。    #IsBuildMudle=true，可以独立运行每个module，独立运行调试，



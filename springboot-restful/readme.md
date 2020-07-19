这个demo也是从这里[(传送门)](https://github.com/JeffLi1993/springboot-learning-example)复制过来的，因为也踩了坑，所以记录一下<br>
# 坑
## mysql 8.0连接问题
我是用docker起的mysql，用的是8.0.18版本，spring boot连接时有点问题，用原地址中的连接字符串不能连接，网上搜了很多说的都不行，最后将pom.xml中mysql驱动包的版本也改为8.0.18才连接成功
这个demo是从这里[(传送门)](https://github.com/JeffLi1993/springboot-learning-example)抄过来的，至于为什么还要上传到这里，当然不是为了抄袭，因为他上传的demo跑不通，我是踩了坑之后跑通后才上传上来的<br>
spring boot读取配置谁的方式：<br>
这个demo是测试spring boot读取配置文件的方式<br>
* 默认读取resources中的application.properties文件，可以在该文件中配置运行环境
* 如果找不到上面的文件或上面的文件没有需要的数据，会继续找application.yml文件，读取这里的数据
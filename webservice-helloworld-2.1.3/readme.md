该项目使用spring boot 2.1.3版本进行搭建简单webservice示例，虽然简单也踩了坑<br>
# 坑一
最初是跟着别人写的教程（[传送门](https://www.cnblogs.com/xibei666/p/8970549.html "")）来写的，但是这里是用1.5.3，而我想升级到2.1.3，抄完发现不能用，会报一个莫名其妙的错误，后来发现只是因为这里的代码少了一个name属性
```
@Bean
    public ServletRegistrationBean dispatcherServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/service/*");//发布服务名称
    }
```
在@Bean后加上name属性，如下：<br>
`@Bean(name="cxfServlet")`<br>
即可
# 坑二
成功跑起来后使用node的node-soap包测试时，会报这个（[传送门](https://www.cnblogs.com/zfding/p/10475397.html)）错误，原因也如这里所说，其实是因为webservice服务类上的targetNamespace写的不对导致的，这个值应与package的name成倒序，如这里package的name是springboot.Service，那这个值就应该是Service.springboot，最初这里是随便写的，所以导致调用时出错。

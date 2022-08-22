# SpringCloudDemo
搭建入门级SpringCloudDemo




1、Eureka是基于REST（Representational State Transfer）服务，主要以AWS云服务为支撑，提供服务发现并实现负载均衡和故障转移。我们称此服务为Eureka服务。Eureka提供了java客户端组件，Eureka Client，方便与服务端交互。客户端内置了基于round-robin实现的简单负载均衡。在Netifix，为Eureka提供更为复杂的负载均衡方案进行封装，以实现高可用，它包括基于流量、资源利用率以及请求返回状态的加权负载均衡。

[springcloud教程 -- 1.快速搭建入门级demo,看这一篇就够了_叶巨岩的博客-CSDN博客_springcloud](https://blog.csdn.net/weixin_38023579/article/details/81328524)

2、Feign是一个声明性web服务客户端。它使编写web服务客户机更容易。使用Feign创建一个接口并注释它。它具有可插入的注释支持，包括Feign注释和JAX-RS注释。Feign也支持可插拔编码器和解码器。Spring Cloud增加了对Spring MVC注释的支持，并支持使用Spring Web中默认使用的HttpMessageConverters。Spring Cloud集成了Ribbon和Eureka，以及Spring Cloud LoadBalancer，在使用Feign时提供一个负载均衡的http客户端。


[Feign原理 （图解） - 疯狂创客圈 - 博客园 (cnblogs.com)](https://www.cnblogs.com/crazymakercircle/p/11965726.html)


3、Zuul是所有来自设备和web站点到Netflix流媒体应用程序后端的请求的前门。作为一个边缘服务应用程序，Zuul的构建是为了支持动态路由、监视、弹性和安全性。它还可以根据需要将请求路由到多个Amazon自动伸缩组。Netflix API流量的数量和多样性有时会导致生产问题迅速而且没有任何警告。我们需要一个允许我们快速改变行为的系统，以便对这些情况做出反应。

[springcloud教程 -- 4.网关zuul的使用详解_叶巨岩的博客-CSDN博客](https://blog.csdn.net/weixin_38023579/article/details/104997164)

# 问卷系统


## 安装

因为DWSurvey是基于JAVA WEB实现，所以安装与一般的JAVA WEB程序无异，配置好数据库地址就可以正常使用。

### 安装说明

	服务器必须安装由 JAVA 1.6+、MySQL、Apache Tomcat 构成的环境

	由于引用的外部jar在你本地maven仓库中可能没有，这时只要您本地有maven环境，执行下bin目录下面的文件就可以自动导入。

## 环境配置说明

    lib目录下的几个jar包可能是您中央仓库没有，所以运行时如果提示找不到相关jar

    就请到bin目录下去执行jar导入命命，安装中央仓库缺失jar

    可直接执行 install-lose-jar.sh/install-lose-jar.bat

### 配置说明、数据初始化

    先在您mysql导入/src/main/resources/conf/sql/目录下的dwsurvey.sql数据库脚本文件

配置文件地址

    conf/application.properties

	#database settings
	jdbc.url=jdbc:mysql://localhost:3306/dwsurvey?useUnicode=true&characterEncoding=utf8
	jdbc.username=root
	jdbc.password=123456,.

    分别修改```jdbc.url、jdbc.username、jdbc.password```

### 启动访问

配置完成后，启动服务在浏览器中输入如```localhost:8080/diaowen```相应的地址看到登录页面，表示已经安装成功。

初始账号：```admin@admin.com``` 密码：```123456```


## 特色

以一种全新的设计体验，告别繁琐的设计流程，通过简单有趣的方式，轻轻松松完成问卷设计，多种问卷样式模板选择，只为显现更精美的表单问卷.

### 丰富的题型 

丰富的题型支持，通过拖拽即可完成题目选择，并可以随意拖动其位置，还可置入所需图片、企业LOGO、设置答题逻辑，一份优美的问卷就是这么简单。

### 问卷表单静态化

对于问卷表单系统，因为所有的表单字段都是后台数据库来维护，所以对于每一次答卷请求，如果都从后端数据库去取每一题及选项的话，必定会对性能造成不小影响。

所以在发布的表单问卷时会对数据进行的页面静态化，生成一个真实的表单存档。

## docker支持

### 快速体验

    # 启动一个 mysql 容器，等待初始化完成
    docker-compose up -d db

    # 启动 dwsurvey 容器
    docker-compose up -d dwsurvey

### 环境变量

如果你有现成的mysql，你可以单独启动 dwsurvey 容器。

    # docker pull wkeyuan/dwsurvey:latest
    # docker run -d -e ... wkeyuan/dwsurvey:latest

你可以通过环境变量来进行一些必要的配置，以下是所有支持的环境变量：

| 变量名 | 必须 | 作用 |
| ------ | ---- | ---- |
| ``MYSQL_HOST`` | 是 | 数据库地址，可以是域名或者IP。 |
| ``MYSQL_PORT`` | 否 | 数据库端口，默认为 ``3306`` 。 |
| ``MYSQL_DATABASE`` | 是 | dwsurvey使用的数据库，必须事先创建好。 |
| ``MYSQL_USER`` | 是 | 数据库帐号，必须实现创建好。 |
| ``MYSQL_PASSWORD`` | 是 | 数据库帐号的密码。 |
| ``ADMIN_EMAIL`` | 首次必须 | 初始帐号的邮箱。首次运行时必须，后续升级时不需要该变量。 |
| ``ADMIN_PASSWORD`` | 首次必须 | 初始帐号的密码。 |
| ``CONTEXT_ROOT`` | 否 | 默认为 ``/`` ，访问的URL根路径。|

### 本地构建镜像

由于使用了 multistage build 的特性，要求 docker 的版本大于 ``17.05`` 。

    docker build -t dwsurvey .

由于构建时需要从 maven 仓库下载大量依赖包，为了加快速度，你可以使用参数 ``LOCAL_MAVEN_MIRROR`` 来指定使用的 maven 镜像
（默认为阿里云的镜像）。

    docker build --build-arg LOCAL_MAVEN_MIRROR=http://your-mirror -t dwsurvey .

# TomDemoSpringByXml
實作一個spring4的範例專案，並使用XML的註解方式

##	ByName的注入方式範例
http://localhost:8080/TomDemoSpringByXml/mainController/mainActionByName

##	ByType的注入方式範例
http://localhost:8080/TomDemoSpringByXml/mainController/mainActionByType


###web.xml
servlet: 因為srpingMVC本身就是一個servlet，並利用<url-pattern>/</url-pattern>將所有請求url都交由srpingMVC控管
contextConfigLocation: 負責加載相關xml
ContextLoaderListener: 負責將加載的XML初始化(如未設定contextConfigLocation，則預設讀取applicationContext.xml)
DispatcherServlet: 前端處理器，負責處理http請求
CharacterEncodingFilter: 負責編碼，避免出現亂碼，一般使用utf-8

###執行流程
step1.
使用者發起請求到前端控制器（DispatcherServlet），該控制器會過濾出哪些請求可以訪問Servlet、哪些不能訪問。
就是url-pattern的作用，並且會載入springmvc.xml配置檔案。

step2.
前端控制器會找到處理器對映器（HandlerMapping），通過HandlerMapping完成url到controller對映的元件，
簡單來說，就是將在springmvc.xml中配置的或者註解的url與對應的處理類找到並進行儲存，用map<url,handler>這樣的方式來儲存。

step3.
HandlerMapping有了對映關係，並且找到url對應的處理器，HandlerMapping就會將其處理器（Handler）返回，在返回前，會加上很多攔截器。

step4.
DispatcherServlet拿到Handler後，找到HandlerAdapter（處理器介面卡），通過它來訪問處理器，並執行處理器。

step5.
執行處理器

step6.
處理器會返回一個ModelAndView物件給HandlerAdapter

step7.
通過HandlerAdapter將ModelAndView物件返回給前端控制器(DispatcherServlet)


git remote add origin https://github.com/tom511280/tomDemoJavaServlet.git


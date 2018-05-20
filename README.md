c3demo
-----
This project is an experiment using C3.js to render line charts.

I found this library really simple and easy to use, however have run into some difficulty when trying to render more
than one chart on a page.

I went through a process of reducing the problem and taking out as much as possible, this resulted in a pretty statuc
page *working.html* which seems to work. The charts are still generated using Javascript on the client and using the
same versions of the libraries.

#####Requires
- C3.js 0.6.1
- D3.js 5.4.0

This project also uses:
- Java (OpenJDK) 1.8.0
- jquery 3.3.1

#####Running
```
java -Dspring.output.ansi.enabled=always -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true -Dfile.encoding=UTF-8 -classpath <snip> au.com.prodevelop.c3demo.C3demoApplication
```
or
```
mvn spring-boot:run
```

#####TODO
This project needs many things. I recognise the lack of unit tests.
I also recognise that this will never be a production application, it is a hobby project for my own learning.

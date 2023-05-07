>> I had the same issue. I was using eclipse platform and server was missing in my show view.
   Steps:
   -help->install new software
   -in work with : select : "Indigo Update Site - http://download.eclipse.org/releases/indigo/" , once selected, all available software will be displayed in the   
    section under type filter text
   -Expand “Web, XML, and Java EE Development” and select "JST Server adapters extensions"
       
    OR
    
   -Open Eclipse and move move 
    [window -> show view -> ohters -> show views menu select ->other[If here "server" is not showing]
   -Check current version of Eclipse
   -Open the below like given and select your version and copy urls link.
   -move some other menu:
    [help -> install new software -> Avilable software ->work with -><past copy link>
   -select web,xml,java,EE and OSGI enterprises Deelopment->next and finished


>>How to see my Eclipse version?
   Steps:
   -Help-->installation details      
   

>> Tomcat configure in Eclipse:
   Steps:
       -Open Eclipse
        [window -> show view -> other view -> server ->open 
        

>> Set Servlet-api.jar file path:
   Steps:
      -open Eclipse:
       right click project explore->properties ->java build path ->select class path -> Add External jarfile
 
      After moving 
      C:\Program Files\Apache Software Foundation\Tomcat 10.0\lib -> Select ->servlet-api.jar file ->Apply and close
         
>> Package accessible from more than one module: <unnamed>
   Steps:
      -Right click Eclipse project > Properties > Java Build Path
      -In Libraries tab, remove all the external jar files under Modulepath and add them under Classpath (you can just select all the jars and drag them under Classpath)
      -Click Apply and Close
         
         
>> How to comment multiple lines in Eclipse.
      >First way:
         -select block of code -> right click -> source ->Add block comment
         
     >Second way:
         -ctrl+shift+/
   


>>How to import class automatically in Eclipse. 
   
      >In Eclipse, to import a single class, you may clicked on the class and press shortcut key “Ctrl + Space” to prompt all the available classes to import. 
   
      >Eclipse comes with a nice feature called “Organize Imports” to imports all the classes that are used, automatically.
      -Right click current file.
      -select source
      -Organize Imports


>> Multiple annotations found at this line: - The superclass "javax.servlet.http.HttpServlet", determined from the Dynamic Web Module facet version (4.0), 
   was not found on the Java Build Path - The superclass "javax.servlet.http.HttpServlet", determined from the Dynamic Web Module facet version (4.0), 
   was not found on the Java Build Path.
         OR
   [The superclass "javax.servlet.http.HttpServlet" was not found on the Java Build Path [duplicate].]
   Steps:
      the first string where place
      <%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8"%>


>> 
   Steps:


>> 
   Steps:
   















    

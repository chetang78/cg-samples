Once it is converted to maven project please clean up the cold classes files stored in : 
classes folder under C:\chetan\Learn\git\cg-samples\Math\WebContent  (otherwise the older files are picked up)

fixes for POM .. repo


<repositories>
 <repository>
 <id>maven online</id>
 <name>maven repository</name>
 <url>https://repo1.maven.org/maven2/</url>
 </repository>
 <repository>
 <id>liberty maven online</id>
 <name>liberty maven repository</name>
 <url>http://public.dhe.ibm.com/ibmdl/export/pub/software/websphere/wasdev/maven/repository/</url>
 </repository>
 </repositories>    
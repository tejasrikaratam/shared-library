
def mavenHome = tool name:"Maven-3.6.3",type: "maven"
         
         def mavenCMD= "${mavenHome}/bin/mvn"
         sh "${mavenCMD} clean package"

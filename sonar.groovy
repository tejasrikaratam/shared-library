def call(){

  def mavenHome = tool name: "Maven-3.6.3",type: "maven"
  withSonarQubeEnv('sonar-6') {
  sh "${mavenHome}/bin/mvn sonar:sonar"
 }
}


def call(){
    sh"mvn install -DskipITs=true"
    sh "mvn verify -DskipUnitTest"
}
def call(){
    sh"mvn install -DskipITs=true"
    sh "mvn clean verify -DskipTests=true"
}
def call(){
    sh"mvn install -DskipITs=true"
    sh "mvn checkstyle:checkstyle"
}
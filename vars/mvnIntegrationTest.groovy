def call(){
    sh"mvn install -DskipITs=true"
    sh "mvn -s checkstyle:checkstyle"
}
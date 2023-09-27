def call(){
    sh "mvn verify -DskipITs=true"
}
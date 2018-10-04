node {

   stage('Clone Repository') {
        // Get some code from a GitHub repository
        checkout scm
   }

   stage('Remove container if already running'){

    //Remove maven-build-container if it exists
           sh " docker-compose down"

   }

      stage('Build images if not exists') {



        sh "docker-compose build"
   }

        stage('Start containers'){
        sh "docker-compose up"

}
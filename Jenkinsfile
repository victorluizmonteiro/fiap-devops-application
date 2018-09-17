node {

   stage('Clone Repository') {
        // Get some code from a GitHub repository
        checkout scm
   }

   stage('Remove container if already running'){

    //Remove maven-build-container if it exists
           sh " docker rm -f fiap-devops-container"

   }

      stage('Deploy Spring Boot Application') {



        sh "docker run --name fiap-devops-container -d -p 8087:8080 monteiro1306/fiapdevops"
   }

}
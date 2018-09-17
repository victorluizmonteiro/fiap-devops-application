node {

   stage('Clone Repository') {
        // Get some code from a GitHub repository
        checkout scm
   }

      stage('Deploy Spring Boot Application') {

         //Remove maven-build-container if it exists
        sh " docker rm -f fiap-devops-container"

        sh "docker run --name fiap-devops-container -d -p 8087:8080 monteiro1306/fiapdevops"
   }

}
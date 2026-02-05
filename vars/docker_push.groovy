def call(String Project, String ImageTag, String dockerhubuser){
  echo "this is the docker push stage"
  withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
   echo "login steps in the dockerhub repo" 
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    echo "login successfully"
  }
  echo "steps for the image push"
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
  echo "image push successfully"
}

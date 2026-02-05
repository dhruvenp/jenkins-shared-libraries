def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo "building the docker image"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo"docker image create successfully"
}

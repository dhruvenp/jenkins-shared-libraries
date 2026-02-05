def call(String imageName, String imageTag, String hostPort, String containerPort) {

  echo "this is the deploy stage"

    sh """
  docker run -d \
  -p ${hostPort}:${containerPort} \
  ${imageName}:${imageTag}
  """
echo "the deployment is completed successfully"
}

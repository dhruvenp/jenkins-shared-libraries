def call(String url,String branch){
         echo "clonning the code"
         git url:"${url}",branch :"${branch}" 
}

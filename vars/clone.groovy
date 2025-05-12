def call(String url, String branch){
  echo "This is a cloning part"
  git url: "${url}", branch:"${branch}"
}

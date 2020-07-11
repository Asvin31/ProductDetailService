#!groovy 
node{
    def mvnHome = tool 'maven'
    stage('SCM Preparation') {
        git credentialsId: 'source:demo', url: 'https://github.com/Asvin31/ProductDetailService.git'
    }
    stage('Build Code') {
    sh "${mvnHome}/bin/mvn clean package -DskipTests"
  }
  stage("Code Quality and Unit Testing"){
    parallel (
      'Unit Testing': {
        sh "${mvnHome}/bin/mvn test"
      },
      'Code Quality Analysis': {
          sh "cd /var/lib/jenkins/ && sudo sh sonar.sh"
      }
    )
  }
  stage('Create docker image'){
      sh "sudo chmod 777 /var/run/docker.sock"
      sh "docker build -t gcr.io/retbgbm/pdp ."
  }
  stage('Push Image to Registry'){
      sh "gcloud auth print-access-token | docker login -u oauth2accesstoken --password-stdin https://gcr.io/retbgbm && docker push gcr.io/retbgbm/pdp"
      //sh "docker image rm gcr.io/retbgbm/pdp"
  }
  stage('Image validation'){
    echo "Checking image size"
    sh "cd /home/asvin_v/ && sh validate.sh"
    echo "Created image is valid"
  }
  stage('Deploy-staging'){
      //sh "cd /home/a_varun2/ && sh stage.sh"
	  sh "cd /var/lib/jenkins/ && sudo sh stage.sh"
  }
  stage("Testing"){
    parallel (
      'Contract Testing': {
        sh "cd /home/asvin_v/ && sh validate.sh"
      },
      'Selenium Testing': {
        sh "cd /home/asvin_v/ && sh validate.sh"
	sh 'echo "${USER}" > output.txt'
    	def val = readFile 'output.txt'
    	echo "${val}"
    	echo "${val.trim()}"
      }
    )
  }
  stage('Security Test'){
      //sh "cd /home/a_varun2/ && sh security.sh"
      //sh "cd /home/a_varun2/ && nohup sh wapiti-scan.sh &"                   
	  sh "cd /home/asvin_v/ && sh security.sh"
   } 
  stage('Deploy-production'){
      sh "docker run -d --net=host -p 8095:8095 gcr.io/retbgbm/pdp"
      //jiraSendDeploymentInfo environmentId: 'jfhgkmdsf-43', environmentName: 'sdaa', environmentType: 'development', site: 'rbgat.atlassian.net'
      //jiraSendBuildInfo site: 'rbgat.atlassian.net', branch: 'BEC-52'
      //jiraSendDeploymentInfo environmentId: 'BEC-52', environmentName: '', environmentType: 'production', site: 'rbgat.atlassian.net'
	  always {
          step([$class: 'DeploymentBuildMarker', environmentType: 'production'])
      }
  }
}

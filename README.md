# wildlife
This application is used to track the movements of specific animals within a US National Forrest to monitor things like chronic wasting disease, etc.

Follow instructions to set up your AWS Cloud9 IDE and walk through the tutorials: https://docs.aws.amazon.com/cloud9/latest/user-guide/create-environment-main.html

Clone the GitHub repository.

Follow the instructions to set up a Java application with this tutorial: https://docs.aws.amazon.com/cloud9/latest/user-guide/sample-java.html 

Choose Gradle as the build tool
-- NOTE: Due to deprecation, the build.gradle script in the tutorial must be modified as follows:

   ORIGINAL:
   
    dependencies {
      compile 'com.amazonaws:aws-java-sdk-s3'
      testCompile group: 'junit', name: 'junit', version: '4.12'
    }

  MODIFICATION:
  
    dependencies {
      implementation 'com.amazonaws:aws-java-sdk-s3'
      testImplementation group: 'junit', name: 'junit', version: '4.12'
    }

FROM java:8
ADD target/github-action-cicd.jar github-action-cicd.jar
ENTRYPOINT [ "java","-jar","github-action-cicd.jar" ]
pipeline {
    agent any
    tools {
        maven 'maven 3'
        // jdk 'java 8'
    }
    options {
        skipDefaultCheckout(true)
    }
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking Out ...'
                checkout scm
            }
        }
        stage('Compile') {
            steps {
                echo 'Compiling ...'
                dir("project_templates/java_project_template") {
                    sh 'mvn clean verify'
                }
            }
        }
        stage('Build') {
            steps {
                echo 'Building ...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing ...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying ...'
            }
        }
    }
}

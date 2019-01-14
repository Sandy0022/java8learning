pipeline {
    agent any
    options {
        skipDefaultCheckout(true)
    }
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking Out ...'
                def scmVars = 'checkout scm'
                echo scmVars.GIT_COMMIT
            }
        }
        stage('Compile') {
            steps {
                echo 'Compiling ...'
                sh 'mvn compile'
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

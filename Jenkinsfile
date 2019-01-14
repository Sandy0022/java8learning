pipeline {
    agent any
    options {
        skipDefaultCheckout(true)
    }
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking Out ...'
                mvn compile
            }
        }
        stage('Compile') {
            steps {
                echo 'Compiling ...'
                mvn compile
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

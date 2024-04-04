pipeline 
{
    agent any

    stages
    {
        stage('Get the code from GitHub') 
        {
            steps
            {
                git "https://github.com/HimanshuDalal1999/BDD_Framework_Master"
            }
        }
        
        stage('Executing Maven project')
        {
            steps
            {
                bat "mvn -Dmaven.test.failure.ignore=true clean test"
            }
        }
        
        stage('Sending an Email to recepient')
        {
            steps
            {
                echo "Sending Email"
            }
        }
        
    }
}

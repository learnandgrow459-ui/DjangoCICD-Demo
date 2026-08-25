pipeline{
    agent {label "worker"}
stages
{
    stage('Make Folder')
    {
     steps
     {
        sh "mkdir -p dev-folder-2"
    }
    }
}
}
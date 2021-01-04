def call(){
sh  'docker build -t tejasrik/devopspipeline .'
       sh 'docker login -u tejasrik -p Tejasri@6523'
       sh'docker push tejasrik/devopspipeline'
       sh'docker run -d tejasrik/devopspipeline'
       }

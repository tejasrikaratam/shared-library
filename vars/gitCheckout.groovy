def call(Map stageParams) {

 

    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
   
    ])
 echo "This is from shared-pipeline:{stageParams.branch}"
  }

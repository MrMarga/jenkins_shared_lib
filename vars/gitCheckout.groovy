def call(Map stageParams) {

    checkout{[
        $class: 'GitSCM'
        branches: [[branch: stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ]}
}
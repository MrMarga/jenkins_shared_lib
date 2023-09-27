def call(Map stageParams) {

    checkout{[
        $class: 'GItSCM'
        branches: [[name: stageParams.branch ]],
        userRemoteConfigs: [[url: stageParams.url]]
    ]}
}
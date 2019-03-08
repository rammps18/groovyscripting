#!groovy

// Call shared libaray for common params
def paramList = jobParams.listParams ([
    "var1": "value",
    "var2": "value2"
])
// Define repo specific params
def addtionalParams = [
    booleanParam(defaultValue: false, name: 'SOMETHING', description: 'description?'),
    booleanParam(defaultValue: false, name: 'SOMETHING_ELSE', description: 'description?'),
]
// Set Jenkins job properties, combining both
properties([
    buildDiscarder(logRotator(numToKeepStr: '20')),
    parameters(paramList + addtionalParams)
])




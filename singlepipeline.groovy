
// Fields applied to all the environments

def props() {
def newParameters = []

newParameters.Add([
$class 			: 'StringParameterDefinition',
name 			: 'RELEASE_TAG_NAME',
defaultValue	: '',
description		: 'SVN tag to use / deploy',
])

}




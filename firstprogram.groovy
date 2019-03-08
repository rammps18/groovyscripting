//variables
@Library('my-shared-library@v5')
def pplnjob

//load and define the pipeline
node(master) {

pplnjob = load "..\\workspace@script\\singlepipeline.groovy"
pplnjob.props()

}


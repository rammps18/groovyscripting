//variables
@Library('my-shared-library')
def pplnjob

//load and define the pipeline
node(master) {

pplnjob = load "..\\workspace@script\\singlepipeline.groovy"
pplnjob.props()

}


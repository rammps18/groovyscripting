import com.cloudbees.groovy.cps.NonCPS

//variables
def pplnjob

//load and define the pipeline
node('master') {

pplnjob = load './singlepipeline.groovy'
pplnjob.props()

}


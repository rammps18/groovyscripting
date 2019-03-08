import com.cloudbees.groovy.cps.NonCPS

//load and define the pipeline
node('master') {

pplnjob = load '../workspace@script/singlepipeline.groovy
pplnjob.props()

}


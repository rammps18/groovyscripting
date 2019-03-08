import com.cloudbees.groovy.cps.NonCPS

//load and define the pipeline
node('master') {

pplnjob = load './singlepipeline.groovy'
pplnjob.props()

}


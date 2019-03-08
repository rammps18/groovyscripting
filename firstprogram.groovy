import com.cloudbees.groovy.cps.NonCPS

//load and define the pipeline
node('master') {

pplnjob = load '../workspace@script/Deploy_pipeline.groovy
pplnjob.props()

}

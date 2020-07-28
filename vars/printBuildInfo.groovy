#!/usr/bin/env groovy
package vars;

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    echo config.name
    echo "Param1 is: ${env.param1}"
    echo "Param2 is: ${env.param2}"
    echo "GlobalVars.foo is: ${GlobalVars.foo}"
    return this
}
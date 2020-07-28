package test.vars;

import test.resources.PipelineSpockTestBase

/**
 * How to unit test some vars DSL like shared code
 */
class helloWorldTest extends PipelineSpockTestBase {

    def "test shared library code"() {

        given:
        def helloMessageBody = {
            message = 'This is a test message'
        }

        when:
        def script = loadScript('vars/sayHello.groovy')
        script.call(helloMessageBody)

        then:
        printCallStack()
        assertJobStatusSuccess()
    }
}
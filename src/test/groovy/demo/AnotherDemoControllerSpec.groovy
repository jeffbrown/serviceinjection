// src/test/groovy/demo/AnotherDemoControllerSpec.groovy
package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
class AnotherDemoControllerSpec extends Specification {

    static doWithSpring = {
        helperService DummyHelper
    }
    void "test service injection"() {
        when:
        controller.index()

        then:
        response.text == 'The answer is 2112'
    }
}

class DummyHelper {

    def getTheAnswer() {
        2112
    }
}

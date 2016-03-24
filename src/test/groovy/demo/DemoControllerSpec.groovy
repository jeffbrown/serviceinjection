// src/test/groovy/demo/DemoControllerSpec.groovy
package demo

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
@Mock(HelperService)
class DemoControllerSpec extends Specification {

    static doWithSpring = {
        helperService HelperService
    }

    void "test service injection"() {
        when:
        controller.index()

        then:
        response.text == 'The answer is 42'
    }
}

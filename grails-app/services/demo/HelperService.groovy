// grails-app/services/demo/HelperService.groovy
package demo

class HelperService {
    def anotherHelperService
    def getTheAnswer() {
        anotherHelperService.theAnswer
    }
}

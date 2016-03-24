// grails-app/controllers/demo/DemoController.groovy
package demo

class DemoController {
    def helperService

    def index() {
        def answer = helperService.theAnswer
        render "The answer is ${answer}"
    }
}

package g252msgsrc

class FooController {
    def messageSource

    def index() {
        [messageSource: messageSource]
    }
}

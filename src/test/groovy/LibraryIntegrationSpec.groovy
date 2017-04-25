import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class LibraryIntegrationSpec extends Specification {

    def 'can say hello to #sayHelloReceiver'() {

        when:
        def library = new Library()
        then:
        library.sayHelloTo(sayHelloReceiver) == "Hello $sayHelloReceiver!"

        where:
        sayHelloReceiver         | _
        "Earth"                  | _
        "World"                  | _
        "Universe"               | _
    }

}
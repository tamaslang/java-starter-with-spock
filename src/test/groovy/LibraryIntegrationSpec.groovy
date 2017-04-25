import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class LibraryIntegrationSpec extends Specification {
    def 'can call sayHello library method'() {
        when:
        def library = new Library()
        then:
        library.sayHelloTo("World") == "Hello World!"
    }
}
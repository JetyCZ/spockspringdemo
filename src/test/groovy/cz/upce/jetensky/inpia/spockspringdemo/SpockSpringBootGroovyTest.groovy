package cz.upce.jetensky.inpia.spockspringdemo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class SpockSpringBootGroovyTest extends Specification{

    @Autowired
    MyService myService

    void "contextLoads"() {
        expect:
            myService.hello() == "Hello"
    }

}

package com.example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PlayerSpec extends Specification implements DomainUnitTest<Player> {

     void "test domain constraints"() {
        when:
        Player domain = new Player()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}

//package com.app
//
//import io.micronaut.http.HttpRequest
//import io.micronaut.http.client.HttpClient
//import io.micronaut.http.client.annotation.Client
//import io.micronaut.test.extensions.spock.annotation.MicronautTest
//import jakarta.inject.Inject
//import spock.lang.Specification
//
//@MicronautTest
//class UserControllerSpec extends Specification {
//
//    @Inject
//    @Client('/')
//    HttpClient client
//
//    void 'test get user response'() {
//        when:
//        HttpRequest request = HttpRequest.GET('/user')
//        def rsp = client.toBlocking().retrieve(request)
//
//        then:
//        rsp != null
//    }
//
//}

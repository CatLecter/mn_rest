package com.app.controllers.api.admin

import groovy.transform.CompileStatic
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@CompileStatic
@Controller('api/admin')
class AdminController {

    @Get('/')
    @Produces(MediaType.TEXT_JSON)
    Map checkRole() {
        ['role': 'You`re a admin, Harry!']
    }

}

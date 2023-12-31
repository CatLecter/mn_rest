package com.app.controllers.api.v1

import com.app.models.UserRequestModel
import groovy.transform.CompileStatic
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*

import javax.validation.Valid

@CompileStatic
@Controller('api/user')
class UserController {

    @Get('/')
    @Produces(MediaType.APPLICATION_JSON)
    Map getUser(@QueryValue user_uuid) {
        ['user_uuid': user_uuid]
    }

    @Post('/')
    @Produces(MediaType.APPLICATION_JSON)
    Map addUser(@Valid @Body UserRequestModel user) {
        ['full_name': user.full_name, 'phone': user.phone]
    }

    @Put('/')
    @Produces(MediaType.APPLICATION_JSON)
    Map updateUser(@Valid @Body UserRequestModel user, @QueryValue user_uuid) {
        ['user_uuid': user_uuid, 'full_name': user.full_name, 'phone': user.phone]
    }

    @Delete('/')
    @Produces(MediaType.APPLICATION_JSON)
    Map deleteUser(@QueryValue user_uuid) {
        ['user_uuid': user_uuid]
    }

    @Delete('/')
    @Produces(MediaType.APPLICATION_JSON)
    Map deleteAllUsers(@QueryValue user_uuid) {
        ['user_uuid': user_uuid]
    }
}

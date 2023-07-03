package com.app.models

import javax.validation.constraints.NotBlank

class UserRequestModel {
    @NotBlank
    String full_name

    @NotBlank
    String phone
}

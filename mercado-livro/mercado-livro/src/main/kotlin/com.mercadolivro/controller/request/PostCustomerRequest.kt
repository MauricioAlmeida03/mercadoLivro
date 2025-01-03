package com.mercadolivro.controller.request

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty

data class PostCustomerRequest (

    @field:NotEmpty(message = "Nome deve ser válido")
    val name: String,

    @field:Email(message = "E-mail deve ser válido")
    val email: String
    )
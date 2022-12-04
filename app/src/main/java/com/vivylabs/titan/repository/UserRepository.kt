package com.vivylabs.titan.repository

import com.vivylabs.titan.service.UserService

class UserRepository(private val userService: UserService) {
    suspend fun findOne(id: Int) = userService.findOne(id)
}
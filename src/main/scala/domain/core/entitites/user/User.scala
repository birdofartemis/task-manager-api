package com.api.task.manager
package domain.core.entitites.user

import domain.core.valueobjects.user.UserId

case class User(
               id: UserId,
               username: String,
               password: String,
               )

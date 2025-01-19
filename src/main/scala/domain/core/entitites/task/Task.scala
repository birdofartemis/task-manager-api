package com.api.task.manager
package domain.core.entitites.task

import domain.core.valueobjects.task.{TaskId, TaskStatus}
import domain.core.valueobjects.user.UserId

import java.time.LocalDate

case class Task(
                 id: TaskId,
                 tittle: String,
                 description: String,
                 status: TaskStatus,
                 deadLine: Option[LocalDate],
                 userId: Option[UserId],
                 tags: List[String]
               )

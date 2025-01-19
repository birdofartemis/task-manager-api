package com.api.task.manager
package domain.core.valueobjects.task

sealed trait TaskStatus

object TaskStatus {
  case object TODO extends TaskStatus

  case object IN_PROGRESS extends TaskStatus

  case object DONE extends TaskStatus

  case object CANCELED extends TaskStatus


}

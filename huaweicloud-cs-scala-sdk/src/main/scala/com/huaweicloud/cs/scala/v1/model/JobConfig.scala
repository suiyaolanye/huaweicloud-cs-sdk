/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.scala.v1.model

import com.huaweicloud.cs.scala.v1.client.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class JobConfig (
  /* 是否开启作业自动快照功能, true开启, false关闭, 默认false */
  checkpointEnabled: Option[Boolean],
  /* 快照模式, 两种可选, exactly_once和at_least_once */
  checkpointMode: Option[JobConfigEnums.CheckpointMode],
  /* 快照时间间隔, 单位为秒 */
  checkpointInterval: Option[Int],
  /* 是否启用日志存储 */
  logEnabled: Option[Boolean],
  /* OBS桶名 */
  obsBucket: Option[String]
) extends ApiModel

object JobConfigEnums {

  type CheckpointMode = CheckpointMode.Value
  object CheckpointMode extends Enumeration {
    val ExactlyOnce = Value("exactly_once")
    val AtLeastOnce = Value("at_least_once")
  }

}


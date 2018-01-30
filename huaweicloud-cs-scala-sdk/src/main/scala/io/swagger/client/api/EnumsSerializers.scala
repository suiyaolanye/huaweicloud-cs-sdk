/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package com.huaweicloud.cs.scala.v1

import com.huaweicloud.cs.scala.v1.model._
import org.json4s._
import scala.reflect.ClassTag

object EnumsSerializers {

  def all: Seq[Serializer[_]] = Seq[Serializer[_]]() :+
    new EnumNameSerializer(ClusterOverviewEntityEnums.BillingUnit) :+
    new EnumNameSerializer(ClusterOverviewEntityEnums.TimeUnit) :+
    new EnumNameSerializer(JobConfigEnums.CheckpointMode) :+
    new EnumNameSerializer(JobDetailEntityEnums.RunMode) :+
    new EnumNameSerializer(JobEntityEnums.RunMode) :+
    new EnumNameSerializer(JobOverviewEntityEnums.BillingUnit) :+
    new EnumNameSerializer(JobOverviewEntityEnums.TimeUnit) :+
    new EnumNameSerializer(SubmitSqlJobRequestEnums.RunMode) :+
    new EnumNameSerializer(SubmitSqlJobRequestEnums.CheckpointMode) :+
    new EnumNameSerializer(UpdateSqlJobRequestEnums.RunMode) :+
    new EnumNameSerializer(UpdateSqlJobRequestEnums.CheckpointMode)

  private class EnumNameSerializer[E <: Enumeration: ClassTag](enum: E)
    extends Serializer[E#Value] {
    import JsonDSL._

    val EnumerationClass: Class[E#Value] = classOf[E#Value]

    def deserialize(implicit format: Formats):
    PartialFunction[(TypeInfo, JValue), E#Value] = {
      case (t @ TypeInfo(EnumerationClass, _), json) if isValid(json) =>
        json match {
          case JString(value) =>
            enum.withName(value)
          case value =>
            throw new MappingException(s"Can't convert $value to $EnumerationClass")
        }
    }

    private[this] def isValid(json: JValue) = json match {
      case JString(value) if enum.values.exists(_.toString == value) => true
      case _ => false
    }

    def serialize(implicit format: Formats): PartialFunction[Any, JValue] = {
      case i: E#Value => i.toString
    }
  }

}

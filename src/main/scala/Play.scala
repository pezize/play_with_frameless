import frameless._
import frameless.syntax._
import org.apache.spark.sql.SparkSession

object Play extends App {
  implicit val spark: SparkSession = SparkSession.builder().master("local").getOrCreate()

  case class A(o: Option[(Int, Int)])
  val tds = TypedDataset.create(
    Seq(
      Some(A(Some((1, 2)))),
      Some(A(None)),
      None
    )
  )
  tds.show().run()
}
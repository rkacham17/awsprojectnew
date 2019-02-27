package dataframes
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


  object Dataframeturorial extends App {


      lazy val sparkConf = new SparkConf()
        .setAppName("Learn Spark")
        .setMaster("local[*]")
        .set("spark.cores.max", "2")

      lazy val sparkSession = SparkSession
        .builder()
        .config(sparkConf)
        .getOrCreate()


    // Create a DataFrame from reading a CSV file
    val dfTags = sparkSession
      .read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv("question_tags_10K.csv")
      .toDF("id", "tag")

    dfTags.show(10)

    


    // Print DataFrame schema
    dfTags.printSchema()

 dfTags.select("id","tag").show(5)
}

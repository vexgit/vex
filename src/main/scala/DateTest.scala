import java.text.DateFormat
import java.text.DateFormat.{LONG, getDateInstance}
import java.util.{Locale, Date}

object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
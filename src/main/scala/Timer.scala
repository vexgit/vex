import java.util.concurrent.atomic.AtomicInteger

object Timer {

  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }

  def timeFlies() {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]) {
    var counter = new AtomicInteger()
    oncePerSecond(() => {
      var count = counter.incrementAndGet()
      println("current: " + counter);
    })
  }
}
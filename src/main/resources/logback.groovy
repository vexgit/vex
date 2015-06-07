import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%-5level %d{HH:mm:ss.SSS} [%thread] %logger{36} - %msg%n"
    }
}

root(INFO, ["CONSOLE"])
logger("com.foo", INFO)


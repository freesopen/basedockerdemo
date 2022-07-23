package top.netapps

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling

/**
 * @author sxu
 */
@SpringBootApplication
@EnableScheduling
@EnableAsync
@EnableCaching
class App {
}
fun main() {
    SpringApplication.run(App::class.java)
}
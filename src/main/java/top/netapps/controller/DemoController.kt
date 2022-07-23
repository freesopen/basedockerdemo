package top.netapps.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpSession

@RestController
@RequestMapping
class DemoController {
    @GetMapping("/")
    fun index(session: HttpSession): String {
        return session.id
    }
}
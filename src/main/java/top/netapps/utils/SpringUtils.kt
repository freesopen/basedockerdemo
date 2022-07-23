package top.netapps.utils

import org.springframework.beans.factory.InitializingBean
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ApplicationObjectSupport

@Configuration
class SpringUtils : ApplicationObjectSupport(), InitializingBean {
    @Throws(Exception::class)
    override fun afterPropertiesSet() {
        ac = applicationContext
    }

    companion object {
        var ac: ApplicationContext? = null
    }
}
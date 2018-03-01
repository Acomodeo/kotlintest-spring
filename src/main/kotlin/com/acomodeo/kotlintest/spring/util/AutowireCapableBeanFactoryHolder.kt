package com.acomodeo.kotlintest.spring.util

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.AutowireCapableBeanFactory

/**
 * @author Mischa Holz
 */
open class AutowireCapableBeanFactoryHolder {

    companion object {
        @JvmStatic
        lateinit var factory: AutowireCapableBeanFactory
    }

    @Autowired
    fun autowireFactory(factory: AutowireCapableBeanFactory) {
        Companion.factory = factory
    }
}

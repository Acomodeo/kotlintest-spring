package com.acomodeo.kotlintest.spring.annotation

import com.acomodeo.kotlintest.spring.util.AutowireCapableBeanFactoryHolder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Mischa Holz
 */
@Configuration
open class KotlinTestConfiguration {

    @Bean
    open fun autowireCapableBeanFactoryHolder() = AutowireCapableBeanFactoryHolder()
}

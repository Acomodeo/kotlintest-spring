package com.acomodeo.kotlintest.spring.annotation

import org.springframework.context.annotation.Import

/**
 * @author Mischa Holz
 */
@Import(KotlinTestConfiguration::class)
@Deprecated("The core team of kotlintest wrote their own connector")
annotation class EnableKotlinTest

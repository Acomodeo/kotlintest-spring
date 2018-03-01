package com.acomodeo.kotlintest.spring.annotation

import org.springframework.context.annotation.Import

/**
 * @author Mischa Holz
 */
@Import(KotlinTestConfiguration::class)
annotation class EnableKotlinTest

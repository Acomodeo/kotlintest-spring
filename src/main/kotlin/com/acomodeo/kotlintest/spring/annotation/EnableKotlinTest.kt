package com.acomodeo.kotlintest.spring.annotation

import com.acomodeo.kotlintest.spring.annotation.KotlinTestConfiguration
import org.springframework.context.annotation.Import

/**
 * @author Mischa Holz
 */
@Import(KotlinTestConfiguration::class)
annotation class EnableKotlinTest
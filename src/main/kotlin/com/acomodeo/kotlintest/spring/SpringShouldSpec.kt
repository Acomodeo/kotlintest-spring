package com.acomodeo.kotlintest.spring

import com.acomodeo.kotlintest.spring.runner.KotlinTestSpringRunner
import io.kotlintest.specs.ShouldSpec
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Mischa Holz
 */
@RunWith(KotlinTestSpringRunner::class)
abstract class SpringShouldSpec : ShouldSpec(), SpringSpec {

    final override fun beforeAll() = autowireAndBeforeAll()

    @Test
    fun loading() {}

}
package com.acomodeo.kotlintest.spring

import com.acomodeo.kotlintest.spring.runner.KotlinTestSpringRunner
import io.kotlintest.specs.StringSpec
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Mischa Holz
 */
@RunWith(KotlinTestSpringRunner::class)
abstract class SpringStringSpec : StringSpec(), SpringSpec {

    final override fun beforeAll() = autowireAndBeforeAll()

    @Test
    fun loading() {}

}
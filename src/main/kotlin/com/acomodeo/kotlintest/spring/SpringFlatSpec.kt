package com.acomodeo.kotlintest.spring

import com.acomodeo.kotlintest.spring.runner.KotlinTestSpringRunner
import io.kotlintest.specs.FlatSpec
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Mischa Holz
 */
@RunWith(KotlinTestSpringRunner::class)
abstract class SpringFlatSpec : FlatSpec(), SpringSpec {
    
    final override fun beforeAll() = autowireAndBeforeAll()

    @Test
    fun loading() {}

}
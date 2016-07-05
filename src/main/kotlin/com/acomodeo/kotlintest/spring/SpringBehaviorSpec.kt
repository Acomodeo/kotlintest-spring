package com.acomodeo.kotlintest.spring

import com.acomodeo.kotlintest.spring.runner.KotlinTestSpringRunner
import io.kotlintest.specs.BehaviorSpec
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Mischa Holz
 */
@RunWith(KotlinTestSpringRunner::class)
abstract class SpringBehaviorSpec : BehaviorSpec(), SpringSpec {

    final override fun beforeAll() = autowireAndBeforeAll()

    @Test
    fun loading() {}

}
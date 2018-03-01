package com.acomodeo.kotlintest.spring

import com.acomodeo.kotlintest.spring.runner.KotlinTestSpringRunner
import io.kotlintest.Spec
import io.kotlintest.specs.FreeSpec
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Mischa Holz
 */
@RunWith(KotlinTestSpringRunner::class)
abstract class SpringFreeSpec : FreeSpec(), SpringSpec {

    override val oneInstancePerTest: Boolean = false

    final override fun interceptSpec(context: Spec, spec: () -> Unit) {
        autowireAndBeforeAll()

        spec()
    }

    @Test
    fun loading() {
    }
}

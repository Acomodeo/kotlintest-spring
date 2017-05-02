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

    final override fun interceptSpec(context: Spec, spec: () -> Unit) {
        super.interceptSpec(context, spec)

        autowireAndBeforeAll()

        spec()
    }

    @Test
    fun loading() {}

}

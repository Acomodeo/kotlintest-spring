package com.acomodeo.kotlintest.spring

import com.acomodeo.kotlintest.spring.runner.KotlinTestSpringRunner
import io.kotlintest.Spec
import io.kotlintest.specs.WordSpec
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Mischa Holz
 */
@RunWith(KotlinTestSpringRunner::class)
abstract class SpringWordSpec : WordSpec(), SpringSpec {

    final override fun interceptSpec(context: Spec, spec: () -> Unit) {
        super.interceptSpec(context, spec)

        autowireAndBeforeAll()

        spec()
    }

    @Test
    fun loading() {}

}


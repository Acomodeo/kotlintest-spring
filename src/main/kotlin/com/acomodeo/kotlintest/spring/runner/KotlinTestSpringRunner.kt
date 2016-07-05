package com.acomodeo.kotlintest.spring.runner

import io.kotlintest.KTestJUnitRunner
import io.kotlintest.TestBase
import org.junit.runner.notification.RunNotifier
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * @author Mischa Holz
 */
class KotlinTestSpringRunner(val testClazz: Class<TestBase>) : SpringJUnit4ClassRunner(testClazz) {
    private val kTestRunner = KTestJUnitRunner(testClazz)

    override fun getDescription() = kTestRunner.description

    override fun run(notifier: RunNotifier?) {
        super.run(notifier)

        kTestRunner.run(notifier)
    }
}
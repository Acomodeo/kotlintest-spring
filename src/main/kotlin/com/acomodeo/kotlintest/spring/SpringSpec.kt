package com.acomodeo.kotlintest.spring

import com.acomodeo.kotlintest.spring.util.AutowireCapableBeanFactoryHolder

/**
 * @author Mischa Holz
 */

interface SpringSpec {
    fun _beforeAll() {}
}

internal fun SpringSpec.autowireAndBeforeAll() {
    AutowireCapableBeanFactoryHolder.factory.autowireBean(this)

    this._beforeAll()
}

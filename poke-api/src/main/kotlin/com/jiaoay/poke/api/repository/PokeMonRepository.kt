package com.jiaoay.poke.api.repository

import com.jiaoay.common.logger.CommonLog
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class PokeMonRepository @Inject constructor() {

    fun test() {
        CommonLog.d(tag = "PokeMonRepository", message = "test")
    }
}
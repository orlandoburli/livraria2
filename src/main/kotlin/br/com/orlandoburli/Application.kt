package br.com.orlandoburli

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("br.com.orlandoburli")
                .mainClass(Application.javaClass)
                .start()
    }
}
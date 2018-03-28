package com.github.mangatmodi.kaal.main

import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.Options

class Kaal {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val options = Options()
            val cmd = DefaultParser().parse(options, args)
            println("Starting Kaal agent...")
        }
    }
}
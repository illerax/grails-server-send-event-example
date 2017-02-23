package com.illerax.sse

/**
 * Created by Evgeny Smirnov <illerax@gmail.com>
 */
class HardWorkService {

    def process(Long id) {
        HardWorkTask task = HardWorkTask.get(id)
        "${task.name}"(task.value)
    }

    private 'Calculate factorial of'(Long value) {
        def findFactorialGroovy = { n -> (n == 1) ? 1 : n * call(n - 1) }
        findFactorialGroovy(value)
    }

    private 'Sum of prime numbers less then'(Long value) {
        def range = 2..value
        (2..Math.sqrt(range.last())).each { n -> range -= ((2 * n)..(range.last())).step(n) }
        range.sum()
    }

    def methodMissing(String name, args) {
        sleep(1000)
        'unknown'
    }
}

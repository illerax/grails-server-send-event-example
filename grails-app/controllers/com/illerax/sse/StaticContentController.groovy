package com.illerax.sse

/**
 * Created by Evgeny Smirnov <illerax@gmail.com>
 */
class StaticContentController {
    def withoutDynamic() {
        [tasks: HardWorkTask.list()]
    }

    def withDynamic() {
        [tasks: HardWorkTask.list()]
    }
}

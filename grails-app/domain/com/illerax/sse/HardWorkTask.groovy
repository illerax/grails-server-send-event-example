package com.illerax.sse
/**
 * Created by Evgeny Smirnov <illerax@gmail.com>
 */
class HardWorkTask {

    def hardWorkService

    String name
    Long value

    def getResult(){
        hardWorkService.process(id)
    }
}

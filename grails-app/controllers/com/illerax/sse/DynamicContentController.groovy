package com.illerax.sse

import rx.Subscriber
import grails.rx.web.*

/**
 * Created by Evgeny Smirnov <illerax@gmail.com>
 */
class DynamicContentController implements RxController {

    def hardWorkService

    def getDynamicValues() {
        rx.stream { Subscriber subscriber ->
            Eval.me(params.tasks).each { taskId ->
                subscriber.onNext(
                        rx.render("{\"$taskId\":\"${hardWorkService.process(taskId.toLong())}\"}")
                )
            }
            subscriber.onCompleted()
        }

    }

}

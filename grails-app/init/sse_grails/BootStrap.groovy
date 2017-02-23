package sse_grails

import com.illerax.sse.HardWorkTask

class BootStrap {

    def init = { servletContext ->
        new HardWorkTask(name: 'Calculate factorial of', value: 10).save(flush: true)
        new HardWorkTask(name: 'Sum of prime numbers less then', value: 1598).save(flush: true)
        new HardWorkTask(name: 'Calculate factorial of', value: 20).save(flush: true)
        new HardWorkTask(name: 'Sum of prime numbers less then', value: 1232).save(flush: true)
        new HardWorkTask(name: 'Sum of prime numbers less then', value: 6000).save(flush: true)
        new HardWorkTask(name: 'Calculate factorial of', value: 15).save(flush: true)
        new HardWorkTask(name: 'Unknown operation', value: 2000).save(flush: true)
        new HardWorkTask(name: 'Calculate factorial of', value: 7).save(flush: true)
        new HardWorkTask(name: 'Calculate factorial of', value: 16).save(flush: true)
        new HardWorkTask(name: 'Sum of prime numbers less then', value: 2000).save(flush: true)
    }
    def destroy = {
    }
}

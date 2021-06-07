package chap11.section1

// Thread 클래스를 상속받아 구현
class SimpleThread: Thread() {
    override fun run() {
        super.run()
        println("Current Threads: ${Thread.currentThread()}")
    }
}

// Runnable 인터페이스로부터 run() 구현
class SimpleRunnable: Runnable {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

fun main() {
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

    object : Thread() {
        override fun run() {
            super.run()
            println("Current Threads(object): ${Thread.currentThread()}")
        }
    }.start()

    Thread {
        println("Current Threads(lambda): ${Thread.currentThread()}")
    }.start()
}
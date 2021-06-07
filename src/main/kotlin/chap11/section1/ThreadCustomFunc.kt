package chap11.section1

public fun thread(start: Boolean = true, isDaemon: Boolean = false,
                    contextClassLoader: ClassLoader? = null, name: String? = null,
                    priority: Int = -1, block: () -> Unit): Thread {
    val thread = object : Thread() {
        override fun run() {
            super.run()
            block()
        }
    }

    if (isDaemon)  // 백그라운드 실행 여부
        thread.isDaemon = true
    if (priority > 0)  // 우선순위(1:낮음 ~ 5:보통 ~ 10:높음)
        thread.priority = priority
    if (name != null)  // 이름
        thread.name = name
    if (contextClassLoader != null)
        thread.contextClassLoader = contextClassLoader
    if (start)
        thread.start()
    return thread
}

fun main() {
    thread(start = true) {
        println("Current Threads(Custom function): ${Thread.currentThread()}")
        // Current Threads(Custom function): Thread[Thread-0,5,main]
        println("Priority: ${Thread.currentThread().priority}")  // Priority: 5
        println("Name: ${Thread.currentThread().name}")  // Name: Thread-0
        println("Name: ${Thread.currentThread().isDaemon}")  // Name: false
    }
}
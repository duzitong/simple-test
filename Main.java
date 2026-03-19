/**
 * Simple Java program for MCP debugger tool testing.
 * Set a breakpoint on the "count += i" line, then start with ide_debug_configuration.
 * When paused, the agent can inspect variables: i, count, greeting.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String greeting = "Hello, Debugger!";
        int count = 0;

        for (int i = 0; i < 5; i++) {
            count += i;                          // <-- set breakpoint here (line 12)
            System.out.println("Step " + i + ": count=" + count);
            Thread.sleep(500);
        }

        System.out.println("Final: " + greeting + " count=" + count);
    }
}

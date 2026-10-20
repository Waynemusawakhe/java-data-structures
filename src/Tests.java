/** Plain-Java checks for the data structures (run: java Tests). */
public class Tests {
    private static int passed = 0;

    private static void check(boolean condition, String name) {
        if (!condition) throw new AssertionError("FAILED: " + name);
        passed++;
        System.out.println("ok - " + name);
    }

    public static void main(String[] args) {
        // MyArrayList: add, get, remove, contains, sort, binary search
        MyArrayList<Integer> list = new MyArrayList<>();
        int[] values = {42, 7, 19, 3, 25};
        for (int i = 0; i < values.length; i++) list.add(i, values[i]);
        check(list.size() == 5, "array list size after 5 adds");
        check(list.get(0) == 42, "array list get by index");
        check(list.contains(19), "array list contains");
        list.sortList();
        check(list.get(0) == 3 && list.get(4) == 42, "array list sorts ascending");
        check(list.binarySearch(19) == 2, "binary search finds element");
        check(list.binarySearch(8) < 0, "binary search reports missing element");
        check(list.remove(0) == 3 && list.size() == 4, "array list remove shifts left");

        // MyLinkedList
        MyLinkedList<String> linked = new MyLinkedList<>();
        linked.append("b");
        linked.append("c");
        linked.prepend("a");
        check("a".equals(linked.getFirst()) && "c".equals(linked.getLast()), "linked list prepend and append");
        check("a".equals(linked.removeFirst()), "linked list remove first");

        // Stack with redo
        StackAsMyLinkedList<Integer> stack = new StackAsMyLinkedList<>();
        stack.push(1);
        stack.push(2);
        check(stack.pop() == 2, "stack is last in, first out");
        check(stack.redo() == 2 && stack.pop() == 2, "stack redo restores the popped element");

        // Queue
        QueueAsMyLinkedList<Integer> queue = new QueueAsMyLinkedList<>();
        queue.enqueue(1);
        queue.enqueue(2);
        check(queue.dequeue() == 1 && queue.dequeue() == 2, "queue is first in, first out");
        check(queue.dequeue() == null, "empty queue returns null");

        System.out.println("\nAll " + passed + " checks passed.");
    }
}

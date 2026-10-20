# Java Data Structures from Scratch

Generic data structures written by hand in Java, without `java.util` collections, for CMPG221 Data Structures (NWU, 2024). Each one includes the reasoning about its cost.

| Class | What it is | Key operations and cost |
|---|---|---|
| `MyArrayList<E>` | Fixed-capacity array-backed list | `get` O(1) · `add`/`remove` at index O(n) (shifting) · `sortList` O(n²) · recursive `binarySearch` O(log n) on a sorted list |
| `MyLinkedList<E>` | Singly linked list with head and tail | `prepend`/`append`/`removeFirst` O(1) · `delete(item)` O(n) · `identicalElements` (intersection of two lists) O(n·m) |
| `StackAsMyLinkedList<E>` | Stack built on the linked list, with **redo** | `push`/`pop` O(1) · `redo` restores the last popped element from a second stack |
| `QueueAsMyLinkedList<E>` | Queue built on the linked list | `enqueue` at tail O(1) · `dequeue` from head O(1) |
| `BubbleSortAlgorithm` | Bubble sort that prints every comparison and swap | O(n²) worst case, O(n) best case thanks to the early exit when no swaps happen |
| `Fruits`, `Apple`, `Berries` | Comparable class hierarchy used to test the generics | Ordered by quantity |
| `CharWrapperClass` | Comparable wrapper for characters (word-guessing game assignment) | |

## Run it

```bash
javac -d out src/*.java
java -cp out Tests
```

`Tests.java` runs 13 plain-Java checks covering every structure: insertion, removal, sorting, binary search, LIFO and FIFO order, and stack redo.

## Notes

- The array list has a fixed capacity of 100. The obvious next step is to double the array when it fills, which gives amortised O(1) appends.
- `sortList` is a bubble sort. Swapping it for merge sort would bring sorting down to O(n log n).

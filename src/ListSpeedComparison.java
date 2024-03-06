import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListSpeedComparison {
    public static void main(String[] args) {
        final int SIZE = 1000000; // Number of elements

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        long arrayListStartTime = System.nanoTime();

        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
        }

        long arrayListEndTime = System.nanoTime();
        long arrayListTime = arrayListEndTime - arrayListStartTime;
        System.out.println("ArrayList insertion time: " + arrayListTime + " nanoseconds");

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        long linkedListStartTime = System.nanoTime();

        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
        }

        long linkedListEndTime = System.nanoTime();
        long linkedListTime = linkedListEndTime - linkedListStartTime;
        System.out.println("LinkedList insertion time: " + linkedListTime + " nanoseconds");

        // Access time comparison
        long arrayListAccessStartTime = System.nanoTime();
        arrayList.get(SIZE / 2);
        long arrayListAccessEndTime = System.nanoTime();
        long arrayListAccessTime = arrayListAccessEndTime - arrayListAccessStartTime;

        long linkedListAccessStartTime = System.nanoTime();
        linkedList.get(SIZE / 2);
        long linkedListAccessEndTime = System.nanoTime();
        long linkedListAccessTime = linkedListAccessEndTime - linkedListAccessStartTime;

        System.out.println("ArrayList access time: " + arrayListAccessTime + " nanoseconds");
        System.out.println("LinkedList access time: " + linkedListAccessTime + " nanoseconds");

        // Deletion time comparison
        long arrayListRemoveStartTime = System.nanoTime();
        arrayList.remove(SIZE / 2);
        long arrayListRemoveEndTime = System.nanoTime();
        long arrayListRemoveTime = arrayListRemoveEndTime - arrayListRemoveStartTime;

        long linkedListRemoveStartTime = System.nanoTime();
        linkedList.remove(SIZE / 2);
        long linkedListRemoveEndTime = System.nanoTime();
        long linkedListRemoveTime = linkedListRemoveEndTime - linkedListRemoveStartTime;

        System.out.println("ArrayList deletion time: " + arrayListRemoveTime + " nanoseconds");
        System.out.println("LinkedList deletion time: " + linkedListRemoveTime + " nanoseconds");

        // Iteration time comparison
        long arrayListIterationStartTime = System.nanoTime();
        Iterator<Integer> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            arrayListIterator.next();
        }
        long arrayListIterationEndTime = System.nanoTime();
        long arrayListIterationTime = arrayListIterationEndTime - arrayListIterationStartTime;
        System.out.println("ArrayList iteration time: " + arrayListIterationTime + " nanoseconds");

        long linkedListIterationStartTime = System.nanoTime();
        Iterator<Integer> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            linkedListIterator.next();
        }
        long linkedListIterationEndTime = System.nanoTime();
        long linkedListIterationTime = linkedListIterationEndTime - linkedListIterationStartTime;
        System.out.println("LinkedList iteration time: " + linkedListIterationTime + " nanoseconds");
    }
}

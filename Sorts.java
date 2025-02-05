public class Sorts {
    private int[] array;
    private int size;

    public SortedArrayPriorityQueue(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public void add(int element) {
        if (size == array.length) {
            throw new RuntimeException("ArraY is full.");
        }

        int index = 0;
        while (index < size && array[index] < element) {
            index++;
        }

        for (int x = size; x > index; x--) {
            array[x] = array[x - 1];
        }

        array[index] = element;
        size++;
    }

    public int removeMin() {
        if (size == 0) {
            throw new RuntimeException("Array is empty");
        }

        int min = array[0];
        for (int j = 0; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
        size--;
        return min;
    }

    public int getMin() {
        if (size == 0) {
            throw new RuntimeException("Array is empty");
        }

        return array[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        SortedArrayPriorityQueue priorityQueue = new SortedArrayPriorityQueue(5);

        priorityQueue.add(5);
        priorityQueue.add(10);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(1);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.removeMin());
        }
    }
}
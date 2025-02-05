public class BinaryHeap {
    private int[] heap;
    private int size;

    public BinaryHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void add(int element) {
        if (size == heap.length) {
            throw new RuntimeException("eRror: Heap is full");
        }

        heap[size] = element;
        bubbleUp(size);
        size++;
    }
    public int removeMin() {
        if (size == 0) {
            throw new RuntimeException("Heap is empty");
        }

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        bubbleDown(0);
        return min;
    }

    private void bubbleUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[parentIndex] <= heap[index]) {
                break;
            }

            int temp = heap[parentIndex];
            heap[parentIndex] = heap[index];
            heap[index] = temp;
            index = parentIndex;
        }
    }

    private void bubbleDown(int index) {
        while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallest = index;

            if (leftChildIndex < size && heap[leftChildIndex] < heap[smallest]) {
                smallest = leftChildIndex;
            }

            if (rightChildIndex < size && heap[rightChildIndex] < heap[smallest]) {
                smallest = rightChildIndex;
            }

            if (smallest == index) {
                break;
            }

            int temp = heap[smallest];
            heap[smallest] = heap[index];
            heap[index] = temp;
            index = smallest;
        }
    }
}
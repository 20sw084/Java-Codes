import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class ProcessScheduling {

     // We create a Process class that represents our processes
    protected static class Process {
        // Each process has a process id, priority, duration, and arrival time
        private int processId;
        private int priority;
        private int duration;
        private int arrivalTime;

        // We set the default values when creating an empty Process
        public Process() {
            processId = 0;
            priority = 0;
            duration = 0;
            arrivalTime = 0;
        };

        // We set the values when creating a Process with given parameters
        public Process(int processId, int priority, int duration, int arrivalTime) {
            this.processId = processId;
            this.priority = priority;
            this.duration = duration;
            this.arrivalTime = arrivalTime;
        };

        // We can get each of the process values
        public int getProcessId() {return processId;};
        public int getPriority() {return priority;};
        public int getDuration() {return duration;};
        public int getArrivalTime() {return arrivalTime;};

        // We can set each of the process values
        public void setProcessId(int processId) {this.processId = processId;};
        public void setPriority(int priority) {this.priority = priority;};
        public void setDuration(int duration) {this.duration = duration;};
        public void setArrivalTime(int arrivalTime) {this.arrivalTime = arrivalTime;};

        // We can return the process in a string representation
        public String toString() {
            String s = new String();
            s += "Id = " + processId + ", ";
            s += "priority = " + priority + ", ";
            s += "duration = " + duration + ", ";
            s += "arrival time = " + arrivalTime;
            return s;
        };
    };

    public static void main(String[] args) throws FileNotFoundException {
        // We use a scanner to read from a given input file
        Scanner s = new Scanner(new File("process_scheduling_in.txt"));
        // We use printwriter to write our output to a file
        PrintWriter writer = new PrintWriter("process_scheduling_out.txt");

        // We use an ArrayList as the data structure that will hold our input processes
        ArrayList<Process> D = new ArrayList<>();

        // We read our input file, create a process for each line read, and add each
        //   process to our ArrayList
        while (s.hasNext()) {
            String line = s.nextLine();
            String[] lineContents = line.split(" ");
            Process p1 = new Process(Integer.parseInt(lineContents[0]), Integer.parseInt(lineContents[1]), Integer.parseInt(lineContents[2]), Integer.parseInt(lineContents[3]));
            D.add(p1);
        };

        // We close our scanner
        s.close();

        // We note how many processes are in our original input file
        int numberOfProcesses = D.size();

        // We write each of our input processes onto the output file
        for (int i=0; i<D.size(); i++) {
            writer.println(D.get(i));
        };
        writer.println();

        // We create variables that keep track of:
        // The "current time" in our simulation
        int currentTime = 0;
        // Whether we are currently running a process or not
        boolean running = false;
        // We also create our empty priority queue
        HeapPriorityQueue<Integer, Process> Q = new HeapPriorityQueue<>();

        Process p = new Process();
        // A Process runningP that is the currently running process
        Process runningP = new Process();
        int waitTime = 0;
        // A double that will calculate our average wait time
        double averageWaitTime = 0;
        // An int that keeps track of the currently running process's end time
        int endTime = 0;

        // This loop runs once for every time unit until D (our ArrayList) is empty
        while (!D.isEmpty()) {
            int earliest = D.get(0).getArrivalTime();
            int earliestIndex = 0;
            for (int i=0; i<D.size(); i++) {
                int temp = D.get(i).getArrivalTime();
                if (temp < earliest) {
                    earliest = temp;
                    earliestIndex = i;
                };
            };
            p = D.get(earliestIndex);
            // If the arrival time of p <= our current time
            if (p.getArrivalTime() <= currentTime) {
                // We remove process p from D and insert it into Q (our priority queue)
                Q.insert(p.getPriority(), p);
                D.remove(earliestIndex);
            };
            // If Q is not empty AND there is no currently running process (running is false)
            if (!Q.isEmpty() && !running) {
                // We remove a process with a smallest priority from Q
                runningP = Q.removeMin().getValue();
                // We determine some values that we will write to our file
                waitTime = currentTime - runningP.getArrivalTime();
                averageWaitTime += waitTime;
                endTime = currentTime + runningP.getDuration();
                // We write to our file
                writer.println("Process removed from queue is: id = " + runningP.getProcessId() + ", at time " + currentTime + ", wait time = " + waitTime + ", Total wait time = " + averageWaitTime);
                writer.println("Process id = " + runningP.getProcessId() + "\n\tPriority = " + runningP.getPriority() + "\n\tArrival = " + runningP.getArrivalTime() + "\n\tDuration = " + runningP.getDuration());
                // We note that we are currently running a process (running is true)
                running = true;
            };
            // We increment the current time by 1
            currentTime += 1;
            // If there is a process running AND it just ended
            if (running && endTime == currentTime) {
                // We write to our file that our process has ended
                writer.println("Process " + runningP.getProcessId() + " finished at time " + endTime + "\n");
                // We note that our process is no longer running (running is false)
                running = false;
            };
        };
        writer.println("\nD becomes empty at time " + (currentTime-1) +"\n");
        // While there is a process waiting in Q (Q is not empty)
        while (!Q.isEmpty()) {
            // If there is no currently running process (running is false)
            if (!running) {
                // We remove a process with a smallest priority from Q
                runningP = Q.removeMin().getValue();
                // We determine some values that we will write to our file
                waitTime = currentTime - runningP.getArrivalTime();
                averageWaitTime += waitTime;
                endTime = currentTime + runningP.getDuration();
                // We write to our file
                writer.println("Process removed from queue is: id = " + runningP.getProcessId() + ", at time " + currentTime + ", wait time = " + waitTime + ", Total wait time = " + averageWaitTime);
                writer.println("Process id = " + runningP.getProcessId() + "\n\tPriority = " + runningP.getPriority() + "\n\tArrival = " + runningP.getArrivalTime() + "\n\tDuration = " + runningP.getDuration());
                // We note that we are currently running a process (running is true)
                running = true;
            };
            // We increment the current time by 1
            currentTime += 1;
            // If there is a process running AND it just ended
            if (running && endTime == currentTime) {
                // We write to our file that our process has ended
                writer.println("Process " + runningP.getProcessId() + " finished at time " + endTime + "\n");
                // We note that our process is no longer running (running is false)
                running = false;
            };
        };
        writer.println("Process " + runningP.getProcessId() + " finished at time " + endTime + "\n");
        // We write to our file the total wait time of all processes
        writer.println("Total wait time = " + averageWaitTime);
        // We calculate our average wait time for all processes
        averageWaitTime /= numberOfProcesses;
        // We write to our file the average wait time for all processes
        writer.print("Average wait time = " + averageWaitTime);
        // We close our PrintWriter
        writer.close();
    };
};

HeapPriorityQueue.java


import java.util.ArrayList;
import java.util.Comparator;

public class HeapPriorityQueue<K,V> extends AbstractPriorityQueue<K,V> {
/** primary collection of priority queue entries */
protected ArrayList<Entry<K,V>> heap = new ArrayList<>();

/** Creates an empty priority queue based on the natural ordering of its keys. */
public HeapPriorityQueue() { super(); }

public HeapPriorityQueue(Comparator<K> comp) { super(comp); }

public HeapPriorityQueue(K[] keys, V[] values) {
    super();
    for (int j=0; j < Math.min(keys.length, values.length); j++)
      heap.add(new PQEntry<>(keys[j], values[j]));
    heapify();
}

// protected utilities
protected int parent(int j) { return (j-1) / 2; }     // truncating division
protected int left(int j) { return 2*j + 1; }
protected int right(int j) { return 2*j + 2; }
protected boolean hasLeft(int j) { return left(j) < heap.size(); }
protected boolean hasRight(int j) { return right(j) < heap.size(); }

/** Exchanges the entries at indices i and j of the array list. */
protected void swap(int i, int j) {
    Entry<K,V> temp = heap.get(i);
    heap.set(i, heap.get(j));
    heap.set(j, temp);
}

/** Moves the entry at index j higher, if necessary, to restore the heap property. */
protected void upheap(int j) {
    while (j > 0) {            // continue until reaching root (or break statement)
      int p = parent(j);
      if (compare(heap.get(j), heap.get(p)) >= 0) break; // heap property verified
      swap(j, p);
      j = p;                                // continue from the parent's location
    }
}

/** Moves the entry at index j lower, if necessary, to restore the heap property. */
protected void downheap(int j) {
    while (hasLeft(j)) {               // continue to bottom (or break statement)
      int leftIndex = left(j);
      int smallChildIndex = leftIndex;     // although right may be smaller
      if (hasRight(j)) {
          int rightIndex = right(j);
          if (compare(heap.get(leftIndex), heap.get(rightIndex)) > 0)
            smallChildIndex = rightIndex; // right child is smaller
      }
      if (compare(heap.get(smallChildIndex), heap.get(j)) >= 0)
        break;                             // heap property has been restored
      swap(j, smallChildIndex);
      j = smallChildIndex;                 // continue at position of the child
    }
}

/** Performs a bottom-up construction of the heap in linear time. */
protected void heapify() {
    int startIndex = parent(size()-1);    // start at PARENT of last entry
    for (int j=startIndex; j >= 0; j--)   // loop until processing the root
      downheap(j);
}

// public methods

@Override
public int size() { return heap.size(); }

@Override
public Entry<K,V> min() {
    if (heap.isEmpty()) return null;
    return heap.get(0);
}

@Override
public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
    checkKey(key);      // auxiliary key-checking method (could throw exception)
    Entry<K,V> newest = new PQEntry<>(key, value);
    heap.add(newest);                      // add to the end of the list
    upheap(heap.size() - 1);               // upheap newly added entry
    return newest;
}

@Override
public Entry<K,V> removeMin() {
    if (heap.isEmpty()) return null;
    Entry<K,V> answer = heap.get(0);
    swap(0, heap.size() - 1);              // put minimum item at the end
    heap.remove(heap.size() - 1);          // and remove it from the list;
    downheap(0);                           // then fix new root
    return answer;
}

/** Used for debugging purposes only */
private void sanityCheck() {
    for (int j=0; j < heap.size(); j++) {
      int left = left(j);
      int right = right(j);
      if (left < heap.size() && compare(heap.get(left), heap.get(j)) < 0)
        System.out.println("Invalid left child relationship");
      if (right < heap.size() && compare(heap.get(right), heap.get(j)) < 0)
        System.out.println("Invalid right child relationship");
    }
}
}


AbstractPriorityQueue.java


import java.util.Comparator;

public abstract class AbstractPriorityQueue<K,V> implements PriorityQueue<K,V> {
//---------------- nested PQEntry class ----------------
protected static class PQEntry<K,V> implements Entry<K,V> {
    private K k; // key
    private V v; // value

    public PQEntry(K key, V value) {
      k = key;
      v = value;
    }

    // methods of the Entry interface
    public K getKey() { return k; }
    public V getValue() { return v; }

    // utilities not exposed as part of the Entry interface
    protected void setKey(K key) { k = key; }
    protected void setValue(V value) { v = value; }
} //----------- end of nested PQEntry class -----------

// instance variable for an AbstractPriorityQueue
/** The comparator defining the ordering of keys in the priority queue. */
private Comparator<K> comp;

protected AbstractPriorityQueue(Comparator<K> c) { comp = c; }

/** Creates an empty priority queue based on the natural ordering of its keys. */
protected AbstractPriorityQueue() { this(new DefaultComparator<K>()); }

/** Method for comparing two entries according to key */
protected int compare(Entry<K,V> a, Entry<K,V> b) {
    return comp.compare(a.getKey(), b.getKey());
}

/** Determines whether a key is valid. */
protected boolean checkKey(K key) throws IllegalArgumentException {
    try {
      return (comp.compare(key,key) == 0); // see if key can be compared to itself
    } catch (ClassCastException e) {
      throw new IllegalArgumentException("Incompatible key");
    }
}

@Override
public boolean isEmpty() { return size() == 0; }
}


PriorityQueue.java

public interface PriorityQueue<K,V> {

int size();

boolean isEmpty();

Entry<K,V> insert(K key, V value) throws IllegalArgumentException;

Entry<K,V> min();

Entry<K,V> removeMin();
}

Entry.java

public interface Entry<K,V> {
K getKey();

V getValue();
}


DefaultComparator.java


import java.util.Comparator;

public class DefaultComparator<E> implements Comparator<E> {

@SuppressWarnings({"unchecked"})
public int compare(E a, E b) throws ClassCastException {
    return ((Comparable<E>) a).compareTo(b);
}
}


process_scheduling_in.txt

1 10 25 10
2 3 15 17
3 1 17 26
4 9 17 30
5 10 9 40
6 6 14 47
7 7 18 52
8 5 18 70
9 2 16 93
10 8 20 125

 

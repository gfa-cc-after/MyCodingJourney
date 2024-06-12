package Counter4;
public class Counter {


    // This does not work // do not copy ... still figuring it out
    private int counter;

    // Constructor with no input parameters (default value is 0)
    public Counter() {
        this.counter = 0;
    }

    // Constructor with 1 input parameter called counter
    public Counter(int counter) {
        this.counter = counter;
    }

    // Add a whole number to the counter
    public void add(int number) {
        this.counter += number;
    }

    // Increase the counter's value by one
    public void add() {
        this.counter++;
    }

    // Get the current counter value
    public int get() {
        return this.counter;
    }

    // Reset the counter to the initial value set during construction
    public void reset() {
        // For the default constructor, reset to 0; for the parameterized constructor, reset to the initial value
        this.counter = (this.counter == 0) ? 0 : this.counter;
    }
}

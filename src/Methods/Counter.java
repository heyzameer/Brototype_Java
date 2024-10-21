package Methods;

public class Counter {

        // Static variable shared across all instances
        private static int staticCount = 0;
        // Instance variable unique to each instance
        private int instanceCount = 0;

        // Constructor increments both counts
        public Counter() {
            staticCount++;       // Increment static count
            instanceCount++;     // Increment instance count
        }

        // Static method to get the static count
        public static int getStaticCount() {
            return staticCount;
        }

        // Instance method to get the instance count
        public int getInstanceCount() {
            return instanceCount;
        }
    }

    class Main {
        public static void main(String[] args) {
            // Creating first instance of Counter
            Counter c1 = new Counter();
            System.out.println("Static count after c1: " + Counter.getStaticCount()); // Output: 1
            System.out.println("Instance count of c1: " + c1.getInstanceCount()); // Output: 1

            // Creating second instance of Counter
            Counter c2 = new Counter();
            System.out.println("Static count after c2: " + Counter.getStaticCount()); // Output: 2
            System.out.println("Instance count of c2: " + c2.getInstanceCount()); // Output: 1

            // Creating third instance of Counter
            Counter c3 = new Counter();
            System.out.println("Static count after c3: " + Counter.getStaticCount()); // Output: 3
            System.out.println("Instance count of c3: " + c3.getInstanceCount()); // Output: 1

            // Display instance count for c1 and c2
            System.out.println("Instance count of c1: " + c1.getInstanceCount()); // Output: 1
            System.out.println("Instance count of c2: " + c2.getInstanceCount()); // Output: 1
        }
    }


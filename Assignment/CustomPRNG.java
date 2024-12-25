
public class CustomPRNG {
    // Parameters for the LCG
    private long seed;       // Current state (seed value)
    private final long a;    // Multiplier
    private final long c;    // Increment
    private final long m;    // Modulus

    // Constructor to initialize parameters
    public CustomPRNG(long seed) {
        this.seed = seed;
        this.a = 1664525;    // Standard multiplier for LCG
        this.c = 1013904223; // Standard increment for LCG
        this.m = (long) Math.pow(2, 32); // Modulus (2^32)
    }

    // Generate the next random number
    public long nextRandom() {
        seed = (a * seed + c) % m;
        return seed;
    }

    // Generate a random number within a specific range
    public int nextInt(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Min must be less than max");
        }
        return (int) (min + (nextRandom() % (max - min + 1)));
    }

    public static void main(String[] args) {
        // Initialize the PRNG with a seed
        CustomPRNG prng = new CustomPRNG(12345);

        // Generate random numbers
        System.out.println("First 10 random numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.println(prng.nextRandom());
        }

        // Generate random numbers in a specific range
        System.out.println("\nRandom numbers between 10 and 50:");
        for (int i = 0; i < 10; i++) {
            System.out.println(prng.nextInt(10, 50));
        }
    }
}

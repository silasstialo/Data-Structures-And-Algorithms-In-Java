# Array Reverser Utility

A lightweight, generic Java utility designed to reverse arrays in-place using a two-pointer approach[cite: 1, 2].

## Files Included

* **`ArrayReverser.java`**: Contains the generic static `reverse` method supporting object arrays (e.g., `Integer[]`, `String[]`).
* **`Main.java`**: Demonstration script showcasing how to use the utility with an array of integers[cite: 2].

## How It Works

The `reverse` method uses two pointers (`left` starting at the beginning and `right` starting at the end of the array) that move inward, swapping elements until they meet in the middle[cite: 1]. 

* **Time Complexity:** $O(n)$ where $n$ is the number of elements in the array.
* **Space Complexity:** $O(1)$ since it operates entirely in-place.

## Usage Example

```java
Integer[] numbers = {10, 1, 13, 7, 44, 16, 5};
ArrayReverser.reverse(numbers);

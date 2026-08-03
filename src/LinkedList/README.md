# Doubly Linked List Implementation

A custom implementation of a **Doubly Linked List** in Java.

## 📁 Project Structure

- `LinkedList.java`: Main class managing list operations.
- `Node.java`: Node class with data and previous/next references.
- `Main.java`: Entry point with test cases.

## ✨ Features

- **Bidirectional Traversal**: Forward (`traverse()`) and reverse (`traverseReverse()`).
- **Insertion**: Add to end (`add()`), beginning (`addAt(0)`), or specific index (`addAt(index)`).
- **Deletion**: Remove from end (`remove()`), specific index (`removeAt(index)`), or clear all (`clear()`).
- **Search**: Retrieve by index (`get(index)`) or find index by value (`find(data)`).
- **Error Handling**: Throws `NullPointerException` or `IndexOutOfBoundsException` for invalid operations.

## 🚀 Usage

### Compile and Run

```bash
javac *.java
java Main

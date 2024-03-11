package Stack;

import java.util.Date;

public class Stack {
    private Contact[] contacts;
    private int top;
    private int capacity;

    public Stack(int size) {
        contacts = new Contact[size];
        capacity = size;
        top = -1;
    }

    public void push(Contact contact) {
        if (isFull()) {
            throw new IllegalStateException("Stack is already full");
        }

        if (!contact.validateContact()) {
            throw new IllegalArgumentException("Invalid Contact object");
        }

        contacts[++top] = contact;
    }

    public Contact pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return contacts[top--];
    }

    public int getSize() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        Contact contact1 = new Contact("John", "Doe", "+1234567890");
        Contact contact2 = new Contact("Alice", "Smith", "+9876543210");

        stack.push(contact1);
        stack.push(contact2);

        System.out.println("Stack size: " + stack.getSize());

        Contact poppedContact = stack.pop();
        System.out.println("Popped contact: " + poppedContact.getFirstName());
    }
}

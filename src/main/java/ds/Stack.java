/**
* Stack.java
* This class represents a stack
**/
package ds;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    int top;
    List<Node> listOfNodes;
    int maxSize;

    public Stack(){

    }
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        listOfNodes = new ArrayList<Node>(maxSize);
    }

    public void push(Node element)  throws Exception {
        if(top == listOfNodes.size()) {
            System.out.println("The stack is full you cannot push more elements");
            throw new Exception("The stack is full you cannot push more elements");
        }
        if(top == 0) {
            listOfNodes.add(element);
        } else {
        	listOfNodes.add(element);
            ++top;
        }
    }

    public Node pop() throws Exception {
        if(top == 0){
            System.out.println("The stack is empty");
            throw new Exception("The stack is empty");
        }

        return listOfNodes.get(top--);
    }

    public Node peek() throws Exception {
        if(top == 0)
            throw new Exception("The stack is empty");
        return listOfNodes.get(top);
    }

    public boolean isEmpty() throws Exception {
        if(top == 0)
            return true;
        return false;
    }

}

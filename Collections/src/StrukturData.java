import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StrukturData {
    public static void main(String[] args) {
//        Stack data = new Stack();
//        data.add("novin");
//        data.add("farel");
//        data.push(1);
//        System.out.println(data);
//        System.out.println(data.set(0, "novinn"));


//        Queue dataQueue = new ArrayDeque();
//        dataQueue.add("jawa");
//        dataQueue.add("hai");
//        dataQueue.offer("novin");
//        dataQueue.peek();
//        dataQueue.poll();
//        System.out.println(dataQueue);

//        Queue<Integer> dataStack = new ArrayDeque<Integer>();
//        dataStack.add(11);
//        dataStack.add(22);
//        dataStack.add(33);
//        System.out.println(dataStack.remove());

        Stack<String> name = new Stack<>();
        name.push("a");
        name.push("b");
        name.push("c");
        name.push("d");
        name.push("e");

        Object[] a = name.toArray();
        for (var b : a) {
            System.out.println(b);
        }


    }
}

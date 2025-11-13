import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> queue; // 內部使用 LinkedList 來儲存資料

    public MyQueue() {
        queue = new LinkedList<>();
    }

    // 入隊（新增元素到尾端）
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // 出隊（移除並返回隊首元素）
    public T dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return queue.removeFirst();
    }

    // 判斷是否為空
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // 返回目前佇列的大小
    public int size() {
        return queue.size();
    }

    // 額外方法：查看隊首元素但不移除
    public T peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return queue.getFirst();
    }
}


public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        //do some test if needed
    }
}


//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------
/**
 * Created by tang on 2017/7/8.
 */
public class MyArrayList<T> implements IList<T> {

    private Node<T> head;//头部
    private int size = 0;


    public MyArrayList() {
        this.head = null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int Size() {
        return this.size;
    }

    @Override
    public void addNode(T data) {

        if (isEmpty()) {//链表是否为空
            head = new Node<T>(data);
        } else {
            Node<T> last = new Node<T>(data);//创建新的节点
            Node<T> newHead = head;//标识头部
            while (newHead.next != null) {
                newHead = newHead.next;//移位
            }
            newHead.next = last;//添加到末尾


        }
        size++;

    }

    @Override
    public Node get(int i) throws Exception {
        if (size <= i) {
            throw new IndexOutOfBoundsException("index:" + i + " " + "size:" + size);//越界
        }
        Node<T> node = head;
        int index = 0;
        while (node.next != null) {//遍历
            if (index == i) {
                break;
            }
            node = node.next;
            index++;//记录地几个；
        }
        return node;
    }

    @Override
    public void remove(int i) throws Exception {
        if (size <= i) {
            throw new IndexOutOfBoundsException("index:" + i + " " + "size:" + size);//越界
        }
        Node<T> node = head;
        int index = 0;
        while (node.next != null) {//遍历
            if (index == i) {

                
                break;
            }
            node = node.next;
            index++;//记录地几个；
        }

    }



    @Override
    public void reverse() {

    }

    @Override
    public int Indexof(Node x) {
        return 0;
    }

    @Override
    public void insert(int i, Node x) throws Exception {

    }


}




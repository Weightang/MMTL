  public interface IList<T> {
        //置空操作
        void clear();

        //判空操作
        boolean isEmpty();

        //取表长度
        int Size();

        void addNode(T data);
        //取表元素
        Node get(int i) throws Exception;

        //插入操作
        void insert(int i, Node x) throws Exception;

        //删除操作
        void remove(int i) throws Exception;

        //查找操作
        int Indexof(Node x);


        //倒序
        void reverse();

    }
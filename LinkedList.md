## 链表
![](https://github.com/Weightang/MMTL/blob/master/assets/%E9%93%BE%E8%A1%A8.png)


### 单向链表

定义： 节点从单一方向连接起来的，每个节点都有一个指针，指向下个节点，
第一个有下个节点的节点叫头节点，当节点指针指向null的叫尾节点，访问链表从头访问。

![](https://github.com/Weightang/MMTL/blob/master/assets/%E5%8D%95%E5%90%91%E9%93%BE%E8%A1%A8.png)

   Java的实现

### 双向链表

定义： 每个节点中有两个指针，分别指向直接的下个节点和前一个节点,当指向前一个为null，下个一个节点不为null,说明此节点为
头节点，反之，为尾节点。对双向链表的访问可以从任意个节点访问。
![](https://github.com/Weightang/MMTL/blob/master/assets/%E5%8F%8C%E5%90%91%E9%93%BE%E8%A1%A8.png)

   Java的实现
   
### 循环链表

定义： 与单向链表主要的区别是，尾节点的指针指向头节点，形成循环。

![](https://github.com/Weightang/MMTL/blob/master/assets/%E5%BE%AA%E7%8E%AF%E9%93%BE%E8%A1%A8.png)

  Java的实现   

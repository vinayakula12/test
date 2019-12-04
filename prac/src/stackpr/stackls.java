//public class MyQueue<T> {
//2 private static class QueueNode<T> {
//3 private T data;
//4 private QueueNode<T> next;
//5
//6 public QueueNode(T data) {
//7 this.data = data;
//8 }
//9 }
//10
//11 private QueueNode<T> first;
//12 private QueueNode<T> last;
//13
//14 public void add(T item) {
//CrackingTheCodinglnterview.com I 6th Edition 97
//Chapter 3 I Stacks and Queues
//15
//16
//17
//18
//19
//20
//21
//22
//23
//24
//25
//26
//27
//28
//29
//30
//31
//32
//33
//34
//35
//36
//37
//38
//39
//40
//41
//42
//43 }
//}
//QueueNode<T> t = new QueueNode<T>(item);
//if (last != null) {
//last.next= t;
//}
//last = t;
//if (first== null) {
//first= last;
//}
//public T remove() {
//}
//if (first== null) throw new NoSuchElementException();
//T data= first.data;
//first= first.next;
//if (first == null) {
//last = null;
//}
//return data;
//public T peek() {
//}
//if (first== null) throw new NoSuchElementException();
//return first.data;
//public boolean isEmpty() {
//return first== null;
//}
//It is especially easy to mess u
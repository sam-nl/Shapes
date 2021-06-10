import java.util.NoSuchElementException;
/**
 * This class implements a queue of generic objects T.
 * @author Sam
 *
 * @param <T> the type of object stored in the queue.
 */
public class Queue<T> {
	private QueueElement<T> head;
	//the first item in the queue.
	private QueueElement<T> tail;
	//the final item in the queue.
	
	/**
	 * Constructs an empty Queue.
	 */
	public Queue () {
		head = null;
		tail = null;
	}
	/**
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty () {
		if (head == null && tail == null){
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Returns the element at the head of the queue
	 */
	public T peek () throws NoSuchElementException {
		try {
			if (head != null) {
				return head.getElement();
			}else {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			}
		}	
		catch(NoSuchElementException t ){
			throw t;
		}
	}	
	/**
	 * Removes the front element of the queue. 
	 * Note, simply points the head at the 2nd item.
	 * If head is set to null then the final item has been remove and tail is set to null.
	 */
	public void dequeue () throws NoSuchElementException{
		NoSuchElementException e = new NoSuchElementException();
		if (head != null){
			head = head.getNext();
			if (head == null) {
				tail = null;
			}
		}else {
			throw e;
		}
	}
	
	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue (T element) {
		QueueElement<T> temp = new QueueElement<T>(element,null);
		if (tail == null){
			head = temp;
		}else {
			tail.setNext(temp);
		}
		tail = temp;
	}
	
	/**
	 * Prints the full contents of the queue in order from head to tail.
	 */
	public void print() {
		QueueElement<T> i = head;
		
		while (i != null){
			System.out.println(i.getElement()+ ", ");
			i = i.getNext();
		}
		if (head == null){
			System.out.println("The queue is empty");
		}else {
			System.out.println("");
		}
		
	}
}
package project;

import java.util.Stack;

class Queue {
	public QueueNode front;
	public QueueNode rear;

	Queue(){
		front = null;
		rear = null;
	}

	public boolean isEmpty(){
		//if both front and rear point to null then queue is empty
		if( front == null && rear == null){
			return true;
		}
		else{
			return false;
		}
	}

	public void enQueue(QueueNode toAdd){

		//store in node and add to linked list
		if(front == null) {
			rear = toAdd;
			front = toAdd;
		}

		else {
			QueueNode temp = front;
			while(temp != rear) {
				temp = temp.next;
			}
			temp.next = toAdd;
			rear = toAdd;
		}System.out.println();
	}

	public void deQueue(){
		// if list is empty then cannot dequeue
		if(isEmpty()){
			System.out.println("You haven't ordered anything!\n");
		}

		//set front to the next node and assign previous front to null
		else{
			QueueNode temp = front;
			front = front.next;
			temp = null;
		}
	}
}

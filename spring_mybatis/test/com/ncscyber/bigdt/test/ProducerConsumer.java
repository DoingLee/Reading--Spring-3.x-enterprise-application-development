package com.ncscyber.bigdt.test;

public class ProducerConsumer {
	private static int product = 0;

	public void addProduct() {
		synchronized(this){
			if (product == 1) {
				try {
					System.out.println("pro wait");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Add Product!");
				product = 1;
				notifyAll();// 唤醒消费者
			}
		}
	}

	public void getProduct() {
		synchronized(this){
			if (product == 0) {
				try {
					System.out.println("cust wait");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Get Product!");
				product = 0;
				notifyAll();// 通知生产者
			}
		}
	}

	public static void main(String[] args) {
		ProducerConsumer pc = new ProducerConsumer();
		Thread consumer = new Thread(new Consumer(pc));
		Thread producer = new Thread(new Producer(pc));
		consumer.start();
		producer.start();
	}

}

class Producer implements Runnable {
	private ProducerConsumer pc;

	public Producer(ProducerConsumer pc) {
		this.pc = pc;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Producer=======" + i);
			pc.addProduct();
		}
	}
}

class Consumer implements Runnable {
	private ProducerConsumer pc;

	public Consumer(ProducerConsumer pc) {
		this.pc = pc;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Consumer=======" + i);
			pc.getProduct();
		}
	}
}
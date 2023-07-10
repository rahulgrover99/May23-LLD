package solutions.nage1234.ProducerConsumerUsingWaitNotify.producerconsumer;

public class ThreadFactory {
	
	public void startProducerConsumer() {
		InventoryManagement im = new InventoryManagement();
		//1 producer and 2 consumer
		//should be more controllable by writing more codes in InventoryManagement
		//to preempt the consumer thread and give fair to other consumer
		//with wait and notify will not guarantee the different thread to excute
		//thats why the uncertainity and order not guranteed
		//so, need to implement some thread queues to overcome this.
		Producer p = new Producer(im);
		Thread th = new Thread(p);
		th.start();
		Consumer c1 = new Consumer(im);
		Thread th1 = new Thread(c1, "consumer1");
		th1.start();
		Consumer c2 = new Consumer(im);
		Thread th2 = new Thread(c2, "consumer2");
		th2.start();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadFactory tf = new ThreadFactory();
		tf.startProducerConsumer();

	}

}

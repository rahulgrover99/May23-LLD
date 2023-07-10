package solutions.nage1234.ProducerConsumerUsingWaitNotify.producerconsumer;
public class InventoryManagement {
	private int producedItems;
	private int capacity = 10;
	public int getProducedItems() {
		return producedItems;
	}
	
	public synchronized void produceItem() throws Exception{
		while(capacity >= producedItems) {
			producedItems++;
			Thread.sleep(500);
			System.out.println("Produced Item = "+producedItems);
			if(capacity == producedItems) {
				this.notifyAll();
				System.out.println("Producer is Waiting");			
				this.wait();
			}
		}
	}
	
	public synchronized void consumeItem() throws Exception{
		int count = 0;
		while(producedItems > 0) {
			System.out.println("consumed Item "+producedItems+" by "+Thread.currentThread().getName());
			producedItems--;
			Thread.sleep(500);
			count++;
			if(producedItems <= 0 || count == 5) {
				count = 0;
				this.notify();
				System.out.println("Consumer "+Thread.currentThread().getName()+" is Waiting");
				this.wait();
			}
		}
	}
}

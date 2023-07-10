package solutions.nage1234.ProducerConsumerUsingWaitNotify.producerconsumer;

public class Consumer implements Runnable{
	private InventoryManagement inventory;
	
	public Consumer(InventoryManagement im) {
		inventory = im;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			inventory.consumeItem();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

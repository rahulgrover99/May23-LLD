package solutions.nage1234.ProducerConsumerUsingWaitNotify.producerconsumer;

public class Producer implements Runnable{
	private InventoryManagement inventory;
	
	public Producer(InventoryManagement im) {
		inventory = im;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			inventory.produceItem();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

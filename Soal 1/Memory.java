// Class Parent bernama Memory berisikan attribute Frequency, MemorySize dan SupportsCuda

public class Memory{
	protected int frequency;
	protected int memorySize;
	protected int supportsCuda;
	/* Protected hanya dapat di akses oleh class itu sendiri atau turunan(Inheritance)
		dan tidak dapat di akses di luar itu.
	*/

	public void setFrequency(int iFrequency){
		frequency = iFrequency;
	}

	public void setMemorySize(int iMemorySize){
		memorySize = iMemorySize;
	}

	public void setSupportsCuda(int iSupportsCuda){
		supportsCuda = iSupportsCuda;
	}
	// Set attributes

	public int getFrequency(){
		return frequency;
	}

	public int getMemorySize(){
		return memorySize;
	}

	public int getSupportsCuda(){
		return supportsCuda;
	}
	// Get Attributes

}
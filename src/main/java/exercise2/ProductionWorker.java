package exercise2;

public class ProductionWorker implements Payable{
	private int producedPieceRate;
	private int producedPieceCount;

	public ProductionWorker(int producedPieceRate){
		this.producedPieceRate = producedPieceRate;
		producedPieceCount = 0;
	}


	public void produceOnePiece() {
		producedPieceCount++;
	}

	public int computeSalary() {
		return (producedPieceCount*producedPieceRate);
	}
}

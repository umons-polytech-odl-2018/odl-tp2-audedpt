package exercise2;

public class ProductionWorker implements Payable {
	int producedPieceRate;
	int production;

	public void produceOnePiece() {
		production++;
	}

	public ProductionWorker( int producedPieceRate ){
		this.producedPieceRate= producedPieceRate;
		production=0;

	}

	public int computeSalary() {

		return producedPieceRate * production ;
	}
}
